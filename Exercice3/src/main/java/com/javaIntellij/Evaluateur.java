package com.javaIntellij;

public class Evaluateur {
    public Evaluateur() {
    }

    public static void main(String[] args) {
        Evaluateur evaluateur = new Evaluateur();
        try {
            evaluateur.verifierNote(-5);
            evaluateur.verifierNote(25);

        } catch (NoteInvalideException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }

    public void verifierNote(int note) throws NoteInvalideException {
        if(note < 0 || note > 100){
            throw new NoteInvalideException(note);
        }
    }
}
