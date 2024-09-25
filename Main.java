import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ingrese un numero");
        int numero1,Numero2;
        numero1 = scanner.nextInt();
        System.out.println("ingrese otro numero");
        Numero2 = scanner.nextInt();

        int suma = numero1 - Numero2;
        System.out.println("la suma es:");
        System.out.println(suma);

        int resta = numero1 - Numero2;
        System.out.println("la resta es:" + resta);

        int multiplicacion = numero1 * Numero2;
        System.out.println("la multiplicacion es: " + multiplicacion);

        int division = numero1 / Numero2;
        System.out.println("la division es: " + division);

        int cociente = numero1 % Numero2;
        System.out.println("la cociente es: " + cociente);



    }
}
    
}
