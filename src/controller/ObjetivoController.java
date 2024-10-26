package controller;

import model.Objetivo;

import java.util.ArrayList;
import java.util.List;

public class ObjetivoController {
    private List<Objetivo> objetivos;

    private static ObjetivoController INSTANCE = null;

    private ObjetivoController(){
        objetivos = new ArrayList<>();
    }

    public static ObjetivoController getInstance(){
        if(INSTANCE == null){
            INSTANCE = new ObjetivoController();
        }
        return INSTANCE;
    }

}
