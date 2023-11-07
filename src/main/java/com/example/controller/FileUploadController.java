package com.example.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

/**
 * Author:pric
 * Date:2023/10/30 22:50
 */
@RestController
public class FileUploadController {

    @PostMapping("upload")
    public String upload(String nickname , MultipartFile photo , HttpServletRequest request) throws IOException {
        System.out.println(nickname);

        System.out.println(photo.getOriginalFilename());
        System.out.println(photo.getContentType());
        System.out.println(System.getProperty("user.dir"));
        String path = request.getServletContext().getRealPath("/upload/");
        System.out.println(path);
        saveFile(photo,path);
        return "上传成功";
    }

    public void saveFile(MultipartFile photo , String path) throws IOException {
        File dir = new File(path);
        if(!dir.exists()){
            dir.mkdir();
            System.out.println("创建了一个目录");
        }

        File file = new File(path + photo.getOriginalFilename());
        System.out.println(file);
        photo.transferTo(file);

    }


}
