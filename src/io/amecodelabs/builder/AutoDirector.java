
package io.amecodelabs.builder;

import io.amecodelabs.builder.product.Auto;
import io.amecodelabs.builder.BuildAuto;

/**
 *
 * @author Alan M.E
 * @version 1.0
 * @see 24/02/2017
 */

public class AutoDirector {
    
    private BuildAuto buildAuto;
    
    public AutoDirector(BuildAuto buildAuto) {
        this.buildAuto = buildAuto;
    }
    
    public AutoDirector() {
        
    }
    
    public void setBuildAuto(BuildAuto buildAuto) {
        this.buildAuto = buildAuto;
    }
    
    public Auto build() {
        this.buildAuto.createAuto();
        this.buildAuto.buildCarroceria();
        this.buildAuto.buildChasis();
        this.buildAuto.buildMotor();
        this.buildAuto.buildRadiador();
        this.buildAuto.buildSuspension();
        
        return this.buildAuto.getAuto();
    }
    
}
