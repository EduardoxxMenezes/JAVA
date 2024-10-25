/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abstrataAtividade;

/**
 *
 * @author EDUARDOMENEZESDEOLIV
 */
abstract class cla {
    String nome;
    String lider;
    
    public cla(String nome, String lider){
        
    }
    public abstract void habilidadeEspecial();
    
    public void exibirDetalhes(){
        System.out.println("Nome: "+ nome + "\n lider: "+ lider);
    }
}
