package de.flox.exception.main;

import de.flox.exception.user.Benutzer;

public class BenutzerMain {

    public static void main(String[] args) {

        Benutzer benutzer = new Benutzer();
        benutzer.setBenutzername("FlorianWillDas");
        benutzer.setPassword("Hallo");

        System.out.println(benutzer.getBenutzername());
        System.out.println(benutzer.getPassword());

    }

}
