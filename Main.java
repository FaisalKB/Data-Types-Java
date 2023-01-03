class Main {
  public static void main(String[] args) {
    //Code will be placed within the main method
    
    // bytes are integers that range from -128 to 127
    byte by = 127;
    System.out.println(by);

    byte lowestByteValue = -128;
    System.out.println(lowestByteValue);

    // shorts are integers that range from -32,768 to 32,767
    short s = 32_767;
    System.out.println(s);

    short lowestShortValue = -32_768;
    System.out.println(lowestShortValue);
    
    // ints are integers that range from -2,147,483,648 to 2,147,483,647
    int i = 2_147_483_647;
    System.out.println(i);

    int lowestIntValue = -2_147_483_648;
    System.out.println(lowestIntValue);

    // longs are really really long integers of very large or small values. Need to include an 'L' at the end to idenitfy as a long
    long l = 9_223_372_036_854_775_807L;
    System.out.println(l);

    // doubles are great for storing 15-digit decimals
    double d = 3839.34839;
    System.out.println(d);

    // floats are great for storing 7-digit decimals
    float f = 3839.34839F;
    System.out.println(f);

    float pie = 3.14F;
    System.out.println(pie);

    // booleans simply represent either true or false
    boolean on = false;
    System.out.println(on);

    boolean off = true;
    System.out.println(off);

    // chars store single letter/characters or ASCII values
    char c = 'a';
    System.out.println(c);

    char z = 'z';
    System.out.println(z);
    
    /* Strings are like sentences. These are alpha-numeric values that are wrapped in quotes ("like this") 
    and represent the included statements, letters, numbers, words, symbols, characters etc; as the value */
    String sentence = "the quick brown fox jumps over the lazy dog";
    System.out.println(sentence);

    String achievement = "I mastered Java data types!";
    System.out.println(achievement);
  } // End of Main method
} // End of Main class
