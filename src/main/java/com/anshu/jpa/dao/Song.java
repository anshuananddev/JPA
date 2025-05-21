package com.anshu.jpa.dao;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

import java.util.UUID;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Song {
    @Id
    private UUID id ;
    private String name ;
}
