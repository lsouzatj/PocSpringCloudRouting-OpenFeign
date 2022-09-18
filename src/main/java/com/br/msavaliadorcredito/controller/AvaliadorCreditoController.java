package com.br.msavaliadorcredito.controller;


import com.br.msavaliadorcredito.entities.SituacaoCliente;
import com.br.msavaliadorcredito.services.AvaliadorCreditoService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Log4j2
@RequiredArgsConstructor
@RestController
@RequestMapping(value = "/avaliacao-credito")
public class AvaliadorCreditoController {

    private final AvaliadorCreditoService avaliadorCreditoService;

    @GetMapping(value = "/status")
    public String status(){
        log.info("Consultando o status do servico de avaliacao de credito.");
        return "Status do servico de avaliacao de credito ok.";
    }

    @GetMapping(value = "/situacao-cliente", params = "cpf")
    public ResponseEntity<SituacaoCliente> consultaSituacaoCliente(@RequestParam("cpf") String cpf){
        log.info("Consultando o cpf de número {}", cpf);
        var situacaoCliente = avaliadorCreditoService.obterSituacaoCliente(cpf);
        log.info("Consultando a situacao do cliente {}", situacaoCliente);
        return ResponseEntity.status(HttpStatus.OK).body(situacaoCliente);
    }
}
