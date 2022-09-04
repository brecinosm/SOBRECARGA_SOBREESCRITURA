public class Suma {
    public void suma1(int valor1, int valor2) {
        int suma = valor1 + valor2;
        System.out.println("El resultado es: "+suma);
    }

    public void suma1(double v1, double v2){
        double suma2 = v1 + v2;
        System.out.println("\nEl resultado es: "+suma2);
    }

    public interface Main {
        void suma1(int valor1, int valor2);

        void suma1(double v1, double v2);
    }
}
