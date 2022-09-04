public class Datos implements Suma.Main {

    @Override
    public void suma1(int valor1, int valor2){
        int total = valor1 + valor2;
        System.out.println(total);
    }


    @Override
    public void suma1(double v1, double v2){
        double total2 = v1 + v2;
        System.out.println(total2);
    }
}
