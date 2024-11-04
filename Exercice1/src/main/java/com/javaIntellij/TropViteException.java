package com.javaIntellij;

public class TropViteException extends Exception{
    public TropViteException(double vitesse) {
        super("C'est une exception de type TropViteException. Vitesse en cause : " + vitesse);
    }
}
