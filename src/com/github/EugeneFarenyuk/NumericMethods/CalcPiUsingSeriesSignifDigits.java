package com.github.EugeneFarenyuk.NumericMethods;

/**
 * Created by Eugene on 14-Dec-2016.
 */
public class CalcPiUsingSeriesSignifDigits {
    public static void main(String[] args) {
    /* Task:
    Calculate number Pi using series: Pi = 4* (1 -1/3 +1/5 -1/7 +...).
    diff = difference between current and previous calculated Pi value. */
        double Pi=0, PiPrev, diff, diffThreshold =0.00001;
        int index=1;
        // sequence {1,3,5,7,...} has n-th term = 2*index-1.
        // to alternate plus and minus use Math.pow(-1.0, i+1.0).
        do{ PiPrev = Pi;
            Pi += 4 * Math.pow(-1.0, index + 1.0) / (2.0 * index - 1);
            diff = Math.abs(Pi - PiPrev);
            index++;
        } while(diff>diffThreshold);
        System.out.println(PiPrev);
        System.out.println(Pi);
        System.out.println(diff);
        System.out.println(index);
    }
}
