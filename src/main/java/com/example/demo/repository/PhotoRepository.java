package com.example.demo.repository;

import com.example.demo.models.entity.Like;
import com.example.demo.models.entity.Photo;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PhotoRepository extends CrudRepository<Photo, Long> {
    @EntityGraph(value = "photoWithAlbumGraph", type = EntityGraph.EntityGraphType.LOAD)
    Photo getPhotoById(long id);
    @Query("select p.likes from Photo p ")
    List<Like> getLikesPhotoById(long id);
    List<Photo> getPhotoByAlbum_Id(long id);

}
