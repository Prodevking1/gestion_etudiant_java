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
import collectionetudiant.helpers.NoteHelper;
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
class AjouterNote extends Frame {
        static JFrame frame;
	Label lblTitle,lblMatiere,lblsess,lblapp,lblmoyenne,lblMatricule,lbldate;
	TextField txtMatiere,txtmoyenne,txtdate,txtapp,txtMatricule,txtsess;
	TextArea txtAddress;
	Button btnSave,btnClear,btnExit;
 
	public AjouterNote() {
		super("Ajouts Notes");
		setSize(1000, 600);// w,h
		setLayout(null);
		setVisible(true);
		Color formColor = new Color(53, 59, 72);
		setBackground(formColor);
 
		Font titleFont = new Font("arial", Font.BOLD, 25);
		Font labelFont =new  Font("arial", Font.PLAIN, 18);
		Font textFont =new  Font("arial", Font.PLAIN, 15);
 
		lblTitle=new Label("Ajout Notes");  
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
 
		lblMatiere=new Label("Matiere");  
		lblMatiere.setBounds(250,150,150,30);
		lblMatiere.setFont(labelFont);  
		lblMatiere.setForeground(Color.WHITE);
		add(lblMatiere);
 
		txtMatiere=new TextField();
		txtMatiere.setBounds(400,150,400,30);
		txtMatiere.setFont(textFont);
		add(txtMatiere);
 
		lblmoyenne=new Label("Moyenne");  
		lblmoyenne.setBounds(250,200,150,30);
		lblmoyenne.setFont(labelFont); 
		lblmoyenne.setForeground(Color.WHITE);
		add(lblmoyenne);
 
		txtmoyenne=new TextField();
		txtmoyenne.setBounds(400,200,400,30);
		txtmoyenne.setFont(textFont);
		add(txtmoyenne);
                
                lbldate=new Label("Date");  
		lbldate.setBounds(250,250,150,30);
		lbldate.setFont(labelFont); 
		lbldate.setForeground(Color.WHITE);
		add(lbldate);
 
		txtdate=new TextField();
		txtdate.setBounds(400,250,400,30);
		txtdate.setFont(textFont);
		add(txtdate);
                
                lblapp=new Label("Appreciation");  
		lblapp.setBounds(250,300,150,30);
		lblapp.setFont(labelFont);  
		lblapp.setForeground(Color.WHITE);
		add(lblapp);
                txtapp=new TextField();
		txtapp.setBounds(400,300,500,30);
		txtapp.setFont(textFont);
		add(txtapp);
 
		lblsess=new Label("Session");  
		lblsess.setBounds(250,350,150,30);
		lblsess.setFont(labelFont);
		lblsess.setForeground(Color.WHITE);
		add(lblsess);
 
		txtsess=new TextField();
		txtsess.setBounds(400,350,500,30);
		txtsess.setFont(textFont);
		add(txtsess);
 
		
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
                add(lblMatiere);
		add(lblmoyenne);
		add(lblapp);
		add(lblsess);
		
 
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
                NoteHelper.ajouterNote(newNote());
                JOptionPane.showMessageDialog(frame,
                        "Notes ajoutees pour le matricule: " + lblMatricule.getText(),
                        "Success",

                        JOptionPane.OK_OPTION);
							FenetreGlobale fenetre = new FenetreGlobale();
							fenetre.setVisible(true);
							AjouterNote.this.setVisible(false);
                    AjouterNote formEtu = new AjouterNote ();
                    formEtu.setVisible(true);
                    AjouterNote.this.setVisible(false);
                }
             catch (Exception e){
                JOptionPane.showMessageDialog(frame,
                        "Ajout impossible",
                        "Erreur",
                        JOptionPane.ERROR_MESSAGE);
            }
            
        }
    }
    );
    
    }
    public Note newNote() {
        Note note = new Note();
        note.setcode(lblMatiere.getText());
        note.setValeur(Integer.parseInt(lblmoyenne.getText()));
        note.setAppreciation(lblapp.getText());
        note.setDateEval(lbldate.getText());
        note.setSession(lblsess.getText());
        return note;
    }
    public static void main(String[] args) {
       new AjouterNote();
    }
}
