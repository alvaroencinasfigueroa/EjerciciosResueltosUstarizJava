import java.util.Scanner;
public class EjercicioExamenPP {
    public static void main(String [] ar){
        int n;
        int perfAnt;
        int perfPos;
        int d1;
        int d2;
        n = leerEnteroPQ(7,495);
        perfAnt = perfectoAnterior(n);
        perfPos = perfectoPosterior(n);
        d1 = perfAnt;
        d2 = perfPos;
        if(d1 < d2){
            System.out.print("El número perfecto más cercano a ");
        }else{
            System.out.print("d2");
        }
    }
    public static int leerEnteroPQ(int a, int b){
        System.out.print("Ingresar un número");
        Scanner ent = new Scanner(System.in);
        int bb = 0;
        int nu = ent.nextInt();
        while(bb == 0){
            if(nu >= a && nu <= b){
                bb = 1;
            }
        }
        return bb;
    }
    public static int perfectoAnterior(int numero){
        int bb = 0;
        while(bb == 0){
            numero  = numero - 1;
            bb = perfecto1(numero);
        }
        return numero;
    }
    public static int perfectoPosterior(int numero){
        int bb = 0;
        while(bb == 0){
            numero  = numero + 1;
            bb = perfecto1(numero);
        }
        return numero;
    }
    public static int perfecto1(int numero){
        int c = 1;
        int s = 0;
        int bb = 0;
        while(c < numero-1){
            if(numero % c == 0){
                s = s + c;
            }
            c = c+1;
        }
        if(s == numero){
            bb = 1;
        }else{
            bb = 0;
        }
        return bb;
    }
}
