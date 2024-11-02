package controller;

import model.Socio;

import java.util.ArrayList;
import java.util.List;

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

    public void otorgarTrofeo(){

    }

}
