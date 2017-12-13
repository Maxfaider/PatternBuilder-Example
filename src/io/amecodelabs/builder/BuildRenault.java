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
 * @see 24/02/0217
 */
public class BuildRenault extends BuildAuto {
    
    public BuildRenault() {
        
    }

   @Override
    public void buildCarroceria() {
        this.auto.setModelo("Renault Logan");
        Carroceria c = new Carroceria("Liftback", "70 cm3", "Notchback");
        this.auto.setCarroceria(c);
    }

    @Override
    public void buildChasis() {
        Chasis c = new Chasis("Escalera", "150 kg", "300 gp");
        this.auto.setChasis(c);
    }

    @Override
    public void buildMotor() {
        Motor m = new Motor("Disel", "none", "Magnun 5.2 dodge", "Renault");
        this.auto.setMotor(m);
    }

    @Override
    public void buildRadiador() {
        Radiador r = new Radiador("40 c", "1500 n");
        this.auto.setRadiador(r);
    }

    @Override
    public void buildSuspension() {
        Suspension s = new Suspension("90 NW", "Conica", "Normal");
        this.auto.setSuspension(s);
    }
    
}
