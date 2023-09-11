package com.example.simplehibernatedemo.KompisProject.Repo;

import com.example.simplehibernatedemo.KompisProject.Models.Kompis;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface KompisRepo extends JpaRepository<Kompis, Long> {

    List<Kompis> findByName(String name);
    List<Kompis> findByMobile(String mobile);
    List<Kompis> findByMobileAndName(String mobile, String name);

}



