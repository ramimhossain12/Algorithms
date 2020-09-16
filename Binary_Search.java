import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

public class Binary_Search  {
    public static void main(String[] args) {

        //runtime complexity: 0(logN);
        //space complexity: 0(n);

        while (true){
            int[] a = {1,2,4,5,67,89,100};
            int item ;
            int left,right,middle;
            left =0;
            right = 6;
            System.out.println("Enter any number");
            Scanner in = new Scanner(System.in);
            item = in.nextInt();
            while (left<=right){
                middle = (left+right)/2;
                if (a[middle]== item){
                    System.out.println("Item found at index: "+middle);
                    return;

                }else if (a[middle]< item){
                    left = middle+1;
                }else {
                    right = middle-1;
                }
            }

            System.out.println("Item not found");
        }


    }



}
