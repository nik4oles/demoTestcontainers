package com.example.demo.service;

import com.example.demo.models.dto.request.AlbumRequestDTO;
import com.example.demo.models.dto.request.PhotoRequestDTO;
import com.example.demo.models.dto.response.AlbumResponseDTO;
import com.example.demo.models.dto.response.GroupResponseDTO;
import com.example.demo.models.dto.response.PhotoResponseDTO;
import com.example.demo.models.dto.response.UserResponseDTO;
import com.example.demo.models.entity.Album;
import com.example.demo.models.entity.Photo;

import java.util.List;

public interface AlbumService {


    Album getAlbum(long albumId);

    AlbumResponseDTO getAlbumResponseDTO(long id);

    AlbumResponseDTO updateAlbum(long albumId, AlbumRequestDTO album);

    String deleteAlbum(long albumId);

    AlbumResponseDTO addPhoto(long albumId, PhotoRequestDTO photo);

    Photo getPhoto(long photoId);

    PhotoResponseDTO getPhotoResponseDTO(long photoId);

    UserResponseDTO createProfilePictureUser(long id, long photoId);

    AlbumResponseDTO createAlbumUser(long id, AlbumRequestDTO albumDTO);

    GroupResponseDTO createProfilePictureGroup(long id, long photoId);

    AlbumResponseDTO createAlbumGroup(long id, AlbumRequestDTO albumDTO);

    List<PhotoResponseDTO> getAlbumList(long albumId);

    String deletePhoto(long id);
}
