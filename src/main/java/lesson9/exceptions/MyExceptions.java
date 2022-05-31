package lesson9.exceptions;

import lesson7.enums.User;

public class MyExceptions {

    public void doSmth(User u) throws Exception {
        if(null == u) {
            throw new Exception("Привет");
        }
    }

}
