/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula5.ArraysAtividade;

/**
 *
 * @author EDUARDOMENEZESDEOLIV
 */
abstract class produtos {
    protected String nome;
    protected double preco;
    protected int estoque;
    
    public produtos(String nomes, double precos, int estoques){
    this.nome = nomes;
    this.preco = precos;
    this.estoque = estoques;
}
    public void GetInfo(){
          System.out.println("Produto: "+ this.nome + "\n preco: "+ this.preco+" \n estoque: "+ this.estoque);
    }
    
}
