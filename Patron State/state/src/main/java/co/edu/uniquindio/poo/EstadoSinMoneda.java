package co.edu.uniquindio.poo;

public class EstadoSinMoneda implements EstadoMaquina {

    // Implementación del método para insertar una moneda
    @Override
    public void insertarMoneda() {
        System.out.println("Moneda insertada.");
    }

    // Implementación del método para expulsar una moneda
    @Override
    public void ejectarMoneda() {
        System.out.println("No hay moneda para expulsar.");
    }

    // Implementación del método para presionar el botón
    @Override
    public void presionarBoton() {
        System.out.println("Inserta una moneda primero.");
    }


    
}
