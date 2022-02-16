package org.redhat.cee;

import io.quarkus.runtime.QuarkusApplication;
import io.quarkus.runtime.annotations.QuarkusMain;

import java.net.URL;

@QuarkusMain
public class PlaygroundApplication implements QuarkusApplication {

    @Override
    public int run(String... args) {
        URL url = Thread.currentThread().getContextClassLoader().getResource("sample");
        if(url == null){
            System.out.println("sample directory is NOT found.");
        }
        else {
            System.out.println("sample directory is found.");
        }
        return 0;
    }
}
