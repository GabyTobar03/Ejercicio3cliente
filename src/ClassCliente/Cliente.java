package ClassCliente;

import java.util.Random;

public class Cliente {
    private int id;
    private String codigo;
    private String nombre;
    private String apellido;
    private String email;
    private String telefono;

    public Cliente() {
    }

    public Cliente(int id, String nombre, String apellido, String email, String telefono) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.telefono = telefono;
        this.codigo = generarCodigo();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    private String generarCodigo() {
        Random random = new Random();
        int aleatorio = random.nextInt(1000); // Genera un número aleatorio de 0 a 999
        String codigoApellido = (apellido.length() >= 2) ? apellido.substring(0, 2).toUpperCase() : apellido.toUpperCase();
        String codigoNombre = (nombre.length() >= 2) ? nombre.substring(0, 2).toUpperCase() : nombre.toUpperCase();
        return codigoApellido + codigoNombre + String.format("%03d", aleatorio);
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Código: " + codigo + ", Nombre: " + nombre + ", Apellido: " + apellido + ", Email: " + email + ", Teléfono: " + telefono;
    }

}
