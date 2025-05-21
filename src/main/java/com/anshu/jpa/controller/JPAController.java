package com.anshu.jpa.controller;

import com.anshu.jpa.dao.Song;
import com.anshu.jpa.mapper.SongMapper;
import com.anshu.jpa.model.SongModel;
import com.anshu.jpa.repo.SongRepo;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/jpa")
public class JPAController {
    private final SongRepo songRepo ;

    public JPAController(SongRepo songRepo) {
        this.songRepo = songRepo;
    }

    @PostMapping("/song")
    public ResponseEntity<String> saveSong(@RequestBody SongModel songModel) {
        songRepo.save(SongMapper.toEntity(songModel)) ;
        return new ResponseEntity<>("Ok" , HttpStatus.OK) ;
    }

}
