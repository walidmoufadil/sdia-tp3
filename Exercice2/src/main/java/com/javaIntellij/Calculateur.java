package com.javaIntellij;

public class Calculateur {

    public Calculateur() {
    }

    public static void main(String[] args) {
        Calculateur calculateur = new Calculateur();
        try {
            calculateur.testRacineCarre(10);
            calculateur.testRacineCarre(-5);


        }catch (RacineCarreException e) {
            System.out.println(e.getMessage());
        }
    }

    public void testRacineCarre(int valeur) throws RacineCarreException{
        if(valeur < 0){
            throw new RacineCarreException(valeur);
        }
    }

}
