/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ventanasabstractas;

/**
 *
 * @author samuel
 */
public class VAbatible extends VentanaAbstracta {
    
    private int anguloApertura;
    
    public VAbatible(int anguloApertura, boolean estado) {
        super(estado);
        this.anguloApertura = anguloApertura;
    }
    
    public VAbatible() {
    }
    
    public int getAnguloApertura() {
        return anguloApertura;
    }

    //---
    @Override
    public void abrir(int numero) {
        this.setEstado(true);
        this.anguloApertura = (numero / 2);
    }
    
    @Override
    public void cerrar(int numero) {
        this.setEstado(false);
        this.anguloApertura = 0;
    }

    //---
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("VAbatible{");
        sb.append("anguloApertura=").append(anguloApertura);
        sb.append('}');
        return sb.toString();
    }
    
}
