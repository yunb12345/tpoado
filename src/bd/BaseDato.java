package bd;

import model.*;

import java.util.ArrayList;
import java.util.List;

public class BaseDato {
    private static List<Ejercicio> ejercicios = new ArrayList<>();
    private static List<EjercicioCompletado> ejercicioCompletados = new ArrayList<>();
    private static List<Socio> socios = new ArrayList<>();
    private static List<EjercicioReforzado> ejercicioReforzados = new ArrayList<>();
    private static List<Rutina> rutinas = new ArrayList<>();

    public static void agregarEjercicio(Ejercicio ejercicio){
        ejercicios.add(ejercicio);
    }

    public static List<Ejercicio> getEjercicios(){
        return ejercicios;
    }

    public static void agregarEjercicioCompletado(EjercicioCompletado ejercicioCompletado){
        ejercicioCompletados.add(ejercicioCompletado);
    }
    public static void agregarEjercicioReforzado(EjercicioReforzado ejercicioReforzado){
        ejercicioReforzados.add(ejercicioReforzado);
    }
    public static void agregarRutina(Rutina rutina){
        rutinas.add(rutina);
    }

    public static List<Rutina> getRutinas(){
        return rutinas;
    }

    public static List<EjercicioReforzado> getEjercicioReforzado(){
        return ejercicioReforzados;
    }
    public static List<EjercicioCompletado> getEjercicioCompletados(){
        return ejercicioCompletados;
    }

    public static void agregarSocio(Socio socio){
        socios.add(socio);
    }

    public static List<Socio> getSocios(){
        return socios;
    }
}
