/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import javax.annotation.PostConstruct;

/**
 *
 * @author kor
 */
public class POJO {
    
    public POJO() {
    }

    public double transforma(double t, boolean c){
        if(c){
            return (t*9)/5 - 32;
        }else {
            return ((t - 32)*5)/9;
        }
    }
}
