package com.im0rtality.piggybank.client;

import android.graphics.Color;

import java.util.Random;

public class ColorGenerator {
    private static final double GOLDEN_RATION_CONJUGATE = 0.618033988749895;
    private static final double SATURATION = 0.5;
    private static final double LUMINANCE = 0.95;

    private double hue;

    public ColorGenerator() {
        hue = new Random().nextFloat();
    }

    public Integer nextColor() {
        hue = (hue + GOLDEN_RATION_CONJUGATE) % 1.0;

        float[] hsv = new float[]{(float) hue * 360, (float) SATURATION, (float) LUMINANCE};

        return Color.HSVToColor(hsv);
    }
}
