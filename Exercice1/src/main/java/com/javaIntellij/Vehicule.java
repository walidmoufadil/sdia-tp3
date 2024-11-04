package com.javaIntellij;

public class Vehicule {
    public Vehicule() {
    }

    public static void main(String[] args) {
        Vehicule vehicule = new Vehicule();
        try {
            vehicule.testVitesse(89);
            vehicule.testVitesse(100);

        }catch (TropViteException e){
            System.out.println(e.getMessage());
        }

    }

    public void testVitesse(double vitesse) throws TropViteException{
        if(vitesse > 90){
            throw new TropViteException(vitesse);
        }
    }
}
