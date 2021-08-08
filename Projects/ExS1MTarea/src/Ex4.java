import java.util.Scanner;

public class Ex4 {
/*
Escribe un programa que lea una cantidad de grados centígrados y la pase a
grados Fahrenheit. La fórmula es: F = 32 + ( 9 * C / 5)
*/
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        System.out.println("Ingrese una temperatura en °C");
        var c = sc.nextDouble();

        var f = cTemp(c);
        System.out.println(c + "°C son " + f + "°F");
    }

    public static double cTemp(double c){
        var f = 1.8*c+32;
        return f;
    }
}
