import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NumerosPrimos {

    private static void cribaEratostenes(int num) {
        int tope = (int) Math.floor(Math.sqrt(num)) + 1;
        List<Long> compuestos = new ArrayList<>();
        for (int i = 2; i <= tope; i++) {
            if (!compuestos.contains((long) i)) {
                for (int j = i; j <= num / i + 1; j++)
                    compuestos.add((long) (i * j));
            }
        }
        Imprime(compuestos, num);
    }

    private static void Imprime(List compuestos, int num) {
        int salto = 1;
        for (int pos = 2; pos < num; pos++) {
            if (!compuestos.contains((long) pos)) {
                salto++;
                salto = modoImpresion(pos, salto);
            }
        }
    }

    private static int modoImpresion(int pos, int salto) {
        if (pos < 10)
            System.out.print(pos + "   ");
        else if (pos < 100)
            System.out.print(pos + "  ");
        else if (pos < 1000)
            System.out.print(pos + " ");
        if (salto == 10) {
            salto = 1;
            System.out.println();
        }
        return salto;
    }

    public static void main(String[] args) {
        int numDigitos;
        Scanner in = new Scanner(System.in);
        System.out.print("Ingrese como parámetro, un numero de digitos correcto (mayor que 0): ");
        numDigitos = in.nextInt();
        if (numDigitos > 0) {
            System.out.print("Los números primos anteriores a "+numDigitos+" son:\n");
            cribaEratostenes(numDigitos);
        }
    }
}