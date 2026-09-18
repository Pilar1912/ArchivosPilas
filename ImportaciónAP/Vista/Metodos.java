package Vista;
import java.util.Stack;
import java.util.UUID;
import Validaciones.Validaciones;
import java.util.Scanner;

import Modelo.Objeto;

public class Metodos {
    Scanner sc = new Scanner(System.in);
    public Stack<Objeto> LlenarDatos(Stack<Objeto> p){
        boolean continuar = true;
        Validaciones v = new Validaciones();
        while(continuar){
            Objeto o = new Objeto();
            o.setId(UUID.randomUUID());
            System.out.println("Ingrese tipo de vehiculo: 1).Sedan 2).Camioneta");
            o.setTipoVehiculo(v.ValidarEntero(sc));
            System.out.println("Ingrese marca del vehiculo");
            o.setMarca(sc.next());
            System.out.println("Ingrese el color del vehiculo");
            o.setColor(sc.next());
            System.out.println("Ingrese el valor del vehiculo");
            o.setValor(v.ValidarDecimal(sc));
            System.out.println("Ingrese la cédula del propietario");
            o.setCedulaPropietario(sc.next());
            System.out.println("Ingrese el nombre del propietario");
            o.setNombrePropietario(sc.next());
            p.push(o);
            System.out.println("¿Desea seguir ingresando valores? 1). si 2). no");
            int opcion = v.ValidarEntero(sc);
            if(opcion == 2){
                continuar = false;
            }
        }

        return p;
    }
}
