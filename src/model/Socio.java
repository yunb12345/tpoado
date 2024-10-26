package model;

import model.interfaces.IBalanza;
import model.interfaces.ILogin;

import java.util.List;

public class Socio {
    private int edad;
    private char sexo;
    private float altura;
    private float masa;
    private float grasa;
    private String nombre;
    private String password;
    private ILogin login;
    private Objetivo estadoObjetivo;
    private List<Peso> pesosDelMes;
    private List<Trofeo> trofeos;
    private IBalanza balanza;

    public Socio(int edad, char sexo, float altura, float peso, String nombre, String password) {
        this.edad = edad;
        this.sexo = sexo;
        this.altura = altura;
        this.nombre = nombre;
        this.password = password;
    }

    public float pesarse(){

        return balanza.pesarse();
    }

    public void loguearse(){

    }

    public boolean cumplirObjetivo(){
        return estadoObjetivo.cumplirObjetivo(this);
    }

    public void cambiarObjetivo(Objetivo estadoObjetivo){

    }

    public float getPeso(){
        return this.peso;
    }
    public float getMasa(){
        return this.masa;
    }
    public float getGrasa(){
        return this.grasa;
    }
}
