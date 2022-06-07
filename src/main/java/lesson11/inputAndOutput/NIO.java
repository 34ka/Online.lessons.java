package lesson11.inputAndOutput;

import java.io.File;

public class NIO {
    public void doSmth() {
        File f = new File("aa.txt");
        f.exists();
        f.isDirectory();
    }

}
