package br.com.projaula1.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Getter
@Setter
public class Cliente {

    @Id
    private int id;
    private String cpf;
    private String nome;
    private int telefone;




}

