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
    private TrofeoCreido obs;

    public Socio(int edad, char sexo, float altura, String nombre, String password) {
        this.edad = edad;
        this.sexo = sexo;
        this.altura = altura;
        this.nombre = nombre;
        this.password = password;
        this.trofeos = new ArrayList<>();
        this.listaPeso = new ArrayList<Peso>();
        this.obs = new TrofeoCreido("El trofeo creido");
        this.login = new Login();
    }

    public void pesarse(){
        Peso peso = new Peso();
        listaPeso.add(peso);
        notificarObservador(); //observer
    }

    public void setearObserver(TrofeoCreido creido){
        obs=creido;
    }

    public void eliminarObserver(){
        obs=null;
    }

    public void notificarObservador(){
        obs.otorgarTrofeo(this);
    }

    public void agregarTrofeo(Trofeo trofeo){
        trofeos.add(trofeo);
    }

    public boolean loguearse(){
        return login.loguearse(nombre,password);
    }

    public boolean cumplirObjetivo(){
        return objetivo.cumplirObjetivo(this);
    }

    public void cambiarObjetivo(Objetivo estadoObjetivo){
        this.objetivo = estadoObjetivo;
        this.objetivo.crearRutina();
    }

    public List<Peso> getListaPeso() {return listaPeso;}

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

    public List<Trofeo> getTrofeos(){return trofeos;}

}
