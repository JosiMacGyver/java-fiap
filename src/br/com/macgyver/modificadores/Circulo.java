package br.com.macgyver.modificadores;

public  class Circulo {   
    
    
    //atributo com final é imutável e por convenção tem todas as letras maiúsculas
    private final double  NUMERO_PI = 3.1416;
    
    private double raio;
    
    public double calcularArea(){
        raio=10;
        return NUMERO_PI *raio *raio;
    } 

    //Não é possível acessar atributos não estáticos dentro de um processo estático
    public static int totalAcesso;
    
}
