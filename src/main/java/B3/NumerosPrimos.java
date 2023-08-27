package B3;
// Encontrar los numero primos de 1 hasta 1000. Utilizar cualquier ciclo
public class NumerosPrimos {
    public static void main(String[] args) {
        int max = 1000;
        System.out.println("1 es primo");
        for(int x = 2; x <= max; x++){
            if(esPrimo(x)){
                System.out.println(x+" es primo");
            }
        }

    }

    public static boolean esPrimo(int numero){
        int contador = 2;
        boolean primo=true;
        while ((primo) && (contador!=numero)){
            if (numero % contador == 0)
                primo = false;
            contador++;
        }
        return primo;
    }
}
