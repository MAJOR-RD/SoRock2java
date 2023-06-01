/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade;

/**
 *
 * @author Aluno
 */
public class Endereco {
    protected String logradoro;
    protected String numero;
    protected String complemento;
    protected String cep;
    protected String cidade;
    protected UnidadeFederativa uf;

    //construtor
    public Endereco(String logradoro, String numero, String complemento, String cep, String cidade, UnidadeFederativa uf) {
        this.logradoro = logradoro;
        this.numero = numero;
        this.complemento = complemento;
        this.cep = cep;
        this.cidade = cidade;
        this.uf = uf;
    }
    
    //Tostring

    @Override
    public String toString() {
        return "\n logradoro: " + logradoro + 
                "\n numero: " + numero + 
                "\n complemento: " + complemento + 
                "\n cep: " + cep + 
                "\n cidade: " + cidade + 
                "\n uf: " + uf.getTexto();
        
    }
    
    
   
    


//getter e setter

    public String getLogradoro() {
        return logradoro;
    }

    public void setLogradoro(String logradoro) {
        this.logradoro = logradoro;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public UnidadeFederativa getUf() {
        return uf;
    }

    public void setUf(UnidadeFederativa uf) {
        this.uf = uf;
    }
    
    
    
    
    
    
}
