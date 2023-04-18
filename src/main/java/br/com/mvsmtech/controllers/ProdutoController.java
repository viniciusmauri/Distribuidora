package br.com.mvsmtech.controllers;

import br.com.mvsmtech.domain.dto.ProdutoDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProdutoController {

    @GetMapping("/buscar")
    private ResponseEntity<ProdutoDTO> {
        
    }
}
