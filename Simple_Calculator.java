//simple Culculator Using jav
import java.util.Scanner;
public class Simple_Calculator {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        //Declaring varibles
        char Operator;
        Double Number1, Number2,Result;
        //ASKING THE USER TO INPUT YTHE OPERATOR
        
       System.out.println("enter the oprator(+,-,*,/):");
       Operator=input.next().charAt(0);
       //askisg the user to input the number
       System.out.println("enter the first number:");
       Number1=input.nextDouble();
       System.out.println("enter the first number");
       Number2=input.nextDouble();
       
       switch(Operator){
        //Performing Addition
        case '+':{
        Result=Number1+Number2;
        System.out.println("Additation"+Number1+"and"+Number2+"is:"+Result);
        break;
        }
        //Performing Subtraction
        case'-':{
        Result=Number1-Number2;
        System.out.println("Subraction"+Number1+"and"+Number2+"is:"+Result);
        break;
        }
        
        //Performing Multiplication

        case'*':{
        Result=Number1*Number2;
        System.out.println("Additation"+Number1+"and"+Number2+"is:"+Result);
        break;
        }
        
        //Performing Division
        case'/':{
        Result=Number1/Number2;
        System.out.println("Division"+Number1+"and"+Number2+"is:"+Result);
        break;
       }
        
       default:{
        System.out.println("Unsupported/invalid input");
        break;
       }
    }


    
       input.close();
    }
    
}
