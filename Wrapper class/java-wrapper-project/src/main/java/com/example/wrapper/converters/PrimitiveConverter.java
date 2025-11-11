package com.example.wrapper.converters;

public class PrimitiveConverter {

    public static Integer convertIntToInteger(int value) {
        return Integer.valueOf(value);
    }

    public static int convertIntegerToInt(Integer value) {
        return value != null ? value.intValue() : 0;
    }

    public static Double convertDoubleToDouble(double value) {
        return Double.valueOf(value);
    }

    public static double convertDoubleToPrimitive(Double value) {
        return value != null ? value.doubleValue() : 0.0;
    }

    public static Long convertLongToLong(long value) {
        return Long.valueOf(value);
    }

    public static long convertLongToPrimitive(Long value) {
        return value != null ? value.longValue() : 0L;
    }

    public static Float convertFloatToFloat(float value) {
        return Float.valueOf(value);
    }

    public static float convertFloatToPrimitive(Float value) {
        return value != null ? value.floatValue() : 0.0f;
    }
}