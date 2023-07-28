package com.saikumar.SoundFusion.repository;

import com.saikumar.SoundFusion.model.Song;
import com.saikumar.SoundFusion.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ISongRepo  extends JpaRepository<Song,Long> {

    Song findFirstBySongTitle(String songTitle);

    List<Song> findAllSongsBySongArtist(String artist);
}
