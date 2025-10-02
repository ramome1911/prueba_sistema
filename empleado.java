public abstract class empleado {
    private String nombre;
    private String apellido;
    private String dni;
    private double salarioBase;

    public empleado(String nombre, String apellido, String dni, double salarioBase) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.salarioBase = salarioBase;
    }

}