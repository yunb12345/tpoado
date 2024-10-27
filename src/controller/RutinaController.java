package controller;

import model.Ejercicio;
import model.Entrenamiento;
import model.Rutina;
import model.Socio;

import java.util.ArrayList;
import java.util.List;

public class RutinaController {
    private SocioController sociocontroller;
    private EntrenamientoController entrenamientoController;
    private static RutinaController instancia = null;
    private List<Rutina> rutinas = null;
    private List<Socio> socios = sociocontroller.getSocios(); //puede romper algun ecapsulamiento no estoy seguro si esto se hace asi

    public static RutinaController getInstancia(){
        if(instancia==null){
            instancia = new RutinaController();
        }
        return instancia;
    }
    private RutinaController(){
        this.rutinas = new ArrayList<>();
        this.sociocontroller = SocioController.getInstance();
        this.entrenamientoController = EntrenamientoController.getInstancia();
    }
    public Rutina generarRutina(Socio socio){
        List<Ejercicio> ejercicios = entrenamientoController.generarEjercicio(socio.getObjetivo()); //lista de ejercicios dependiendo el objetivo
        Entrenamiento entrenamiento = entrenamientoController.generarEntrenamiento(ejercicios,1); //hardcodeo el dia
        Rutina rutina = new Rutina(socio,entrenamiento);
        socio.setRutina(rutina);
        return rutina;
    }
}