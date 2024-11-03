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
    private List<Peso> pesosDelMes;
    private List<Trofeo> trofeos;
    private IBalanza balanza;

    public Socio(int edad, char sexo, float altura, String nombre, String password, List<Trofeo> trofeos) {
        this.edad = edad;
        this.sexo = sexo;
        this.altura = altura;
        this.nombre = nombre;
        this.password = password;
        this.trofeos = new ArrayList<>();
    }

    public void pesarse(int mes,int anio){
        Peso peso = new Peso(balanza.pesarse(), balanza.calcularMasa(), balanza.calcularGrasa(), mes,anio);
        pesosDelMes.add(peso);
    }

    public void agregarTrofeo(Trofeo trofeo){
        trofeos.add(trofeo);
    }

    public void loguearse(){
        new Login();
    }

    public boolean cumplirObjetivo(){
        return objetivo.cumplirObjetivo(this);
    }

    public void cambiarObjetivo(Objetivo estadoObjetivo){
        this.objetivo = estadoObjetivo;
    }

    public List<Peso> getPesosDelMes() {
        return pesosDelMes;
    }

    public Peso getPrimerPeso(){
        return pesosDelMes.get(0);
    }

    public Peso getUltimoPeso(){
        return pesosDelMes.getLast();
    }

    public Objetivo getObjetivo() {
        return objetivo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
