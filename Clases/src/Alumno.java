import java.sql.SQLException;
import java.util.Scanner;

public class Alumno {

    private int id;
    private String nombre;
    private String apellido;
    private int mensualidad;
    private int pagoPendiente;

    DB baseDeDatos = new DB();
    Scanner keyboard = new Scanner(System.in);

    public Alumno() throws SQLException {}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getMensualidad() {
        return mensualidad;
    }

    public void setMensualidad(int mensualidad) {
        this.mensualidad = mensualidad;
    }

    public int getPagoPendiente() {
        return pagoPendiente;
    }

    public void setPagoPendiente(int pagoPendiente) {
        this.pagoPendiente = pagoPendiente;
    }
}