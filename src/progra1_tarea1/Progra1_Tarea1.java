
package Progra1_Tarea1;


import javax.swing.JOptionPane;


public class Progra1_Tarea1 {

  
    public static void main(String[] args) {
     
       menu();
      
    }  
    
    
  public static void menu(){ 
      
       String seguir = "", result = "";
       
        int opc;
        do {
      result = "";
            opc = Integer.parseInt(JOptionPane.showInputDialog(null,
                "Calculadora : \n 1.Sumar \n 2.Restar \n 3.Multiplicar \n 4.Dividir \n 5.Salir"+
                "\n Favor seleccionar la operación que desea realizar"));
            
            switch (opc){
                case 1: sumar();
                    break;
                 case 2: restar();
                    break;   
                  case 3: multiplicar();
                    break; 
                  case 4: dividir();
                    break; 
                  case 5: JOptionPane.showMessageDialog(null,"Gracias por usar la calculadora");
                    break; 
                default:
                    throw new AssertionError();
            }
          
          
        
      
        } while (opc!=5);
        
    }
    public static void sumar(){ 

      double num1, num2, total;  
        
      num1 = Double.parseDouble(JOptionPane.showInputDialog(null,
               "Digite un número"));
        
      num2= Double.parseDouble(JOptionPane.showInputDialog(null,
               "Digite otro número"));
              
              
     total = num1+ num2;
     
    JOptionPane.showMessageDialog(null, "total suma: " + total);
    
    }
    
    public static void restar(){ 
        
    double num1, num2, total;  
        
      num1 = Double.parseDouble(JOptionPane.showInputDialog(null,
               "Digite un número"));
        
      num2= Double.parseDouble(JOptionPane.showInputDialog(null,
               "Digite otro número"));
      
    total = num1- num2;
      JOptionPane.showMessageDialog(null, "total resta: " + total);
    
    }
    
    public static void multiplicar(){ 
    double num1, num2, total;  
        
      num1 = Double.parseDouble(JOptionPane.showInputDialog(null,
               "Digite un número"));
        
      num2= Double.parseDouble(JOptionPane.showInputDialog(null,
               "Digite otro número"));
      
    total = num1* num2;
      JOptionPane.showMessageDialog(null, "total mutiplicación: " + total);
    
    }


    public static void dividir(){ 
     
        double num1, num2, total;  
        
      num1 = Double.parseDouble(JOptionPane.showInputDialog(null,
               "Digite un número"));
        
      num2= Double.parseDouble(JOptionPane.showInputDialog(null,
               "Digite otro número"));
      
    total = num1/ num2;
      JOptionPane.showMessageDialog(null, "total división: " + total);
    
    
    }/*main*/
    
}/*class*/
