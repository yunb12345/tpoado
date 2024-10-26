package controller;

public class EjercicioController {
    private static EjercicioController instancia = null;

    public static EjercicioController getInstancia(){
        if(instancia==null){
            instancia = new EjercicioController();
        }
        return instancia;
    }
    private EjercicioController(){

    }
}
