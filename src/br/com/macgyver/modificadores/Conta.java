package br.com.macgyver.modificadores;

import br.com.macgyver.excecoes.CriacaoExcecoes.SaldoInsuficienteException;

public abstract  class Conta {
    protected double  saldo;
    
    public void sacar (double valor) throws SaldoInsuficienteException{
        if (valor>saldo){
           // throw new  SaldoInsuficienteException();
        }
        saldo = saldo - valor;
    }
    
    //é abstrato e não possui implementação
    public abstract double verificarSaldo();
    
}
