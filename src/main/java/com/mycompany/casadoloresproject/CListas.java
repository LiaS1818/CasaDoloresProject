/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.casadoloresproject;

import entities.CAdministrador;
import entities.CBartender;
import entities.CBebida;
import entities.CCocinero;
import entities.CComanda;
import entities.CMesero;
import entities.CPlatillo;
import java.util.ArrayList;

/**
 *
 * @author DELL
 */
public class CListas {

    public ArrayList<CAdministrador> administradorList = new ArrayList();
    public ArrayList<CMesero> meseroList = new ArrayList();
    public ArrayList<CCocinero> cocineroList = new ArrayList();
    public ArrayList<CBartender> bartenderList = new ArrayList();

    // Listas de productos
    public ArrayList<CPlatillo> platilloList = new ArrayList();
    public ArrayList<CBebida> bebidaList = new ArrayList();

    public void createUsers() {
        for (int i = 0; i < 1; i++) {
            administradorList.add(new CAdministrador("100", 100));
        }

        meseroList.add(new CMesero("Rangel", 300));
        meseroList.add(new CMesero("Rangel", 301));
    }

    public int createIdAdministrador() {
        return administradorList.get(administradorList.size() - 1).getiID() + 1;
    }

    public int createIdCocinero() {
        return cocineroList.get(cocineroList.size() - 1).getiID() + 1;
    }

    public int createIdBartender() {
        return bartenderList.get(bartenderList.size() - 1).getiID() + 1;
    }

    public int createIdMesero() {
        return meseroList.get(meseroList.size() - 1).getiID() + 1;
    }

    public void showBebidas() {
        for (CBebida bebida : bebidaList) {
            System.out.println(bebida.getsNombre());

        }
    }

    public void crearBebida(CBebida bebida) {
        bebidaList.add(bebida);
    }

    public void showPlatillo() {
        for (CPlatillo platillo : platilloList) {
            System.out.println(platillo.getsNombre());

        }
    }

    public void crearPlatillo(CPlatillo platillo) {
        platilloList.add(platillo);
    }

    public void crearMesero(CMesero mesero) {
        meseroList.add(mesero);
    }

    public void crearCocinero(CCocinero cocinero) {
        cocineroList.add(cocinero);

    }

    public void crearBartender(CBartender bartender) {
        bartenderList.add(bartender);

    }

    public void crearAdministrador(CAdministrador administrador) {
        administradorList.add(administrador);
    }

    public int BuscarIdAdministrador(int ID) {
        int Index = 0;

        if (administradorList.isEmpty()) {
            return -1;
        }

        for (CAdministrador usuario : administradorList) {
            if (usuario.getiID() == ID) {
                return Index;
            }
            Index++;
        }
        return -1;
    }

    public int BuscarIdBartender(int ID) {
        int Index = 0;
        if (bartenderList.isEmpty()) {
            return -1;
        }

        for (CBartender usuario : bartenderList) {
            if (usuario.getiID() == ID) {
                return Index;
            }
            Index++;
        }
        return -1;
    }

    public int BuscarIdMesero(int ID) {
        int Index = 0;

        if (meseroList.isEmpty()) {
            return -1;
        }
        for (CMesero usuario : meseroList) {
            if (usuario.getiID() == ID) {
                return Index;
            }
            Index++;
        }
        return -1;
    }

    public int BuscarIdCocinero(int ID) {
        int Index = 0;
        if (cocineroList.isEmpty()) {
            return -1;
        }
        for (CCocinero usuario : cocineroList) {
            if (usuario.getiID() == ID) {
                return Index;
            }
            Index++;
        }
        return -1;
    }

    public void removeAdministrador(int index) {
        administradorList.remove(index);
    }

    public void removeBartender(int index) {
        bartenderList.remove(index);
    }

    public void removeMesero(int index) {
        meseroList.remove(index);
    }

    public void removeCocinero(int index) {
        cocineroList.remove(index);
    }

    public int buscarComida(String pComida) {
        int index = 0;

        if (platilloList.isEmpty()) {
            return -1;
        }

        for (CPlatillo comida : platilloList) {
            if (comida.getsNombre().equals(pComida)) {
                return index;
            }
            index++;
        }

        return -1;
    }

    public int buscarBebida(String pBebida) {
        int index = 0;

        if (bebidaList.isEmpty()) {
            return -1;
        }

        for (CBebida comida : bebidaList) {
            if (comida.getsNombre().equals(pBebida)) {
                return index;
            }
            index++;
        }

        return -1;
    }

    public void removePlatillo(int index) {
        platilloList.remove(index);
    }

    public void removeBebida(int index) {
        bebidaList.remove(index);
    }

    // Marco Haciendo Modificación
    public void createPlatillos() {
        platilloList.add(new CPlatillo("Enchiladas", "Principal", 500, "Manaña", true));
    }

    public void setIsStockPlatillo(int position, String platilloType, boolean isStock) {
        int index = 0, superIndex = 0;
        for (CPlatillo platillo : platilloList) {
            if (platillo.getsCategoria().equals(platilloType)) {
                if (index == position) {
                    platilloList.get(superIndex).setIsStock(isStock);
                }
                index++;
            }
            superIndex++;
        }
    }

    public void setIsStockBebida(int position, String bebidaType, boolean isStock) {
        int index = 0, superIndex = 0;
        for (CBebida bebida : bebidaList) {
            if (bebida.getsCategoria().equals(bebidaType)) {
                if (index == position) {
                    bebidaList.get(superIndex).setIsStock(isStock);
                }
                index++;
            }
            superIndex++;

        }
    }

    public int getPlatilloSize(String platilloType) {
        int index = 0;
        for (CPlatillo platillo : platilloList) {
            if (platillo.getsCategoria().equals(platilloType)) {
                index++;
            }
        }
        return index;
    }

    public int getBebidaSize(String bebidaType) {
        int index = 0;
        for (CBebida bebida : bebidaList) {
            if (bebida.getsCategoria().equals(bebidaType)) {
                index++;
            }
        }
        return index;
    }

    public int getComandaIndex(CMesero mesero, int mesaID) {
        int index = 0;
        for (CComanda comanda : mesero.getComandas()) {
            if (mesaID == comanda.getMesaID()) {
                return index;
            }
            index++;
        }
        return -1;
    }

    public boolean isTableActive(CMesero mesero, int mesaID) {
        for(CComanda comanda : mesero.getComandas()){
            if(comanda.getMesaID() == mesaID && comanda.isStatus()){
                return true;
            }
        }
        return false;
    }
    
    public int getIndexComanda(ArrayList<CComanda> comanda, int mesaID){
        int i = 0;
        for(CComanda comandaLocal : comanda){
            if(comandaLocal.getMesaID() == mesaID){
                return i;
            }
            i++;
        }
        return -1;
    }
}
