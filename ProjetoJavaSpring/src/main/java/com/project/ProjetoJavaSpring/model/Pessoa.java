package com.project.ProjetoJavaSpring.model;


import com.project.ProjetoJavaSpring.utils.ValidaCpf;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="PESSOA")
public class Pessoa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Integer Id;

    @Column(name = "CPF")
    private String cpf;

    @Column(name = "nome")
    private String nome;

    @Column(name = "Endereco")
    private Endereco endereco;

    @Column(name = "DataNascimento")
    private Date dataNacimento;

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDataNacimento() {
        return dataNacimento;
    }

    public void setDataNacimento(Date dataNacimento) {
        this.dataNacimento = dataNacimento;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        Boolean cpfTeste = ValidaCpf.isCPF(cpf);
        if(cpfTeste){
            this.cpf = cpf;
        }else{
          throw new RuntimeException("CPF invalido!");
        }

    }
}