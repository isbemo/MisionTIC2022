// import java.sql.Date;
// import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {

        //Variables en Java
/*        String saludo = "Cordial saludo \n Ingrese su nombre";
        System.out.println(saludo);
        String nombre = "Isaías E. Beleño M.";
        byte edad = 28;
        System.out.printf(nombre + " con " + edad + " años");
*/      
//Código ASCII con CHAR
/*
        char a=65, b=66, c=67;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
*/
//Operadores en JAVA
/*
        int x = 10;
        x += 5;
        System.out.println(x);
        int y = 20;
        y %=3;
        System.out.println(y);
        int z = 30;
        z |= 3;
        System.out.println(z);
        int w = 41;
        w &= 2;
        System.out.println(w);
        int j = 50;
        j>>=2;
        System.out.println("j >>=3 es " + j);
*/
//String's Methods
/*
        String saludo = "¡Hola! \f ¿cómo estas?";
        System.out.println(saludo.toUpperCase());
        System.out.println(saludo.toLowerCase());
        System.out.println(saludo.indexOf("¿"));
        System.out.println(saludo.length());
        System.out.println(saludo.replaceAll("¡Hola", "Hello"));
*/
// Math Library
/*
        int x = 20, y = 30;
        System.out.println(Math.min(x, y));
        System.out.println(Math.max(x, y));
        System.out.println(Math.sqrt(x));
        System.out.println(Math.abs(y));
        double r = Math.random();
        System.out.println(r);
        System.out.println(Math.round(r));
*/
//Uso de condicionales
/*
        int hora = 18;
        if (hora <12){
                System.out.println("Es de Mañana");
        }else{
                System.out.println("Es de Tarde");
        }
        //Forma condensada
        String sol = (hora<12) ? "It's Morning" : "It's Afternoon";
        System.out.println(sol);
*/
//Uso del SWITCH
/* Es importante aclarar que SWITCH es de uso teclado opciones.
Como el menú del bot de WhatsApp.
*/
/*
        int day = 4;
        switch (day) {
                case 1:
                System.out.println("Monday");
                break;
                case 2:
                System.out.println("Tuesday");
                break;
                case 3:
                System.out.println("Wednesday");
                break;
                case 4:
                System.out.println("Thursday");
                break;
                case 5:
                System.out.println("Friday");
                break;
                case 6:
                System.out.println("Saturday");
                break;
                case 7:
                System.out.println("Sunday");
                break;
        }
*/
//Loops bajo While
/*
        //Function WHILE
        int i = 0;
        while (i < 5) {
                System.out.println(i);
                i++;
        }
        //FUNCTION DO () WHILE ()
        int J = 5;
        do {
                System.out.println(J);
                J--;
        }
        while (J >= 0);

        //FUNCTION FOR()
        for (int i = 0; i < 5; i++) {
                System.out.println(i);
        }
        //BAJO ARREGLOS
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        for (String i : cars) {
                System.out.println(i);
        }
*/
// MATRICES DE DATOS
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        int[] myNum = {10, 20, 30, 40};
        System.out.println(cars[0]);
        System.out.println(myNum[0]);
        System.out.println(cars.length);
        for (int i = 0; i < cars.length; i++) {
                System.out.println(cars[i]+"\t");
        }

        /*        String nombre ="";  //Creo la variable para el dato que pediré

        Scanner scanNombre = new Scanner (System.in);  // Creo el objeto que pedirá la variable
        nombre = scanNombre.nextLine(); //Asigna el objeto a mi variable
        System.out.println("Su nombre es: " + nombre);  //Imprimo el valor de la variable.

        BufferedReader brNombre = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Ingrese su nombre: ");
        String nombre = brNombre.readLine();
        System.out.println("Su nombre es: "+nombre);
*/


    }
}
