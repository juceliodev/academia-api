package com.digitalinnovation.academia.controller;

import com.digitalinnovation.academia.entity.AvaliacaoFisica;
import com.digitalinnovation.academia.entity.form.AvaliacaoFisicaForm;
import com.digitalinnovation.academia.service.impl.AvaliacaoFisicaServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/avaliacoes")
public class AvaliacaoFisicaController {

    @Autowired
    private AvaliacaoFisicaServiceImpl service;

    @PostMapping
    public AvaliacaoFisica create(@RequestBody AvaliacaoFisicaForm form){
        return service.create(form);
    }

}
