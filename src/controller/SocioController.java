package controller;

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
    public void crearSocio(){

    }

}
