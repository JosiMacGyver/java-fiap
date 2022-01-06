package br.com.macgyver.arquivos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class AcessoArquivo {

    public static void main(String[] args) {
        try {
            //Abre o arquivo
            FileWriter stream = new FileWriter("arquivo.txt");
            PrintWriter print = new PrintWriter(stream);

            //Escreve no arquivo
            print.println("Teste");
            print.println("Escrevendo no arquivo");

            //fechando o  arquivo
            print.close();
            stream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        try{
            //Abre o arquivo
            FileReader stream = new FileReader("arquivo.txt");
            BufferedReader reader = new BufferedReader(stream);
            
            //Lê uma linha do arquivo
            String linha = reader.readLine();
            while (linha !=null){
                System.out.println(linha);
                
                //lê a próxima linha do arquivo
                linha = reader.readLine();
            }
            
            reader.close();
            //fecha o arquivo
            stream.close();        
            
        }catch(IOException e){
            e.printStackTrace();
        }
        
        File arquivo = new File("arquivo2.txt");
        
        //verifica se o arquivo existe
        if (arquivo.exists()){
            System.out.println("O arquivo existe " + 
                    "Pode ser lido: " + arquivo.canRead()
                    + "Pode ser gravado " + arquivo.canWrite()
                    + "Tamanho " + arquivo.length()
                    + "Caminho " + arquivo.getPath());
        }else{
            //cria o arquivo
            try{
                if(arquivo.createNewFile())
                    System.err.println("Arquivo Criado!");
                //return true
                else
                    System.out.println("Arquivo não criado!");
                //return false
                
            }catch (IOException e){
                e.printStackTrace();
            }
        }
        
        
        
        File diretorio = new File("fiap");
        
        if (diretorio.exists()){
            System.err.println("Diretório Existe");
        }else{
            //se não existe, cria o diretório
            if(diretorio.mkdir())
                System.out.println("Diretorio Criado!");
            else
                System.err.println("Diretorio não criado.");
        }
        
        File arquivo2 = new File (diretorio, "file.txt");
        try{
            if (arquivo.createNewFile())
                System.out.println("Arquivo Criado!");
            else
                System.out.println("Arquivo não criado.");
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
