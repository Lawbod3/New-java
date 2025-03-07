import java.util.Scanner;

public class TaskThree {

  public static void main(String[] args){

  Scanner input = new Scanner(System.in);

double total = 0;
double average = 0;
double result = 0;
for(int count = 0; count < 10; count++){
  System.out.println("Collecting scores: ");
  Double scores = input.nextDouble();

total += scores;

}

average = total / 10;
result = total + average;
System.out.printf("\n%2f",result);
























	}

}