package com.carlos.springvscode.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import lombok.Data;

@Entity
@Data
public class Estado {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nome;

    @JsonManagedReference
    @OneToMany(mappedBy = "estado")
    private List<Cidade> cidade = new ArrayList<>();

    public Estado() {
    }
    
    public Estado(Integer id, String nome) {
        this.id = id;
        this.nome = nome;
    }


    
}