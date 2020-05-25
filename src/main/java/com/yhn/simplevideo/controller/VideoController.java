package com.yhn.simplevideo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import java.io.FileInputStream;


/**
 * @Auther: yhn
 * @Date: 2020/5/23 22:22
 */
@RestController
public class VideoController {

    @GetMapping("/play")
    public void playVideo(HttpServletResponse response) throws Exception {
        byte[] data = new byte[200 * 1024 * 1024];
        FileInputStream fis = new FileInputStream("D://OBS//2019-09-11 00-19-41.mp4");
        fis.read(data);
        ServletOutputStream sos = response.getOutputStream();
        sos.write(data);
        sos.close();
        fis.close();
    }
}
