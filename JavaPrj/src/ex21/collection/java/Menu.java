package ex21.collection.java;

public class Menu {
  private long id;
  private String KorName;
  private int price;

  // 생성자
  public Menu() {
    // TODO Auto-generated constructor stub
  }

  // 오버로드 생성자
  public Menu(long id, String korName, int price) {
    super();
    this.id = id;
    this.KorName = korName;
    this.price = price;
  }

  // toString
  @Override
  public String toString() {
    return "Menu [id=" + id + ", KorName=" + KorName + ", price=" + price + "]";
  }

  // Getter, Setter
  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getKorName() {
    return KorName;
  }

  public void setKorName(String korName) {
    KorName = korName;
  }

  public int getPrice() {
    return price;
  }

  public void setPrice(int price) {
    this.price = price;
  }


}
