package ex20.exception;

public class Program {

  public static void main(String[] args) throws 백을넘는예외 {
    int result = 0;
    result = Calculator.add(120, 30);

//    try {
//    } catch (백을넘는예외 ex) {
//      System.out.println("100을 넘습니다. 100이하로 입력해 주십시오.");
//    } catch (음수가되는예외 ex) {
//      System.out.println("음수가 있습니다. 양수로 입력해주세요.");
//    } catch (Exception ex) {
//      System.out.println("모든 기타의 예외 처리입니다.");
//    } finally {
//      System.out.println("모든 리소스 처리");
//    }

    System.out.println(result);

    System.out.println("프로그램 종료");
  }

}
