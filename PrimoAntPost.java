import java.util.*;
public class PrimoAntPost{

    public static void main(){
        int n;
        int pa;
        int pp;
        int d1;
        int d2;
        n = leerEnteroPositivo();
        pa = primoAnterior(n);
        pp = primoPosterior(n);
        d1 = n-pa;
        d2 = pp-n;
        if(d1 < d2){
            System.out.print("El número primo más cercano es el " + pa);
        }else{
            System.out.print("El número más cercano es el " + pp);
        }
    }

    public static int leerEnteroPositivo(){
        int bb = 0;
        int numero;
        Scanner ent = new Scanner(System.in);
        while (bb == 0)
        {
            System.out.print("DIGITAR UN NÚMERO MAYOR A CERO... ");
            numero = ent.nextInt();
            if (numero > 0)
            {
                bb = 1;
            }

        }
        return bb;
    }

    public static int primoAnterior(int numero){
        int bb = 0;
        int R;
        while(bb == 0){
            numero = numero-1;
            R = esPrimo(numero);
            if(R == 1){
                bb = 1;
            }
        }
        return numero;
    }

    public static int primoPosterior(int numero){
        int bb = 0;
        int R;
        while(bb == 0){
            numero = numero+1;
            R = esPrimo(numero);
            if(R == 1){
                bb = 1;
            }
        }
        return numero;
    }

    public static int esPrimo(int numero){
        int bb = 0;
        int contador = 0;
        for(int i = 1; i <= numero; i++){
            if(numero % i == 0){
                contador++;
            }

        }
        if(contador == 2){
            bb = 1;
        }else{
            bb = 0;
        }
        return bb;
    }
}