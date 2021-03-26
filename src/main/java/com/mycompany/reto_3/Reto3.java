package com.mycompany.reto_3;

import java.util.Arrays;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Reto3 {
    
    // Eliana Janneth Puerta Morales
    // Andrés David Ocampo
    
    public static void main(String[]args ){
     int i = -1;   
     while ( i != 0){  
       String opcion =  JOptionPane.showInputDialog("Desarrollado Por: Eliana Puerta y Andres David \n" +
               "********************       BIENVENIDOS      ******************** \n"
               + " 1. Crear una matriz. \n 2. Operaciones con un vector. \n"
               + " 3. Multiplicacion de vectores. \n 4. Producto Cruz. \n 0. Salir. ");
       
         i = Integer.parseInt(opcion);
         if (i == 1){
            punto1();
         }
         else if( i == 2){
            punto2();
         }
        else if( i == 3){
            punto3();
         }
        else if( i == 4){
            punto4();
         }
        else if( i == 0){
            break;
         }
        else{
             JOptionPane.showMessageDialog(null, "Por favor digite un número entre 0 y 4");
        }
    }
}
    
    static void punto1(){
        int filas = 0;
        int columnas = 0;
        
        Scanner lector = new Scanner(System.in);      
        
        System.out.println("Ingrese las filas de la matriz: ");
           filas = lector.nextInt();
        System.out.println("Ingrese las columnas de la matriz: ");    
            columnas = lector.nextInt();
                
        double[][] matriz = new double[filas][columnas];
     
        for(int i = 0; i < filas; i++){
            for(int j = 0; j < columnas; j++){
                System.out.println("Ingrese el número de la posición "+ (i+1) +","+(j+1));
                matriz[i][j] = lector.nextDouble();            
            }
        }
       JOptionPane.showMessageDialog(null,"La matriz creada es: " + Arrays.deepToString(matriz));
    }
    
    static void punto2(){
        double suma = 0;
        double promedio = 0;
        var mayor = 0;
        var menor = 0;
        var arreglo = "";      
      
        Scanner lector = new Scanner(System.in);
        System.out.println("Ingrese los elementos del vector: ");
                arreglo = lector.next();               

        var listaenteros = arreglo.split(",");
        
        menor = Integer.parseInt(listaenteros[0]);
        
        for (int i =0 ; i< listaenteros.length; i++) {   
            
            suma = suma + Integer.parseInt(listaenteros[i]);   
            if(mayor < Integer.parseInt(listaenteros[i])){
            mayor = Integer.parseInt(listaenteros[i]);
            }
            if(menor > Integer.parseInt(listaenteros[i])){
            menor = Integer.parseInt(listaenteros[i]);
            }
        }
        promedio = suma/(listaenteros.length);
        
        JOptionPane.showMessageDialog(null,"La suma de los enteros digitados es: "
                + suma + "\nPromedio de los enteros digitados: "
                + promedio + "\nNúmero mayor ingresado: " + mayor + " \nNúmero menor ingresado: " + menor);            
                        
    }
    
    static void punto3(){
        int tamaño = 0;
        var escalar = 0;   
          
        Scanner lector = new Scanner(System.in);
        System.out.println("Ingrese el tamaño de los vectores:  ");
        tamaño = lector.nextInt();         
                
        var vector1 = new int[tamaño];
        var vector2 = new int[tamaño];
     
        System.out.println("Ingrese los valores del vector 1:  ");
        for( int i = 0 ; i < tamaño ; i++){
            vector1[i] = lector.nextInt();
        }
        System.out.println("Ingrese los valores del vector 2:  ");
        for( int d = 0 ; d < tamaño ; d++){
            vector2[d] = lector.nextInt();
        }     
        for (int k = 0; k<tamaño; k++){         
            escalar = escalar + (vector1[k]*vector2[k]);               
        }
        System.out.println(escalar);
        JOptionPane.showMessageDialog(null, "El escalar resultante es: " + escalar);
    }
    
    static void punto4(){
        
        Scanner lector = new Scanner(System.in);
  
        var vector0 = new int[3];     
        var u = new int[3];
        var v = new int[3];
        var producto = new int [3];
     
        for( int i = 0 ; i < 2 ; i++){
            vector0[i] = 1;
        }
     
        System.out.println("Ingrese los valores del vector 1:  ");
        for( int i = 0 ; i < 3 ; i++){
            u[i] = lector.nextInt();
        }
        System.out.println("Ingrese los valores del vector 2:  ");
        for( int i = 0 ; i < 3 ; i++){
            v[i] = lector.nextInt();
        }
        producto[0] = vector0[0]*((u[1]*v[2])-(v[1]*u[2]));
        producto[1] = -1*vector0[0]*((u[0]*v[2])-(v[0]*u[2]));
        producto[2] = vector0[0]*((u[0]*v[1])-(v[0]*u[1]));       
     
        JOptionPane.showMessageDialog(null,"El vector resultante es: " + Arrays.toString(producto)); 
    }
}