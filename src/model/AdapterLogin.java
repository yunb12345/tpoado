package model;

import bd.BaseDato;
import model.interfaces.IAdapterLogin;

import java.util.Objects;

public class AdapterLogin implements IAdapterLogin {

    @Override
    public boolean loguearse(String nombre,String pass) {
        boolean flag = false;
        for(Socio socio : BaseDato.getSocios()){
            if(Objects.equals(socio.getNombre(), nombre) && Objects.equals(socio.getPassword(), pass)){
                flag = true;
            }
        }
        if(flag){
            System.out.println("Te logueaste correctamente");
        }else{
            System.out.println("Usuario o passsword incorrecto");
        }
        return flag;
    }
}
