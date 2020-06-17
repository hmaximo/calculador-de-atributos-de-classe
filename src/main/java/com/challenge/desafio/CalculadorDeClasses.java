package com.challenge.desafio;

import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

import com.challenge.annotation.Somar;
import com.challenge.annotation.Subtrair;
import com.challenge.interfaces.Calculavel;

public class CalculadorDeClasses implements Calculavel {
    
    public BigDecimal somar(Object objeto) {
        return calculaOperacao(objeto, Somar.class);
    }

    public BigDecimal subtrair(Object objeto) {
        return calculaOperacao(objeto, Subtrair.class);
    }

    public BigDecimal totalizar(Object objeto) {
        BigDecimal total = BigDecimal.ZERO;
        total = calculaOperacao(objeto, Somar.class).subtract(calculaOperacao(objeto, Subtrair.class));
        return total;
    }

    private BigDecimal calculaOperacao(Object objeto, Class anotacao) {
        BigDecimal operacao = BigDecimal.ZERO;
        List<Field> atributos = Arrays.asList(objeto.getClass().getDeclaredFields());
        
        /* O código nesse comentário foi retirado, pois os testes estão sendo feitos em instâncias e não em classes.
        Seleção dos atributos de classe (estáticos) somente: 
        atributos = atributos.stream().filter(f -> Modifier.isStatic(f.getModifiers())).collect(Collectors.toList());*/
        
        //Iteração de busca por atributos anotados com @Somar, do tipo BigDecimal e com valores não nulos
        for (Field atributo : atributos) {
            try {
                atributo.setAccessible(true); //Modificação de acesso dos atributos não-públicos
                if (atributo.isAnnotationPresent(anotacao) 
                && atributo.getType() == BigDecimal.class 
                && atributo.get(objeto) != null) 
                    operacao = operacao.add((BigDecimal) atributo.get(objeto)); //Atualização da soma dos BigDecimais
            } catch (SecurityException | IllegalAccessException | IllegalArgumentException e) {
                e.printStackTrace();
            }
        }
        return operacao;
    }
}