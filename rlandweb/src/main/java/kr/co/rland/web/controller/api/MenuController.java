package kr.co.rland.web.controller.api;

import kr.co.rland.web.entity.Menu;
import kr.co.rland.web.entity.MenuView;
import kr.co.rland.web.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController("apiMenuController")
@RequestMapping("/api/menus")
public class MenuController {

    @Autowired
    private MenuService service;

    //    @ResponseBody
    @GetMapping
//    @CrossOrigin(origins = "http://localhost:63342/") // 메서드에서 설정
//    @CrossOrigin(origins = "http://127.0.0.1:5500/")
    public List<MenuView> list(
            @RequestParam(name="p", defaultValue = "1") Integer page,
            @RequestParam(name="c", required = false) Long categoryId,
            @RequestParam(name="q", required = false) String query) {

        List<MenuView> list = service.getViewList(page, query, categoryId);

        System.out.println(list);

        return list;
    }

    // 16번 메뉴 제공 API
    @GetMapping("{id}")
    public Menu detail(
            @PathVariable long id) {

        Menu menu = service.getById(id);
        return menu;
    }

    @PostMapping
    public Menu add(
            @RequestBody Menu menu) {
        Menu newOne = service.add(menu);

        return newOne;
    }

    // 메뉴 수정 API
    @PutMapping
    public Menu edit(
            @RequestBody Menu menu) {
        System.out.println("====================edit=====");
        System.out.println(menu);
        Menu mMenu = service.modify(menu);
        return mMenu;
    }


}
