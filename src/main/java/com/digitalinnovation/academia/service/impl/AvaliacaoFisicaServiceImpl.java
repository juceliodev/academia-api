package com.digitalinnovation.academia.service.impl;

import com.digitalinnovation.academia.entity.Aluno;
import com.digitalinnovation.academia.entity.AvaliacaoFisica;
import com.digitalinnovation.academia.entity.form.AvaliacaoFisicaForm;
import com.digitalinnovation.academia.entity.form.AvaliacaoFisicaUpdateForm;
import com.digitalinnovation.academia.repository.AlunoRepository;
import com.digitalinnovation.academia.repository.AvaliacaoFisicaRepository;
import com.digitalinnovation.academia.service.IAvaliacaoFisicaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AvaliacaoFisicaServiceImpl implements IAvaliacaoFisicaService {

    @Autowired
    AvaliacaoFisicaRepository avaliacaoFisicaRepository;

    @Autowired
    AlunoRepository alunoRepository;

    @Override
    public AvaliacaoFisica create(AvaliacaoFisicaForm form) {
        AvaliacaoFisica avaliacaoFisica = new AvaliacaoFisica();
        Aluno aluno = alunoRepository.findById(form.getAlunoId()).get();

        avaliacaoFisica.setAluno(aluno);
        avaliacaoFisica.setPeso(form.getPeso());
        avaliacaoFisica.setAltura(form.getAltura());

        return avaliacaoFisicaRepository.save(avaliacaoFisica);
    }

    @Override
    public AvaliacaoFisica get(Long id) {
        return null;
    }

    @Override
    public List<AvaliacaoFisica> getAll() {
        return null;
    }

    @Override
    public AvaliacaoFisica update(Long id, AvaliacaoFisicaUpdateForm formUpdate) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }
}
