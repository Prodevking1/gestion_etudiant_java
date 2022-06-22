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
public class Note {
     private float valeur;
    private Date dateEval;
    private String appreciation;
    private String session;

    public Note(float valeur, Date dateEval, String appreciation, String session) {
        this.valeur = valeur;
        this.dateEval = dateEval;
        this.appreciation = appreciation;
        this.session = session;
    
    }


    /**
     * @return the valeur
     */
    public float getValeur() {
        return valeur;
    }

    /**
     * @param valeur the valeur to set
     */
    public void setValeur(float valeur) {
        this.valeur = valeur;
    }

    /**
     * @return the dateEval
     */
    public Date getDateEval() {
        return dateEval;
    }

    /**
     * @param dateEval the dateEval to set
     */
    public void setDateEval(Date dateEval) {
        this.dateEval = dateEval;
    }

    /**
     * @return the appreciation
     */
    public String getAppreciation() {
        return appreciation;
    }

    /**
     * @param appreciation the appreciation to set
     */
    public void setAppreciation(String appreciation) {
        this.appreciation = appreciation;
    }

    /**
     * @return the session
     */
    public String getSession() {
        return session;
    }

    /**
     * @param session the session to set
     */
    public void setSession(String session) {
        this.session = session;
    }

  

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 47 * hash + Float.floatToIntBits(this.valeur);
        hash = 47 * hash + Objects.hashCode(this.dateEval);
        hash = 47 * hash + Objects.hashCode(this.appreciation);
        hash = 47 * hash + Objects.hashCode(this.session);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Note other = (Note) obj;
        if (Float.floatToIntBits(this.valeur) != Float.floatToIntBits(other.valeur)) {
            return false;
        }
        if (!Objects.equals(this.appreciation, other.appreciation)) {
            return false;
        }
        if (!Objects.equals(this.session, other.session)) {
            return false;
        }
        if (!Objects.equals(this.dateEval, other.dateEval)) {
            return false;
        }
        return true;
    }
     @Override
    public String toString() {
        return "Note{" + "valeur=" + valeur + ", dateEval=" + dateEval + ", appreciation=" + appreciation + ", session=" + session + '}';
    } 
}
