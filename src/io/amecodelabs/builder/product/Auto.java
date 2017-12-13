package io.amecodelabs.builder.product;

/**
 *
 * @author Alan M.E
 * @version 1.0
 * @see 24/02/2017
 */

public class Auto {
    
    private String modelo;
    private Chasis chasis;
    private Motor motor;
    private Radiador radiador;
    private Suspension suspension;
    private Carroceria carroceria;
    
    public Auto(String modelo) {
        this.modelo = modelo;
    }
    
    public Auto() {
        
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Chasis getChasis() {
        return chasis;
    }

    public void setChasis(Chasis chasis) {
        this.chasis = chasis;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public Radiador getRadiador() {
        return radiador;
    }

    public void setRadiador(Radiador radiador) {
        this.radiador = radiador;
    }

    public Suspension getSuspension() {
        return suspension;
    }

    public void setSuspension(Suspension suspension) {
        this.suspension = suspension;
    }

    public Carroceria getCarroceria() {
        return carroceria;
    }

    public void setCarroceria(Carroceria carroceria) {
        this.carroceria = carroceria;
    }
    
}
