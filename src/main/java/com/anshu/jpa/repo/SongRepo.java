package com.anshu.jpa.repo;

import com.anshu.jpa.dao.Song;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface SongRepo extends JpaRepository<Song , UUID> {
}
