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
public abstract class Pessoa {
    protected int id;
    protected String nome;
    protected String telefone;
    protected Endereco endereco;
    
  //CONSTRUTOR

    public Pessoa(int id, String nome, String telefone, Endereco endereco) {
        this.id = id;
        this.nome = nome;
        this.telefone = telefone;
        this.endereco = endereco;
    }
   
    //GETTER E SETTER

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    
    //TO STRING

    @Override
    public String toString() {
        return "Id: " + id + 
                "\n Nome: " + nome + 
                "\n Telefone: " + telefone + 
                "\n Endereço: " + endereco ;
    }
    
    
    
    
}
