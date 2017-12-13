
package io.amecodelabs.builder;

import io.amecodelabs.builder.product.Auto;

/**
 *
 * @author Alan M.E
 * @version 1.0
 * @see 24/02/2017
 */

public abstract class BuildAuto {
    
    protected Auto auto;
    
    public BuildAuto() {
        
    }
    
    public void createAuto() {
        this.auto = new Auto();
    }
    
    public Auto getAuto() {
        return this.auto;
    }
    
    /**
     * method abstract
     */
    public abstract void buildCarroceria();
    public abstract void buildChasis();
    public abstract void buildMotor();
    public abstract void buildRadiador();
    public abstract void buildSuspension();
    
}
