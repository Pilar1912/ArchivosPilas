package Validaciones;
import java.util.Scanner;

public class Validaciones {
    public int ValidarEntero(Scanner sc){
        while(!sc.hasNextInt()){
            System.out.println("Por favor ingrese un número entero");
            sc.next();
        }
        return sc.nextInt();
    }

    public Double ValidarDecimal(Scanner sc){
        while(!sc.hasNextDouble()){
            System.out.println("Por favor ingrese un número decimal");
            sc.next();
        }
        return sc.nextDouble();
    }
    
}
