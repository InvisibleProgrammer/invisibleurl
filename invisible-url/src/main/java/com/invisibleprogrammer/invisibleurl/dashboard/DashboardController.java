package com.invisibleprogrammer.invisibleurl.dashboard;

import com.invisibleprogrammer.invisibleurl.shorturls.ShortUrl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("/dashboard")
public class DashboardController {


    @GetMapping()
    public ShortUrl[] index() {
        return new ShortUrl[]{
                new ShortUrl("https://invisibleprogrammer.com/", "blog"),
                new ShortUrl("https://www.google.com/", "dwkfjdsf")
        };
    }
}
