package de.flox.exception.user;

import de.flox.exception.exceptions.BenutzernameException;

public class Benutzer {

    private String benutzername, password;

    public String getBenutzername() {
        return benutzername;
    }

    public void setBenutzername(String benutzername) {
        try {
            checkBenutzername(benutzername);
        } catch (BenutzernameException e) {
            System.err.println(e.getMessage());
            e.printStackTrace();
        }
        if(benutzername.length() > 8){

            String shorten = benutzername.substring(0, Math.min(benutzername.length(), 8));
            this.benutzername = shorten;

        }
    }

    public void checkBenutzername(String benutzername)throws BenutzernameException{

        if(benutzername.length() > 8) {
            throw new BenutzernameException("Benutzername darf nicht länger als 8 Zeichen sein!");
        }

    }

    public void checkPasswort(String password){

        if(password.length() <= 7){
            throw new RuntimeException("Passwort ist zu kurz!");
        }

    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        checkPasswort(password);
        this.password = password;
    }
}
