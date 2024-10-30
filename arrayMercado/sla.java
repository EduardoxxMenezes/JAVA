/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula5.ArraysAtividade;

/**
 *
 * @author EDUARDOMENEZESDEOLIV
 */
public class sla extends produtos{
    String nome;
 double preco;
 int estoque;
    
    public sla(String nomes, double precos, int estoques){
        super(nomes,precos,estoques);
    }
    @Override
    public void GetInfo(){
        System.out.println("Produto: "+ nome + "\n preco: "+ preco+" \n estoque: "+estoque);
    }
}
