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
import javax.swing.JOptionPane;

/**
 *
 * @author EnriqueChim
 */
public class Controlador implements ActionListener{
    ManejoDeArchivos manejo=new ManejoDeArchivos();
    Login login=new Login();
    Registro registro=new Registro();
    MenuTeatro menuteatro=new MenuTeatro();

    public Controlador( Login login, Registro registro, MenuTeatro menuteatro) {
        this.login=login;
        this.menuteatro=menuteatro;
        this.registro=registro;
        this.registro.Bt_RegistroUsuario.addActionListener(this);
        this.registro.Bt_RegistroIniciarSesionUsuario.addActionListener(this);
        this.login.IniciarSesionUsuario.addActionListener(this);
        this.login.RegistrarUsuario.addActionListener(this);
    }
    
    public void iniciarSesionUsuario(){
        String nombre=login.LoginNombreUsuario.getText();
        String contrasenia=login.LoginContraseñaUsuario.getText();
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
    

    public void registrarUsuario(){
        try{
            String nombreUsuario=registro.RegistroNombreUsuario.getText();
            String apellidoUsuario=registro.RegistroApellidoUsuario.getText();
            String curpUsuario=registro.RegistroCurpUsuario.getText();
            String contraseñaUsuario=registro.RegistroContraseñaUsuario.getText();
            Usuario usuario=new Usuario(nombreUsuario,apellidoUsuario,curpUsuario,contraseñaUsuario);
            AdministradorDeUsuario.listaUsuarios.add(usuario);
            ManejoDeArchivos.escribirArchivo(listaUsuarios);
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "ERROR EN EL REGISTRO");
        }
        
    }
    
    

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==login.IniciarSesionUsuario){
            iniciarSesionUsuario();
            System.out.println("1");
        }
        if(e.getSource()==login.RegistrarUsuario){
            new Registro().setVisible(true);
       
            if(e.getSource()==registro.Bt_RegistroUsuario){
                System.out.println("HSHSH");
                registrarUsuario();
                System.out.println("2");
            }else if(e.getSource()==registro.Bt_RegistroIniciarSesionUsuario){
                new Login().setVisible(true);
                System.out.println("3");
            }
            System.out.println("4");
        }
    }
    
}
