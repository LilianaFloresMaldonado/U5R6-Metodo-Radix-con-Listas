
package metodoradixlista;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


public class MetodoRadixLista {
  public static void main(String[] args) {
      
         List<Integer> Listita = new LinkedList<Integer>();
         Listita.add(1); Listita.add(3); Listita.add(5); Listita.add(7);
         Listita.add(6); Listita.add(2); Listita.add(4); Listita.add(8);
         
         System.out.println("Lista original: "+Listita);
         metodoRadix(Listita);
         //System.out.println("Lista ordenada");
         //for( j=0;j<Lista.size();j++){
         // System.out.print(Lista.get(j)+" ");
          
     }
  
     
     public static void metodoRadix(List<Integer> Lista ){
         int x,i,j;
         for(x = Integer.SIZE -1; x >= 0; x--){
             List<Integer> aux= new ArrayList<Integer>();
             for (int k = 0; k < Lista.size(); k++) {
                 aux.add(1);
             }
             j=0;
             for ( i = 0; i < Lista.size(); i++) {
                 boolean mover = Lista.get(i) << x >= 0;
                 if(x==0 ? ! mover:mover){
                     aux.set(j,Lista.get(i));                     
                     j++;
                 }else{
                     Lista.set(i-j,Lista.get(i));                     
                 }
             }
             for (i = j; i < aux.size(); i++) {
                 aux.set(i, Lista.get(i-j)); 
             } 
             Lista=aux;
         }
         System.out.print("Lista ordenada con el metodo Radix: ");
         for( j=0;j<Lista.size();j++){
          System.out.print("["+Lista.get(j)+","+"]");
          }
         System.out.println(" ");
     }
    
}   
     
    

