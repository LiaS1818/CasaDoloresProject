/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

/**
 *
 * @author a1710
 */
public class CComandaPlatillo {
    private CPlatillo platillo;
    private int quantity;

    public CComandaPlatillo(CPlatillo platillo, int quantity) {
        this.platillo = platillo;
        this.quantity = quantity;
    }

    public CPlatillo getPlatillo() {
        return platillo;
    }

    public void setPlatillo(CPlatillo platillo) {
        this.platillo = platillo;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
    
}
