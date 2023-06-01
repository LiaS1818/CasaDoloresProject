/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

/**
 *
 * @author DELL
 */
public class CProducto {
   private String sNombre;
   private String sCategoria;
   private int iPrecio;
   private String Horario;
   private boolean isStock;

    public CProducto(String sNombre, String sCategoria, int iPrecio, String Horario, boolean isStock) {
        this.sNombre = sNombre;
        this.sCategoria = sCategoria;
        this.iPrecio = iPrecio;
        this.Horario = Horario;
        this.isStock = isStock;
    }

    public String getsNombre() {
        return sNombre;
    }

    public void setsNombre(String sNombre) {
        this.sNombre = sNombre;
    }

    public String getsCategoria() {
        return sCategoria;
    }

    public void setsCategoria(String sCategoria) {
        this.sCategoria = sCategoria;
    }

    public int getiPrecio() {
        return iPrecio;
    }

    public void setiPrecio(int iPrecio) {
        this.iPrecio = iPrecio;
    }

    public String getHorario() {
        return Horario;
    }

    public void setHorario(String Horario) {
        this.Horario = Horario;
    }

    public boolean isIsStock() {
        return isStock;
    }

    public void setIsStock(boolean isStock) {
        this.isStock = isStock;
    }
   
   
    
}
