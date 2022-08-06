package com.digitalinnovation.academia.controller;

import com.digitalinnovation.academia.entity.Aluno;
import com.digitalinnovation.academia.entity.AvaliacaoFisica;
import com.digitalinnovation.academia.entity.form.AlunoForm;
import com.digitalinnovation.academia.service.impl.AlunoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/alunos")
public class AlunoController {

    @Autowired
    private AlunoServiceImpl service;

    @PostMapping
    public void criarAluno(@Valid @RequestBody AlunoForm alunoForm){
        service.create(alunoForm);
    }

    @GetMapping("/avaliacoes/{id}")
    public List<AvaliacaoFisica> getAllAvaliacaoFisicaId(@PathVariable Long id){
        return service.getAllAvaliacaoFisicaId(id);
    }

    @GetMapping
    public List<Aluno> getAll(@RequestParam(value = "dataDeNascimento", required = false)
                                      String dataDeNacimento){
        return service.getAll(dataDeNacimento);
    }

}
