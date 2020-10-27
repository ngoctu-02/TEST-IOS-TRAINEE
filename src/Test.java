import java.util.Arrays;
import java.util.Scanner;

public class Test {
    private static int n;


    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào số phần tử của mảng: ");
        n = scanner.nextInt();
        nhapMang(n, scanner);


    }
    public static void nhapMang(int n, Scanner scanner){

        float[] a = new float[n];
        for (int i = 0; i < a.length; i++){
            System.out.print("nhap phan tu thu " + i +": ");
            a[i] = scanner.nextFloat();
        }
        System.out.println("Mang a co gia tri: " + Arrays.toString(a));
        float[] b = new float[n];
        for (int i = 0; i < n; i++){
            if (i-1<0){
                b[i] = a[i] + a[i+1];
            }else if (i + 1 > a.length-1 ){
                b[i] = a[i-1] + a[i];
            } else {
                b[i] = a[i-1] + a[i] + a[i+1];
            }

        }
        System.out.println("mang b co gia tri: "+ Arrays.toString(b));
    }
}
