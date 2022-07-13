package collectionetudiant;

import collectionetudiant.Etudiant;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author
 */
public class ConnexionEtudiant {

    public static void AddEtudiant(Etudiant etudiant) throws Exception {
        String query = "INSERT INTO etudiants values (" + etudiant.getMatricule() + ",'" + etudiant.getNom() + "','"
                + etudiant.getPrenom() + "','" + etudiant.getDte_naiss() + "','" + etudiant.getLieu_naiss()
                + etudiant.getGenre() + "')";
        String db_url = "jdbc:mysql://localhost:3308/bdreleve";
        String db_user = "root";
        String db_password = "";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection(db_url, db_user, db_password);
            Statement state = conn.createStatement();
            int result = state.executeUpdate(query);
            state.close();
            conn.close();
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(" Une erreur s'est produite :" + e);
        }
    }

    /*
     * public static void modifierEtudiantBD(int matricule, Etudiant etudiant)
     * throws Exception {
     * String query = "UPDATE etudiantdiant SET matricule_Etudiant="
     * + etudiant.getMatricule() + ", nom_Etudiant='" + etudiant.getNom() +
     * "', prenom_Etudiant='" + etudiant.getPrenom() +
     * "', email_Etudiant='" + etudiant.getEmail() +
     * "', numtel_Etudiant='" + etudiant.getNumTel() +
     * "' WHERE matricule_Etudiant=" + matricule;
     * String url = "jdbc:mysql://localhost:3308/bdreleve";
     * String login = "root";
     * String db_password = "";
     * try {
     * Class.forName("com.mysql.jdbc.Driver");
     * Connection conn = DriverManager.getConnection(url, login, db_password);
     * Statement state = conn.createStatement();
     * int result = state.executeUpdate(query);
     * state.close();
     * conn.close();
     * } catch (ClassNotFoundException | SQLException e) {
     * System.out.println(" Exception : " + e + " est levée");
     * }
     * }
     * 
     * public static void modifierEtudiantBDPreparedStatement(int mat, Etudiant
     * etudiant)
     * throws Exception {
     * String query =
     * "UPDATE etudiantdiant SET matricule_Etudiant= ?, nom_Etudiant=?, prenom_Etudiant=?, email_Etudiant=?, numtel_Etudiant=? WHERE matricule_Etudiant=?"
     * ;
     * String url = "jdbc:mysql://localhost:3308/bdreleve";
     * String login = "root";
     * String db_password = "";
     * try {
     * Class.forName("com.mysql.jdbc.Driver");
     * Connection conn = DriverManager.getConnection(url, login, db_password);
     * PreparedStatement pstate = conn.prepareStatement(query);
     * pstate.setInt(1, etudiant.getMatricule());
     * pstate.setString(2, etudiant.getNom());
     * pstate.setString(3, etudiant.getPrenom());
     * pstate.setString(4, etudiant.getEmail());
     * pstate.setString(5, etudiant.getNumTel());
     * pstate.setInt(6, mat);
     * int result = pstate.executeUpdate(query);
     * pstate.close();
     * conn.close();
     * } catch (ClassNotFoundException | SQLException e) {
     * System.out.println(" Exception : " + e + " est levée");
     * }
     * }
     * 
     * public static void supprimerEtudiantBD(int etudiant) throws Exception {
     * String query = "DELETE FROM etudiantdiant WHERE matricule_Etudiant=" +
     * etudiant;
     * try {
     * Connection conn = GestionReleve.pool.getConnection();
     * Statement state = conn.createStatement();
     * int rs = state.executeUpdate(query);
     * state.close();
     * conn.close();
     * } catch (SQLException e) {
     * System.out.println(" Exception : " + e + " est levée");
     * }
     * }
     */

    public static boolean isEtudiant(int etudiant) throws Exception {
        String query = "SELECT * FROM etudiantdiant WHERE matricule_Etudiant=" + etudiant;
        String url = "jdbc:mysql://localhost:3308/gestion";
        String login = "root";
        String db_password = ""; 
        boolean result = false;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection(url, login, db_password);
            Statement state = conn.createStatement();
            ResultSet rs = state.executeQuery(query);
            if (rs.next()) {
                result = true;
            } else {
                result = false;
            }
            rs.close();
            state.close();
            conn.close();
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(" Une erreur s'est produite : " + e.getMessage());
        }
        return result;
    }

    public static void admis(int etudiant) throws Exception {
        String query = "SELECT * FROM notes WHERE matricule_Etudiant=" + etudiant + "AND AVG()";
        String url = "jdbc:mysql://localhost:3308/gestion";
        String login = "root";
        String db_password = "";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection(url, login, db_password);
            Statement state = conn.createStatement();
            ResultSet rs = state.executeQuery(query);
            while (rs.next()) {
                String nom = rs.getString("matiere_Note");
                float note = rs.getFloat("valeur_Note");
                String date = rs.getString("datedevoir_Note");
                int session = rs.getInt("session_Note");
                System.out.println("Matiere: " + nom + " Note: " + note + " Date:" + date);
            }
            rs.close();
            state.close();
            conn.close();
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Une erreur s'est produite : " + e);
        }
    }
}
