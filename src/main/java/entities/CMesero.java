/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

import java.util.ArrayList;

/**
 *
 * @author DELL
 */
public class CMesero extends CUsuario{
    private ArrayList<CComanda> comandas;

    public CMesero(String sUsername, int piID) {
        super(sUsername,  piID);
        comandas = new ArrayList();
    }
    
    public void setComanda(CComanda comanda){
        comandas.add(comanda);
    }

    public ArrayList<CComanda> getComandas() {
        return comandas;
    }
}
