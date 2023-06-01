/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.casadoloresproject;

import entities.CAdministrador;
import entities.CBartender;
import entities.CBebida;
import entities.CCocinero;
import entities.CMesero;
import entities.CPlatillo;
import java.util.ArrayList;
import views.VLogin;
import views.vMenuAdministrador;

/**
 *
 * @author DELL
 */
public class CasaDoloresProject {
    

    public static void main(String[] args) {
        CListas listas = new CListas();
        listas.createUsers();
        listas.createProducts();
        
        new vMenuAdministrador(listas).setVisible(true);
    }
   
}
