/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collectionetudiant;

import java.util.Date;
import java.util.Objects;

/**
 *
 * @author FREDERIC
 */
public class semestre {
    private String niveau;
    private int Numero;
    private String fil;
    private Date debut;
    private Date fin;

    public semestre(String niveau, int Numero, String fil, Date debut, Date fin) {
        this.niveau = niveau;
        this.Numero = Numero;
        this.fil = fil;
        this.debut = debut;
        this.fin = fin;
    }

    public String getNiveau() {
        return niveau;
    }

    public int getNumero() {
        return Numero;
    }

    public String getFil() {
        return fil;
    }

    public Date getDebut() {
        return debut;
    }

    public Date getFin() {
        return fin;
    }

    public void setNiveau(String niveau) {
        this.niveau = niveau;
    }

    public void setNumero(int Numero) {
        this.Numero = Numero;
    }

    public void setFil(String fil) {
        this.fil = fil;
    }

    public void setDebut(Date debut) {
        this.debut = debut;
    }

    public void setFin(Date fin) {
        this.fin = fin;
    }

    @Override
    public String toString() {
        return "semestre{" + "niveau=" + niveau + ", Numero=" + Numero + ", fil=" + fil + ", debut=" + debut + ", fin=" + fin + '}';
    }
    
}
