package org.example;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class DFERR extends FileOutputStream {
    public DFERR(String name) throws FileNotFoundException {
        super(name);


    }
}
