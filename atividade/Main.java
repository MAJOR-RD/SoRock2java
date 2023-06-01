/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade;

import java.time.LocalDate;
import java.time.Month;

/**
 *
 * @author Aluno
 */
public class Main {


    public static void main(String[] args) {
      Endereco endereco = new Endereco("Rua LINS", "24", "Do lado da fonte", "244-8584", "Salvador", UnidadeFederativa.BAHIA);  
      Juridica juridica = new Juridica("9781389569", "2358568234834", LocalDate.of(2000, Month.MARCH, 20), LocalDate.of(2022, Month.MARCH, 20), 3.00, 1, "Matheus", "71 985456561", endereco);
      Fisica fisico = new Fisica(Genero.MASCULINO, "834.356.345-54", "235524", LocalDate.of(2003, Month.JUNE, 6), 100.5, 1, "SIM", "71 94444444", endereco);
      
        System.out.println("Juridica:");
        System.out.println(juridica);
        System.out.println("");
        System.out.println("Física:");
        System.out.println(fisico);
    }
    
}
