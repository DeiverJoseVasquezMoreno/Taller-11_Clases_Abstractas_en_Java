public class TestEmpleado {
    public static void main(String[] args) {
        Empleado gerente = new Gerente("Ana", 3000.0, 500.0);
        Empleado vendedor = new Vendedor("Luis", 1500.0, 300.0);

        gerente.mostrarDetalles();
        vendedor.mostrarDetalles();
    }
}
