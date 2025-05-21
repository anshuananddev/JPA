package com.anshu.jpa.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.UUID;
@AllArgsConstructor
@Data
public class SongModel {
    private UUID id;
    private String name;

}