package javabeginner.arrray;

`
import java.util.Arrays;
import java.util.Scanner;
public class Sort {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner a= new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size=a.nextInt();
        int n[]= new int[size];
        for(int i=0;i<size;i++){
            n[i]=a.nextInt();
        }
        Arrays.sort(n);
        for(int i=0;i<size;i++)
        {
             System.out.print(n[i] + " ");
        }
        System.out.println("min"+ n[0]);
        System.out.println("max"+ n[size-1]);
        a.close();
    }
    
}
