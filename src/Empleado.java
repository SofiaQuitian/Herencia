public class Empleado {

    protected String cedula;
    protected String nombre;
    protected double salario;

    public Empleado() {
    }

    public Empleado(String cedula, String nombre, double salario) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.salario = salario;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "cedula='" + cedula + '\'' +
                ", nombre='" + nombre + '\'' +
                ", salario=" + salario +
                '}';
    }


    public void mostrarDetalles(){
        System.out.println("Cedula: " + cedula + "Nombre: " + nombre + "Salario: " + salario);
    }

    public double calcularBonificacion(){

        return salario*0.1;
    }


}