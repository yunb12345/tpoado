package model;

import controller.EjercicioController;
import model.enums.ExigenciaMuscular;

import java.util.ArrayList;
import java.util.List;

public class Entrenamiento {
    private List<Ejercicio> ejercicios;
    private int dia;
    private boolean asistencia;
    private boolean entrenamientoIniciado;
    private boolean entrenamientoFinalizado;

    public Entrenamiento(int dia) {
        this.dia = dia;
        this.asistencia = false;
        entrenamientoIniciado = false;
        entrenamientoFinalizado = false;
    }

    public void iniciarEntrenamiento(){
        this.entrenamientoIniciado = true;
        asistencia = true;
        for(Ejercicio ejercicio:ejercicios){
            ejercicio.iniciarEjercicio();
        }
    }

    public void finalizarEntrenamiento(){
        this.entrenamientoFinalizado=true;
    }

    public boolean cumplioAsistencia() {
        return asistencia;
    }

    public boolean verificarEjerciciosCompletado(){
        for(Ejercicio value: ejercicios){
            if(!value.esEjercicioCompletado()){
                return false;
            }
        }
        return true;
    }

    public void generarEjercicio(Objetivo objetivo){
        List<Ejercicio> ejercicio = EjercicioController.getInstancia().getEjercicios();
        List<Ejercicio> ejercicioAux = new ArrayList<>();
        for(Ejercicio value:ejercicio){
            if(objetivo instanceof BajarPeso){
                if(value.getNivelAerobico()>=3) {
                    ejercicioAux.add(value);
                }
            }
            else if(objetivo instanceof TonificarCuerpo){
                if(value.getNivelAerobico() <= 5 && value.getNivelMuscular() == ExigenciaMuscular.alto){
                    ejercicioAux.add(value);
                }
            }
            else{
                if((value.getNivelAerobico() <= 2 && value.getNivelAerobico() <= 4) &&
                        value.getNivelMuscular() != ExigenciaMuscular.alto){
                    ejercicioAux.add(value);
                }
            }
        }
        setEjercicios(ejercicioAux);
    }

    public void setEjercicios(List<Ejercicio> ejercicios) {
        this.ejercicios = ejercicios;
    }

    public void reforzarEjercicio(float porcentaje){
        EjercicioController ejercicioController = EjercicioController.getInstancia();
        List<Ejercicio> ejerciciosReforzados = new ArrayList<>();
        for(Ejercicio ejercicio:ejercicios){
            EjercicioReforzado ejercicioReforzado = new EjercicioReforzado(ejercicio,porcentaje);
            ejerciciosReforzados.add(ejercicioReforzado);
            ejercicioController.agregarEjercicioReforzado(ejercicioReforzado);
        }
        setEjercicios(ejerciciosReforzados);
    }

    public int getDia() {
        return dia;
    }
}
