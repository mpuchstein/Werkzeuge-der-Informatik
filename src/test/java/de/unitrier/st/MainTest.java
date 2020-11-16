package de.unitrier.st;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MainTest {

    private HTTPCall call;

    @Before
    public void setUp() {
        call = new HTTPCall();
    }

    @Test
    public void fileLoadingTest() {
        Assert.assertEquals(call.send("http://www.mocky.io/v2/5a9ce37b3100004f00ab5154"), "{\"hello\":\"world\"}");

    }

}
