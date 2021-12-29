
package br.com.macgyver.estruturas;

import java.util.Arrays;

public class MetodosStrings {
      public static void main(String[] args) {
          
          String nome = new String("maçã");
          String nome2 = new String("Maçã");
          String nome3 = new String ("maça");
          
          System.out.println(nome.equals(nome2)); //false
          
           System.out.println(nome.equalsIgnoreCase(nome2)); //true
           
           boolean teste = (nome ==nome3); //false
           System.out.println(teste);
           
           
           String nome4 = "maça";
           String nome5 = "maça";
           
           teste = (nome4==nome5); //false
           System.out.println(teste);
           
           String descricao = new String("Maçã Gala, a maçã mais doce do mercado!");
           
           System.out.println(descricao.length());
           System.out.println(descricao.startsWith("Maçã")); //true
           System.out.println(descricao.endsWith("!")); //true
           
           System.out.println(descricao.charAt(1));
           System.out.println(descricao.indexOf("G"));
           System.out.println(descricao.indexOf("Gala"));
           
           System.out.println(descricao.indexOf("a"));
           System.out.println(descricao.lastIndexOf("a"));
           
           System.out.println(descricao.replace("G", "g"));
           System.out.println(descricao.replace("Gala", "Fuji"));
           System.out.println(descricao.replace("a", "A"));
           
           System.out.println(descricao.split(" ").length);
           System.out.println(Arrays.toString(descricao.split("     ")));
           
           System.out.println(descricao.toLowerCase());
           System.out.println(descricao.toUpperCase());
           
          System.out.println(descricao.substring(0, 4));
          System.out.println(descricao.substring(4));

          System.out.println(descricao.substring(
                  descricao.indexOf("Maçã"),
                  descricao.indexOf(" ")));
          
          System.out.println(descricao);
      }
          
}
