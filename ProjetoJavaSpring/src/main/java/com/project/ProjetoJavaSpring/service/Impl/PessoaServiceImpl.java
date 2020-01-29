package com.project.ProjetoJavaSpring.service.Impl;

import com.project.ProjetoJavaSpring.data.PessoaData;
import com.project.ProjetoJavaSpring.framework.CrudServiceImpl;
import com.project.ProjetoJavaSpring.model.Pessoa;
import com.project.ProjetoJavaSpring.service.PessoaService;
import org.springframework.data.jpa.repository.JpaRepository;

public class PessoaServiceImpl extends CrudServiceImpl<Pessoa, Integer> implements PessoaService {

    private final PessoaData pessoaData;

    public PessoaServiceImpl(PessoaData pessoaData) {
        this.pessoaData = pessoaData;
    }

    @Override
    public JpaRepository<Pessoa, Integer> getRepository() {
        return pessoaData;
    }


}
