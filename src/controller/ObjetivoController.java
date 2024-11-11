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
        if(!socio.cumplirObjetivo()){
            socio.getObjetivo().getRutina().reforzarRutina(15.5f); //datos hardcodeados y revisar esto
        }
    }
}
