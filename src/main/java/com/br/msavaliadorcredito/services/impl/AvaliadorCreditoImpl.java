package com.br.msavaliadorcredito.services.impl;


import com.br.msavaliadorcredito.clients.CartoesResourceClient;
import com.br.msavaliadorcredito.clients.ClienteResourceClient;
import com.br.msavaliadorcredito.dtos.CartaoClienteDTO;
import com.br.msavaliadorcredito.dtos.DadosClienteDTO;
import com.br.msavaliadorcredito.entities.SituacaoCliente;
import com.br.msavaliadorcredito.services.AvaliadorCreditoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.LinkedHashMap;
import java.util.List;

@Service
@RequiredArgsConstructor
public class AvaliadorCreditoImpl implements AvaliadorCreditoService {

    private final ClienteResourceClient clienteResourceClient;
    private final CartoesResourceClient cartoesResourceClient;
    @Override
    public SituacaoCliente obterSituacaoCliente(String cpf) {
        //Obter dados do cliente - MsClientes
        ResponseEntity<DadosClienteDTO> dadosClienteResponse = clienteResourceClient.consultarDadosCliente(cpf);
        //Obter cartoes do cliente - MsCartoes
        ResponseEntity<List<CartaoClienteDTO>> cartoesClienteResponse = cartoesResourceClient.getCartoesByCliente(cpf);
        return SituacaoCliente
                .builder()
                .dadosClienteDTO(dadosClienteResponse.getBody())
                .cartaoClienteDTO(cartoesClienteResponse.getBody())
                .build();
    }
}
