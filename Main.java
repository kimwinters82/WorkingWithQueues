import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); // get user input 
    int length = sc.nextInt(); //N amount of statemets
    sc.nextLine(); //clear scanner  - moving from int to string
    Queue queue = new Queue(); //create queue object
    int front = 0; //variable to store front element
    int rear = -1; //variable to store rear element
    int numItems = 0;

    for (int i=0; i<length; i++){ // iterate through each input
      String [] input = sc.nextLine().split(" "); //separate method call from string
      if (input[0].equalsIgnoreCase("insert")){ //if word equal insert
        queue.insert(input[1]); //insert string to back of queue
      }
      else { //if letters equal remove
        if (!queue.isEmpty() && input[0].equalsIgnoreCase("remove")){
          //condition added to avoid error- removing from empty queue
          queue.remove();//remove first element
        }
        }
        }
    sc.close();//close scanner

    if (queue.isEmpty()){
      System.out.println("empty"); //catch in case queue is empty
    }
    else if (numItems % 2 == 0){
        System.out.println("even F:"+front+" R:"+rear);
      }  
    else{
        System.out.println("odd F:"+front+" R:"+rear);
    }
  }
  public void insert(String s){
    if(!isFull()){
      if (rear == length-1){
        rear = -1;
      }
      rear++;
      queue[rear] = s;
      numItems++;
    }
  }
  public void remove(String s){
    if(!isEmpty()){
      if(front == length-1){
        front = 0;
      }
      front++;
      numItems--;
    }
  }
  public boolean isEmpty(){
    return (numItems == 0);
  }
  public boolean isFull(){
    return (numItems == length);
  }
}