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
public enum UnidadeFederativa {
    BAHIA("Bahia", "BA"),
    SAO_PAULO("São Paulo","SP"),
    RIO_DE_JANEIRO("Rio de Janeiro", "RJ");
    
    private String texto;
    private String sigla;
//construtor
    private UnidadeFederativa(String texto, String sigla) {
        this.texto = texto;
        this.sigla = sigla;
    }
    
    //getter

    public static UnidadeFederativa getBAHIA() {
        return BAHIA;
    }

    public static UnidadeFederativa getSAO_PAULO() {
        return SAO_PAULO;
    }

    public static UnidadeFederativa getRIO_DE_JANEIRO() {
        return RIO_DE_JANEIRO;
    }

    public String getTexto() {
        return texto;
    }

    public String getSigla() {
        return sigla;
    }
    
    
}
