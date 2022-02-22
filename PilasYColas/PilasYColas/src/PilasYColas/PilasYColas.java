/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PilasYColas;

//import java.io.File;
//import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;
import java.util.Scanner;
import java.util.Stack;
/**
 *
 * @author Usuaria
 */
public class PilasYColas {

public static void main(String [] arg) {
     
      Stack<Integer> pila=new Stack<>();
      Queue<Integer> cola = new LinkedList<>();
      Random dado = new Random();
      ManejadorArchivos archivo = new ManejadorArchivos();
      int opcion = 0;
      int numero;
      String nombreArchivo = "";
      do{
          System.out.println("----------------------");
          System.out.println("PILAS Y COLAS UMG");
          System.out.println("----------------------");
          System.out.println("1. Pila");
          System.out.println("2. Cola");
          System.out.println("3. Salir");
          System.out.println("4. Eliminar Pila");
          System.out.println("5. Eliminar Cola");
          System.out.print("seleccione una opcion: ");
         Scanner entrada=new Scanner(System.in);
         opcion = entrada.nextInt();
          switch(opcion){
              case 1:
               for(int i=0; i<1000000;i++){
                  do{
                   numero=dado.nextInt();
                     }while(numero<-10000000||numero>10000000);
                pila.add(numero);
                }
                  System.out.print("Nombre del archivo: ");
        nombreArchivo =entrada.next();
      archivo.grabarPila(nombreArchivo+".txt", pila);
      
                  break;
                  
              case 2:
                      for(int i=0; i<1000000;i++){
                  do{
                   numero=dado.nextInt();
                     }while(numero<-10000000||numero>10000000);
                cola.add(numero);
                }
                  System.out.print("Nombre del archivo: ");
        nombreArchivo =entrada.next();
      archivo.grabarCola(nombreArchivo+".txt", cola);
                  break;
                  
              case 3:
                  System.out.println("****** PROGRAMA FINALIZADO *********");
                  break;
          }
      }while(opcion!=3);
     
            }
    
}


    

