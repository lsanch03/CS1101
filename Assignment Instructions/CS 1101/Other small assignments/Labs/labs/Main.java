class Main {
  public static void main(String[] args) {
    // 3 integerToBinaryString test cases:
    System.out.println("Test cases for integerToBinaryString");
    System.out.println("7: " + Binary.integerToBinaryString(7));
    System.out.println("8: " + Binary.integerToBinaryString(8));
    System.out.println("101: " + Binary.integerToBinaryString(101));
    System.out.println("");

    // 3 binaryStringToInteger test cases:
    System.out.println("Test cases for binaryStringToInteger");
    System.out.println("001: " + Binary.binaryStringToInteger("011"));
    System.out.println("101: " + Binary.binaryStringToInteger("101"));
    System.out.println("111: " + Binary.binaryStringToInteger("111"));

    // Test case for printAllBinaryStrings
    System.out.println("Test cases for printAllBinaryStrings");
    Binary.printAllBinaryStrings(9);
    System.out.println("");
  }
}
