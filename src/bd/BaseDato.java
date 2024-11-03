package bd;

import model.Ejercicio;
import model.EjercicioCompletado;
import model.Socio;

import java.util.ArrayList;
import java.util.List;

public class BaseDato {
    private static List<Ejercicio> ejercicios = new ArrayList<>();
    private static List<EjercicioCompletado> ejercicioCompletados = new ArrayList<>();
    private static List<Socio> socios = new ArrayList<>();

    public static void agregarEjercicio(Ejercicio ejercicio){
        ejercicios.add(ejercicio);
    }
    public static List<Ejercicio> getEjercicios(){
        return ejercicios;
    }
    public static void agregarEjercicioCompletado(EjercicioCompletado ejercicio){
        ejercicioCompletados.add(ejercicio);
    }
    public static List<EjercicioCompletado> getEjercicioCompletados(){
        return ejercicioCompletados;
    }
    public static void agregarSocios(Socio socio){
        socios.add(socio);
    }
    public static List<Socio> getSocios(){
        return socios;
    }
}
