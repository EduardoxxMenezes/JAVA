/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package abstrataAtividade;

public class App {

    public static void main(String[] args) {
        arvore Arvore = new arvore("arvore","arvore");
        chao Chao = new chao("terra","terra");
        folha Folha = new folha("folha","folha");
        sla Sla = new sla("sla","sla");
        Arvore.habilidadeEspecial();
        Arvore.exibirDetalhes();
        Chao.habilidadeEspecial();
        Chao.exibirDetalhes();
        Folha.habilidadeEspecial();
        Folha.exibirDetalhes();
        Sla.habilidadeEspecial();
        Sla.exibirDetalhes();
        
    }
}
