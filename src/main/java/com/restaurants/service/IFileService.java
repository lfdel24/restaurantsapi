package com.restaurants.service;

import org.springframework.core.io.Resource;
import org.springframework.web.multipart.MultipartFile;

public interface IFileService {

    public void save(MultipartFile file) throws Exception;

    public Resource load(String name) throws Exception;

}
