/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interface.Atividade;
import java.util.Scanner;
/**
 *
 * @author EDUARDOMENEZESDEOLIV
 */
public class Main {
 
    
    public void pedirPagamento(){
               Scanner sc = new Scanner(System.in);
     CartaoCredito cartao = new CartaoCredito();
     Paypal pay = new Paypal();
   
     
         System.out.println("Deseja pagar pelo cartao de credito (1) ou pelo paypal? (2)");
       int formaPagamento = sc.nextInt();
        System.out.println("Qual o valor que deseja efetuar?");
       Double valor = sc.nextDouble();
       
       if(formaPagamento == 1){
           
           System.out.println("Insira o numero de seu cartao: ");
           sc.nextLine();
           String numCartao = sc.nextLine();
           cartao.numeroCartao = numCartao;
           
           System.out.println("Insira o codigo de seguranca: ");
           int code = sc.nextInt();
            cartao.codigoSeguranca = code;
           
          
           cartao.processarPagamento(valor);
       }
       else if(formaPagamento == 2){
           System.out.println("Insira seu email: ");
           String email = sc.nextLine();
           pay.email = email;
           pay.processarPagamento(valor);
           
       }
      
    }
    public static void main(String[] args){
        Main main = new Main();
        main.pedirPagamento();
    }
}
