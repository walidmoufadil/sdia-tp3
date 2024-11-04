package com.javaIntellij;

public class NoteInvalideException extends Exception{
    public NoteInvalideException(double valeur) {
        super("Exception de type NoteInvalideException. Note invalide : "+ valeur);
    }
}
