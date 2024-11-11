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
        socioController = socioController.getInstancia();
        Socio socio1 = new Socio(25,'M',1.45f,"Agustin","14735");
        socioController.crearSocio(socio1);
        Assert.assertEquals(1, BaseDato.getSocios().size());
    }

    @Test
    public void cambiarObjetivo(){
        ejercicioController = ejercicioController.getInstancia();
        Ejercicio ejercicio1 = new EjercicioConcreto(1,1,12.3f,5, ExigenciaMuscular.alto, GrupoMuscular.brazo); //bajar peso
        Ejercicio ejercicio2 = new EjercicioConcreto(1,1,12.3f,3, ExigenciaMuscular.alto, GrupoMuscular.brazo); //ejercicio para mantener figura
        ejercicioController.agregarEjercicio(ejercicio1);
        ejercicioController.agregarEjercicio(ejercicio2);

        Socio socio1 = new Socio(30,'M',1.85f,"Matias","666");
        Objetivo objetivo = new BajarPeso();
        socio1.cambiarObjetivo(objetivo); //al setear el objetivo se genera la rutina
        socio1.pesarse();

        Objetivo objetivo2 = new MantenerFigura(5);
        socio1.cambiarObjetivo(objetivo2);
        Assert.assertEquals(objetivo2, socio1.getObjetivo()); //este es para el cambio de objetivo
        Assert.assertEquals(2,BaseDato.getRutinas().size()); //este es para la rutina
    }

    @Test
    public void asignarRutina(){
        ejercicioController = ejercicioController.getInstancia();
        Ejercicio ejercicio1 = new EjercicioConcreto(1,1,12.3f,5, ExigenciaMuscular.alto, GrupoMuscular.brazo);
        ejercicioController.agregarEjercicio(ejercicio1);

        Socio socio1 = new Socio(14,'M',1.65f,"Agustin","1234");
        Objetivo objetivo = new BajarPeso();
        socio1.cambiarObjetivo(objetivo);
        socio1.getObjetivo().crearRutina();
        Rutina rutina = new Rutina();
        Assert.assertEquals(rutina,socio1.getObjetivo().getRutina());
    }

    @Test
    public void reforzarRutina(){
        ejercicioController = ejercicioController.getInstancia();
        Ejercicio ejercicio1 = new EjercicioConcreto(1,1,12.3f,5, ExigenciaMuscular.alto, GrupoMuscular.brazo); //bajar peso
        ejercicioController.agregarEjercicio(ejercicio1);

        Socio socio1 = new Socio(30,'M',1.85f,"Matias","666");
        Objetivo objetivo = new BajarPeso();
        socio1.cambiarObjetivo(objetivo);
        socio1.pesarse();
        socio1.getObjetivo().crearRutina(); //generamos la rutina
        socio1.getObjetivo().reforzarRutina();
        EjercicioReforzado ejercicioReforzado = new EjercicioReforzado(ejercicio1,5f);
        Assert.assertEquals(4,BaseDato.getEjercicioReforzado().size());
    }

    @Test
    public void asignarTrofeoCreido(){
        Socio socio1 = new Socio(22,'M',1.75f,"Lucas","78893");
        socio1.pesarse();
        socio1.pesarse();
        socio1.pesarse();
        Assert.assertEquals(1,socio1.getTrofeos().size());
    }

    @Test
    public void TrofeoConstancia(){
        ejercicioController = ejercicioController.getInstancia();
        Ejercicio ejercicio1 = new EjercicioConcreto(1,1,12.3f,5, ExigenciaMuscular.alto, GrupoMuscular.brazo); //bajar peso
        ejercicioController.agregarEjercicio(ejercicio1);

        Socio socio1 = new Socio(22,'M',1.75f,"Lucas","78893");
        socio1.pesarse();
        Objetivo objetivo = new BajarPeso();
        socio1.cambiarObjetivo(objetivo);
        socio1.getObjetivo().getRutina().iniciarRutina();
        TrofeoConstancia trofeoConstancia = new TrofeoConstancia("has sido constante");
        trofeoConstancia.otorgarTrofeo(socio1);
        Assert.assertEquals(1,socio1.getTrofeos().size());
    }

    @Test
    public void TrofeoDedicacion(){
        Socio socio3 = new Socio(35,'M',1.80f,"Luca","78922");
        Objetivo objetivo = new BajarPeso();
        socio3.cambiarObjetivo(objetivo);
        socio3.pesarse();
        TrofeoDedicacion trofeoDedicacion = new TrofeoDedicacion("asd");
        trofeoDedicacion.otorgarTrofeo(socio3);
        Assert.assertEquals(1,socio3.getTrofeos().size());
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

        Socio socio1 = new Socio(19,'M',1.69f,"Marcos","7844");
        Objetivo objetivo = new BajarPeso();
        socio1.cambiarObjetivo(objetivo);
        socio1.getObjetivo().crearRutina();
        socio1.getObjetivo().getRutina().iniciarRutina();

        Assert.assertEquals(4,BaseDato.getEjercicioCompletados().size());
    }

    @Test
    public void autenticarUsuario(){
        socioController = socioController.getInstancia();
        Socio socio1 = new Socio(27,'M',1.90f,"Matias","123");
        socioController.crearSocio(socio1);
        Assert.assertEquals(true,socio1.loguearse());
    }
}
