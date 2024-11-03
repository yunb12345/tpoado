package controller;

public class RutinaController {
    private static RutinaController instancia = null;

    public static RutinaController getInstancia(){
        if(instancia==null){
            instancia = new RutinaController();
        }
        return instancia;
    }
    private RutinaController(){
    }
}