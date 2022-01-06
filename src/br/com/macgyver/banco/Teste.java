
package br.com.macgyver.banco;

public class Teste {
    
    public static void main (String[] args){
        
        Conta cc = new Conta();
        cc.depositar(50.0);
        cc.setAgencia(12);
        cc.setNumero(321);
        
        cc.depositar(1000);
        
        System.out.println(cc.getSaldo());        
        
        Conta poupanca = new Conta(111, 222, 1000);
        poupanca.retirar(50);
        
        System.out.println(poupanca.getSaldo());
    }
    
}