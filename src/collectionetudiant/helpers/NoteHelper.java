
package collectionetudiant.helpers;

import collectionetudiant.models.*;

public class NoteHelper {
    public static void ajouterNote(Note note) throws Exception {
        /* String query = "INSERT INTO etudiants(code, matiere, valeur, dateEval, appreciation	, session_Note) values("
                + note.getcode() + ",'" + note.getMatiere() + "','" + note.getValeur() + "','"
                + note.getDateEval() + "','" + note.getAppreciation() + "','" + note.getSession()  + "' );"; */


        String query = "INSERT INTO notes(code, matiere, valeur, dateEval, appreciation	, session_Note) values("
                + note.getcode() + ",'" + note.getMatiere() + "','" + note.getValeur() + "','"
                + note.getDateEval() + "','" + note.getAppreciation() + "','" + note.getSession() + "' );";

        Db_Instance.instance(query);
    }

}
