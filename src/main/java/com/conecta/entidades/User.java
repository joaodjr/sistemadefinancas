package com.conecta.entidades;


import lombok.Data;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "usuario")
public class User implements Serializable {
    private static long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cod_usuario")
    private Long id;

    @Column(name = "nome", nullable = false, length = 30)
    private String nome;

    @Column(name = "senha", nullable = false, length = 8)
    private String senha;

    @Column(name = "login", nullable = false, length = 30, unique = true)
    private String login;

    @ManyToOne
    @JoinColumn(name = "fk_cod_perfil_usuario", nullable = false)
    private PerfilUsuario perfilUsuario;
}