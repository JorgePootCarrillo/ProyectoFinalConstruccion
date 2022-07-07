package Controlador;

import Modelo.Usuario;
import Vista.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.JOptionPane;

public class Controlador implements ActionListener{
public static ArrayList<Usuario> listaUsuarios = new ArrayList<Usuario>();
public static ArrayList<Object> listaObras = new ArrayList<Object>();

    public static void main(String[] args) throws ClassNotFoundException {      

        new Inicio().setVisible(true);
     
    }
    
    /*
    public static void iniciarSesion(){
         boolean iniciarSesion = false;
            String nombre = txt_UsuarioIniciarSesion.getText();
            String contrasenia = txt_ContraseniaIniciarSesion.getText();
            for(int i = 0; i<Controlador.listaUsuarios.size(); i++){
                if(nombre.equals(Controlador.listaUsuarios.get(i).getNombreUsuario()) && contrasenia.equals(Controlador.listaUsuarios.get(i).getContraseniaUsuario())){
                    new MenuPrincipal().setVisible(true);
                    this.dispose();
                    iniciarSesion = true;
                }
            }
            if (iniciarSesion == false){
                JOptionPane.showMessageDialog(null, "Nombre o contraseña incorrectos");
            }
    }
*/
    @Override
    public void actionPerformed(ActionEvent e) {
        //Implements
    }

}
