/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interface.Atividade;

/**
 *
 * @author EDUARDOMENEZESDEOLIV
 */
public class CartaoCredito implements pagamento {
        String numeroCartao;
        int codigoSeguranca;
    @Override
    public void processarPagamento(double valor){
        System.out.println("Compra no valor de "+ valor + " concluida no cartao " + obterDetalhes());
    }
    
    @Override
    public String obterDetalhes(){
        
        String cartao = "*** *** **" + numeroCartao.substring(numeroCartao.length() - 4);
        
        return cartao + " " + codigoSeguranca;
    }
    
}
