/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PilasYColas;

/**
 *
 * @author Usuaria
 */
public class metodoCola {
    public class MetCol {
    Object cola[]= new Object[11];
    int bol=0;
    
    public void Meter(String a){
        if(bol<11){
            cola[bol]=a;
            bol++;
        }
    } 
    
    public void Sacar(){
        if(bol>0){
            cola[0]=null;
            for(int b=1;b<bol;b++)//como se acomoda la tabla
            cola[b-1]=cola[b];
        }
        bol--;
    }
    
    public String MostCola(){
        String m="";
        if(bol==0){
            m="No Hay Clientes: ";
        }else{
            for(int c=0;c<bol;c++)
                m+=("Clientes: "+(c+1)+" "+cola[c]+"\n");//trae elemento y suma 1
        }
         return m;   
    }
    
    public String Clientes(){
        String client="";
        client=("Clientes: "+bol);
        return client;
    }
    
    //para corroborar si esta llena la cola
    public String Recorrer(){
        String Comp="";
        if(bol==11){
            Comp="Esta Llena: ";
        }else{
            Comp="No esta llena: ";
        }
        return Comp;
        
    }
    
    //ver si esta vacia
    public String RecorrerV(){
        String Vacio="";
        if(bol==11){
            Vacio="No Esta vacia: ";
        }else{
            Vacio="Vacia: ";
        }
        return Vacio;   
    }
    
    //Para ver quien esta al inicio de la cola
    public String Inicio(){
        String ini="";
        if(cola[0]!=null){
            ini=(""+cola[0]);
        }else{
            ini=("No hay Clientes");
        }
        return ini;
        
    }
    
    //Ver quien esta al final
     public String Final(){
        String fin="";
        if(cola[0]!=null){
            fin=(""+cola[bol-1]);
        }else{
            fin=("No hay Clientes");
        }
        return fin;
    }
     
     public void Limpiar(){
         for(int d=bol-1;d>=0;d--)
             cola[d]=null;
         bol=0;
     }
}
}
