import java.util.Scanner;

public class Array_class {

    public static void main(String[] args){
//
////        int a[]={10,20,30,40,50};
//        int a[]=new int[5];
//
//        Scanner s=new Scanner(System.in);
//
////        System.out.println(a[4]);
//
//        for(int i=0;i<5;i++)
//        {
//            a[i]=s.nextInt();
//
//        }
//
//        for (int b:a)
//        {
//            System.out.print(b + " ");
//        }

        int a[][]=new int[3][3];
        Scanner s=new Scanner(System.in);
        System.out.println("Enter array element:-- ");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                a[i][j]=s.nextInt();
            }
        }
        System.out.print("Entered array elements are:-\n");
        for(int i=0;i<3;i++)
        {
            for (int j=0;j<3;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();

        }


    }
}
