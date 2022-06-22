package collectionetudiant.helpers;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author
 */

public class Db_Instance {

    
        static String db_url = "jdbc:mysql://localhost/gestion";
        static String db_user = "root";
        static String db_password = "";
        
       public static void instance (String query){
            try {
                Class.forName("com.mysql.jdbc.Driver");
                Connection conn = DriverManager.getConnection(db_url, db_user, db_password);
                Statement state = conn.createStatement();
                state.executeUpdate(query);
                state.close();
                conn.close();
                System.out.println("Connexion a la bd reussie...");
            } catch (ClassNotFoundException | SQLException e) {
                System.out.println(" Une erreur s'est produite :" + e);
        }
        
        
    }

}
