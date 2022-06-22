package collectionetudiant.views;

import java.awt.*;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import collectionetudiant.*;

public class FenetreGlobale extends Frame {

	/**
	 *
	 * @author Rahimah
	 */

	public FenetreGlobale() {
		super("Fenetre");
		setBounds(100, 100, 800, 480); // x,y,width,height

		// Buttons Panel
		Button bEtudiant = new Button("Creer un etudiant");
		// bEtudiant.addActionListener(new Etudiant()); //Enregistrement de l'écouteur
		bEtudiant.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// On peut éventuellement passé en paramèttre Fenetre.this à la nouvelle fenêtre
				AjouterEtudiant form = new AjouterEtudiant();
				// form.formEtudiant();
				// JFrame frame3 = new JFrame("niveau 2");
				form.setVisible(true);
				// On cache l'ancienne fenêtre.
				FenetreGlobale.this.setVisible(false);
			}
		});
		bEtudiant.setActionCommand("boutonetudiant");

		Button bNotes = new Button("Ajouter la note et calculer la moyenne");
		bNotes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// On peut éventuellement passé en paramèttre Fenetre.this à la nouvelle fenêtre
				AjouterNote note = new AjouterNote();
				// form.formEtudiant();
				// JFrame frame3 = new JFrame("niveau 2");
				note.setVisible(true);
				// On cache l'ancienne fenêtre.
				FenetreGlobale.this.setVisible(false);
			}
		});
		Button bAdmis = new Button("Liste des admins");
		bAdmis.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ev) {
				/* FenetreAdmis.calculMoyenne(1); */
				FenetreAdmis admis = new FenetreAdmis();
				admis.setVisible(true);
				FenetreGlobale.this.setVisible(false);
			}
		});
		Button bDeliberation = new Button("Deliberation Generale");
		/* bExit.addActionListener(new evenementunboutonpourtous()); */
		Panel bPanel = new Panel(new GridLayout(1, 0, 5, 5));
		bPanel.add(bEtudiant);
		bPanel.add(bNotes);
		bPanel.add(bAdmis);
		bPanel.add(bDeliberation);

		/*
		 * class Ecouteur_Bouton implements ActionListener {
		 * public void actionPerformed(ActionEvent e)
		 * { if (e.getActionCommand() == "boutonetudiant")
		 * System.out.println(" Vous êtes d'accord ... Merci");
		 * else
		 * System.out.println(" Vous avez choisi d'annuler ... Au revoir");
		 * }}
		 */
		Menu lge = new Menu("Gestion de notes");
		// Barre de ménu
		MenuBar myMenu = new MenuBar();
		myMenu.add(lge);
		// Définition de la menubar de la fenêtre
		setMenuBar(myMenu);
		// Layout
		setLayout(new GridLayout(6, 1));
		add(bPanel);

		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.out.println(" Au revoir !!!");
				System.exit(-1);
			}
		});

		setVisible(true);
	}

	public static void main(String[] args) {
		new FenetreGlobale();
	}
}
