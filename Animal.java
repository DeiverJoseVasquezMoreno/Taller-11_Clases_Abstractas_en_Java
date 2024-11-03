public abstract class Animal {
    public void hacerSonido() {
        System.out.println("El animal hace un sonido.");
    }
}

class Main {
    public static void main(String[] args) {
        // Error de compilación: Cannot instantiate the type Animal
        // Animal animal = new Animal();
    }
}
