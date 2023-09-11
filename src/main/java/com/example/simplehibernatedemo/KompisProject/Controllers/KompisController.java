package com.example.simplehibernatedemo.KompisProject.Controllers;

import com.example.simplehibernatedemo.KompisProject.Models.Kompis;
import com.example.simplehibernatedemo.KompisProject.Repo.KompisRepo;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

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

    @RequestMapping("/findAll")
    public List<Kompis> findAll(){
        return kr.findAll();
    }

    @RequestMapping("/findById/{id}")
    public Kompis findById(@PathVariable Long id){
        return kr.findById(id).orElse(null);
    }

    @RequestMapping("/findByName/{name}")
    public List<Kompis> findById(@PathVariable String name){
        return kr.findByName(name);
    }

    @RequestMapping("/deleteById/{id}")
    public String deleteById(@PathVariable Long id){
        kr.deleteById(id);
        return "Kompis med id "+id+" är borttagen";
    }
}
