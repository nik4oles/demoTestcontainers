package com.example.demo.service;


import com.example.demo.models.dto.request.LikeRequestDTO;
import com.example.demo.models.dto.response.PhotoResponseDTO;
import com.example.demo.models.entity.Like;

import java.util.List;

public interface LikeService {

    PhotoResponseDTO addLikePhoto(long userId, long photoId);

    PhotoResponseDTO removeLikePhoto(Long likeId, long photoId);

    void updateLike(LikeRequestDTO like, long id);

    List<Like> getLikesByPhoto(Long photoId);
}
