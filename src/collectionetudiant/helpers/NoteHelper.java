package collectionetudiant.helpers;

import collectionetudiant.models.*;

public class NoteHelper {
    public static void ajouterNote(Note note) throws Exception {
        String query = "INSERT INTO etudiants(code, valeur,  dateEval, appreciation, session) values("
                + note.getcode() + ",'" + note.getValeur() + "','" + note.getDateEval() + "','"
                + note.getAppreciation() + "','" + note.getSession() + "' );";

        Db_Instance.instance(query);
    }

}
