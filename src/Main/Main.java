/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

import Controlador.Controlador;
import Vista.Login;
import Vista.MenuTeatro;
import Vista.Registro;

/**
 *
 * @author EnriqueChim
 */
public class Main {
    public static void main(String[] args) {
        Login login=new Login();
        Registro registro=new Registro();
        MenuTeatro menuteatro=new MenuTeatro();
        Controlador controlador=new Controlador(login,registro,menuteatro);
        login.setVisible(true);
        registro.setVisible(true);
    }
    
}
