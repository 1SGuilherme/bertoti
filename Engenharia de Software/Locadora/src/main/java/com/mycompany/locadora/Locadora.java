/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.locadora;

import java.util.LinkedList;
import java.util.List;

public class Locadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    

    
    private List<DataLocacao> datas = new LinkedList<DataLocacao>();

    public void cadastrarLocacao(DataLocacao data){
        datas.add(data);
    
    }       
           
    private List<Carro> carros = new LinkedList<Carro>();

    public void cadastrarCarro(Carro carro){
        carros.add(carro);
    }
    
    public List<Carro> buscarCarroPorEspecificacao(Especificacao espec){
        List<Carro> carrosDisponiveis = new LinkedList<Carro>();
        for(Carro carro:carros){
            if(carro.getEspec().comparar(espec)) 
                carrosDisponiveis.add(carro);
        }
        return carrosDisponiveis;
        
    }   
    
    private List<Cliente> clientes = new LinkedList<Cliente>();

    public void cadastrarCliente(Cliente cliente){
        clientes.add(cliente);
    }
        



}



