/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula5.ArraysAtividade;

/**
 *
 * @author EDUARDOMENEZESDEOLIV
 */
public class mascaras extends produtos{
    String nome;
 double preco;
 int estoque;
    
    public mascaras(String nomes, double precos, int estoques){
        super(nomes,precos,estoques);
    }
    @Override
    public void GetInfo(){
      System.out.println("Produto: "+ this.nome + "\n preco: "+ this.preco+" \n estoque: "+ this.estoque);
    }
}
