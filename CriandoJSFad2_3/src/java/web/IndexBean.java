/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package web;



import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

/**
 *
 * @author kor
 */
@Named
@RequestScoped
public class IndexBean {

    private String nome;
    private String estadoCivil;
    private String sexo;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }
    
    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }


    public String getResultado() {
        if ((nome != null) && (estadoCivil != null) && (sexo != null)) {
            return nome + " está " + estadoCivil + " e é do sexo " + sexo;
        } else {
            return "";
        }
    }
}