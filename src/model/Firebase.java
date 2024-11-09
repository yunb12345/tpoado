package model;

import model.interfaces.IFirebase;

public class Firebase implements IFirebase {

    @Override
    public void notificar() {
        System.out.println("Notificación enviada");
    }
}
