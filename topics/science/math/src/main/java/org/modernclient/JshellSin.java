package org.modernclient;

import java.util.stream.*;

public class JshellSin {

    public static void main(String[] args) {
        IntStream.range(0, 4)
            .mapToDouble(i -> 30. * i * 2* Math.PI/360.)
            .forEach(d -> System.out.println(Math.sin(d)));
    }

}
