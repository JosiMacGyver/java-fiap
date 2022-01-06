package br.com.macgyver.arquivos;

import br.com.macgyver.excecoes.CriacaoExcecoes.SaldoInsuficienteException;

public class Polimorfismo {
    public class Conta{
    protected double saldo;
    
    public void  sacar (double valor) throws SaldoInsuficienteException{
        if (valor>saldo){
           // throw new SaldoInsuficienteException();
        }
        saldo = saldo - valor;
    }
}
    public class ContaCorrente extends Conta{
        private double limite;
        
        @Override
        public void sacar(double valor) throws SaldoInsuficienteException{
            if (valor > saldo + limite){
               // throw new SaldoInsuficienteException();
            }
            saldo = saldo-valor;
        }
    }

}

