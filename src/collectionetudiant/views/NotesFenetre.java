package collectionetudiant.views;
import collectionetudiant.models.Etudiant;
import collectionetudiant.models.Note;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class NotesFenetre {


    
    
    /* public static void afficherReleve(int matricule) {
        Iterator<Etudiant> itr = etudiants.iterator();
        boolean trouve = false;
        boolean trouven = false;
        while (itr.hasNext()) {
            Etudiant etu = itr.next();
            if (etu.getMatricule() == matricule) {
                trouve = true;
                System.out.println("*** Relevé de notes de l'étudiant [" + etu + "] ***");
                Iterator<Note> itrn = etu.getNom().iterator();
                while (itrn.hasNext()) {
                    trouven = true;
                    Note n_etu = itrn.next();
                    System.out.println(n_etu);
                }
                if (!trouven) {
                    System.out.println("Aucune note pour l'instant!");
                }
                break;
            }
        }
        if (!trouve) {
            System.out.print("Aucun étudiant de matricule " + matricule);
        }
    } */
}
