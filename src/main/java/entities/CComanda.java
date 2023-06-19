/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

import java.util.ArrayList;

/**
 *
 * @author a1710
 */
public class CComanda {
    private int CuentaFinal;
    private String dateInit;
    private String dateEnd;
    private int mesaID;
    private ArrayList<CComandaPlatillo> comandaPlatillo;
    private ArrayList<CComandaBebida> comandaBebida;

    public CComanda(String dateInit, int mesaID) {
        this.CuentaFinal = 0;
        this.dateInit = dateInit;
        this.dateEnd = "";
        this.mesaID = mesaID;
        this.comandaPlatillo = new ArrayList();
        this.comandaBebida = new ArrayList();
    }

    public int getCuentaFinal() {
        return CuentaFinal;
    }

    public void setCuentaFinal(int CuentaFinal) {
        this.CuentaFinal = CuentaFinal;
    }

    public int getMesaID() {
        return mesaID;
    }

    public void setMesaID(int mesaID) {
        this.mesaID = mesaID;
    }
    
    

    public String getDateInit() {
        return dateInit;
    }

    public void setDateInit(String dateInit) {
        this.dateInit = dateInit;
    }

    public String getDateEnd() {
        return dateEnd;
    }

    public void setDateEnd(String dateEnd) {
        this.dateEnd = dateEnd;
    }

    public ArrayList<CComandaPlatillo> getComandaPlatillo() {
        return comandaPlatillo;
    }

    public void setComandaPlatillo(CComandaPlatillo comandaPlatillo) {
        this.comandaPlatillo.add(comandaPlatillo);
    }

    public ArrayList<CComandaBebida> getComandaBebida() {
        return comandaBebida;
    }

    public void setComandaBebida(CComandaBebida comandaBebida) {
        this.comandaBebida.add(comandaBebida);
    }
    
    
    
}
