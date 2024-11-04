package com.javaIntellij;

public class NoteInvalideException extends Exception{
    public NoteInvalideException(int valeur) {
        super("Exception de type NoteInvalideException. Note invalide : "+ valeur);
    }
}
