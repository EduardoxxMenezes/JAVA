/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula5.ArraysAtividade;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author EDUARDOMENEZESDEOLIV
 */
public class menu {
    boolean resultado = true; double precoTotal;
  
    ArrayList<produtos> carrinho = new ArrayList<>();
    Scanner sc = new Scanner(System.in);        
    public void verCarrinho(){
        for(produtos item: carrinho){
         System.out.println("NOME: "+ item.nome+ "\n PRECO: "+ item.preco + "\n QUANTIDADE: "+ item.estoque);
           
        }
        
        System.out.println(carrinho.get(0).nome);
    }
    public void adicionarItemCarrinho(String nomes, double precos, int estoques){
        System.out.println("O Objeto que você vai comprar é uma: \n 1- fruta. \n  2- roupa. \n 3- mascara. \n 4- moveis. \n 5-sla");
        int objeto = sc.nextInt();
        switch(objeto){
        case 1 -> carrinho.add(new frutas(nomes,precos,estoques));
        case 2 -> carrinho.add(new roupas(nomes,precos,estoques));
        case 3 -> carrinho.add(new  mascaras(nomes,precos,estoques));
        case 4 -> carrinho.add(new moveis(nomes,precos,estoques));
        case 5 -> carrinho.add(new sla(nomes,precos,estoques));
    }
     
    }
    
    public void removerItemCarrinho(int index){
        System.out.println("Produto Removido: ");
          System.out.println("NOME: "+ carrinho.get(index).nome+ "\n PRECO: "+  carrinho.get(index).nome + "\n QUANTIDADE: "+ carrinho.get(index).nome);
           
     
        carrinho.remove(index);
    }
    
    public void comprarCarrinho() {
        for (produtos item : carrinho) {
            double fullPreco = item.preco * item.estoque;
             System.out.println("NOME: "+ item.nome+ "\n PRECO: "+ item.preco + "\n QUANTIDADE: "+ item.estoque);
           
            precoTotal += fullPreco;
        }
        System.out.println("Preço total: " + precoTotal + " Tem certeza que deseja comprar? \n1- Sim / 2- NÃO.");
        int escolha = sc.nextInt();
        if (escolha == 1) {
            System.out.println("Compra concluída.");
            precoTotal = 0;
            carrinho.clear();
            System.out.println("Seu carrinho está vazio.");
        } else {
            System.out.println("COMPRA CANCELADA.");
        }
    }
    
    
    public void menu(){
        while(resultado){
        Scanner sc = new Scanner(System.in);
        System.out.println("MENU. \n 1-Ver Carrinho. \n 2- Adicionar no Carrinho. \n 3- Remover do Carrinho. \n 4- Comprar. \n 0- Sair. ");
        int menuEscolha = sc.nextInt();
        switch(menuEscolha){
            case 1:
               verCarrinho();
            break;
            case 2:
                System.out.println("Insira o nome do produto: ");
                String produtoNome = sc.nextLine();
                sc.nextLine();
                System.out.println("Insira o preco do produto (embora voce nao deveria poder fazer isso, mas fds)");
                double produtoPreco = sc.nextDouble();
                System.out.println("Insira a quantidade de produtos que você quer: ");
                int produtoQuantidade = sc.nextInt();
                adicionarItemCarrinho(produtoNome, produtoPreco,  produtoQuantidade);
            break;
            case 3:
               verCarrinho();
                System.out.println("Insira o indice do item que voce deseja remover: ");
                int Remove = sc.nextInt();
               removerItemCarrinho(Remove);
            break;
            case 4:
               comprarCarrinho();
            break;
            case 0:
               resultado = false;
               System.out.println(" FECHANDO...");
            break;
            default: 
                System.out.println("OPCAO NAO RECONHECIDA.");
            break;
        }}
    }
}
