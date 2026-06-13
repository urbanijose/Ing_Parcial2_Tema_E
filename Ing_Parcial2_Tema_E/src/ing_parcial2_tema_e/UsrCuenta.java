package ing_parcial2_tema_e;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UsrCuenta {
    private String user;
    private int password;

    public UsrCuenta(String user, int password) {
        this.user = user;
        this.password = password;
    }

    public UsrCuenta() {
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }
    
    public boolean validarPassword(int contra) {
        if (contra == this.password){
            return true;
        } else {
            return false;
        }
    }
    
    public void cambioPassword(String newPass) {
        int nuevacontra = Integer.parseInt(newPass);
        this.password = nuevacontra;
    }
    
    public void delay(int mili) {
        try {
            Thread.sleep(mili);
        } catch (InterruptedException e) {
            System.out.println("Delay de " + mili + " milisegundos");
        }
    }
    
    public boolean usuariosDiferentes(UsrCuenta u2) {
        if (u2 == null) {
            return true;
        }
        if (u2.getUser().equals(this.user) && u2.getPassword() == this.password) {
            return false;
        } else {
        return true;
        }
    }
    
    public boolean validarMail(String email) {
        Pattern pattern = Pattern.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
        Matcher mather = pattern.matcher(email);
        return mather.find();
    }
}


