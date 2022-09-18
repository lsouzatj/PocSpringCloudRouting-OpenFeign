package com.br.msavaliadorcredito.services.impl;


import com.br.msavaliadorcredito.entities.SituacaoCliente;
import com.br.msavaliadorcredito.services.AvaliadorCreditoService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AvaliadorCreditoImpl implements AvaliadorCreditoService {
    @Override
    public SituacaoCliente obterSituacaoCliente(String cpf) {
        //Obter dados do cliente - MsClientes
        //Obter cartoes do cliente - MsCartoes
        return null;
    }
}
