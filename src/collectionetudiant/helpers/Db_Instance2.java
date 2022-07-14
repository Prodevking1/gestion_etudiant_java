package collectionetudiant.helpers;

import java.sql.*;

/**
 *
 * @author
 */

public class Db_Instance2 {

    
        static String db_url = "jdbc:mysql://localhost/gestion";
        static String db_user = "root";
        static String db_password = "";
        static ResultSet rs;

       public static ResultSet instance (String query){
            try {
                Class.forName("com.mysql.jdbc.Driver");
                Connection conn = DriverManager.getConnection(db_url, db_user, db_password);
                Statement state = conn.createStatement();
                 rs = state.executeQuery(query);
                /* state.close();
                conn.close(); */
                System.out.println("Connexion a la bd reussie...");
            } catch (ClassNotFoundException | SQLException e) {
                System.out.println(" Une erreur s'est produite :" + e);
        }
            return rs;
        
        
    }

}
