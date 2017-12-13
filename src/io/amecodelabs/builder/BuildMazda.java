
package io.amecodelabs.builder;

import io.amecodelabs.builder.product.Carroceria;
import io.amecodelabs.builder.product.Chasis;
import io.amecodelabs.builder.product.Motor;
import io.amecodelabs.builder.product.Radiador;
import io.amecodelabs.builder.product.Suspension;

/**
 *
 * @author Alan M.E
 * @version 1.0
 * @see 24/02/2017
 */
public class BuildMazda extends BuildAuto {
    
    public BuildMazda() {
        
    }

    @Override
    public void buildCarroceria() {
        this.auto.setModelo("Mazda c3x");
        Carroceria c = new Carroceria("Fastback", "100 cm3", "Roadster");
        this.auto.setCarroceria(c);
    }

    @Override
    public void buildChasis() {
        Chasis c = new Chasis("Bitubo", "200 kg", "500 gp");
        this.auto.setChasis(c);
    }

    @Override
    public void buildMotor() {
        Motor m = new Motor("Electrico", "ignicion", "VIPER 8.3 Dodge Viper", "Mazda");
        this.auto.setMotor(m);
    }

    @Override
    public void buildRadiador() {
        Radiador r = new Radiador("32 C", "1600 n");
        this.auto.setRadiador(r);
    }

    @Override
    public void buildSuspension() {
        Suspension s = new Suspension("100 NW", "Curva", "Progresivo");
        this.auto.setSuspension(s);
    }
    
}
