import java.util.Scanner;

public class Insertion_Sort {


    public static void main(String[] args) {
        int num,i,j,temp;

        int a[] = {10 ,2,5,8,74,6,9,7};

        for( i= 0;i<7;++i){


             temp = a[i];
             j = i-1;
            while (j>=0 &&temp<=a[j]){
                a[j+1] = a[j];
                j = j-1;
            }
            a[j+1] = temp;
        }
        System.out.println("printing sorted elements ...");
        for( i=0;i<10;i++){
            System.out.println(a[i]);
        }
    }

}
