package lesson9.exceptions;

/* Exception он обазятельно требудет обработчика
 *RuntimeException не требует обработчика
 *
 */

import java.io.FileNotFoundException;
import java.io.IOError;

public class ExceptionAndRuntimeException {

    public static void main(String[] args) throws FileNotFoundException, IOError {
        System.out.println("Hello");
        writeToFile();
        System.out.println("Bye");
    }

    public static void writeToFile() throws FileNotFoundException, IOError {
        //actions
    }
}
