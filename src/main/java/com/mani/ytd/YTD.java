package com.mani.ytd;

import java.io.File;
import java.net.URL;
import com.github.axet.vget.VGet;

/**
 *
 * @author Manindar
 */
public class YTD {

    public static void main(String[] args) {
        try {
            String url = "https://www.youtube.com/watch?v=TFOKwwo2pE4";
            String path = "D:\\NetBeansProjects\\Mani\\YTD\\";
            VGet v = new VGet(new URL(url), new File(path));
            v.download();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
