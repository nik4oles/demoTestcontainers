package com.example.demo.repository;

import com.example.demo.models.entity.Like;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LikeRepository extends CrudRepository<Like, Long> {
    Like getLikeById(Long likeId);

}
