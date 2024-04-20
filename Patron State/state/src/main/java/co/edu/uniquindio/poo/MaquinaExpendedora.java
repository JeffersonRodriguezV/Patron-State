package co.edu.uniquindio.poo;

public class MaquinaExpendedora {

    // Estado actual de la máquina expendedora
    private EstadoMaquina estadoActual;

    // Constructor que inicializa la máquina en el estado "Sin Moneda"
    public MaquinaExpendedora() {
        estadoActual = new EstadoSinMoneda();
    }

    // Método para cambiar el estado de la máquina
    public void cambiarEstado(EstadoMaquina estado) {
        estadoActual = estado;
    }

    // Método para insertar una moneda
    public void insertarMoneda() {
        estadoActual.insertarMoneda();
        // Si el estado actual es "Sin Moneda", cambia al estado "Con Moneda"
        if (estadoActual instanceof EstadoSinMoneda) {
            cambiarEstado(new EstadoConMoneda());
        }
    }

    // Método para expulsar una moneda
    public void ejectarMoneda() {
        estadoActual.ejectarMoneda();
        // Si el estado actual es "Con Moneda", cambia al estado "Sin Moneda"
        if (estadoActual instanceof EstadoConMoneda) {
            cambiarEstado(new EstadoSinMoneda());
        }
    }

    // Método para presionar el botón
    public void presionarBoton() {
        estadoActual.presionarBoton();
    }
    
}
