package com.invisibleprogrammer.invisibleurl.shorturls;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Arrays;

@Controller()
@RequestMapping("/")
public class ShortUrlController {



    @RequestMapping(value = "/{shortUrl}", method = RequestMethod.GET)
    public ResponseEntity<ShortUrl> shortUrl(@PathVariable("shortUrl") String shortUrl){
        var longUrls = new ShortUrl[]{
                new ShortUrl("https://invisibleprogrammer.com/", "blog"),
                new ShortUrl("https://www.google.com/", "dwkfjdsf")}
        ;

        var longUrl = Arrays.stream(longUrls).filter(lu -> lu.getShortUrl().equals(shortUrl)).findFirst();

        if (longUrl.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }

        return new ResponseEntity<>(longUrl.get(), HttpStatus.TEMPORARY_REDIRECT);

    }
}
