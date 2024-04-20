package co.edu.uniquindio.poo;

public class EstadoConMoneda implements EstadoMaquina {

    // Implementación del método para insertar una moneda
    @Override
    public void insertarMoneda() {
        System.out.println("Ya hay una moneda insertada.");
    }

    // Implementación del método para expulsar una moneda
    @Override
    public void ejectarMoneda() {
        System.out.println("Moneda expulsada.");
    }

    // Implementación del método para presionar el botón
    @Override
    public void presionarBoton() {
        System.out.println("Botón presionado. Dispensando producto.");
    }

    
}
