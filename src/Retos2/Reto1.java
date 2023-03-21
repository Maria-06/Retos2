package Retos2;

import java.util.Scanner;

public class Reto1 {
    public static void main(String[] args) {
        
    int cantidad;
    double promedio, suma=0;

    Scanner leer=new Scanner(System.in);

    System.out.println("Ingresa la cantidad de notas:");
    cantidad=leer.nextInt();
    double nota[] =new double[cantidad];

    for(int i=0; i<cantidad; i++){
        System.out.println("Ingresa el valor de la nota"+(i+1));
        nota[i]=leer.nextDouble();
        suma=suma+nota[i];

    }
    promedio=suma/cantidad;
    System.out.println("El promedio de la notas es:"+promedio);

    if(promedio<3){
        System.out.println("Reprobaste");
    }else if(promedio>=3 && promedio<=4){
        System.out.println("Pasaste Raspando");
    }else if(promedio <4){
        System.out.println("Aprobaste con buenos resultados");
    }else{
        System.out.println("La nota que ingresaste no es valida");
    }

    leer.close();
    }


}
