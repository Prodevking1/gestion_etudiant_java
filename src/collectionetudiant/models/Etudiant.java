/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collectionetudiant.models;
import collectionetudiant.*;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 *
 * @author FREDERIC
 */
public class Etudiant extends Note{
    private String matricule = UUID.randomUUID().toString();
    private String nom;
    private String prenom;
    private String dte_naiss;
    private String lieu_naiss;
    private String genre;
    private String email;
    

    public Etudiant(String matricule, String nom, String prenom, String dte_naiss, String lieu_naiss, String genre,String email 
            ) {
        this.matricule = matricule;
        this.nom = nom;
        this.prenom = prenom;
        this.dte_naiss = dte_naiss;
        this.lieu_naiss = lieu_naiss;
        this.genre = genre;
        this.email = email;

    }
    
    public Etudiant(){

    }
    /**
     * @return the matricule
     */
    public String getMatricule() {
        return matricule;
    }

    /**
     * @param matricule the matricule to set
     */
    public void setMatricule(String matricule) {
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
    public String getDte_naiss() {
        return dte_naiss;
    }

    /**
     * @param dte_naiss the dte_naiss to set
     */
    public void setDte_naiss(String dte_naiss) {
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

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
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

    public List<Etudiant> getNote() {
        return null;
    }

}
 
