/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collectionetudiant.views;
 
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import java.util.List;
import collectionetudiant.helpers.EtudiantHelper;
import collectionetudiant.models.Etudiant;
import collectionetudiant.models.Note;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
 
//Simple Registration Form in Java AWT
class MyApp extends Frame {
        static JFrame frame;
	Label lblTitle,lblName,lblFather,lblAge,lbllieu,lblGender,lblCourse,lblHobbies,lblMatricule,lblemail,lblAddress;
	TextField txtName,txtFather,txtAge,txtemail,txtMatricule,txtlieu;
	TextArea txtAddress;
	Checkbox checkMale, checkFemale,Hobbies1,Hobbies2,Hobbies3,Hobbies4;
	CheckboxGroup cbg;
	Choice Course;
	Button btnSave,btnClear,btnExit;
 
	public MyApp() {
		super("Formulaire D'ajout");
		setSize(1000, 600);// w,h
		setLayout(null);
		setVisible(true);
		Color formColor = new Color(53, 59, 72);
		setBackground(formColor);
 
		Font titleFont = new Font("arial", Font.BOLD, 25);
		Font labelFont =new  Font("arial", Font.PLAIN, 18);
		Font textFont =new  Font("arial", Font.PLAIN, 15);
 
		lblTitle=new Label("Formulaire d'ajout");  
		lblTitle.setBounds(250,40,300,50);
		lblTitle.setFont(titleFont);
		lblTitle.setForeground(Color.YELLOW);
		add(lblTitle);
                
                lblMatricule=new Label("Matricule");  
		lblMatricule.setBounds(250,100,150,30);
		lblMatricule.setFont(labelFont);  
		lblMatricule.setForeground(Color.WHITE);
		add(lblMatricule);
                
                txtMatricule=new TextField();
		txtMatricule.setBounds(400,100,400,30);
		txtMatricule.setFont(textFont);
		add(txtMatricule);
 
		lblName=new Label("Nom");  
		lblName.setBounds(250,150,150,30);
		lblName.setFont(labelFont);  
		lblName.setForeground(Color.WHITE);
		add(lblName);
 
		txtName=new TextField();
		txtName.setBounds(400,150,400,30);
		txtName.setFont(textFont);
		add(txtName);
 
		lblFather=new Label("Prenom");  
		lblFather.setBounds(250,200,150,30);
		lblFather.setFont(labelFont); 
		lblFather.setForeground(Color.WHITE);
		add(lblFather);
 
		txtFather=new TextField();
		txtFather.setBounds(400,200,400,30);
		txtFather.setFont(textFont);
		add(txtFather);
                
                lblemail=new Label("E-mail");  
		lblemail.setBounds(250,250,150,30);
		lblemail.setFont(labelFont);  
		lblemail.setForeground(Color.WHITE);
		add(lblemail);
                txtemail=new TextField();
		txtemail.setBounds(400,250,500,30);
		txtemail.setFont(textFont);
		add(txtemail);
 
		lblAge=new Label("Date Naissance");  
		lblAge.setBounds(250,300,150,30);
		lblAge.setFont(labelFont);
		lblAge.setForeground(Color.WHITE);
		add(lblAge);
 
		txtAge=new TextField();
		txtAge.setBounds(400,300,500,30);
		txtAge.setFont(textFont);
		add(txtAge);
                
                lbllieu=new Label("Lieu Naissance");  
		lbllieu.setBounds(250,350,150,30);
		lbllieu.setFont(labelFont);
		lbllieu.setForeground(Color.WHITE);
		add(lbllieu);
 
		txtlieu=new TextField();
		txtlieu.setBounds(400,350,500,30);
		txtlieu.setFont(textFont);
		add(txtlieu);
 
 
		lblGender=new Label("Genre");  
		lblGender.setBounds(250,400,150,30);
		lblGender.setFont(labelFont);
		lblGender.setForeground(Color.WHITE);
		add(lblGender);
 
		cbg = new CheckboxGroup();
 
		checkMale = new Checkbox("Homme",cbg,true);
		checkMale.setBounds(400,400, 100, 30);
		checkMale.setFont(labelFont);
		checkMale.setForeground(Color.WHITE);
		add(checkMale);
 
		checkFemale = new Checkbox("Femme",cbg,false);
		checkFemale.setBounds(500,400, 100, 30);
		checkFemale.setFont(labelFont);
		checkFemale.setForeground(Color.WHITE);
		add(checkFemale);
 
		
		btnSave=new Button("Ajoutez");
		btnSave.setBounds(400,530,150,30);
		btnSave.setFont(labelFont);
		btnSave.setBackground(Color.BLUE);
		btnSave.setForeground(Color.WHITE);
		add(btnSave);
 
		btnClear=new Button("Effacez");
		btnClear.setBounds(560,530,150,30);
		btnClear.setFont(labelFont);
		btnClear.setBackground(Color.RED);
		btnClear.setForeground(Color.WHITE);
		add(btnClear);
                
                btnExit=new Button("Quittez");
		btnExit.setBounds(720,530,150,30);
		btnExit.setFont(labelFont);
		btnExit.setBackground(Color.BLUE);
		btnExit.setForeground(Color.WHITE);
		add(btnExit);
                
                btnSave.setActionCommand("Ajouter");
		btnClear.setActionCommand("Effacez");
                 // top-bottom
		add(lblMatricule);
		add(lblName);
		add(lblFather);
		add(lblAge);
		add(lbllieu);
		add(lblGender);
		add(lblemail);
		
 
		// Close Button Code
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.out.println(" Au revoir !!!");
				System.exit(-1);
			}
		});
                
                setVisible(true);

		btnSave.addActionListener(new ActionListener() {

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
							MyApp.this.setVisible(false);

				}catch(Exception e){
					JOptionPane.showMessageDialog(frame,
							"Ajout impossible",
							"Erreur",

							JOptionPane.ERROR_MESSAGE);
				}

			}
		});

		btnClear.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent ev) {

				try {
					txtMatricule.setText("");
					txtFather.setText("");
					txtName.setText("");
					txtAge.setText("");
					txtlieu.setText("");
					txtemail.setText("");

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
		etudiant.setMatricule(lblMatricule.getText());
		etudiant.setNom(lblName.getText());
		etudiant.setPrenom(lblFather.getText());
		etudiant.setEmail(lblemail.getText());
		etudiant.setLieu_naiss(lbllieu.getText());
		etudiant.setDte_naiss(lblAge.getText());
		return etudiant;

	}


}

	
 

 
public class AjouterEtudiant {
	public static void main(String[] args) {
		MyApp frm = new MyApp();
	}
 
}
