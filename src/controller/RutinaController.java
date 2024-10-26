package controller;

import model.Rutina;

import java.util.ArrayList;
import java.util.List;

public class RutinaController {
    private List<Rutina> rutinas;

    private static RutinaController INSTANCE = null;

    private RutinaController(){
        rutinas = new ArrayList<>();
    }

    public static RutinaController getInstance(){
        if(INSTANCE == null){
            INSTANCE = new RutinaController();
        }
        return INSTANCE;
    }
}
