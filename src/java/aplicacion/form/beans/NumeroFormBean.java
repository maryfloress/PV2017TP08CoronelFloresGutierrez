/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.form.beans;

import aplicacion.modelo.dominio.ArregloNumeros;
import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author Severa
 */
@ManagedBean
@ViewScoped
public class NumeroFormBean implements Serializable{
private ArregloNumeros numeros;
private int numer;
    /**
     * Creates a new instance of NumeroFormBean
     */
    public NumeroFormBean() {
        numeros=new ArregloNumeros();
    }
    public void agregarNumeros(){
        numeros.agregarNumero(getNumer());
    }

    /**
     * @return the numeros
     */
    public ArregloNumeros getNumeros() {
        return numeros;
    }

    /**
     * @param numeros the numeros to set
     */
    public void setNumeros(ArregloNumeros numeros) {
        this.numeros = numeros;
    }

    /**
     * @return the numer
     */
    public int getNumer() {
        return numer;
    }

    /**
     * @param numer the numer to set
     */
    public void setNumer(int numer) {
        this.numer = numer;
    }
}
