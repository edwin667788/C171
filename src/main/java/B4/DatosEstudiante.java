package B4;

public class DatosEstudiante {
    private String id;
    private String nombre;
    private String apellido;
    private String Telefono;
    private String cedula;
    private double promedio;
    private String carrera;

    DatosEstudiante(String id){
        this.id=id;

    }
// Getter Set

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getTelefono() {
        return Telefono;
    }

    public String getCedula() {
        return cedula;
    }

    public double getPromedio() {
        return promedio;
    }

    public String getCarrera() {
        return carrera;
    }
}
