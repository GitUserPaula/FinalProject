
package arrayposyneg;
import java.util.Scanner;

public class ArrayPosYNeg {

    
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println ("Ingresa los 6 numeros para el arreglo : ");
        int [] a = new int [6];
        
        int cerocount=0;
        int negcount=0;
        int poscount=0;
        int sumneg=0;
        int sumpos=0;
        
        for (int i = 0; i<a.length;i++){
            a [i] =input.nextInt();
            if (a[i] == 0){
                cerocount++;
            }
            if (a [i] > 0){
                sumpos = poscount + a[i];
                poscount++;
            }
            if (a[i] < 0){
                sumneg = negcount + a [i];
                negcount++;
            }
        }
        System.out.println ("La cantidad de ceros introducidos es: "+cerocount);
        System.out.println ("La cantidad de negativos introducidos es: "+negcount);
        System.out.println ("La cantidad de positivos introducidos es: "+poscount);
        System.out.println("La media de los negativos es: "+ (double)sumneg/negcount);
        System.out.println("La media de los positivos es: "+(double)sumpos/poscount);
        
        
    }
    
}
