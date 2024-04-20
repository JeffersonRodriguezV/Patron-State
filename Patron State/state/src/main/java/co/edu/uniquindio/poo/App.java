package co.edu.uniquindio.poo;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        // Crear una instancia de la máquina expendedora
        MaquinaExpendedora maquina = new MaquinaExpendedora();

        // Insertar moneda
        maquina.insertarMoneda();
        
        // Presionar botón sin insertar moneda
        maquina.presionarBoton();
        
        // Insertar otra moneda
        maquina.insertarMoneda();
        
        // Presionar botón para dispensar producto
        maquina.presionarBoton();
        
        // Expulsar la moneda
        maquina.ejectarMoneda();
    }
}
