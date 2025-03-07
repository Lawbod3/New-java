import java.util.Scanner;

public class TaskTen {

  public static void main(String[] args){

  Scanner input = new Scanner(System.in);

double total = 0;
double average = 0;
double result = 0;
double timer = 0;
for(int count = 1; count <= 10; count++){
  System.out.println("Collecting scores: ");
  double scores = input.nextDouble();
 if(scores >= 0 ){
total += scores;
timer++;
}
}

average = total / timer;

System.out.printf("\n%2f",average);
























	}

}