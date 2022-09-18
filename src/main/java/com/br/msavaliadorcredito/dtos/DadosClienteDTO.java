package com.br.msavaliadorcredito.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DadosClienteDTO {
    private Long id;
    private String nome;
}
