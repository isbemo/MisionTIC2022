import java.util.Scanner;
public class Ex1 {
    public static void main(String[] args) throws Exception {
        //Pedir Nombre por consola
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese su nombre: ");
        var nombre = sc.nextLine();

        //Llamar clase que hace algo
        var resultado = saludo(nombre);
        System.out.println(resultado);
    }
//Esto es una clase llamada FUNCIÓN
    public static String saludo(String nombre){
        return "¡Hola "+ nombre + "!";
    }
}
