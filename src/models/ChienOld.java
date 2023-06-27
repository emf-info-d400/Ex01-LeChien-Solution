package models;

/**
 * Classe représentant un Chien.
 *
 * @author FRIEDLI Paul
 * @since 2023-06-27
 * @version 0.1
 */
public class ChienOld {

    /**
     * L'attribut nom du chien.
     */
    private final String nom;
    
    /**
     * L'attribut âge du chien.
     */
    private final int age;
    
    /**
     * Le constructeur de la classe Chien.
     * @param nom le nom a donner au chien
     * @param age l'âge du chien
     */
    public ChienOld( String nom, int age ) {
        this.nom = nom;
        this.age = age;
    }

    /**
     * La méthode à appeler pour endormir le chien.
     */
    public void dormir() {
        System.out.println( nom + " dort" );
    }

    /**
     * La méthode à appeler pour faire manger le chien.
     * @param nourriture ce que le chien va dévorer
     */
    public void manger( String nourriture ) {
        System.out.println( nom + " mange " + nourriture );
    }

    /**
     * La méthode à appeler pour faire aboyer le chien.
     */
    public void aboyer() {
        System.out.println( nom + " aboie" );
    }

    /**
     * La méthode à appeler pour réveiller le chien.
     */
    public void reveiller() {
        System.out.println( nom + " se réveille" );
    }

    /**
     * Le getter de l'attribut nom du chien.
     * 
     * @return le nom du chien
     */
    public String getNom() {
        return nom;
    }

    /**
     * Le getter de l'attribut âge du chien.
     * 
     * @return l'âge du chien
     */
    public int getAge() {
        return age;
    }
}
