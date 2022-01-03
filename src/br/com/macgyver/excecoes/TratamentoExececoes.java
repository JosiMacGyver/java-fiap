package br.com.macgyver.excecoes;

import java.util.InputMismatchException;
import java.util.Scanner;


public class TratamentoExececoes {
    public static void main (String[] args)  {
        Scanner sc = new Scanner(System.in);
        
        int numero1 = sc.nextInt();
        int numero2 = sc.nextInt();
        
        //evitando que o numerador seja zero
        // a exceção é capturada com parâmetro "e'
        try{
        int divisao = numero1/numero2;
         System.out.println("O resultado é " + divisao);
        }catch(ArithmeticException e){
            System.err.println("Erro ao dividir");
        }        
        
        
        //utilizando múltipolos catchs e finally para executar o código obrigatóriamente
        try{
            int numero3 = sc.nextInt();
            int numero4 = sc.nextInt();
            
            int div = numero3/numero4;
            System.out.println("O resultado da divisão é " + div);
        }catch(ArithmeticException e) {
            System.err.println("Erro ao dividir");
        }catch(InputMismatchException e){
            System.err.println("Erro de entrada de dados");
        }finally{
            System.out.println("Finalizando a execução do programa");
            sc.close();
        }
        sc.close();
        
        
        
        int[] array = new int [2];
        
        try{
            //tenta acessar poisição que não existe no vetor
            array[2] = 10;
        }catch(ArrayIndexOutOfBoundsException e){
            System.err.println("Mensagem de erro" + e.getMessage());
            e.printStackTrace();
        }
    }
}
