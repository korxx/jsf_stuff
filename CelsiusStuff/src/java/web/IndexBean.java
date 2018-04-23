/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package web;



import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import negocio.POJO;

/**
 *
 * @author kor
 */
@Named
@RequestScoped
public class IndexBean {

    private boolean celsius = true;
    private double temperatura = 1;
    private double resultado = 1;
    private POJO p;

    public double getResultado() {
        if(temperatura != 1){
            this.resultado =  this.p.transforma(this.temperatura, this.celsius);
        }
        return this.resultado;
    }
    
    public void setResultado(double resultado) {
        this.resultado =  this.p.transforma(this.temperatura, this.celsius);
    }
    public boolean isCelsius() {
        return celsius;
    }

    public void setCelsius(boolean celsius) {
        this.celsius = celsius;
    }

    public double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }

    
        
   
}