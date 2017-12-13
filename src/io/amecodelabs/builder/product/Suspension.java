
package io.amecodelabs.builder.product;

/**
 *
 * @author Alan M.E
 * @version 1.0
 * @see 24/02/2017
 */

public class Suspension {
    
    private String capacidadTorsion;
    private String ballesta;
    private String tipoResorte;

    public Suspension(String capacidadTorsion, String ballesta, String tipoResorte) {
        this.capacidadTorsion = capacidadTorsion;
        this.ballesta = ballesta;
        this.tipoResorte = tipoResorte;
    }

    public String getCapacidadTorsion() {
        return capacidadTorsion;
    }

    public void setCapacidadTorsion(String capacidadTorsion) {
        this.capacidadTorsion = capacidadTorsion;
    }

    public String getBallesta() {
        return ballesta;
    }

    public void setBallesta(String ballesta) {
        this.ballesta = ballesta;
    }

    public String getTipoResorte() {
        return tipoResorte;
    }

    public void setTipoResorte(String tipoResorte) {
        this.tipoResorte = tipoResorte;
    }
    
}
