package B2;

public class NumerosFigonachi {
    public static void main(String[] args) {
        System.out.println("Aqui estan los primeros 20 numeros de la lista de Fibonacci => ");
        int n =20;
        int f =0;
        int t1 =1;
        int t2;
        for (int i=1; i<=n; i++){
            t2 =f;
            f =t1 +f;
            t1=t2;
            System.out.println("numero Figonacci "+t1);

        }

    }
}
