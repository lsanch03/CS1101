import java.util.*;

public class Binary {
  /* integerToBinaryString is a method that recieves an int n
  * and returns a String s. This method takes int n and converts
  * the number to binary.
  */
  public static String integerToBinaryString(int n) {
    String s = "";
    while (n != 0) {
      int rem = n % 2;
      n /= 2;
      s = rem + s;
    }
    return s;
  }

  /* binaryStringToInteger is a method that recieves a String s
  * and returns an int n. This method takes String s and converts
  * the number to an int.
  */
  public static int binaryStringToInteger(String s) {
    int n = 1;
    int size = s.length() - 1;
    for(int i = s.length() - 1; i > 0; i--) {
      n += Character.getNumericValue(s.charAt(i)) * Math.pow(2,size);
      size--;
    }
    return n;
  }

  public static void printAllBinaryStrings(int x) {
    if (x > 10)
      throw new IllegalArgumentException("int cannot be greater than 10");
    if (x < 0)
      return;
    printAllBinaryStrings(x-1);
    System.out.print(integerToBinaryString(x) + " ");
  }
}
