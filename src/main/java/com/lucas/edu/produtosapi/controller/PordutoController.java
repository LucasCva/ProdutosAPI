package com.lucas.edu.produtosapi.controller;

import com.lucas.edu.produtosapi.model.Produto;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("produtos")
public class PordutoController {

    @PostMapping
    public void salvar(@RequestBody Produto produto) {
        System.out.println("Produto salvo " + produto)
        ;
    }
}
