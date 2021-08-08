import java.util.Scanner;

public class Ex5 {
    /*
Escribe un programa java que lea una variable de tipo entero y asígnale un valor. A continuación muestra 
un mensaje indicando si la variable es par o impar. Utiliza el operador condicional ( ? : ) para resolverlo.
Ej: “14 es par” o “15 es impar”
    */
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        System.out.println("Ingrese un número entero: ");
        var num = sc.nextInt();

        var sol = clase(num);
        System.out.println(sol);
    }

    public static String clase(int num) {
        String sol = (num % 2 == 0) ? num + " es par" : num + " es impar";
        return sol;
    }
}
