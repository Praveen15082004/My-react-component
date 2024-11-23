/*import java.util.Scanner;
public class Loop {
    public static void main(String[] args){
        Scanner scan =new Scanner(System.in);
        String RCB = scan.nextLine();
        
        if(RCB.equals("win"))
        {
            System.out.println("cub");
        }else{
            System.out.println("NO");
        }
    }
    
}
*/

/*import java.util.Scanner;
public class Loop{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String Meghna = scan.nextLine();

        if(Meghna.equals("Dead")){
            System.out.println("Priya married");
        }
        else{
            System.out.println("Meghna married");
        }
    }
}*/

// Mark >35 print pass,else fail..

/*import java.util.Scanner;
public class Loop{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int Mark = scan.nextInt();
        if(Mark >= 35){
            System.out.println("Pass");
        }
        else{
            System.out.println("Fail");
        }
    }
}*/

// Income salary using if...

/*import java.util.Scanner;
public class Loop{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int income = scan.nextInt();
        if(income >= 7000){
            System.out.println("Scholarship is available");
        }
        else{
            System.out.println("Scholarship is not available");
        }
    }
}*/

//3 && 5 both are divisible 

/*import java.util.Scanner;
public class Loop{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        
        if(a%3==0 && a%5==0){
            System.out.println("Divsible by both");
        }
        else{
            System.out.println("not Divsible by both");
        }
    }
}*/

//3 or 5 is divisible..

import java.util.Scanner;
public class Loop{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        
        if(a%3==0 || a%5==0){
            System.out.println("Divsible by both");
        }
        else{
            System.out.println("not Divsible by both");
        }
    }
}