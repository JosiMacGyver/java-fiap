
package br.com.macgyver.excecoes;

public class CriacaoExcecoes {
    
    public void depositar(double valor, double saldo){
        if (valor<0){
            throw new ValorInvalidoException();
        }
    }
    
    public void sacar(double valor, double saldo) throws SaldoInsuficienteException{
        if (valor>saldo){
            throw new SaldoInsuficienteException();
        }
        saldo = saldo - valor;    }
    
    public class ValorInvalidoException extends RuntimeException{       
     
        
    }
    
    public class SaldoInsuficienteException extends Exception{
        
    }
    
}
