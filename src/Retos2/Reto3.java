package Retos2;

import java.util.Scanner;

public class Reto3 {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);

        int [][] precio;
        precio=new int[4][4];
  
        String [][] producto;
        producto=new String[4][4];
  
        for(int filas=0;filas<4;filas++){
            for(int columnas=0;columnas<4;columnas++){
                 
              System.out.println("Ingrese el nombre del producto de la fila "+filas+" columna "+columnas);
              producto[filas][columnas] = leer.nextLine();
  
              System.out.println("Ingrese el precio de la fila "+filas+" columna "+columnas);
              precio[filas][columnas] = leer.nextInt();
  
            }
            System.out.println(" ");
        }
  
        System.out.println("Los productos son: ");
        for(int filas=0;filas<4;filas++){
             
            for(int columnas=0;columnas<4;columnas++){
                System.out.println(""+filas+""+columnas+"\t");
                System.out.println(producto[filas][columnas]+"\t");
              System.out.println(precio[filas][columnas]+"\t");
  
  
            }
            System.out.println(" ");
        }
  
        leer.close();
    }
}
