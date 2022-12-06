/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.locadora;

/**
 *
 * @author Padaria
 */
public class Especificacao {
    
    private String marca;
    private String modelo;
    private String cor;

    public Especificacao(String marca, String modelo, String cor) {
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
    
    public boolean comparar(Especificacao especificacao){
        if (marca.equals(especificacao.marca)&& modelo.equals(especificacao.modelo)&& 
                cor.equals(especificacao.cor)){
            return true;
        } else {
            return false;
        }
          
    }
    
    
}
