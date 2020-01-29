package com.project.ProjetoJavaSpring.data;

import com.project.ProjetoJavaSpring.model.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PessoaData extends JpaRepository<Pessoa, Integer> {

    Pessoa findByCpf(String cpf);

}
