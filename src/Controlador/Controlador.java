/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.AdministradorDeUsuario;
import static Modelo.AdministradorDeUsuario.listaUsuarios;
import Modelo.ManejoDeArchivos;
import Modelo.Usuario;
import Vista.Login;
import Vista.MenuTeatro;
import Vista.Registro;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author EnriqueChim
 */
public class Controlador extends JFrame{
    ManejoDeArchivos manejo=new ManejoDeArchivos();
    Login login=new Login();
    Registro registro=new Registro();
    MenuTeatro menuteatro=new MenuTeatro();

    
    public void iniciarSesionUsuario(String nombre, String contrasenia){
        try {
            if(ManejoDeArchivos.lecturaArchivo(nombre, contrasenia)==true){
                new MenuTeatro().setVisible(true);
            }else{
                JOptionPane.showMessageDialog(null, "Usuario incorrecto");
            }
            
        } catch (IOException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    

    public void registrarUsuario(String nombreUsuario, String apellidoUsuario, String curpUsuario, String contraseniaUsuario){
        boolean usuarioAgregado=false;
        try{
            if(nombreUsuario.isEmpty() || apellidoUsuario.isEmpty() || curpUsuario.isEmpty() || contraseniaUsuario.isEmpty()){
            JOptionPane.showMessageDialog(null, "Campos Vacios");
            }else{
                
            Usuario usuario=new Usuario(nombreUsuario,apellidoUsuario,curpUsuario,contraseniaUsuario);
            AdministradorDeUsuario.listaUsuarios.add(usuario);
            ManejoDeArchivos.escribirArchivo(listaUsuarios);
            
            usuarioAgregado=true;
            }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "ERROR EN EL REGISTRO");
            usuarioAgregado=false;
        }
        
        
        if(usuarioAgregado){
            JOptionPane.showMessageDialog(null, "USUARIO AGREGADO");
        }
        
    }
    
    
    
    
}
