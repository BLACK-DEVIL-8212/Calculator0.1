import java.util.Scanner;

public class main{

    public static void sum(int n1 , int n2){
        System.out.println("[+] enter the first number:" );
        Scanner a = new Scanner(System.in);
        n1 = a.nextInt();
        System.out.println("[+] enter the second number:" );
        Scanner b = new Scanner(System.in);
        n2 = b.nextInt();
        int n3 = n1+n2;
        System.out.println("[+] result :"+ n3);
    }
    public static void sub(int n1 , int n2){
        System.out.println("[+] enter the first number:" );
        Scanner a = new Scanner(System.in);
        n1 = a.nextInt();
        System.out.println("[+] enter the second number:" );
        Scanner b = new Scanner(System.in);
        n2 = b.nextInt();
        int n3 = n1-n2;
        System.out.println("[+] result :"+ n3);
    }
    public static void mul(int n1 , int n2){
        System.out.println("[+] enter the first number:" );
        Scanner a = new Scanner(System.in);
        n1 = a.nextInt();
        System.out.println("[+] enter the second number:" );
        Scanner b = new Scanner(System.in);
        n2 = b.nextInt();
        int n3 = n1*n2;
        System.out.println("[+] result :"+ n3);
    }
    public static void div(int n1 , int n2){
        System.out.println("[+] enter the first number:" );
        Scanner a = new Scanner(System.in);
        n2 = a.nextInt();
        System.out.println("[+] enter the second number:" );
        Scanner b = new Scanner(System.in);
        n1 = b.nextInt();
        int n3 = n1/n2;
        System.out.println("[+] result :"+ n3);
    }
    public static void square(int n1 , int n2){
        System.out.println("[+] enter the first number:" );
        Scanner a = new Scanner(System.in);
        n1 = a.nextInt();
        n2 = n1*n1;
        System.out.println("[+] result :"+ n2);
    }
    public static void cube(int n1 , int n2){
        System.out.println("[+] enter the first number:" );
        Scanner a = new Scanner(System.in);
        n1 = a.nextInt();
        n2 = n1*n1*n1;
        System.out.println("[+] result :"+ n2);
    }
    
    public static void main(String[] args){
        System.out.println("! WELCOME TO CALCULATOR !\n\n");
        System.out.println("[1] Addition\n[+] Substract\n[+] multiplication\n[+] division\n[+] square\n[+] cube\n\n ");
        System.out.println("[+] Enter your choice :" );
        // used : a b n1 n2 n3
        
        int n4 ;
        Scanner c = new Scanner(System.in);
        n4 = c.nextInt();

        if (n4 == 1){
            sum(n4, n4);
        }
        if (n4 == 2){
            sum(n4, n4);
        }
        if (n4 == 3){
            sum(n4, n4);
        }
        if (n4 == 4){
            sum(n4, n4);
        }
        if (n4 == 5){
            sum(n4, n4);
        }
        if (n4 == 6){
            sum(n4, n4);
        }
        System.exit(n4);
    }
}