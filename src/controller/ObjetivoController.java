package controller;

import model.Socio;

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

    public void estadoCumplimientoObjetivo(Socio socio){
        //logica del progres/ si lo esta cumpliendo
        if(!socio.cumplirObjetivo()){

        }
    }
}
