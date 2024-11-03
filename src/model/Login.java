package model;

import model.interfaces.ILogin;

import java.util.Date;

public class Login implements ILogin {
    private Date fecha;

    @Override
    public void loguearse(Socio socio) {
        if(socio.getNombre() == null && socio.getPassword() == null){
            System.out.println("Error, nombre y contraseña no pueden ser nulos ");
        }
        System.out.println("Inicio de sesión exitoso para: " + socio.getNombre());
    }
}
