package com.javaIntellij;

public class RacineCarreException extends Exception{
    public RacineCarreException(int valeur) {
        super("C'est une exception de type RacineCarreException. Nombre négatif : "+valeur);
    }
}
