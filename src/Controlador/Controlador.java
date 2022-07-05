/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Usuario;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author jorge
 */
public class Controlador {
public static ArrayList<Usuario> listaUsuarios = new ArrayList<Usuario>();

public static void escribirDatosEnTxt(String nombreArchivo, int numeroLista){
     try{
            ObjectOutputStream salida  = new ObjectOutputStream(new FileOutputStream(nombreArchivo));
            if(numeroLista == 1){
                salida.writeObject(Controlador.listaUsuarios);
            }else
                if(numeroLista == 2){
       //             salida.writeObject(Controlador.listaObras);
                }
            salida.close();
        }
        catch(IOException e){
            System.out.println("Problemas con el archivo");
        }
}

public static void leerDatosEnTxt(String nombreArchivo, int numeroLista) throws ClassNotFoundException{
    try{    
        ObjectInputStream entrada = new ObjectInputStream(new FileInputStream(nombreArchivo));
        if(numeroLista == 1){
        Controlador.listaUsuarios = (ArrayList)entrada.readObject();
        }else
            if(numeroLista == 2){
            Controlador.listaUsuarios = (ArrayList)entrada.readObject();
            }
        entrada.close();
        }
        catch(IOException e){
            System.out.println("Problemas con el archivo");
        }
        catch(Exception e2){
            System.out.println("Error al leer el archivo");
        }
}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ClassNotFoundException {
        // TODO code application logic here
        Controlador.leerDatosEnTxt("listaUsuaios.txt", 1);
        Controlador.leerDatosEnTxt("listaObras.txt", 2);
        
    }
    
}
