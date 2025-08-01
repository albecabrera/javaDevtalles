package constante;

public class SalarioNetto {
    public static void main(String[] args) {
        final double PORCIENTO_INTERES = 0.10;
        int salarioTotal = 3000;
        double salarioNetto = salarioTotal * (1 - PORCIENTO_INTERES);
        System.out.println("salarioNetto = " + salarioNetto);
    }
}
