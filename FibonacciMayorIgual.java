import java.util.*;

public class FibonacciMayorIgual{
    public static void main(String ar []){
        int N;
        int R;
        N = leerEnteroPositivo();
        R = fibonacci(N);
        System.out.print("El número es !!!! ");
        System.out.print(" "+R);
    }

    public static int leerEnteroPositivo(){
        int bb = 0;
        int numero = 0;
        Scanner ent = new Scanner(System.in);
        while(bb == 0){
            System.out.print("Digitar un número mayor a cero !!!! ");
            numero  = ent.nextInt();
            if(numero > 0){
                bb = 1;
            }
        }
        return numero;
    }

    public static int fibonacci(int numero){
        int penultimo = 0;
        int ultimo = 1;
        int nuevo = 0;
        int bb = 0;
        while(bb == 0){
            nuevo = penultimo + ultimo;
            penultimo = ultimo;
            ultimo = nuevo;
            if(nuevo >= numero){
                bb = 1;
            }
        }
        return nuevo;
    }

}