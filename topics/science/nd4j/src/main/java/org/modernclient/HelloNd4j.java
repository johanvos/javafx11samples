package org.modernclient;

import org.nd4j.linalg.api.ndarray.INDArray;
import org.nd4j.linalg.factory.Nd4j;

public class HelloNd4j {

    public static void main(String[] args) {
        System.out.println("Hello, nd4j");
        INDArray a = Nd4j.zeros(3,5);
        System.out.println("a = "+a);
    }

}
