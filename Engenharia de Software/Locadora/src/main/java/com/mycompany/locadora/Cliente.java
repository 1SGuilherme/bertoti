/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.locadora;

/**
 *
 * @author Padaria
 */
public class Cliente {
    
    private String nome;
    private int idade;
    private String endereco;
    private Cartao card;
    private long cpf;

    
    public Cliente(String nome, int idade, String endereco, Cartao card, long cpf) {
        this.nome = nome;
        this.idade = idade;
        this.endereco = endereco;
        this.card = card;
        this.cpf = cpf;
    }
    
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Cartao getCard() {
        return card;
    }

    public void setCard(Cartao card) {
        this.card = card;
    }

    public long getCpf() {
        return cpf;
    }

    public void setCpf(long cpf) {
        this.cpf = cpf;
    }
    
    
       
    
}
