import java.util.Scanner;

public class Binary_to_Decimal {
       public static void main(String args []){
              Scanner sc=new Scanner(System.in);
              int no=sc.nextInt();
              String bin="";
              while(no!=0){
                     bin=(no&1) + bin;//extract lsb 
                     no=no>>1; // bitwise division  >> right shift
              }
              bin=bin.replaceAll("1","2");
              bin=bin.replaceAll("0","1");
              bin=bin.replaceAll("2","0");
            System.out.println(Integer.parseInt(bin,2)); //binary to decimal conversion
       
       }
       
}
