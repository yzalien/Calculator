class Main {

  public static void main(String[] args) {
    System.out.print("\033[H\033[2J");

    Calculator calc = new Calculator();
    calc.run();
  }
}