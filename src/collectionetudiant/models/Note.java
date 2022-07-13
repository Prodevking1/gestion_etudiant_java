/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collectionetudiant.models;


/**
 *
 * @author FREDERIC
 */
public class Note {
    private String code;
    private String matiere;
    private double valeur;
    private String dateEval;
    private String appreciation;
    private String session;

    public Note(String code, String matiere, double valeur, String dateEval, String appreciation, String session) {
        this.code = code;
        this.matiere = matiere;
        this.valeur = valeur;
        this.dateEval = dateEval;
        this.appreciation = appreciation;
        this.session = session;
    
    }
    public Note(){}

    /**
     * @return the valeur
     */
    public double getValeur() {
        return valeur;
    }

    public String getcode() {
        return this.code;
    }

    public void setcode(String code) {
        this.code = code;
    }

    /**
     * @param valeur the valeur to set
     */
    public void setValeur(double valeur) {
        this.valeur = valeur;
    }

    /**
     * @return the dateEval
     */
    public String getDateEval() {
        return dateEval;
    }

    /**
     * @param dateEval the dateEval to set
     */
    public void setDateEval(String dateEval) {
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

  

    public String getCode() {
        return this.code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMatiere() {
        return this.matiere;
    }

    public void setMatiere(String matiere) {
        this.matiere = matiere;
    }

    

     @Override
    public String toString() {
        return "Note{" + "valeur=" + valeur + ", dateEval=" + dateEval + ", appreciation=" + appreciation + ", session=" + session + '}';
    } 

    
}
