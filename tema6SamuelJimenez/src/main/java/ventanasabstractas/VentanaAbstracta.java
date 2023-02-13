/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ventanasabstractas;

/**
 *
 * @author samuel
 */
public abstract class VentanaAbstracta {

    private boolean estado;

    public VentanaAbstracta() {
    }

    public VentanaAbstracta(boolean estado) {
        this.estado = estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    

    public abstract void abrir(int numero);

    public abstract void cerrar(int numero);

    public boolean isEstado() {
        return estado;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("VentanaAbstracta{");
        sb.append("estado=").append(estado);
        sb.append('}');
        return sb.toString();
    }

}
