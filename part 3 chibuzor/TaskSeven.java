import java.util.Arrays;

public class TaskSeven {

     public static void main(String[] args){

int[] answer = {12,1,2,3,4,5,6,7,8,9,10};

 
System.out.println(elementInOddSum(answer));








}


public static int elementInOddSum(int[] array){

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


int sum = 0;
for(int count = 0; count < result.length; count++){
 sum += result[count];


}


return sum;

}
























}