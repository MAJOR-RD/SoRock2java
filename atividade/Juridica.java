/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade;

import java.time.LocalDate;

public class Juridica extends Pessoa{
        private String cnpj;
        private String inscricaoEstadual;
        private LocalDate dataInicio;
        private LocalDate dataTermino;
        private double valorContrato;
        
       //CONSTRUTOR

    public Juridica(String cnpj, String inscricaoEstadual, LocalDate dataInicio, LocalDate dataTermino, double valorContrato, int id, String nome, String telefone, Endereco endereco) {
        super(id, nome, telefone, endereco);
        this.cnpj = cnpj;
        this.inscricaoEstadual = inscricaoEstadual;
        this.dataInicio = dataInicio;
        this.dataTermino = dataTermino;
        this.valorContrato = valorContrato;
    }
    
    //tostring

    @Override
    public String toString() {
        return super.toString()+
                "\n CNPJ: " + cnpj + 
                "\n Inscrição Estadual: " + inscricaoEstadual + 
                "\n Data Inicio=" + dataInicio + 
                "\n Data Término=" + dataTermino + 
                "\n Valor do Contrato=" + valorContrato;
    }
    
    
        
    
    
    
    
    
      //GETTER E SETTER  

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getInscricaoEstadual() {
        return inscricaoEstadual;
    }

    public void setInscricaoEstadual(String inscricaoEstadual) {
        this.inscricaoEstadual = inscricaoEstadual;
    }

    public LocalDate getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(LocalDate dataInicio) {
        this.dataInicio = dataInicio;
    }

    public LocalDate getDataTermino() {
        return dataTermino;
    }

    public void setDataTermino(LocalDate dataTermino) {
        this.dataTermino = dataTermino;
    }

    public double getValorContrato() {
        return valorContrato;
    }

    public void setValorContrato(double valorContrato) {
        this.valorContrato = valorContrato;
    }
    
}
