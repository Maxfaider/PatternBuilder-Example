
package io.amecodelabs.builder.product;

/**
 *
 * @author Alan M.E
 * @version 1.0
 * @see 24/02/2017
 */

public class Carroceria {
    
    private String estilo;
    private String volumen;
    private String accesorios;

    public Carroceria(String estilo, String volumen, String accesorios) {
        this.estilo = estilo;
        this.volumen = volumen;
        this.accesorios = accesorios;
    }
    
    public String getEstilo() {
        return estilo;
    }

    public void setEstilo(String estilo) {
        this.estilo = estilo;
    }

    public String getVolumen() {
        return volumen;
    }

    public void setVolumen(String volumen) {
        this.volumen = volumen;
    }

    public String getAccesorios() {
        return accesorios;
    }

    public void setAccesorios(String accesorios) {
        this.accesorios = accesorios;
    }
    
}
