import java.util.Random;

class MyJavaLab08 {
  public static void main(String[] args) {
      
      //Create a random linked list
    Random rand = new Random();

    Node list = new Node();
    list.setVal(rand.nextInt(50) + 10);
    Node head = list;
    for (int i = 1; i < 10; i++) {
      Node temp = new Node();
      temp.setVal(rand.nextInt(50) + 10);
      head.setNext(temp);
      head = head.getNext();
    }

      //Print out all oobjectives
    System.out.print("The list forward: ");
    printList(list);
    System.out.println("The average values of the list: " + average(list));
    System.out.println("The minimum value in the list: " + minimum(list));
    System.out.print("The list reversed: ");
    printList(reverse(list));
    // reverse(list);
  }

  public static void printList(Node list) {
      //Prints out the linked list.
    while (list != null) {
      System.out.print(list.getVal() + " ");
      list = list.getNext();
    }
    System.out.println("");
  }

  public static double average(Node list) {
      //Print average
    int divider = 0;
    int sum = 0;
    while (list != null) {
      sum += list.getVal();
      divider++;
      list = list.getNext();
    }
    return sum / (double)divider; //return total num of nums and divide it by num of linked lists to get avg.
  }

  public static int minimum(Node list) {
    int min = list.getVal();
    while (list != null) {
      if (list.getVal() < min) //compares and returns the smallest.
        min = list.getVal();
      list = list.getNext();
    }
    return min;
  }

  public static Node reverse(Node list) {
    int counter = 0;
    Node head = list;
    while (head != null) {
      counter++; //get num of linked lists to create an array
      head = head.getNext();
    }

    int[] array = new int[counter]; //create array size of elements in the linked list.
    for (int i = array.length - 1; i >= 0; i--) { //we store values in decending order.
      array[i] = list.getVal(); //store linked list values to an array
      list = list.getNext();
    }

    Node newList = new Node(); //new linked list
    newList.setVal(array[0]); 
    Node newHead = newList;
    for (int i = 1; i < array.length; i++) {
      Node temp = new Node();
      temp.setVal(array[i]);//put values from array into linked lists.
      newHead.setNext(temp);
      newHead = newHead.getNext();
    }

    return newList;
  }
}
