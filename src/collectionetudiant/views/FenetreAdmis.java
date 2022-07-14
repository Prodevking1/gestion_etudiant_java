package collectionetudiant.views;
import collectionetudiant.helpers.AdmisHelper;
import collectionetudiant.helpers.Db_Instance2;

import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingUtilities;

public class FenetreAdmis extends JFrame {
    public FenetreAdmis() throws SQLException {
        
        // headers for the table
        String[] columns = new String[] {
                "Id", "Nom", "Prenom", "Moyenne"
        };

        String query = "select matricule, nom, prenom, AVG(valeur) from etudiants e, notes n where e.matricule=n.code group by e.nom, e.prenom;";

        ResultSet res = Db_Instance2.instance(query);
        /* try{
            String query = "select matricule, nom, prenom, AVG(valeur) from etudiants e, notes n where e.matricule=n.code;";

            ResultSet res = Db_Instance2.instance(query);
            
            System.out.println("ok");
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        } */

        // actual data for the table in a 2d array
        while (res.next()) {
            final String matricule = res.getString("matricule");
            final String nom = res.getString("nom");
            final String prenom = res.getString("prenom");
            final String moyenne = res.getString("AVG(valeur)");

            Object[][] data = new Object[][] {
                    {matricule, nom, prenom, moyenne},

            };
            // create table with data
            JTable table = new JTable(data, columns);

            // add the table to the frame
            this.add(new JScrollPane(table));

            this.setTitle("Table Example");
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.pack();
            this.setVisible(true);
        }
        
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    new FenetreAdmis();
                } catch (SQLException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        });
    }
}