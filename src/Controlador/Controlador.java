/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Usuario;
import Vista.*;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Vector;

/**
 *
 * @author jorge
 */
public class Controlador {
public static ArrayList<Usuario> listaUsuarios = new ArrayList<Usuario>();
public static ArrayList<Vector<Object>> listaObras = new ArrayList<Vector<Object>>();

public static void escribirDatosEnTxt(String nombreArchivo, int numeroLista){
     try{
            ObjectOutputStream salida  = new ObjectOutputStream(new FileOutputStream(nombreArchivo));
            if(numeroLista == 1){
                salida.writeObject(Controlador.listaUsuarios);
            }else
                if(numeroLista == 2){
                  salida.writeObject(Controlador.listaObras);
                }
            salida.close();
        }
        catch(IOException e){
            System.out.println("No se pudo escribir en TXT");
        }
}

public static void leerDatosEnTxt(String nombreArchivo, int numeroLista) throws ClassNotFoundException{
    try{    
        System.out.println("Se ejecuta 1");
        ObjectInputStream entrada = new ObjectInputStream(new FileInputStream(nombreArchivo));
        System.out.println("Se ejecuta 2");
        if(numeroLista == 1){
            System.out.println("Se ejecuta 3");
        Controlador.listaUsuarios = (ArrayList)entrada.readObject(); //PROBLEMA
        System.out.println("Se ejecuta 4");
        }else
           System.out.println("Se ejecuta 5");
            if(numeroLista == 2){
                System.out.println("Se ejecuta 6");
            Controlador.listaUsuarios = (ArrayList)entrada.readObject();
            System.out.println("Se ejecuta 7");
            }
        System.out.println("Se ejecuta 8");
        entrada.close();
        }
        catch(IOException e){
            System.out.println("Se ejecuta 9");
            System.out.println("No se pudo leer datos en txt");
        }
        catch(Exception e2){
            System.out.println("Se ejecuta 10");
            System.out.println("No se pudo leer datos en txt exception 2");
        }
}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ClassNotFoundException {
        // TODO code application logic here
        Controlador.leerDatosEnTxt("listaUsuarios.txt", 1);
        Controlador.leerDatosEnTxt("listaObras.txt", 2);
<<<<<<< HEAD
        new Inicio().setVisible(true);
        
=======
        //Hola
>>>>>>> 64dd160ad73c91fab31b7242e392b6ae78642042
    }
    
}
