package app;

import models.Chien;

/**
 * Projet "LeChien", ma première classe et mes premiers objets.
 *
 * @author FRIEDLI Paul
 * @since 2023-06-27
 * @version 0.1
 */
public class Application {

    /**
     * LA méthode main() de l'application, là où tout commence mais... tout se
     * finit-il bien là ?
     *
     * @param args les arguments du programme passés sur la ligne de commande
     */
    public static void main(String[] args) {

        // Création de quelques chiens
        Chien medor = new Chien("Médor", 4);
        Chien zeus = new Chien("Zeus", 6);
        Chien rintintin = new Chien("Rintintin", 2);

        medor.dormir();
        rintintin.aboyer();
        rintintin.dormir();
        rintintin.reveiller();
        rintintin.aboyer();
        zeus.manger("son os de dinosaure");
        medor.aboyer();
        medor.manger("des croquettes");
        medor.reveiller();
        medor.reveiller();
        medor.aboyer();
        medor.manger("un bout de fromage");
    }
}
