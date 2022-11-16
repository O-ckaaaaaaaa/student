package helloworld;
import java.util.Scanner;
class HelloWorld {
    public static void main(String[] args){
        int marks[]=new int[4];
        int total=0;
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<4;i++){
            System.out.println("Enter marks for unit"+(i+1)+":");
            marks[i]=sc.nextInt();
            total  =  total + marks[i];
        }
       sc.close();
        if(total<=400 && total>=301){
            System.out.print("Grade-A");
        }
        else if(total<=300 && total>=251){
            System.out.print("Grade-B");
        }
        else if(total<=250 && total>=201){
            System.out.print("Grade-C");
        }
        else if(total<=200 && total>=151){
            System.out.print("Grade-D");
        }
        else if(total<=150 && total>=101){
            System.out.print("Grade-E");
        }
        else if(total<=100 && total>=50){
            System.out.print("Grade-F");
        }
        else if(total<=49 && total>=0){
            System.out.print("UN GRADED");
        }
        else {
            System.out.print("ENTER VALID MARKS!!!!");
        }
    }
}
