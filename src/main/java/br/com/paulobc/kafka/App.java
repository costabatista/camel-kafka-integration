package br.com.paulobc.kafka;

import br.com.paulobc.kafka.encode.Encoder;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        Encoder encoder = new Encoder();
        String encoded = encoder.encodeStringToBase64("Hello World!!!");
        System.out.println("Encoded value is: " + encoded);
        String decoded = encoder.decodeStringFromBase64(encoded);
        System.out.println("Decoded value is: " + decoded);
    }
}
