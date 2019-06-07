package math;

import kata.Kata;

import java.lang.*;

public class VolTank extends Kata {

    private static final String kataLink = "https://www.codewars.com/kata/tank-truck/train/java";

    public VolTank() {
        super(kataLink);
    }

    public static int tankVol(int h, int d, int vt) {
//        something wrong in my solution
//        double hd = h;
//        double dd = d;
//        double vtd = vt;
//        double rd = dd / 2;
//        double arccos = Math.acos(((rd - hd) / rd));
//        double root = (2 * rd * hd) - (Math.pow(h, 2));
//        double cylinderLength = vtd / ((Math.pow(rd, 2) * (arccos - ((rd - hd) * (Math.sqrt(root) / Math.pow(rd, 2))))));
//        double resultVolume = (Math.pow(rd, 2) * cylinderLength) * (arccos - ((rd - hd) * (Math.sqrt(root) / (Math.pow(rd, 2)))));
//        int resultVolumeInt = (int) Math.round(resultVolume);
//        return resultVolumeInt;

        double r = (double) d / 2;
        return (int) ((vt / (Math.PI)) * (Math.acos((r - h) / r) - (r - h) * Math.sqrt(d * h - Math.pow(h, 2)) / Math.pow(r, 2)));
    }

}
