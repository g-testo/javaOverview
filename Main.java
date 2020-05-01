class Main {
  public static void main(String[] args) {
    Main main = new Main();
    System.out.println(main.add(2, 3));
    System.out.println(staticAdd(2, 5));

    // Can store up to -128, 127 +/-
    // 8 bits / 1 byte
    byte myByte = 1;
    Byte myOtherByte = 1;

    // Can store up to 32000 +/-
    // 16 bits / 2 bytes
    short myShort = 1;
    Short myWrapperShort = 2;

    // Can store up to -2147483648 to 2147483647
    // 32 bits / 4 bytes
    int myVar = 3;
    Integer myWrapperVar = 5;

    // Can store up to -9,223,372,036,854,775,807 and 9,223,372,036,854,775,808.
    // 64 bits / 8 bytes
    long myLong = 124567;
    Long myWrapperLong = 12345l;

    float myFloat = 2.5f;
    Float myWrapperFloat = 2.75f;

    double myDouble = 2.34246;
    Double myWrapperDouble = 2.3542;

    // 1 bit // 0 - 1
    boolean foo = false;
    Boolean bar = true;

    char myChar = 'a';
    Character myWrapperChar = 'B';

    String myString = "Error";

    // =========CONTROL FLOW========== \\

    if (!bar) {
      System.out.println("False");
    } else if (bar) {
      System.out.println("True");
    } else {
      System.out.println("Who knows?");
    }

    if (myVar == 5) {
      myVar++;
    } else if (myVar == 6) {
      myVar--;
    } else {
      myVar = 8;
    }

    switch (myString) {
      case "Test":
        System.out.println("Its working");
        break;
      case "Error":
        System.out.println("It broke!");
        return;
      default:
        break;
    }

    // for (let i = 0; i < myVar; i++) {
    // console.log(i);
    // }

    for (int i = 0; i < myVar; i++) {
      System.out.println(i);
    }

    while (myVar < 10) {
      myVar++;
    }

    do {
      myVar++;
    } while (myVar < 10);

  }

  public static int staticAdd(int a, int b) {
    return a + b;
  }

  private int add(int a, int b) {
    return a + b;
  }
}
