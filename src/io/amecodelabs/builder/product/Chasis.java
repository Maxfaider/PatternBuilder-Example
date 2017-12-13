
package io.amecodelabs.builder.product;

/**
 *
 * @author Alan M.E
 * @version 1.0
 * @see 24/02/2017
 */

public class Chasis {
    
    private String tipo;
    private String peso;
    private String resistencia;

    public Chasis(String tipo, String peso, String resistencia) {
        this.tipo = tipo;
        this.peso = peso;
        this.resistencia = resistencia;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

    public String getResistencia() {
        return resistencia;
    }

    public void setResistencia(String resistencia) {
        this.resistencia = resistencia;
    }
    
}
