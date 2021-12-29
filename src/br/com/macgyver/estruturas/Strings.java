package br.com.macgyver.estruturas;


public class Strings {
     public static void main(String[] args) {
         
         String nome;
         nome = new String();
         nome = "Maçã";
         System.out.println(nome);
         
         String nome2 = new String ("Maçã");
         System.out.println(nome2);
                  
         //usa um pull de memória para armazenar maçã ao invés de alocar memória
         String nome3 = "Maçã";
         System.out.println(nome3);
                  
         /*//null pointer exception
         String nome4 = null;
         System.err.println(nome4.length()); */        
         
         
         /*
         String descricao = "Tipo Gala \nA maçã mais doce do mercado ";
         System.out.println(descricao);
         
         descricao = "Tipo Gala \tA maçã mais doce do mercado";
         System.out.println(descricao);
         
         descricao= "Tipo Gala, \"A maçã mais doce do mercado\"";
         System.out.println(descricao);      
       */
         
         String fruta = new String("Maçã");
         String descricao  = new String();
         descricao ="tipo Gala, a maçã mais doce do mercado";
         
         String propaganda = nome + " " + descricao;
         System.out.println(propaganda);
         
         propaganda =  nome.concat(" ").concat(descricao);
         System.out.println(propaganda);
         
         propaganda  +=  " ";
         System.out.println(propaganda);
         
       
         
      
     }
    
}
