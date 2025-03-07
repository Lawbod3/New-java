import java.util.Scanner;
import java.util.Arrays;
public class TaskTwo {

   public static void main(String[] args){
   Scanner input = new Scanner(System.in);

int[] array = new int[10];
int scores = 0;
for(int count = 0; count < 10; count++){
System.out.print("\nEnter scores: ");
  scores = input.nextInt();

 array[count] = scores;

}

for(int count = 0; count < 10; count++){

System.out.println(array[count]);

}



















}

}