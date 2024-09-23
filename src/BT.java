//import java.io.*;
import java.util.*;


public class BT {

    public static int findGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    //BCNN
    public static int findLCM(int a, int b) {
        return (a * b) / findGCD(a, b);
    }

    //SNT
    public static boolean checkSNT(int n)
    {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void listSNT(int n)
    {
        for(int i = 2; i < n; i++)
        {
            if (checkSNT(i))
            {
                System.out.print(" " + i);
            }
        }
    }

    //SCP
    public static boolean isPerfectSquare(int n) {
        if (n < 0) {
            return false;
        }
        int sqrt = (int) Math.sqrt(n);
        return (sqrt * sqrt == n);
    }

    public static void B4()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap x: ");
        int x = scanner.nextInt();
        System.out.println("Nhap y");
        int y = scanner.nextInt();
        System.out.println(x+y);
        System.out.println(x-y);
        System.out.println(x*y);
        System.out.println(x/y);
        scanner.close();
    }

    public static void B5()
    {
        Scanner scanner = new Scanner(System.in);
        int a, b;
        do {
            System.out.println("Nhap a: ");
            a = scanner.nextInt();
            System.out.println("Nhap b: ");
            b = scanner.nextInt();
        } while(a <= 0 || b <= 0);

        int ucln = findGCD(a, b);
        int bcnn = findLCM(a, b);

        System.out.println("(USCLN) cua " + a + " va " + b + " la: " + ucln);
        System.out.println("(BSCNN) cua " + a +" va " + b + " la: " + bcnn);
        scanner.close();
    }

    public static void B6()
    {
        Scanner scanner = new Scanner(System.in);
        int n;
        do {
            System.out.print("Nhap n: ");
            n = scanner.nextInt();
        } while(n <= 0);

        listSNT(n);
        scanner.close();
    }

    public static void B7()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so luong cua mang: ");
        int size = scanner.nextInt();

        int[] arr = new int [size];

        System.out.println("Nhap cac phan tu cua mang: ");
        for(int i = 0; i < size; i++)
        {
            arr[i] = scanner.nextInt();
        }

        System.out.print("Các số nguyên tố trong mảng là:");
        for (int num : arr) {
            if (checkSNT(num)) {
                System.out.print(" " + num);
            }
        }
        System.out.println();

        int max = arr[0];
        for(int num : arr)
        {
            if(num > max)
            {
                max = num;
            }
        }
        System.out.println("So lon nhat trong mang la: " + max);

        int countPerfectSquares = 0;
        for (int num : arr) {
            if (isPerfectSquare(num)) {
                countPerfectSquares++;
            }
        }
        System.out.println("So luong so chinh phuong trong mang la: " + countPerfectSquares);

        Arrays.sort(arr);
        System.out.print("Mang sau khi sap xep tang dan la:");
        for(int num : arr)
        {
            System.out.print(" " + num);
        }


        scanner.close();
    }

    public static void main(String[] args) {

        //B4
        BT.B4();

        //B5
//		BT.B5();

        //B6
//		BT.B6();

        //B7
//		BT.B7();


    }
}
