package com.example.simplehibernatedemo.KompisProject.Controllers;

import com.example.simplehibernatedemo.KompisProject.Models.Kompis;
import com.example.simplehibernatedemo.KompisProject.Repo.KompisRepo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KompisController {

    private final KompisRepo kr;

    public KompisController(KompisRepo kr){
        this.kr=kr;
    }

    @RequestMapping("/addFriend")
    public String addFriend(@RequestParam String name, @RequestParam String mail,
                          @RequestParam String mobile, @RequestParam Long id){
        Kompis newFriend = new Kompis(id, name, mail, mobile);
        kr.save(newFriend);
        return "Friend saved";
    }
}
