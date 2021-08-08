import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        // Pide un número por consola
        var sc = new Scanner(System.in);
        System.out.println("Ingrese un número entero: ");
        var num = sc.nextInt();

        //Llama la función
        var digitos = numDigitos(num);
        System.out.println("El número tiene " + digitos + " digitos");
    }

    public static int numDigitos(int numero){
        var digitos = 0;

        do {
            numero /= 10;
            digitos++;
        }
        while(numero != 0);
        return digitos;
    }
}
