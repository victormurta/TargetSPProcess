package org.example;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;


public class Main {
    public static void main(String[] args) {

        BigDecimal soma = BigDecimal.ZERO;
        BigDecimal menor = BigDecimal.ZERO;
        BigDecimal maior = BigDecimal.ZERO;
        BigDecimal media = BigDecimal.ZERO;
        int dias = 0, diasZerados = 0;

        try {

            Gson gson = new Gson();
            Type listType = new TypeToken<List<Faturamento>>() {}.getType();
            List<Faturamento> faturamentos = gson.fromJson(new FileReader("dados.json"), listType);


            for (Faturamento faturamento : faturamentos) {
                if (faturamento.getValor().compareTo(BigDecimal.ZERO) > 0){
                    soma = soma.add(faturamento.getValor());
                } else {
                    diasZerados++;
                }
            }

            media = soma.divide(BigDecimal.valueOf(faturamentos.size()-diasZerados), 2, RoundingMode.CEILING);

            for (Faturamento faturamento : faturamentos) {
                if (maior.compareTo(faturamento.getValor()) < 0){
                    maior = faturamento.getValor();

                } else if (menor.compareTo(faturamento.getValor()) > 0){
                    menor = faturamento.getValor();
                }

                if (media.compareTo(faturamento.getValor()) < 0){
                    dias++;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Menor Faturamento: " + menor);
        System.out.println("Maior Faturamento: " + maior);
        System.out.println("Dias de Faturamento acima da média mensal: " + dias);
        System.out.println("A média foi: " + media);
    }
}