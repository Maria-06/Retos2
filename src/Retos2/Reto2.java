package Retos2;

import java.util.Scanner;


public class Reto2 {
    public static void main(String[] args) {
        int cantidad, ganar=0;

        Scanner leer=new Scanner(System.in);

        System.out.println("Ingresa la cantidad de competidores");
        cantidad=leer.nextInt();

        String nombre[] =new String[cantidad];
        Double tiempo[] =new Double[cantidad];


        for(int i=0; i<nombre.length; i++){
            System.out.println("Ingresa el nombre del competidor: "+(i+1));
            nombre[i]=leer.next();

            System.out.println("Ingrese el tiempo del competidor en segundos "+(i+1));
            tiempo[i]=leer.nextDouble();
        }

        System.out.println("Nombre y tiempo del competidor");

        for(int i=0; i<cantidad; i++){
            System.out.println("El nombre del competidor "+nombre[i]+" y un tiempo de "+tiempo[i]+" segundos");
        }

        for(int i=0; i<tiempo.length; i++){
            if(tiempo[i] < tiempo[ganar]){
                ganar=i;
            }
        }

        System.out.println("El competidor ganador es: "+nombre[ganar]+" con un tiempo gana "+tiempo[ganar]+" segundos ");
    
    leer.close();
    }

}
