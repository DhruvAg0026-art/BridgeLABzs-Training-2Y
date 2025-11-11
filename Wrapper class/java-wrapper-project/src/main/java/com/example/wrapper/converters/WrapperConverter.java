public class WrapperConverter {

    public int convertIntegerToInt(Integer value) {
        return value != null ? value.intValue() : 0;
    }

    public double convertDoubleToInt(Double value) {
        return value != null ? value.intValue() : 0;
    }

    public long convertLongToInt(Long value) {
        return value != null ? value.intValue() : 0;
    }

    public float convertFloatToInt(Float value) {
        return value != null ? value.intValue() : 0;
    }

    public boolean convertBooleanToPrimitive(Boolean value) {
        return value != null ? value.booleanValue() : false;
    }

    public char convertCharacterToPrimitive(Character value) {
        return value != null ? value.charValue() : '\u0000';
    }
}