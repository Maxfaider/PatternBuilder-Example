
package io.amecodelabs.builder.product;

/**
 *
 * @author Alan M.E
 * @version  1.0
 * @see 24/02/2017
 */

public class Radiador {
    
    private String refrigeracion;
    private String termotasto;

    public Radiador(String refrigeracion, String termotasto) {
        this.refrigeracion = refrigeracion;
        this.termotasto = termotasto;
    }

    public String getRefrigeracion() {
        return refrigeracion;
    }

    public void setRefrigeracion(String refrigeracion) {
        this.refrigeracion = refrigeracion;
    }

    public String getTermotasto() {
        return termotasto;
    }

    public void setTermotasto(String termotasto) {
        this.termotasto = termotasto;
    }
    
}
