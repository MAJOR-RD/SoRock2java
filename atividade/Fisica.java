/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade;

import java.time.LocalDate;
import java.time.Period;

/**
 *
 * @author Aluno
 */
public class Fisica extends Pessoa{
    
    private Genero genero; 
    private String cpf;
    private String rg;
    private LocalDate dataNascimento;
    private double salario;
   
    //CONSTRUTOR

    public Fisica(Genero genero, String cpf, String rg, LocalDate dataNascimento, double salario, int id, String nome, String telefone, Endereco endereco) {
        super(id, nome, telefone, endereco);
        this.genero = genero;
        this.cpf = cpf;
        this.rg = rg;
        this.dataNascimento = dataNascimento;
        this.salario = salario;
    }
    
//TO STRING

    @Override
    public String toString() {
        return super.toString()+
                "\n Gênero :" + genero.getTexto() + 
                "\n cpf: " + cpf + 
                "\n rg: " + rg + 
                "\n Data Nascimento: " + dataNascimento + 
                "\n Salario=" + salario;
    }
    
   
    
    
    //GETTER E SETTER
    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
   //GETIDADE
    
    public int getIdade(){
        return Period.between(dataNascimento, LocalDate.now()).getYears();
    }
    
}
