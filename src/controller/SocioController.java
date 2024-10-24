package controller;

import model.Socio;

import java.util.ArrayList;
import java.util.List;

public class SocioController {
    private List<Socio> socios;

    private static SocioController INSTANCE = null;

    private SocioController(){
        socios = new ArrayList<>();
    }

    public static SocioController getInstance(){
        if(INSTANCE  == null){
            INSTANCE = new SocioController();
        }
           return INSTANCE;
        }

    public void otorgarTrofeo(){

    }

    public List<Socio> getSocios() {
        return socios;
    }

    public void setSocios(List<Socio> socios) {
        this.socios = socios;
    }
}
