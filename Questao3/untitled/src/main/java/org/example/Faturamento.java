package org.example;

import java.math.BigDecimal;

public class Faturamento {
    private int dia;
    private BigDecimal valor;


    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }
}