package com.br.msavaliadorcredito.clients;

import com.br.msavaliadorcredito.dtos.CartaoClienteDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient(value = "mscartoes", path = "/cartoes")
public interface CartoesResourceClient {

    @GetMapping(value = "/getCartoesCliente", params = "cpf")
    ResponseEntity<List<CartaoClienteDTO>> getCartoesByCliente(@RequestParam("cpf") String cpf);
}
