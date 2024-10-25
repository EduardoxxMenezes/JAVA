/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abstrataAtividade;

/**
 *
 * @author EDUARDOMENEZESDEOLIV
 */
public class sla {
        String nome;
    String lider;
    
    public sla(String nome, String lider){
        this.nome = nome;
        this.lider = lider;
    }

    public void habilidadeEspecial(){
        System.out.println("Habilidade especial: fds.");
    }
    
    public void exibirDetalhes(){
        System.out.println("Nome: "+ nome + "\n lider: "+ lider);
    }
}
