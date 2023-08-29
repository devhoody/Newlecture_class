package ex21.collection.java;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Program {

  public static void main(String[] args) {
    {
      Set<Integer> set = new HashSet<>();
      set.add(3);
      set.add(3);
      set.add(3);

//			set.contains(3);
      int size = set.size();
      System.out.printf("set size is %d%n", size);
    }

    {
      List<Integer> list = new ArrayList<>();
      list.add(3);
      list.add(3);
      list.add(3);

      list.get(0);
      int size = list.size();
      System.out.printf("list size is %d%n", size);

    }

    {
      Map<String, Integer> map = new HashMap<>();
      map.put("kor1", 3);
      map.put("kor2", 3);
      map.put("kor3", 3);

      map.get("kor1");
      int size = map.size();
      System.out.printf("map size is %d%n", size);

      Menu menu = new Menu(1L, "아메리카노", 3000);

      Map<String, Object> menuView = new HashMap<>();
      menuView.put("id", menu.getId());
      menuView.put("KorName", menu.getKorName());
      menuView.put("price", menu.getPrice());
      menuView.put("size", "Large");
    }

  }

}
