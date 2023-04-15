class Main {

  public static void main(String[] args) {
    System.out.print("\033[H\033[2J");

    Calculator calc = new Calculator();
    calc.run();

    int number;
    number = 23;

    //010101010101110100110101001010100101 - machine code i.e. the floor (low level, fundamental instructions given to computer)
    // c -> asembly -> machine code (levels of abstraction)

    // [0,0,1,1,0,1,0,1,0,1,0,1] -> [byte, byte, byte] (computer's bank of memory)
    // byte = 8 bits = 0000000 (bit is 1 or 0)
    // 01               = base 2  (binary)
    // 0123456789       = base 10 (decimal)
    // 0123456789ABCDEF = base 16 (hex or hexidecimal)
    // (fundamental number systems used in programming, mostly just binary and hex)
    
    // an address points to a set of bits in memory (you would see regularly a set of 32bits or 64bits)
    // variable -> memory address(hex) -> binary memory address (computer understands)
    // int32, int64 (capacity of variable represented in bits)
    // int32 number; allocate 32bits in memory, the address of the memmory is represented with a variable name called number
    // int defines the decoding and encoding of the data.
    // char, we have an array of binary that is interpreted as a character
    // datatypes define the mapping for human sybmols into binary
    // rawB || decimal datatype(dint4) || char datatype(char4)
    // 0001 -> 1d               ->   A
    // 0010 -> 2d               ->   V
    // 0011 -> 3d               ->   {
    // 0100 -> 4d               ->   M

    // assembly:
    // write 23 into address 0x00AB3
    // read 0x00003 into register
    // add  0x00004 to register
    // write register into address 0x00003
    // loops but like whatever
    

    // Creates a new instance of `Main` class and assigns it to a variable called
    // `main`.
    Main main = new Main();
  }

  // visibility return_type function_name (parameter_type parameter_variable) {}
  // public void calculatorMain () {
  // }
}