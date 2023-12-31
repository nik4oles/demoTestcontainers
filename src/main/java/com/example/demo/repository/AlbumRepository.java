package com.example.demo.repository;


import com.example.demo.models.entity.Album;
import com.example.demo.models.entity.Photo;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AlbumRepository extends CrudRepository<Album, Long> {
    @Query("select a.photos from Album a")
    List<Photo> getSubscribersByUserId(Long userId);

    @EntityGraph(value = "albumWithPhotoGraph", type = EntityGraph.EntityGraphType.LOAD)
    Album getAlbumById(long id);

}

