/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collectionetudiant;

import java.util.List;

/**
 *
 * @author FREDERIC
 */
public class Etudiant {
    private int matricule;
    private String nom;
    private String prenom;
    private int dte_naiss;
    private String lieu_naiss;
    private String genre;
    private String email;
    

    public Etudiant(int matricule, String nom, String prenom, int dte_naiss, String lieu_naiss, String genre,String email) {
        this.matricule = matricule;
        this.nom = nom;
        this.prenom = prenom;
        this.dte_naiss = dte_naiss;
        this.lieu_naiss = lieu_naiss;
        this.genre = genre;
        this.email = email;
    }

    /**
     * @return the matricule
     */
    public int getMatricule() {
        return matricule;
    }

    /**
     * @param matricule the matricule to set
     */
    public void setMatricule(int matricule) {
        this.matricule = matricule;
    }

    /**
     * @return the nom
     */
    public String getNom() {
        return nom;
    }

    /**
     * @param nom the nom to set
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * @return the prenom
     */
    public String getPrenom() {
        return prenom;
    }

    /**
     * @param prenom the prenom to set
     */
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    /**
     * @return the dte_naiss
     */
    public int getDte_naiss() {
        return dte_naiss;
    }

    /**
     * @param dte_naiss the dte_naiss to set
     */
    public void setDte_naiss(int dte_naiss) {
        this.dte_naiss = dte_naiss;
    }

    /**
     * @return the lieu_naiss
     */
    public String getLieu_naiss() {
        return lieu_naiss;
    }

    /**
     * @param lieu_naiss the lieu_naiss to set
     */
    public void setLieu_naiss(String lieu_naiss) {
        this.lieu_naiss = lieu_naiss;
    }

    /**
     * @return the genre
     */
    public String getGenre() {
        return genre;
    }

    /**
     * @param genre the genre to set
     */
    public void setGenre(String genre) {
        this.genre = genre;
    }
    
    public int hashCode() {
        int hash = 5;
        hash = 89 * hash + this.matricule;
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
        final Etudiant other = (Etudiant) obj;
        if (this.matricule != other.matricule) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Etudiant{" + "matricule=" + matricule + ", nom=" + nom + ", prenom=" + prenom + ", dte_naiss=" + dte_naiss + ", lieu_naiss=" + lieu_naiss + ", genre=" + genre + '}';
    }

}
 
