package com.challenge.desafio;

import java.math.BigDecimal;

import com.challenge.annotation.Somar;
import com.challenge.annotation.Subtrair;

public class ClasseDesconhecida {
    

    @Somar
    public BigDecimal numero1 = BigDecimal.valueOf(5);

    @Somar
    public BigDecimal numero2 = BigDecimal.valueOf(50);

    @Somar
    public static BigDecimal numero3 = BigDecimal.valueOf(500);

    @Somar
    public int numero4 = 5000;

    @Somar
    public String texto1;

    @Somar
    public BigDecimal numeroNaoIniciado1;

    @Somar
    public static BigDecimal numeroNaoIniciado2;

    @Somar
    private BigDecimal numero5 = BigDecimal.valueOf(50000);

    @Somar
    private static BigDecimal numero6 = BigDecimal.valueOf(500000);

    @Somar
    private BigDecimal numeroNaoIniciado3;

    @Somar
    protected BigDecimal numero7 = BigDecimal.valueOf(5000000);

    @Somar
    protected BigDecimal numero8 = BigDecimal.valueOf(50000000);

    @Somar
    protected BigDecimal numeroNaoIniciado4;

    @Subtrair
    private BigDecimal menos1 = BigDecimal.valueOf(1);

    @Subtrair
    public static BigDecimal menos2 = BigDecimal.valueOf(10);

    public static BigDecimal menos3 = BigDecimal.valueOf(100);

    private static BigDecimal menos4 = BigDecimal.valueOf(1000);

    public BigDecimal getNumero1() {
        return this.numero1;
    }

    public void setNumero1(BigDecimal numero1) {
        this.numero1 = numero1;
    }

    public BigDecimal getNumero2() {
        return this.numero2;
    }

    public BigDecimal getNumero3() {
        return ClasseDesconhecida.numero3;
    }

    public void setNumero2(BigDecimal numero2) {
        this.numero2 = numero2;
    }

    public int getNumero4() {
        return this.numero4;
    }

    public void setNumero4(int numero4) {
        this.numero4 = numero4;
    }

    public String getTexto1() {
        return this.texto1;
    }

    public void setTexto1(String texto1) {
        this.texto1 = texto1;
    }

    public BigDecimal getNumeroNaoIniciado1() {
        return this.numeroNaoIniciado1;
    }

    public void setNumeroNaoIniciado1(BigDecimal numeroNaoIniciado1) {
        this.numeroNaoIniciado1 = numeroNaoIniciado1;
    }

    public BigDecimal getNumeroNaoIniciado2() {
        return ClasseDesconhecida.numeroNaoIniciado2;
    }

    public BigDecimal getNumero5() {
		return this.numero5;
	}

    public void setNumero5(BigDecimal numero5) {
        this.numero5 = numero5;
    }

    public BigDecimal getNumeroNaoIniciado3() {
		return this.numeroNaoIniciado3;
	}

    public void setNumeroNaoIniciado3(BigDecimal numeroNaoIniciado3) {
        this.numeroNaoIniciado3 = numeroNaoIniciado3;
    }

    public BigDecimal getNumero6() {
		return ClasseDesconhecida.numero6;
	}

    public BigDecimal getNumero7() {
		return this.numero7;
	}

    public void setNumero7(BigDecimal numero7) {
        this.numero7 = numero7;
    }

    public BigDecimal getNumero8() {
		return this.numero8;
	}

    public void setNumero8(BigDecimal numero8) {
        this.numero8 = numero8;
    }

    public BigDecimal getNumeroNaoIniciado4() {
		return this.numeroNaoIniciado4;
	}

    public void setNumeroNaoIniciado4(BigDecimal numeroNaoIniciado4) {
        this.numeroNaoIniciado4 = numeroNaoIniciado4;
    }

    public BigDecimal metodoTeste() {
        BigDecimal numero9 = BigDecimal.valueOf(0.5);
        return numero9;
    }

}