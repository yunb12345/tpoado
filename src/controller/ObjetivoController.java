package controller;

public class ObjetivoController {
    private static ObjetivoController instancia = null;

    public static ObjetivoController getInstancia(){
        if(instancia==null){
            instancia = new ObjetivoController();
        }
        return instancia;
    }
    private ObjetivoController(){

    }

}
