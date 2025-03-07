public class TaskSeven {
  public static void main(String[] args){


int answer = 1;
int sum = 0;
 for(int counter = 1; counter <= 5; counter++){
 
 for(int count = 1; count <= 10; count++){


if(count % 4 == 0){
if(count == 4){
 answer *= count;
}
}
}

sum += answer;
}
System.out.printf(" %d", sum);

int result = 1;
int total = 0;
for(int counter = 1; counter <= 5; counter++){ 
if(counter == 1)System.out.printf(" "); 
 for(int count = 1; count <= 10; count++){


if(count % 4 == 0){
if(count != 4){
result *= count;
}
}

}

total += result;
}
System.out.printf(" %d", total);














	}


}