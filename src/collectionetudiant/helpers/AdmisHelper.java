
package collectionetudiant.helpers;

import java.sql.*;

import collectionetudiant.models.*;

public class AdmisHelper {
    public static final String getAdmis = null;

    public static void getAdmis() throws Exception {
        

       
        String query = "select matricule, nom, prenom, AVG(valeur) from etudiants e, notes n where e.matricule=n.code;";

        ResultSet res = Db_Instance2.instance(query);
        while (res.next()) {
            final String matricule = res.getString("matricule");
            final String nom = res.getString("nom");
            final String prenom = res.getString("prenom");
            final String moyenne = res.getString("AVG(valeur)");
        }

    }

}
