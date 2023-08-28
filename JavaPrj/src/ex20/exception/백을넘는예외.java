package ex20.exception;

public class 백을넘는예외 extends Exception {
  @Override
  public String getMessage() {

    return "백을넘는 예외입니다.";
  }
}
