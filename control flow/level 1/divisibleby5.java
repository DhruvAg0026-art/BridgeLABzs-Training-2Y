import java.util.Scanner;

public class divisibleby5{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number whose divisibility you wanna check: ");
        int num=sc.nextInt();
        if(num%5==0){
            System.out.printf(" Is the number %d divisible by 5? Yes",num);
        }
        else{
            System.out.printf(" Is the number %d divisible by 5? No",num);   
        }
    }
}