/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

/**
 *
 * @author a1710
 */
public class CComandaBebida {
    private CBebida bebida;
    private int quantity;

    public CComandaBebida(CBebida bebida, int quantity) {
        this.bebida = bebida;
        this.quantity = quantity;
    }

    public CBebida getBebida() {
        return bebida;
    }

    public void setBebida(CBebida bebida) {
        this.bebida = bebida;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
    
    
}
