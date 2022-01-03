package br.com.macgyver.colecoes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class TestCollections {
    
    public static void main (String[] args){
        ArrayList carrinho = new ArrayList();
        Double valor = 100.55;
        int valor2 = 1;
        int valor3;
        
        carrinho.add(valor);
        carrinho.add("Uva");
        carrinho.add(valor2);
        
        System.out.println(carrinho.get(1));
        
        //cast
        valor3 = (int) carrinho.get(2);
        
        System.out.println(valor);       
                
        List <String> carrinho2 = new ArrayList<String>();
        
        System.out.println(carrinho2.isEmpty()); //true
        
        carrinho2.add("Maçã");
        carrinho2.add("Morango");
        carrinho2.add("Maçã");
        carrinho2.set(1, "Pera");
        
        System.out.println(carrinho2.isEmpty());
        System.out.println(carrinho2.size());
        
        System.out.println(carrinho2.contains("Maçã"));
        System.out.println(carrinho2.indexOf("Maçã"));
        System.out.println(carrinho2.get(carrinho2.indexOf("Maçã")));
        System.out.println(carrinho2.lastIndexOf("Maçã"));
        
        Set<String> cesta = new HashSet<String>();
        
        
        //HashSet não permite itens repetidos
        System.out.println(cesta.isEmpty());
        cesta.add("Maçã");
        cesta.add("Maçã");
        cesta.add("maçã");
        System.out.println(cesta.isEmpty());
        
        System.out.println(cesta.size());
        System.out.println(cesta);

       Map<String, String> caixa = new HashMap<String, String>();
       caixa.put("M2225", "Fernando");
       caixa.put("M2226", "Maria");
       caixa.put("M2227", "Soraya");
       
        System.out.println(caixa.isEmpty());
        System.out.println(caixa.size());
        System.out.println(caixa.containsKey("M2225"));
        System.out.println(caixa.containsValue("Fernando"));
        System.out.println(caixa);
      
    }
    
}
