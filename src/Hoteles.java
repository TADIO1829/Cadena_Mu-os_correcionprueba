public class Hoteles {
    String nombre;
    String fundador;
    String categoria;
    int anio;
    int habitaciones;
    int pisos;

    public Hoteles() {
    }

    public Hoteles(String nombre, int pisos, int habitaciones, int anio, String categoria, String fundador) {
        this.nombre = nombre;
        this.pisos = pisos;
        this.habitaciones = habitaciones;
        this.anio = anio;
        this.categoria = categoria;
        this.fundador = fundador;
    }
}
