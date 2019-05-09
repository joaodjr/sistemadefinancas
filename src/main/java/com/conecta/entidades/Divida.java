package com.conecta.entidades;


import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.*;

@Data
@Entity
@Table(name = "divida")
public class Divida implements Serializable{
    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "cod_divida")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "valor_total", nullable = false, precision = 10, scale = 2)
    private BigDecimal valorTotal;

    @Column(name = "quant_parcela", nullable = false, length = 2)
    private Integer quantParcela;

    @Temporal(TemporalType.DATE)
    @JsonFormat(pattern = "dd/MM/yyyy")
    @Column(name = "data_inicio_pagamento", nullable = false)
    private Date dataInicioPagamento;

    @Temporal(TemporalType.DATE)
    @JsonFormat(pattern = "dd/MM/yyyy")
    @Column(name = "data_compra", nullable = false)
    private Date dataCompra;

    @Column(nullable = false, length = 30)
    private String local;

    @Column(nullable = false, length = 30)
    private String descricao;

    @ManyToOne
    @JoinColumn(name = "fk_cod_pessoa", nullable = false)
    private Person person;

    @ManyToOne
    @JoinColumn(name = "fk_cod_cartao", nullable = false)
    private Card card;


    @JsonIgnore
    @OneToMany(mappedBy = "divida", cascade = {CascadeType.ALL}, orphanRemoval = true)
    private List<Parcela> parcelas = new ArrayList();

}