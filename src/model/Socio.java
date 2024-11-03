package model;

import model.interfaces.IBalanza;
import model.interfaces.ILogin;

import java.util.ArrayList;
import java.util.List;

public class Socio {
    private int edad;
    private char sexo;
    private float altura;
    private String nombre;
    private String password;
    private ILogin login;
    private Objetivo objetivo;
    private List<Peso> listaPeso;
    private List<Trofeo> trofeos;

    public Socio(int edad, char sexo, float altura, String nombre, String password) {
        this.edad = edad;
        this.sexo = sexo;
        this.altura = altura;
        this.nombre = nombre;
        this.password = password;
        this.trofeos = new ArrayList<>();
    }

    public void pesarse(){
        Peso peso = new Peso();
        listaPeso.add(peso);
        notificarObservadores(); //observer
    }

    public void agregarTrofeo(Trofeo trofeo){
        trofeos.add(trofeo);
    }

    public void eliminarTrofeo(Trofeo trofeo){
        trofeos.remove(trofeo);
    }

    public void notificarObservadores(){
        for(Trofeo trofeo:trofeos){
            trofeo.otorgarTrofeo(this);
        }
    }

    public void loguearse(){
        login.loguearse(nombre,password);
    }

    public boolean cumplirObjetivo(){
        return objetivo.cumplirObjetivo(this);
    }

    public void cambiarObjetivo(Objetivo estadoObjetivo){
        this.objetivo = estadoObjetivo;
    }

    public List<Peso> getListaPeso() {
        return listaPeso;
    }

    public Peso getPrimerPeso(){
        return listaPeso.get(0);
    }

    public Peso getUltimoPeso(){
        return listaPeso.getLast();
    }

    public Objetivo getObjetivo() {
        return objetivo;
    }

    public String getNombre(){
        return nombre;
    }

    public String getPassword(){
        return password;
    }

}
