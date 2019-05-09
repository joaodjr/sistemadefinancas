package com.conecta.entidades;


import lombok.Data;

import java.io.Serializable;
import javax.persistence.*;

@Data
@Entity
@Table(name = "pessoa")
public class Person implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cod_pessoa")
    private Long id;

    @Column(name = "nome", nullable = false, length = 30, unique = true)
    private String nome;

    @Column(name = "ativa")
    private Integer ativa;

}