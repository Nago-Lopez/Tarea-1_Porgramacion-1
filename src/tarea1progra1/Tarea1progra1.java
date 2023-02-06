
package tarea1progra1;

import java.util.Scanner;
import javax.swing.JOptionPane;


public class Tarea1progra1 {

  
    public static void main(String[] args) {
     
       menu();
      
    }  
    
    
  public static void menu(){ 
      
        Scanner leer = new Scanner (System.in);
        byte opcion = 0;
        do {
      System.out.println("1.Sumar" );
      System.out.println("2.Restar" );
      System.out.println("3.Dividir" );
      System.out.println("4.Multiplicar" );
      System.out.println("5.Salir" );
      System.out.println("Digite una opción" );
      opcion = leer.nextByte();
            switch (opcion){
                case 1: sumar();
                    break;
                 case 2: restar();
                    break;   
                  case 3: dividir();
                    break; 
                  case 4: multiplicar();
                    break; 
                  
                default:
                    throw new AssertionError();
            }
          
          
        
              } while (opcion!=5);
        
    }
    public static void sumar(){ 
 Scanner leer = new Scanner (System.in);
        byte num1 , num2;
     
        float total; 
        
        System.out.println("Digite un numero" );   
        num1 = leer.nextByte();
        System.out.println("Digite otro numero" );   
        num2 = leer.nextByte();
        
     total = num1+ num2;
     
    System.out.println("total suma: " + total);
    
    }
    
    public static void restar(){ 
        
    Scanner leer = new Scanner (System.in);
        byte num1 , num2;
     
        float total; 
        
        System.out.println("Digite un numero" );   
        num1 = leer.nextByte();
        System.out.println("Digite otro numero" );   
        num2 = leer.nextByte();
        
     total = num1- num2;
     
    System.out.println("total resta: " + total);
    
    }
    
    public static void multiplicar(){ 
    Scanner leer = new Scanner (System.in);
        byte num1 , num2;
     
        float total; 
        
        System.out.println("Digite un numero" );   
        num1 = leer.nextByte();
        System.out.println("Digite otro numero" );   
        num2 = leer.nextByte();
        
     total = num1* num2;
     
    System.out.println("total multiplicacion: " + total);
    
    }


    public static void dividir(){ 
    Scanner leer = new Scanner (System.in);
        byte num1 , num2;
     
        float total; 
        
        System.out.println("Digite un numero" );   
        num1 = leer.nextByte();
        System.out.println("Digite otro numero" );   
        num2 = leer.nextByte();
        
     total = num1/ num2;
     
    System.out.println("total dividir: " + total);
    
    
    }/*main*/
    
}/*class*/
