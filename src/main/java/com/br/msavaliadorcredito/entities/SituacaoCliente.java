package com.br.msavaliadorcredito.entities;

import com.br.msavaliadorcredito.dtos.CartaoClienteDTO;
import com.br.msavaliadorcredito.dtos.DadosClienteDTO;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class SituacaoCliente {
    private DadosClienteDTO dadosClienteDTO;
    private List<CartaoClienteDTO> cartaoClienteDTO;
}
