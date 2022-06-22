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
public class ECU {
    
     private String code;
     private String nom;
     private int VH;
      private int credit;

    public ECU(String code, String nom, int VH,int credit) {
        this.code = code;
        this.nom = nom;
        this.VH = VH;
         this.credit = credit;
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
     * @return the VH
     */
    public int getVH() {
        return VH;
    }

    /**
     * @param VH the VH to set
     */
    public void setVH(int VH) {
        this.VH = VH;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + Objects.hashCode(this.code);
        hash = 47 * hash + Objects.hashCode(this.nom);
        hash = 47 * hash + this.VH;
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
        final ECU other = (ECU) obj;
        return true;
    }

    @Override
    public String toString() {
        return "ECU{" + "code=" + code + ", nom=" + nom + ", VH=" + VH + '}';
    }

    /**
     * @return the credit
     */
    public int getCredit() {
        return credit;
    }

    /**
     * @param credit the credit to set
     */
    public void setCredit(int credit) {
        this.credit = credit;
    }
     
    }

