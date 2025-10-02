public class empleasalariado {
    private String nombre;
    private String apellido;
    private String dni;
    private double salarioBase;

    public empleasalariado(String nombre, String apellido, String dni, double salarioBase) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.salarioBase = salarioBase;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getDni() {
        return dni;
    }

    public double getSalarioBase() {
        return salarioBase;
    }
}