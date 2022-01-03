package br.com.macgyver.excecoes;

import br.com.macgyver.banco.Conta;
import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils.IO;
import java.io.FileNotFoundException;


// A exceção é propagada e notificado quando algum error acontecer
public class PropagacaoExcecoes {
    public int dividir (int n1, int n2){
        try{
        return n1/n2;        
        }
        catch (ArithmeticException e){
            e.printStackTrace();
        }
        return 0;
    }    
    
    public int dividir2 (int n3, int n4) throws Exception{
    return n3/n4;
    }   
    
    //múltiplas exceções separadas por ","
    /*
    public void gravarArquivo (String valor) throws
            SecurityException, FileNotFoundException, IO Exception{
        //codigo...
    }*/
    
    //o valor depositado só pode ser maior do que zero
    public void depositar (double valor, double saldo){
        if(valor<0){
            throw new IllegalArgumentException();
        }   
        saldo = saldo + valor;
    }
    
    //não deixa que o valor sacado seja maior do que o valor do saldo
    public void sacar(double valor, double saldo) throws Exception{
        if(valor>saldo){
            throw new Exception("Saldo Insuficiente");       
    }
        saldo = saldo- valor ;
    }
    
    public static void main(String[] args){
        //cria nova instância de conta
        Conta c = new Conta();
        try{
            //sacar
            c.sacar(100);
        }catch(Exception e){
            e.printStackTrace();
        }
        //depositar
        c.depositar(200);
    }
    
    
}
    



