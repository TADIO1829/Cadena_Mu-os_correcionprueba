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

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPisos() {
        return pisos;
    }

    public void setPisos(int pisos) {
        this.pisos = pisos;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public int getHabitaciones() {
        return habitaciones;
    }

    public void setHabitaciones(int habitaciones) {
        this.habitaciones = habitaciones;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getFundador() {
        return fundador;
    }

    public void setFundador(String fundador) {
        this.fundador = fundador;
    }
}
