package model;

import bd.BaseDato;
import model.interfaces.ILogin;

import java.util.Objects;

public class Login implements ILogin {

    @Override
    public void loguearse(String nombre,String password) {
        boolean flag = false;
        for(Socio socio : BaseDato.getSocios()){
            if(Objects.equals(socio.getNombre(), nombre) && Objects.equals(socio.getPassword(), password)){
                flag = true;
            }
        }
        if(flag){
            System.out.println("Te logueaste correctamente, bienvenido!");
        }else{
            System.out.println("Nombre de Usuario o contrseña incorrecta");
        }
    }
}
