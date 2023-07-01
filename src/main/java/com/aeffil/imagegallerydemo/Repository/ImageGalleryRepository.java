package com.aeffil.imagegallerydemo.Repository;

import com.aeffil.imagegallerydemo.Model.ImageGallery;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ImageGalleryRepository extends JpaRepository<ImageGallery, Long>{

}

