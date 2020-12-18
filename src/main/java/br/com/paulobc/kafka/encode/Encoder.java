package br.com.paulobc.kafka.encode;

import org.apache.commons.codec.binary.Base64;

public class Encoder {
    public String encodeStringToBase64(String str) {
        byte[] encoded = Base64.encodeBase64(str.getBytes());
        String encodedStr = new String(encoded);
        return encodedStr;

    }

    public String decodeStringFromBase64(String str) {
        byte[] decoded = Base64.decodeBase64(str.getBytes());
        String decodedStr = new String(decoded);
        return decodedStr;
    }
}
