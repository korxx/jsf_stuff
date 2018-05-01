/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package web;

import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import negocio.SorteadorLocal;

/**
 *
 * @author kor
 */
@Named
@RequestScoped
public class PaginaDaSorteBean {

    @EJB(name = "sorteadorBean")
    private SorteadorLocal sorteadorBean;

    public int getNumero() {
        return sorteadorBean.getNumero();
    }

}
