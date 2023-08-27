package B2;
// 2)Realizar un objeto de tipo Estudiante con sus respectivas caracteristicar "Atributos, Constructores y getter and setter".

import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);

        Estudiante estudiante= new Estudiante("344533");
        System.out.println("Ingresa nombre del estudiante");
        estudiante.setNombre(sc.nextLine());

        // set recibir, get tomar
// colocar tres datos mas
        System.out.println("Bievenido: "+estudiante.getNombre());

    }

    }



