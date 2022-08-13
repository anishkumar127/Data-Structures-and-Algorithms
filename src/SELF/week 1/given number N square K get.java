class Main {

    // answer 729
    // 9* 9 * 9 
  public static void main(String[] args) {

    int base = 9, exponent = 3;

    long result = 1;

    for (; exponent != 0; --exponent) {
      result *= base;
    }

    System.out.println("Answer = " + result);
  }
}

