/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.modelo.dominio;

import java.io.Serializable;
import java.util.Arrays;

/**
 *
 * @author Severa
 */
public class ArregloNumeros implements Serializable{
    private int[] numeros;
    private String texto;
    private int carga;
    
    public ArregloNumeros(){
        numeros=new int [10];
        carga=0;
    }
    public ArregloNumeros(int[] numeros){
        this.numeros=numeros;
    }
    public void agregarNumero(int n){
        for(int i=0;i<10;i++){
         if (i==getCarga()){
             getNumeros()[i]=n;}
         }
         setCarga(getCarga()+1);
         setTexto(Arrays.toString(getNumeros()));
    
    }        

    /**
     * @return the numeros
     */
    public int[] getNumeros() {
        return numeros;
    }

    /**
     * @param numeros the numeros to set
     */
    public void setNumeros(int[] numeros) {
        this.numeros = numeros;
    }

    /**
     * @return the texto
     */
    public String getTexto() {
        return texto;
    }

    /**
     * @param texto the texto to set
     */
    public void setTexto(String texto) {
        this.texto = texto;
    }

    /**
     * @return the carga
     */
    public int getCarga() {
        return carga;
    }

    /**
     * @param carga the carga to set
     */
    public void setCarga(int carga) {
        this.carga = carga;
    }
            
}
