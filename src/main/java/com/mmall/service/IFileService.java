package com.mmall.service;

import org.springframework.web.multipart.MultipartFile;

public interface IFileService {

    /**
     * 文件上传到FTP服务器
     * @param file
     * @param path
     * @return
     */
    String upload(MultipartFile file, String path);
}
