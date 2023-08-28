package ex20.exception;

public class Calculator {

  public static int add(int x, int y) throws 백을넘는예외, 음수가되는예외 {

    if (x > 100) throw new 백을넘는예외();

    if (x < 0) throw new 음수가되는예외();

    int result = x + y;

    return result;
  }

  public static int sub(int x, int y) {

    int result = x - y;

    return result;
  }

  public static int div(int x, int y) {
    int result = x / y;

    return result;
  }

}
