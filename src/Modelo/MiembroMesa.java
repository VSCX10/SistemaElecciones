package Modelo;

public class MiembroMesa extends Persona{
    public MiembroMesa(String nombre, String apellidoPaterno, String apellidoMaterno, String DNI, String password) {
        super(nombre, apellidoPaterno, apellidoMaterno, DNI);
        this.password = password;
    }
}
