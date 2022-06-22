package collectionetudiant.views;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import java.util.Iterator;

import collectionetudiant.*;
import collectionetudiant.models.Etudiant;
import collectionetudiant.models.Note;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class FenetreAdmis extends Frame {
    static JFrame frame;

    private JTextField valeur, matricule, matiere, dateEval, appreciation, session;
    ArrayList<Note> notes = new ArrayList<Note>();

public static void main(String[] args){
    new FenetreAdmis();

}
    public FenetreAdmis() {

        super("Notes");
        setBounds(100, 100, 800, 480);

		setVisible(true);
        
    }

    /* public static void calculMoyenne(int matricule) {
        Iterator<Etudiant> iterator = formEtudiant.etudiants.iterator();
        boolean trouve = false;
        boolean trouven = false;
        while (iterator.hasNext()) {
            Etudiant etu = iterator.next();
            if (etu.getMatricule() == matricule) {
                trouve = true;
                System.out.println("*** Relevé de notes de l'étudiant [" + etu + "] ***");
                Iterator<Note> iteratorNote = etu.getNotes().iterator();
                while (iteratorNote.hasNext()) {
                    trouven = true;
                    Note n_etu = iteratorNote.next();
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

    public Etudiant estAdmis(){
        Etudiant etudiant = new Etudiant();
        
        return etudiant; 
    }

    
}
