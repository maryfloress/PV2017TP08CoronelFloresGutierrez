
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.datos;

import aplicacion.modelo.dominio.Auto;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Severa
 */
public class ColeccionAutos implements Serializable{
   private ArrayList<Auto> autos;

    public ColeccionAutos() {
        autos=new ArrayList();
    }
public void agregarAutos(Auto unAuto){
    getAutos().add(unAuto);
}
public void modificarAutos(Auto unAuto){
    for(Auto a: autos){
        
        if(a.getPatente() == unAuto.getPatente()){
            autos.set(autos.indexOf(a), unAuto);
            break;
        }
    }
}

public void eliminarAutos(Auto unAuto){
    for(Auto a: autos){
        if(a.getPatente()== unAuto.getPatente()){
            autos.remove(autos.indexOf(a));
            break;
        }
    }
}
    /**
     * @return the autos
     */
    public ArrayList<Auto> getAutos() {
        return autos;
    }

    /**
     * @param autos the autos to set
     */
    public void setAutos(ArrayList<Auto> autos) {
        this.autos = autos;
    }
   
}
