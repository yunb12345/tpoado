package model;

public class MantenerFigura extends Objetivo{
    private int oscilacionPeso;

    public MantenerFigura(int oscilacionPeso){
        super();
        this.oscilacionPeso = oscilacionPeso;
    };

    //si el primer peso menos la osc es menor al ultimo peso quiere decir que no mantuvo la figura
    //pes inic 60 osc 5, no puede pesar menos de 55
    //si el primer peso menos la osc es mayor al ultimo peso, no mantuvo la figura
    //pes inic 60 osc 5, no puede pesar mas de 65
    @Override
    public boolean cumplirObjetivo(Socio socio) {
        return !(socio.getPrimerPeso() - oscilacionPeso < socio.getUltimoPeso()) &&
                !(socio.getPrimerPeso() + oscilacionPeso > socio.getUltimoPeso());
    }

    @Override
    public void crearRutina() {

    }
}
