import java.util.Scanner;

public class Ex3 {
/*
Escribe un programa Java que lee un número entero por teclado y obtiene y
muestra por pantalla el doble y el triple de ese número.
*/
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        System.out.println("Ingrese el valor entero: ");
        var num = sc.nextInt();

        var sol1 = doble(num);
        var sol2 = triple(num);

        System.out.println("Para " + num + "\nEl doble es: " + sol1 + " y el triple es: " + sol2);
    }
    public static int doble(int num){
        var dnum = num*2;
        return dnum;
    }
    public static int triple(int num){
        var tnum = num*3;
        return tnum;
    }
}
