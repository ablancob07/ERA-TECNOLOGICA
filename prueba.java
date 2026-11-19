import java.util.Scanner;

public class prueba {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Prueba de programación java en entorno GitHub online");
        String prueba = teclado.nextLine();

        System.out.println("Has escrito: " + prueba);


        System.out.println("Introduce un numero: ");
        int numero1 = teclado.nextInt();

        System.out.println("Introduce otro numero");
        int numero2 = teclado.nextInt();

        System.out.println("Los numeros son " + numero1 + " y " + numero2);
        teclado.close();
    }
}