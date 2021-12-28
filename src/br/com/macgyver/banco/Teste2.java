package br.com.macgyver.banco;


public class Teste2 {
    public static void main(String[] args){
        
        //pega dados da super classe Conta e da classe Conta corrente
        ContaCorrente cc = new ContaCorrente();
        cc.setAgencia(1111);
        cc.setNumero(2222);
        cc.setTipo("PF");
        cc.setChequeEspecial(1000);
    }
    
    //só consegue pegar dados da super classe Conta
    Conta conta = new Conta();
    Conta cc = new ContaCorrente();
    
    //castting. forçando ela a seguir um submétodom, nem sempre dá certo
    //class exception
    ContaCorrente c1 = (ContaCorrente) cc;
    ContaCorrente c2 = (ContaCorrente) conta; 
    
   /*verificando, está comentado porque dá erro
    if (conta instanceof ContaCorrente){
    ContaCorrente c2=(ContaCorrente)conta;
}*/
   
}
