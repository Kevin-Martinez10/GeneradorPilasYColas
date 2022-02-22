/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PilasYColas;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Queue;
import java.util.Stack;

/**
 *
 * @author Usuaria
 */
public class ManejadorArchivos {
     public void grabarPila(String nombre_archivo,Stack<Integer> pila)
    {
        try
        {
            BufferedWriter bw=new BufferedWriter(new FileWriter("Pila"+nombre_archivo));
            int contador=1;
            while(!pila.empty()){
                 bw.write(contador+"): "+pila.pop()+"\n");
                 contador++;
            }
               
          
            System.out.println("****** Archivo: Pila"+nombre_archivo+" generado exitosamente. *********");
            
            bw.close();
            
        }catch(IOException ioe)
        {
            System.out.println("no se ha opodido escribir en el archivo");
        }
    }
     
      public void grabarCola(String nombre_archivo,Queue<Integer> cola)
    {
        try
        {
            BufferedWriter bw=new BufferedWriter(new FileWriter("Cola"+nombre_archivo));
            int contador=1;
            while(!cola.isEmpty()){
                 bw.write(contador+"): "+cola.poll()+"\n");
                 contador++;
            }
            System.out.println("****** Archivo: Cola"+nombre_archivo+" generado exitosamente. *********");
            
            bw.close();
            
        }catch(IOException ioe)
        {
            System.out.println("no se ha opodido escribir en el archivo");
        }
    }
    
   
     public  void lectura(String nombre_archivo)
     {
         try
         {
             BufferedReader bf=new BufferedReader(new FileReader(nombre_archivo));
             String linea="";
             int numeros []= new int[1000000];
             int contador = 0;
             while(linea!=null)
             {
                 linea=bf.readLine();
                 if(linea!=null)
                 {
                   numeros[contador] =Integer.parseInt(linea.split(":")[1].substring(1));
                   contador++;
                 }
                 
             }
             
             int temp =0;
             System.out.println("---- ordenando numeros, espere .... ----");
             for (int i = 0; i < numeros.length-1; i++) {
                 System.out.println("Completado ("+i+" de 1000000 )");
                 for (int j = 0; j < numeros.length-1; j++) {
                     if(numeros[j]>numeros[j+1]){
                         temp = numeros[j+1];
                         numeros[j+1]=numeros[j];
                         numeros[j]=temp;
                     }
                 }
             }
             System.out.println("----- numeros ordenados --------");
             
            // this.grabar("Ordenado_"+nombre_archivo, numeros);
             
             bf.close();
         }catch(FileNotFoundException e){
             System.out.println("No se encuentra el fichero");
         }catch(IOException e){
         }
     }
     
}
