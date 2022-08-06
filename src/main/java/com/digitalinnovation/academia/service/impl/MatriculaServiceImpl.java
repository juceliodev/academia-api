package com.digitalinnovation.academia.service.impl;

import com.digitalinnovation.academia.entity.Aluno;
import com.digitalinnovation.academia.entity.Matricula;
import com.digitalinnovation.academia.entity.form.MatriculaForm;
import com.digitalinnovation.academia.repository.AlunoRepository;
import com.digitalinnovation.academia.repository.MatriculaRepository;
import com.digitalinnovation.academia.service.IMatriculaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MatriculaServiceImpl implements IMatriculaService {

    @Autowired
    private MatriculaRepository matriculaRepository;

    @Autowired
    private AlunoRepository alunoRepository;

    @Override
    public Matricula create(MatriculaForm form) {
        Matricula matricula = new Matricula();
        Aluno aluno = alunoRepository.findById(form.getAlunoId()).get();

        matricula.setAluno(aluno);

        return matriculaRepository.save(matricula);
    }

    @Override
    public Matricula get(Long id) {
        return matriculaRepository.findById(id).get();
    }

    @Override
    public List<Matricula> getAll(String bairro) {

        if(bairro == null){
            return matriculaRepository.findAll();
        }else{
            return matriculaRepository.findAlunosMatriculadosBairro(bairro);
            //return matriculaRepository.findByAlunoBairro(bairro);

        }

    }

    @Override
    public void delete(Long id) {}



}
