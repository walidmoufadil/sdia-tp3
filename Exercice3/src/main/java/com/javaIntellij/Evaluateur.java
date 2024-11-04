package com.javaIntellij;

public class Evaluateur {
    public Evaluateur() {
    }

    public static void main(String[] args) {
        Evaluateur evaluateur = new Evaluateur();
        try {
            evaluateur.verifierNote(15);
            evaluateur.verifierNote(25);

        } catch (NoteInvalideException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }

    public void verifierNote(double note) throws NoteInvalideException {
        if(note < 0 || note > 20){
            throw new NoteInvalideException(note);
        }
    }
}
