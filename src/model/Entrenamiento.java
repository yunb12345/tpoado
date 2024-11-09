package model;

import controller.EjercicioController;
import model.enums.ExigenciaMuscular;

import java.util.ArrayList;
import java.util.List;

public class Entrenamiento {
    private List<Ejercicio> ejercicios;
    private int dia;
    private boolean asistencia;

    public Entrenamiento(int dia) {
        this.dia = dia;
        this.asistencia = false;
    }

    public void iniciarEntrenamiento(){
        this.finalizarEntrenamiento(); //hardcodeado
        asistencia = true;
    }
    public void finalizarEntrenamiento(){
        for(Ejercicio ejercicio:ejercicios){
            ejercicio.finalizarEjercicio(this);
        }
    }

    public boolean cumplioAsistencia() {
        return asistencia;
    }

    public boolean verificarEjerciciosCompletado(){
        for(Ejercicio value: ejercicios){
            if(!value.ejercicioFinalizado()){
                return false;
            }
        }
        return true;
    }
    public void generarEjercicio(Objetivo objetivo){
        List<Ejercicio> ejercicio = EjercicioController.getInstancia().getEjercicios(); //no estoy seguro de esto
        List<Ejercicio> ejercicioAux = new ArrayList<>();
        for(Ejercicio value:ejercicio){
            if(objetivo.cumpleCriterio(value)){
                ejercicioAux.add(value);
            }
        }
        setEjercicios(ejercicioAux);
    }
    public void setEjercicios(List<Ejercicio> ejercicios) {
        this.ejercicios = ejercicios;
    }
    public void reforzarEjercicio(float porcentaje){
        List<Ejercicio> ejerciciosReforzados = new ArrayList<>();
        for(Ejercicio ejercicio:ejercicios){
            Ejercicio ejercicioReforzado = new EjercicioReforzado(ejercicio,porcentaje);
            ejerciciosReforzados.add(ejercicioReforzado);
        }
        setEjercicios(ejerciciosReforzados);
    }

    public int getDia() {
        return dia;
    }
}
