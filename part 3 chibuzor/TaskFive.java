import java.util.Arrays;

public class TaskFive {

     public static void main(String[] args){

int[] answer = {12,1,2,3,4,5,6,7,8,9,10};

 
System.out.println(Arrays.toString(elementInEvenOdd(answer)));








}


public static int[] elementInEvenOdd(int[] array){

int counter = 0;
for(int count = 0; count < array.length; count++){
 
 if(count % 2 != 0 )counter++;
}

int[] result = new int[counter ];


int timer = 0;

for(int count = 0; count < array.length; count++){
if(count % 2 != 0 ){
result[timer] = array[count];
timer++;
}





}



return result;




}
























}