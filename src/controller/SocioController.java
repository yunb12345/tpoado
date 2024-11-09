package controller;

import bd.BaseDato;
import model.Socio;

public class SocioController {

    private static SocioController INSTANCE = null;

    private SocioController(){
    }

    public static SocioController getInstance(){
        if(INSTANCE  == null){
            INSTANCE = new SocioController();
        }
        return INSTANCE;
    }

    public void crearSocio(Socio socio){
        //ej Socio socio1 = new Socio(15,'M',18.8f,"Pedro","123");
        BaseDato.agregarSocio(socio);
    }

}
