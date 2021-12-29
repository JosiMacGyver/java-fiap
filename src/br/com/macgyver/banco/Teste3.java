
package br.com.macgyver.banco;

public class Teste3 {
    
    public static void main (String[] args){
        Conta conta1 = new Conta();
        conta1.depositar(1000);
        conta1.retirar(100);
        
        
        //no caso da ContaCorrente tá usando a subclasse e o valor é diferente de quando usa a superclasse
        ContaCorrente conta2 = new ContaCorrente();
        conta2.depositar(1000);
        conta2.retirar(100);
        
        Conta conta3 = new ContaCorrente();
        conta3.depositar(1000);
        conta3.retirar(100);
        
        System.err.println("Conta1:" + conta1.getSaldo());
        System.err.println("Conta2:" + conta2.getSaldo());
        System.err.println("Conta3:" + conta3.getSaldo());
    }
    
}
