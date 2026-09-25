package Archivos;
import Modelo.Objeto;

import java.util.Stack;
//import java.util.UUID;
import java.io.FileWriter;
//import java.util.LinkedList;
import java.io.IOException;

public class Exportar {
    public void exportarArchivo(Stack<Objeto> p){
        if(p.isEmpty()){
            System.out.println("La lista está vacía, no se puede exportar el archivo");
            return;
        }
        else{
            try(FileWriter e = new FileWriter("Vehiculo.txt")){
                for(Objeto obj : p){
                    e.write("Guid: " + obj.getId() + "\n");
                    e.write("Tipo de vehiculo: " + obj.getTipoVehiculo() + "\n");
                    e.write("Marca: " + obj.getMarca() + "\n"); 
                    e.write("Marca: " + obj.getColor() + "\n"); 
                    e.write("Marca: " + obj.getValor() + "\n"); 
                    e.write("Marca: " + obj.getCedulaPropietario() + "\n"); 
                    e.write("Marca: " + obj.getNombrePropietario() + "\n"); 
                    e.write("---------------------------------------------------/n");

                }
                System.out.println("Archivo exportado correctamente.");
            }
            catch(IOException e){
                e.printStackTrace();
            }
        
        }
    }
}
