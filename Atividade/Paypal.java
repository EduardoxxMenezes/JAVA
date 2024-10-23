/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interface.Atividade;

/**
 *
 * @author EDUARDOMENEZESDEOLIV
 */
public class Paypal implements pagamento{
   String email;
    
    @Override
    public void processarPagamento(double valor){
        System.out.println("Pagamento realizado no valor de R$"+ valor + " realizado no E-mail de: "+ obterDetalhes());
    }
    @Override
    public String obterDetalhes(){
        return email;
    }
}
