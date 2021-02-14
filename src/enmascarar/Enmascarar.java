
package enmascarar;

import java.util.Scanner;

public class Enmascarar {

  
    public static void main(String[] args) {
        // se declara la variable donde se almacenara la cadena leida por teclado
        String numTarjeta;
        
        Scanner leer = new Scanner(System.in);
        System.out.println("MEDIANTE EL METODO FOR");
        System.out.println("Introduzca numero de tarjeta: ");
        numTarjeta = leer.nextLine();
        
        Tarjeta Enmascarar = new Tarjeta(numTarjeta);
        
        if(Enmascarar.validarTarjeta(numTarjeta)){
            
            String Mascara = Enmascarar.enmascararTarjeta(numTarjeta);
            
            System.out.println("Tarjeta Enmascarada: "+Mascara);
            
        }else{
            
            System.out.println("Introdujo una tarjeta incorrecta ...");
        }
        
        
    }
    
}
