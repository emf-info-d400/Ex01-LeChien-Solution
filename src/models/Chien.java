package models;

/**
 * Classe représentant un Chien.
 *
 * @author FRIEDLI Paul
 * @since 2023-06-27
 * @version 0.1
 */
public class Chien {

    /**
     * L'attribut nom du chien.
     */
    private final String nom;

    /**
     * L'attribut âge du chien.
     */
    private final int age;

    /**
     * L'attribut permettant de savoir si le chien est endormi ou pas.
     */
    private boolean dort;
    
    /**
     * Le constructeur de la classe Chien.
     *
     * @param nom le nom a donner au chien
     * @param age l'âge du chien
     */
    public Chien( String nom, int age ) {
        this.nom = nom;
        this.age = age;
        this.dort = false;
    }

    /**
     * La méthode à appeler pour endormir le chien.
     */
    public void dormir() {
        if ( dort ) {
            System.out.println( nom + " est déjà endormi !!!" );
        } else {
            dort = true;
            System.out.println( nom + " dort" );
        }
    }

    /**
     * La méthode à appeler pour faire manger le chien.
     *
     * @param nourriture ce que le chien va dévorer
     */
    public void manger( String nourriture ) {
        if ( dort ) {
            System.out.println( nom + " ne peut pas manger puisqu'il dort !!!" );
        } else {
            System.out.println( nom + " mange " + nourriture );
        }
    }

    /**
     * La méthode à appeler pour faire aboyer le chien.
     */
    public void aboyer() {
        if ( dort ) {
            System.out.println( nom + " ne peut pas aboyer puisqu'il dort !!!" );
        } else {
            System.out.println( nom + " aboie" );
        }
    }

    /**
     * La méthode à appeler pour réveiller le chien.
     */
    public void reveiller() {
        if ( dort ) {
            dort = false;
            System.out.println( nom + " se réveille" );
        } else {
            System.out.println( nom + " ne peut pas se réveiller puisqu'il ne dort pas !!!" );
        }
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
