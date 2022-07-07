package javaClass.Bai6;

import java.util.Scanner;

public class Bai6 {
    public void bubbleSort(int []a, int n){
        int i,j,temp;
        for(i=0; i<n; i++){
            for(j=n-1; j>i; j--){
                if(a[j] > a[j-1]){
                    temp = a[j];
                    a[j] = a[j-1];
                    a[j-1] = temp;
                }
            }
        }
        for (i = 0; i < n;i++){
            System.out.println(a[i] + " ");
        }
    }
    public void selectionSoft(int[] a,int n){
        int i, j, mini, tmp, count=0;

        for(i=0; i<n; i++){
            mini = i;

            for(j=i+1; j<n; j++){
                if(a[j] > a[mini]){
                    mini = j;
                }
            }

            if(mini != i){
                tmp = a[i];
                a[i] = a[mini];
                a[mini] = tmp;
                count++;
            }
        }
        for (i = 0 ;i < n;i++){
            System.out.println(a[i] + " ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Bai6 bai6 = new Bai6();
        System.out.println("Nhập n:");
        int n = sc.nextInt();
        int []a = new int[n];
        for(int i =0;i< n;i++){
            a[i] = sc.nextInt();
        }

        bai6.bubbleSort(a,n);
        bai6.selectionSoft(a,n);
    }
}
