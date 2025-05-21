package com.anshu.jpa.mapper;

import com.anshu.jpa.dao.Song;
import com.anshu.jpa.model.SongModel;
import org.springframework.stereotype.Component;

@Component
public class SongMapper {
    public static SongModel toModel(Song entity) {
        return new SongModel(entity.getId(), entity.getName());
    }

    public static Song toEntity(SongModel model) {
        Song entity = new Song();
        entity.setId(model.getId());
        entity.setName(model.getName());
        return entity;
    }
}