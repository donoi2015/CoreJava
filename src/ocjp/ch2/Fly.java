package ocjp.ch2;
/*
 * Copyright (c) ${year} by Rakuten, Inc. All Rights Reserved.
 */

public interface Fly {
    int MAX_SPEED = 100;

    static double calculateSpeed(float distance, double time) {
        return distance / time;
    }

    int getWingSpan() throws Exception;

    default void land() {
        System.out.println("Animal is landing");
    }
}