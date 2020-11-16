package de.unitrier.st;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        HTTPCall call = new HTTPCall();
        System.out.println(call.send("http://www.mocky.io/v2/5a9ce37b3100004f00ab5154"));
    }

}
