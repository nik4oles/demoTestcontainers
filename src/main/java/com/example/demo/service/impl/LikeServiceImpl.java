package com.example.demo.service.impl;

import com.example.demo.converter.photo.PhotoMapper;
import com.example.demo.models.dto.request.LikeRequestDTO;
import com.example.demo.models.dto.response.PhotoResponseDTO;
import com.example.demo.models.entity.Like;
import com.example.demo.models.entity.Photo;
import com.example.demo.models.enums.Emotion;
import com.example.demo.repository.LikeRepository;
import com.example.demo.repository.PhotoRepository;
import com.example.demo.service.LikeService;
import com.example.demo.service.UserService;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@AllArgsConstructor
public class LikeServiceImpl implements LikeService {
    private final LikeRepository likeRepository;
    private final PhotoRepository photoRepository;
    private final UserService userService;
    private final PhotoMapper photoMapper;

    /** Сохренения лайка */

    @Override
    @Transactional
    public PhotoResponseDTO addLikePhoto(long userId, long photoId) {
        Like like = new Like();
        like.setUser(userService.getUser(userId));
        like.setEmotion(Emotion.Like);
        likeRepository.save(like);
        Photo photo = photoRepository.getPhotoById(photoId);
        photo.getLikes().add(like);

        return photoMapper.toDto(photoRepository.save(photo));
    }

    /** Удаление лайка */
    @Override
    public PhotoResponseDTO removeLikePhoto(Long likeId, long photoId) {
        Photo photo = photoRepository.getPhotoById(photoId);
        Like like = likeRepository.getLikeById(likeId);

        photo.getLikes().remove(like);

        photo = photoRepository.save(photo);
        likeRepository.deleteById(likeId);

        return photoMapper.toDto(photo);
    }
    /** Изменить оценку */
    @Override
    public void updateLike(LikeRequestDTO like, long id) {
        Like likeBD = likeRepository.getLikeById(id);
        likeBD.setEmotion(like.getEmotion());
        likeRepository.save(likeBD);
    }
    /** Получить все оценки фото */
    @Override
    public List<Like> getLikesByPhoto(Long photoId) {
        return photoRepository.getLikesPhotoById(photoId);
    }
}
