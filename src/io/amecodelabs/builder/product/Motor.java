package io.amecodelabs.builder.product;

/**
 *
 * @author Alan M.E
 * @version 1.0
 * @see 24/02/2017
 */

public class Motor {
    
    private String combustible;
    private String bobina;
    private String nombre;
    private String fabricante;

    public Motor(String combustible, String bobina, String nombre, String fabricante) {
        this.combustible = combustible;
        this.bobina = bobina;
        this.nombre = nombre;
        this.fabricante = fabricante;
    }

    public String getCombustible() {
        return combustible;
    }

    public void setCombustible(String combustible) {
        this.combustible = combustible;
    }

    public String getBobina() {
        return bobina;
    }

    public void setBobina(String bobina) {
        this.bobina = bobina;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }
    
}
