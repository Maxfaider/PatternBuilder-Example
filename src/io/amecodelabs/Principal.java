package io.amecodelabs;

import io.amecodelabs.builder.AutoDirector;
import io.amecodelabs.builder.BuildMazda;
import io.amecodelabs.builder.product.Auto;

/**
*
* @author Alan M.E
* @version 1.0
* @see 24/02/2017
*/

public class Principal {

   public static void main(String[] args) {
       
       AutoDirector autoDirector = new AutoDirector();
       autoDirector.setBuildAuto(new BuildMazda());
       Auto auto = autoDirector.build();
       
       info_auto(auto);
   }
   
   private static void info_auto(Auto auto) {
       System.out.println("=========" + auto.getModelo() + "========");
       System.out.println("-- Carroceria  --");
       System.out.println("Estilo: "+auto.getCarroceria().getEstilo());
       System.out.println("volumen: "+auto.getCarroceria().getVolumen());
       System.out.println("accesorios: "+auto.getCarroceria().getAccesorios());
       System.out.println("-- Motor --");
       System.out.println("Combustible: "+auto.getMotor().getCombustible());
       System.out.println("Bobina: "+auto.getMotor().getBobina());
       System.out.println("Motor nombre:"+auto.getMotor().getNombre());
       System.out.println("Fabricante:"+auto.getMotor().getFabricante());
       System.out.println("-- Suspension --");
       System.out.println("Capacidad Torsion: "+auto.getSuspension().getCapacidadTorsion());
       System.out.println("Resorte: "+auto.getSuspension().getTipoResorte());
       System.out.println("Ballesta: "+auto.getSuspension().getBallesta());
       System.out.println("-- Chasis --");
       System.out.println("Peso: "+auto.getChasis().getPeso());
       System.out.println("Resistencia: "+auto.getChasis().getResistencia());
       System.out.println("Tipo: "+auto.getChasis().getTipo());
       System.out.println("-- Radiador --");
       System.out.println("Refrigeracion: "+auto.getRadiador().getRefrigeracion());
       System.out.println("Termostato: "+auto.getRadiador().getTermotasto());
       System.out.println("==============================================");
   }
   
}

