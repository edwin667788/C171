
package B1;

import java.util.Scanner;

// 1)Realizar un programa que me encuentre el mayor de 3 numeros dados, estos numero deben ser solicitados por el consola.
public class B1 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        System.out.println("Bienvenido, por favor digita tu primer numero: " );
        int a = sc.nextInt();
        System.out.println("Digita tu segundo numero: ");
        int b=sc.nextInt();
        System.out.println("digita tu ultimo numero: ");
        int c= sc.nextInt();
        if (a>b && a> c){
            System.out.println(a+" es el mayor de los tres numeros");
        }if (b>a && b>c){
            System.out.println(b+" es el mayor de los tres numeros digitados");

        }
        else if (c>a&&c>b){
            System.out.println(c+" Es el mayor de los tres numero ");
        }
    }

}
