package com.zipcodewilmington.danny_do_better_exercises;

/**
 * Created by dan on 6/14/17.
 */
public class MathUtilities {

    /**
     * @param baseValue  starting value
     * @param difference value to add to starting value
     * @return sum of `baseValue` and `difference`
     */
    public Integer add(int baseValue, int difference) {
        return baseValue + difference;
    }

    /**
     * @param baseValue  starting value
     * @param difference value to add to starting value
     * @return sum of `baseValue` and `difference`
     */
    public Long add(long baseValue, long difference) {

        return  baseValue + difference;
    }

    /**
     * @param baseValue  starting value
     * @param difference value to add to starting value
     * @return sum of `baseValue` and `difference`
     */
    public Short add(short baseValue, short difference) {
       short sum;
       sum = (short)(baseValue + difference);
       return sum;
    }

    /**
     * @param baseValue  starting value
     * @param difference value to add to starting value
     * @return sum of `baseValue` and `difference`
     */
    public Byte add(byte baseValue, byte difference) {
        byte sum1;
        sum1 = (byte)(baseValue + difference);
        return sum1;
    }

    /**
     * @param baseValue  starting value
     * @param difference value to add to starting value
     * @return sum of `baseValue` and `difference`
     */
    public Float add(float baseValue, float difference) {

        float sum;
        sum = baseValue + difference;
        return sum;
    }

    /**
     * @param baseValue  starting value
     * @param difference value to add to starting value
     * @return sum of `baseValue` and `difference`
     */
    public Double add(double baseValue, double difference) {
        double sum2;
        sum2 = (baseValue + difference);
        return sum2;
    }

    /**
     * @param baseValue  starting value
     * @param difference value to subtract from starting value
     * @return difference between `baseValue` and `difference`
     */
    public Integer subtract(int baseValue, int difference) {

        return baseValue - difference;
    }

    /**
     * @param baseValue  starting value
     * @param difference value to subtract from starting value
     * @return difference between `baseValue` and `difference`
     */
    public Long subtract(long baseValue, long difference) {

        long diff;
        diff = (long)(baseValue - difference);
        return (long)diff;
    }

    /**
     * @param baseValue  starting value
     * @param difference value to subtract from starting value
     * @return difference between `baseValue` and `difference`
     */
    public Short subtract(short baseValue, short difference) {

        short diff;
        diff = (short)(baseValue - difference);
        return diff;
    }

    /**
     * @param baseValue  starting value
     * @param difference value to subtract from starting value
     * @return difference between `baseValue` and `difference`
     */
    public Byte subtract(byte baseValue, byte difference) {
        byte diff;
        diff = (byte)(baseValue - difference);
        return diff;
    }

    /**
     * @param baseValue  starting value
     * @param difference value to subtract from starting value
     * @return difference between `baseValue` and `difference`
     */
    public Float subtract(float baseValue, float difference) {

        float diff;
        diff = baseValue - difference;
        return diff;
    }

    /**
     * @param baseValue  starting value
     * @param difference value to subtract from starting value
     * @return difference between `baseValue` and `difference`
     */
    public Double subtract(double baseValue, double difference) {

        double diff;
        diff = (baseValue - difference);
        return diff;
    }


    /**
     * @param dividend value to be divided
     * @param divisor value to divide by
     * @return division of `dividend` by `divisor
     */
    public Integer divide(int dividend, int divisor) {

        return dividend / divisor;
    }

    /**
     * @param dividend value to be divided
     * @param divisor value to divide by
     * @return division of `dividend` by `divisor
     */
    public Long divide(long dividend, long divisor) {

        long quotient;
        quotient = (long)(dividend / divisor);
        return (long)quotient;
    }

    /**
     * @param dividend value to be divided
     * @param divisor value to divide by
     * @return division of `dividend` by `divisor
     */
    public Short divide(short dividend, short divisor) {

        short quotient;
        quotient = (short)(dividend / divisor);
        return quotient;
    }

    /**
     * @param dividend value to be divided
     * @param divisor value to divide by
     * @return division of `dividend` by `divisor
     */
    public Byte divide(byte dividend, byte divisor) {

        byte quotient;
        quotient = (byte)(dividend / divisor);
        return quotient;
    }

    /**
     * @param dividend value to be divided
     * @param divisor value to divide by
     * @return division of `dividend` by `divisor
     */
    public Float divide(float dividend, float divisor) {

        float quotient;
        quotient = (dividend / divisor);
        return quotient;
    }

    /**
     * @param dividend value to be divided
     * @param divisor value to divide by
     * @return division of `dividend` by `divisor
     */
    public Double divide(double dividend, double divisor) {
        double quotient;
        quotient = (dividend / divisor);
        return quotient;
    }


    /**
     * @param multiplicand value to be multiplied
     * @param multiplier value to multiply by
     * @return product of `multiplicand` by `multiplier`
     */
    public Integer multiply(int multiplicand, int multiplier) {

        return multiplicand * multiplier;
    }

    /**
     * @param multiplicand value to be multiplied
     * @param multiplier value to multiply by
     * @return product of `multiplicand` by `multiplier`
     */
    public Long multiply(long multiplicand, long multiplier) {

        long product;
        product = (multiplicand * multiplier);
        return product;
    }

    /**
     * @param multiplicand value to be multiplied
     * @param multiplier value to multiply by
     * @return product of `multiplicand` by `multiplier`
     */
    public Short multiply(short multiplicand, short multiplier) {

        short product;
        product = (short)(multiplicand * multiplier);
        return product;
    }
    /**
     * @param multiplicand value to be multiplied
     * @param multiplier value to multiply by
     * @return product of `multiplicand` by `multiplier`
     */
    public Byte multiply(byte multiplicand, byte multiplier) {

        byte product;
        product = (byte)(multiplicand * multiplier);
        return product;
    }

    /**
     * @param multiplicand value to be multiplied
     * @param multiplier value to multiply by
     * @return product of `multiplicand` by `multiplier`
     */
    public Float multiply(float multiplicand, float multiplier) {

        float product;
        product = (float)(multiplicand * multiplier);
        return product;
    }

    /**
     * @param multiplicand value to be multiplied
     * @param multiplier value to multiply by
     * @return product of `multiplicand` by `multiplier`
     */
    public Double multiply(double multiplicand, double multiplier) {

        double product;
        product = (multiplicand * multiplier);
        return product;
    }
}
