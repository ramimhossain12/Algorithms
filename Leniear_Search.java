import java.util.Scanner;

public class Leniear_Search {

    public static void main(String[] args) {

      int[] num = {1,2,3,6,4,85,6,7,96};
      int item , flag =0;

      Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any number :");
       item = scanner.nextInt();

        for (int i=0;i<10;i++){
            if (num[i]==item){
                flag = i+1;
                break;
            }
            else
                flag =0;


            if (flag!=0)
            {
                System.out.println("Item found at location" + flag);
            }else
                System.out.println("Item not found");
        }


    }

}