package com.singleton.test;

import com.singleton.beans.Measurement;
import com.singleton.beans.Navigation;

public class SingleThreadedTest {
    public static void main(String[] args) {
        Navigation navigation = new Navigation();
        Measurement measurement = new Measurement();

        navigation.navigate();
        measurement.measure();
    }
}
