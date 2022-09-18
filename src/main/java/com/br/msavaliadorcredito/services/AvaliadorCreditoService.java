package com.br.msavaliadorcredito.services;

import com.br.msavaliadorcredito.entities.SituacaoCliente;

public interface AvaliadorCreditoService {
    SituacaoCliente obterSituacaoCliente(String cpf);
}
