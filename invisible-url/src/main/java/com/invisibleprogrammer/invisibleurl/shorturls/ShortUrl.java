package com.invisibleprogrammer.invisibleurl.shorturls;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ShortUrl {
    private String longUrl;
    private String shortUrl;
}
