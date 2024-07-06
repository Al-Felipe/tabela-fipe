package com.example.tabelafipe.controller;

import com.example.tabelafipe.service.FipeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FipeController {
    @Autowired
    private FipeService fipeService;

    @GetMapping("/marcas")
    public String listarMarcas(){
        return fipeService.listarMarcas();
    }

    @GetMapping("/marcas/{idModelo}")
    public String listarModelos(@PathVariable int idModelo){
        return fipeService.listarModelos(idModelo);
    }
}
