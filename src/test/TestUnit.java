package test;

import bd.BaseDato;
import controller.EjercicioController;
import model.*;
import model.enums.ExigenciaMuscular;
import model.enums.GrupoMuscular;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import controller.SocioController;

public class TestUnit {
    private SocioController socioController;
    private EjercicioController ejercicioController;

    @Test
    public void crearUsuario(){
        socioController = socioController.getInstance();
        Socio socio1 = new Socio(14,'M',1.65f,"Agustin","1234");
        socioController.crearSocio(socio1);
        Assert.assertEquals(1, BaseDato.getSocios().size());
    }
    @Test
    public void cambiarObjetivo(){
        Socio socio1 = new Socio(14,'M',1.65f,"Agustin","1234");
        Objetivo objetivo = new BajarPeso();
        socio1.cambiarObjetivo(objetivo);
        socio1.pesarse();
        socio1.cumplirObjetivo();
        Objetivo objetivo2 = new MantenerFigura(5);
        Assert.assertEquals(objetivo2, socio1.getObjetivo());
    }
    @Test
    public void asignarRutina(){
        Socio socio1 = new Socio(14,'M',1.65f,"Agustin","1234");
        Objetivo objetivo = new BajarPeso();
        socio1.cambiarObjetivo(objetivo);
        socio1.getObjetivo().crearRutina();
        Rutina rutina = new Rutina();
        Assert.assertEquals(rutina,socio1.getObjetivo().getRutina());
    }
    @Test
    public void asignarTrofeo(){
        Socio socio1 = new Socio(14,'M',1.65f,"Agustin","1234");
        socio1.pesarse();
        socio1.pesarse();
        socio1.pesarse();
        Assert.assertEquals(1,socio1.getTrofeos().size());
    }
    @Test
    public void registrarEjercicio(){
        ejercicioController = ejercicioController.getInstancia();
        Ejercicio ejercicio1 = new EjercicioConcreto(1,1,12.3f,5, ExigenciaMuscular.alto, GrupoMuscular.brazo);
        Ejercicio ejercicio2 = new EjercicioConcreto(1,1,12.3f,2, ExigenciaMuscular.alto, GrupoMuscular.brazo);
        Ejercicio ejercicio3 = new EjercicioConcreto(1,1,12.3f,1, ExigenciaMuscular.alto, GrupoMuscular.brazo);
        ejercicioController.agregarEjercicio(ejercicio1);
        ejercicioController.agregarEjercicio(ejercicio2);
        ejercicioController.agregarEjercicio(ejercicio3);

        Socio socio1 = new Socio(14,'M',1.65f,"Agustin","1234");
        Objetivo objetivo = new BajarPeso();
        socio1.cambiarObjetivo(objetivo);
        socio1.getObjetivo().crearRutina();
        socio1.getObjetivo().getRutina().iniciarRutina();

        Assert.assertEquals(1,BaseDato.getEjercicioCompletados().size());

    }
    @Test
    public void autenticarUsuario(){
        socioController = socioController.getInstance();
        Socio socio1 = new Socio(14,'M',1.65f,"Agustin","1234");
        socioController.crearSocio(socio1);
        Assert.assertEquals(true,socio1.loguearse());
    }
}
