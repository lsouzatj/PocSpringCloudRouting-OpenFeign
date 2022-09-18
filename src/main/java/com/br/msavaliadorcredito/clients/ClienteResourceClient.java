package com.br.msavaliadorcredito.clients;

import com.br.msavaliadorcredito.dtos.DadosClienteDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "msclientes", path = "/cliente")
public interface ClienteResourceClient {

    @GetMapping(params = "cpf")
    ResponseEntity<DadosClienteDTO> consultarDadosCliente(@RequestParam(value = "cpf") String cpf);
}
