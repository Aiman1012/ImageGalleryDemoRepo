package com.aeffil.imagegallerydemo.Service;

import com.aeffil.imagegallerydemo.Model.ImageGallery;
import com.aeffil.imagegallerydemo.Repository.ImageGalleryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ImageGalleryService {

    @Autowired
    private ImageGalleryRepository imageGalleryRepository;

    public void saveImage(ImageGallery imageGallery) {
        imageGalleryRepository.save(imageGallery);
    }

    public List<ImageGallery> getAllActiveImages() {
        return imageGalleryRepository.findAll();
    }

    public Optional<ImageGallery> getImageById(Long id) {
        return imageGalleryRepository.findById(id);
    }
}
