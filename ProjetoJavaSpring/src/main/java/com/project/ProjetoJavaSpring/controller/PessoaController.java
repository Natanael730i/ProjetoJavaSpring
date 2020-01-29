package com.project.ProjetoJavaSpring.controller;

import com.project.ProjetoJavaSpring.framework.CrudRestController;
import com.project.ProjetoJavaSpring.framework.CrudService;
import com.project.ProjetoJavaSpring.model.Pessoa;
import com.project.ProjetoJavaSpring.service.PessoaService;

public class PessoaController extends CrudRestController<Pessoa, Integer> {

    private final PessoaService pessoaService;


    public PessoaController(PessoaService pessoaService) {
        this.pessoaService = pessoaService;
    }

    public CrudService<Pessoa, Integer> getService(){
        return pessoaService;
    }
}
