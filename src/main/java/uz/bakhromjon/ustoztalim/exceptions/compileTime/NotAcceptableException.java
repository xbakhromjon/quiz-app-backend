package uz.bakhromjon.ustoztalim.exceptions.compileTime;

import org.springframework.http.HttpStatus;

import java.util.HashMap;

/**
 * @author : Bakhromjon Khasanboyev
 **/
public class NotAcceptableException extends ApiException {
    private NotAcceptableException(String message, Object data) {
        super(message, HttpStatus.NOT_ACCEPTABLE, data);
    }

    public static void throwException(String message, String key, Object keyValue) throws NotAcceptableException {
        HashMap<String, Object> map = new HashMap<>();
        map.put(key, keyValue);
        throw new NotAcceptableException(message, map);
    }

    public static void throwException(String message, Object data) throws NotAcceptableException {
        throw new NotAcceptableException(message, data);
    }
}
