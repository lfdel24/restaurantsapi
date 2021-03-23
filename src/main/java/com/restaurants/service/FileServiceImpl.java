package com.restaurants.service;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class FileServiceImpl implements IFileService {

    private final Path rootFolder = Paths.get("/home/leo/uploads");


    @Override
    public void save(MultipartFile file) throws Exception {
        Files.copy(file.getInputStream(),
                this.rootFolder.resolve(file.getOriginalFilename()));
    }

    @Override
    public Resource load(String name) throws Exception {
        Path file = rootFolder.resolve(name);
        Resource resource = new UrlResource(file.toUri());
        return resource;
    }

}
