class CompLab2 {
  public static void main(String[] args) {
    // This will print false because this card is invalid.

    // For checkCustomers method.
    String[][] clients = {{"Luis", "1234567894806"},
                          {"Diego", "6041985853032"}};
    checkCustomers(clients);
      
      if (luhnCheck("1098765432112345") == true) {
          System.out.println("1098765432112345 is valid");
      } else {
          System.out.println("1098765432112345 is false");
      }
      if (luhnCheck("7887723033148101") == true) {
          System.out.println("7887723033148101 is valid");
      } else {
          System.out.println("7887723033148101 is false");
      }
  }

  // Luhn Method
  public static boolean luhnCheck(String cc) {
    int[] ccMod = new int[cc.length()];
    int sum = 0;
    for (int i = 0; i < cc.length(); i++) {
        ccMod[i] = Character.getNumericValue(cc.charAt(i));
        if (i % 2 == 0 && ccMod[i] * 2 > 9) {
          int a = (ccMod[i] * 2) % 10;
          int b = (ccMod[i] * 2) / 10;
          ccMod[i] = a + b;
        }
        else if (i % 2 == 0)
          ccMod[i] *= 2;
      sum += ccMod[i];
    }

    if (sum % 10 != 0)
      return false;
    return true;
  }

  // Check customers sent in by 2d array.
  public static void checkCustomers(String[][] clients) {
    for (int j = 0; j < clients.length; j++)
      if (luhnCheck(clients[j][1]) == false)
        System.out.println("Client: " + clients[j][0] + " tried using and invalid card: " + clients[j][1]);
  }
}
