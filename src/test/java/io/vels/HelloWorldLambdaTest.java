package io.vels;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class HelloWorldLambdaTest {

    @Test
    void shouldReturnHelloWorldLambda() {
        HelloWorldLambda sut = new HelloWorldLambda();
        assertEquals("Hello World!", sut.helloWorld());
    }

}