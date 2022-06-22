package collectionetudiant.views;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import collectionetudiant.helpers.EtudiantHelper;
import collectionetudiant.models.Etudiant;
import collectionetudiant.models.Note;

public class AjouterEtudiant extends Frame implements ActionListener {
	static JFrame frame;
	private JTextField matricule, nom, prenom, email, lieu_naiss, dte_naiss;
	private Choice genre;
	private JButton bannuler, bajouter, quitter;
	static ArrayList<Etudiant> etudiants = new ArrayList<Etudiant>();
	static Etudiant createdEtudiant;
	

	public static void main(String[] args) {

		new AjouterEtudiant();

	}

	public AjouterEtudiant() {
		super("Formulaire Etudiant");
		setBounds(100, 100, 800, 480); // x,y,width,height

		JPanel matriculeP = new JPanel(
				new FlowLayout(FlowLayout.LEFT));
		matriculeP.setBackground(Color.lightGray);
		matriculeP.add(new Label("Matricule"));
		matricule = new JTextField(15);
		matriculeP.add(matricule);

		// JTextField JPanel
		JPanel nomP = new JPanel(
				new FlowLayout(FlowLayout.LEFT));
		nomP.setBackground(Color.lightGray);
		nomP.add(new Label("Nom"));
		nom = new JTextField(15);
		nomP.add(nom);
		JPanel tfPanel1 = new JPanel(
				new FlowLayout(FlowLayout.LEFT));
		tfPanel1.setBackground(Color.lightGray);
		tfPanel1.add(new Label("Prenom"));
		prenom = new JTextField(15);
		tfPanel1.add(prenom);

		JPanel emailP = new JPanel(
				new FlowLayout(FlowLayout.LEFT));
		emailP.setBackground(Color.lightGray);
		emailP.add(new Label("E-mail"));
		email = new JTextField(15);
		emailP.add(email);

		JPanel dte_naissP = new JPanel(
				new FlowLayout(FlowLayout.LEFT));
		dte_naissP.setBackground(Color.lightGray);
		dte_naissP.add(new Label("Date de naissance"));
		dte_naiss = new JTextField(15);
		dte_naissP.add(dte_naiss);

		JPanel lieu_naissP = new JPanel(
				new FlowLayout(FlowLayout.LEFT));
		lieu_naissP.setBackground(Color.lightGray);
		lieu_naissP.add(new Label("Lieu de naissance"));
		lieu_naiss = new JTextField(15);
		lieu_naissP.add(lieu_naiss);

		// Choice JPanel
		JPanel genreP = new JPanel(
				new FlowLayout(FlowLayout.LEFT));
		genreP.setBackground(Color.lightGray);
		genreP.add(new Label("genre"));
		genre = new Choice();
		genre.addItem("Feminin");
		genre.addItem("Masculin");
		genreP.add(genre);

		setLayout(new GridBagLayout());
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.fill = GridBagConstraints.BOTH;
		gbc.gridwidth = GridBagConstraints.REMAINDER;
		gbc.insets = new Insets(5, 0, 0, 0); // top
		add(matriculeP, gbc);
		add(nomP, gbc);
		add(tfPanel1, gbc);
		add(emailP, gbc);
		add(lieu_naissP, gbc);

		// Button de fin

		JPanel btPanel = new JPanel(
				new GridLayout(1, 0, 3, 3));
		bajouter = new JButton("ajouter");
		bannuler = new JButton("Effacer");
		quitter = new JButton("Quitter");
		btPanel.add(bajouter);
		btPanel.add(bannuler);
		btPanel.add(quitter);

		// commandes
		bajouter.setActionCommand("Ajouter");
		bannuler.setActionCommand("Annuler");
		gbc.insets = new Insets(5, 0, 5, 0); // top-bottom
		add(matriculeP, gbc);
		add(nomP, gbc);
		add(tfPanel1, gbc);
		add(dte_naissP, gbc);
		add(lieu_naissP, gbc);
		add(genreP, gbc);
		add(emailP, gbc);
		add(btPanel, gbc);

		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.out.println(" Au revoir !!!");
				System.exit(-1);

			}
		});
		setVisible(true);

		bajouter.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent ev) {

				try {
					EtudiantHelper.ajouterEtudiant(newEtudiant());
					JOptionPane.showMessageDialog(frame,
							"Etudiant ajoute avec succes",
							"",
							
							JOptionPane.PLAIN_MESSAGE);
							FenetreGlobale fenetre = new FenetreGlobale();
							fenetre.setVisible(true);
							AjouterEtudiant.this.setVisible(false);

				}catch(Exception e){
					JOptionPane.showMessageDialog(frame,
							"Ajout impossible",
							"Erreur",

							JOptionPane.ERROR_MESSAGE);
				}

			}
		});

		bannuler.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent ev) {

				try {
					matricule.setText("");
					prenom.setText("");
					nom.setText("");
					dte_naiss.setText("");
					lieu_naiss.setText("");
					email.setText("");

				} catch (Exception e) {
					System.out.println("Une erreur s'est produite");
				}
			}
		});
	};

	/*
	 * public void bajouterActionPerformed(java.awt.event.ActionEvent e) {
	 * System.out.println("Ajout effectué avec");
	 * }
	 */

	protected void FenetreGlobale() {
	}

	public Etudiant newEtudiant() {
		Etudiant etudiant = new Etudiant();
		etudiant.setMatricule(matricule.getText());
		etudiant.setNom(nom.getText());
		etudiant.setPrenom(prenom.getText());
		etudiant.setEmail(email.getText());
		etudiant.setLieu_naiss(lieu_naiss.getText());
		etudiant.setDte_naiss(dte_naiss.getText());
		etudiant.setGenre(genre.getSelectedItem());
		return etudiant;

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}

}
