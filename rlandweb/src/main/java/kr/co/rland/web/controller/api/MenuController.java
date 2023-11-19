package kr.co.rland.web.controller.api;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import kr.co.rland.web.config.auth.RlandUserDetails;
import kr.co.rland.web.entity.Menu;
import kr.co.rland.web.entity.MenuView;
import kr.co.rland.web.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
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
            Menu menu,
            MultipartFile[] imgFiles,
            Authentication authentication,
            HttpServletRequest request
    ) throws IOException {
        RlandUserDetails userDetails = (RlandUserDetails) authentication.getPrincipal();
        System.out.println("지금 접속한 user ID :::::::::" + userDetails.getId());
        Long id = userDetails.getId();

        // webapp경로
        String strPath = request.getServletContext().getRealPath("/image/menu");
        System.out.println(strPath);

        //경로 설정
        File path = new File(strPath);
        if(!path.exists())
            path.mkdirs();

        List<Menu> menus = new ArrayList<>();

        for(MultipartFile imgFile:imgFiles){
            File file = new File(strPath + File.separator + imgFile.getOriginalFilename());
            imgFile.transferTo(file);

            System.out.println(imgFile.getOriginalFilename());
            menu.setImg(imgFile.getOriginalFilename());
            menu.setMemberId(id);
        }

        Menu newOne = service.add(menu);

        HttpHeaders headers = new HttpHeaders();

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
