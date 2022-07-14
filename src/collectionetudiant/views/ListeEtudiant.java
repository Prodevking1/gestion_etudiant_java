package collectionetudiant.views;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import collectionetudiant.helpers.Db_Instance2;

import java.sql.*;

public class ListeEtudiant extends JFrame implements ActionListener {
    
    JLabel lab1, lab2;
    JComboBox jcb1, jcb2;
    JButton jb1, jb2, jb3;
    JTable tb;
    JScrollPane scrl;
    Statement st;

    public ListeEtudiant() {
        this.setTitle("Deliberation");
        this.setSize(1000, 600);
        this.setLocation(350, 30);
        this.setResizable(false);
        JPanel pn = new JPanel();
        pn.setLayout(null);
        pn.setBackground(Color.gray);
        add(pn);
        //
        lab1 = new JLabel("LISTE DE TOUS LES ETUDIANTS");
        lab1.setBounds(150, 10, 500, 30);
        lab1.setFont(new Font("Arial", Font.BOLD, 25));
        lab1.setBorder(BorderFactory.createLineBorder(Color.black));
        pn.add(lab1);

        jb1 = new JButton("Afficher");
        jb1.setBounds(640, 80, 300, 30);
        jb1.setBackground(Color.white);
        jb1.setForeground(Color.blue);
        jb1.addActionListener(this);
        pn.add(jb1);

        jb2 = new JButton("Retour");
        jb2.setBounds(0, 80, 300, 30);
        jb2.setBackground(Color.white);
        jb2.setForeground(Color.blue);
        jb2.addActionListener(this);
        pn.add(jb2);

        //
        DefaultTableModel df = new DefaultTableModel();
        init();
        df.addColumn("Matricule");
        df.addColumn("Nom");
        df.addColumn("Prenom");
        df.addColumn("Moyenne");
        // df.addColumn("Filiere");
        // df.addColumn("Niveau");
        tb.setModel(df);
        pn.add(scrl);

    }

    private void init() {
        tb = new JTable();
        scrl = new JScrollPane();
        scrl.setViewportView(tb);
        scrl.setBounds(10, 150, 960, 400);

    }

    public static void main(String[] args) {

        ListeEtudiant ls = new ListeEtudiant();
        ls.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        if (e.getSource() == jb1) {
            String a, b;
            // a=jcb1.getSelectedItem().toString();
            // b=jcb2.getSelectedItem().toString();
            DefaultTableModel df = new DefaultTableModel();
            df.addColumn("Matricule");
            df.addColumn("Nom");
            df.addColumn("Prenom");
            df.addColumn("Date de Naissance");
            df.addColumn("Lieu de Naissance");
            df.addColumn("Email");
            df.addColumn("Genre");
            df.addColumn("Moyenne");
            tb.setModel(df);
            
            String query = "select * , AVG(valeur) from etudiants e, notes n where e.matricule=n.code  group by e.nom, e.prenom desc;";

            ResultSet rst = Db_Instance2.instance(query);

            try {
                
                while (rst.next()) {
                    df.addRow(new Object[] {
                            rst.getString("matricule"),
                            rst.getString("nom"),
                            rst.getString("prenom"),
                            rst.getString("dte_naiss"),
                            rst.getString("lieu_naiss"),
                            rst.getString("email"),
                            rst.getString("genre"),
                            rst.getString("AVG(valeur)")


                    });

                }

            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, "INTROUVABLE", null, JOptionPane.ERROR_MESSAGE);
            }

        }
        jb2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ev) {
                /* Admis.calculMoyenne(1); */
                FenetreGlobale home = new FenetreGlobale();
                home.setVisible(true);
                ListeEtudiant.this.setVisible(false);

            }
        });

    }

}
