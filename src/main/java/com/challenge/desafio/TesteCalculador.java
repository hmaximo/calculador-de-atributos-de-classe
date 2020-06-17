package com.challenge.desafio;

import java.math.BigDecimal;

import com.challenge.interfaces.Calculavel;

public class TesteCalculador {
    
    public static void main(String[] args) {

        Calculavel calc1 = new CalculadorDeClasses();
        ClasseDesconhecida objeto = new ClasseDesconhecida();
        BigDecimal soma1 = calc1.somar(objeto);
        System.out.println("Esse é o valor da soma dos BigDecimais: " + soma1);

        BigDecimal sub1 = calc1.subtrair(objeto);
        System.out.println("Esse é o valor da subtração dos BigDecimais: " + sub1);

        BigDecimal total1 = calc1.totalizar(objeto);
        System.out.println("Esse é o valor da totalização dos BigDecimais: " + total1);
    }
}