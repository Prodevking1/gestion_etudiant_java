/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collectionetudiant;

import java.util.Objects;

/**
 *
 * @author FREDERIC
 */
public class UE {
    private String code;
     private String nom;
     private String type;

    public UE(String code, String nom, String type) {
        this.code = code;
        this.nom = nom;
        this.type = type;
    }

    /**
     * @return the code
     */
    public String getCode() {
        return code;
    }

    /**
     * @param code the code to set
     */
    public void setCode(String code) {
        this.code = code;
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
     * @return the type
     */
    public String getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(String type) {
        this.type = type;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.code);
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
        final UE other = (UE) obj;
        if (!Objects.equals(this.code, other.code)) {
            return false;
        }
        return true;
    }

   
    @Override
    public String toString() {
        return "UE{" + "code=" + code + ", nom=" + nom + ", type=" + type + '}';
    }
     
     
}
