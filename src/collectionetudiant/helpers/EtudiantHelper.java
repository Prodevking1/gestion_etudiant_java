package collectionetudiant.helpers;

import collectionetudiant.models.*;

public class EtudiantHelper {
    public static void ajouterEtudiant(Etudiant etudiant) throws Exception {
        String query = "INSERT INTO etudiants(matricule, nom, prenom, dte_naiss, lieu_naiss, genre, email) values("
                + etudiant.getMatricule() + ",'" + etudiant.getNom() + "','" + etudiant.getPrenom() + "','"
                + etudiant.getDte_naiss() + "','" + etudiant.getLieu_naiss() + "','" + etudiant.getGenre() + "','"
                + etudiant.getEmail() + "' );";

        Db_Instance.instance(query);
    }

    /*
     * public static void main(String[] args){
     * try {
     * Etudiant etudiant = new Etudiant("005", "Tapsoba", "Rachid", "29-01-2002",
     * "Ouagadougou", "Masculin",
     * "a.rachid@gmail.com");
     * EtudiantHelper.ajouterEtudiant(etudiant);
     * } catch (Exception e) {
     * System.out.println("Une erreur s'est produite :" + e);
     * }
     * }
     */
}
