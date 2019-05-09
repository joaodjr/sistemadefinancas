package com.conecta.entidades;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.*;

@Data
@Entity
@Table(name = "cartao")
public class Card implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cod_cartao")
    private Long id;

    @Column(name = "nome", nullable = false, length = 30)
    private String nome;

    @Column(name = "banco", nullable = false, length = 30)
    private String banco;

    @Column(name = "dia_vencimento")
    private Integer diaVencimento;

    @Column(name = "limite", precision = 10, scale = 2)
    private BigDecimal limite;

    @Column(name = "melhor_dia_compra")
    private Integer melhorDiaCompra;

    @Column(name = "ativo")
    private Integer ativo;

}
