package collectionetudiant.views;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import java.util.Iterator;

import collectionetudiant.*;
import collectionetudiant.helpers.NoteHelper;
import collectionetudiant.models.Etudiant;
import collectionetudiant.models.Note;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class AjouterNote extends Frame {
    static JFrame frame;

    private JTextField valeur, matricule, matiere, dateEval , appreciation, session;
    ArrayList<Note> notes = new ArrayList<Note>();

    public AjouterNote() {

        super("Notes");
        setBounds(100, 100, 800, 480); // x,y,width,height
        // TextField panel
        Panel tfPanel0 = new Panel(
                new FlowLayout(FlowLayout.LEFT));
        tfPanel0.setBackground(Color.lightGray);
        tfPanel0.add(new Label("Matricule"));
        matricule = new JTextField(15);
        tfPanel0.add(matricule);

        Panel tfPanel = new Panel(
                new FlowLayout(FlowLayout.LEFT));
        tfPanel.setBackground(Color.lightGray);
        tfPanel.add(new Label("Matiere"));
        matiere = new JTextField(15);
        tfPanel.add(matiere);
        Panel tfPanel1 = new Panel(
                new FlowLayout(FlowLayout.LEFT));
        tfPanel1.setBackground(Color.lightGray);
        tfPanel1.add(new Label("Moyenne"));
        valeur = new JTextField(15);
        tfPanel1.add(valeur);

        Panel tfPanel2 = new Panel(
                new FlowLayout(FlowLayout.LEFT));
        tfPanel2.setBackground(Color.lightGray);
        tfPanel2.add(new Label("Date"));
        dateEval = new JTextField(15);
        tfPanel2.add(dateEval);

        Panel tfPanel3 = new Panel(
                new FlowLayout(FlowLayout.LEFT));
        tfPanel3.setBackground(Color.lightGray);
        tfPanel3.add(new Label("Appreciation"));
        appreciation = new JTextField(15);
        tfPanel3.add(appreciation);

        Panel tfPanel4 = new Panel(
                new FlowLayout(FlowLayout.LEFT));
        tfPanel4.setBackground(Color.lightGray);
        tfPanel4.add(new Label("Session"));
        session = new JTextField(15);
        tfPanel4.add(session);
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.BOTH;
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        gbc.insets = new Insets(5, 0, 0, 0); // top
        add(tfPanel0, gbc);
        add(tfPanel, gbc);
        add(tfPanel1, gbc);
        add(tfPanel2, gbc);
        add(tfPanel3, gbc);
        add(tfPanel4, gbc);
        Panel btPanel = new Panel(
                new GridLayout(1, 0, 3, 3));
        Button ok = new Button("Ajouter");
        Button cancel = new Button("Effacer");
        Button quitter = new Button("Quitter");
        btPanel.add(ok);
        btPanel.add(cancel);
        btPanel.add(quitter);

        gbc.insets = new Insets(5, 0, 5, 0); // top-bottom
        add(tfPanel0, gbc);
        add(tfPanel, gbc);
        add(tfPanel1, gbc);
        add(tfPanel2, gbc);

        add(tfPanel3, gbc);
        add(tfPanel4, gbc);
        add(btPanel, gbc);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.out.println(" Au revoir !!!");
                System.exit(-1);

            }
        });
        setVisible(true);

    ok.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent ev) {
            try {
                NoteHelper.ajouterNote(newNote());
                JOptionPane.showMessageDialog(frame,
                        "Notes ajoutees pour le matricule: " + matricule.getText(),
                        "Success",

                        JOptionPane.OK_OPTION);
							FenetreGlobale fenetre = new FenetreGlobale();
							fenetre.setVisible(true);
							AjouterNote.this.setVisible(false);
                    AjouterEtudiant formEtu = new AjouterEtudiant();
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
        note.setcode(matricule.getText());
        note.setMatiere(matiere.getText());
        note.setValeur(Integer.parseInt(valeur.getText()));
        note.setAppreciation(appreciation.getText());
        note.setDateEval(dateEval.getText());
        note.setSession(session.getText());
        return note;
    }
    public static void main(String[] args) {
       new AjouterNote();
    }
}
