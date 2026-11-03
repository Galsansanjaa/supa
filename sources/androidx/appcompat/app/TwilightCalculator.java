package androidx.appcompat.app;

import defpackage.wa2;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
class TwilightCalculator {
    private static final float ALTIDUTE_CORRECTION_CIVIL_TWILIGHT = -0.10471976f;
    private static final float C1 = 0.0334196f;
    private static final float C2 = 3.49066E-4f;
    private static final float C3 = 5.236E-6f;
    public static final int DAY = 0;
    private static final float DEGREES_TO_RADIANS = 0.017453292f;
    private static final float J0 = 9.0E-4f;
    public static final int NIGHT = 1;
    private static final float OBLIQUITY = 0.4092797f;
    private static final long UTC_2000 = 946728000000L;
    private static TwilightCalculator sInstance;
    public int state;
    public long sunrise;
    public long sunset;

    public static TwilightCalculator getInstance() {
        TwilightCalculator twilightCalculator = sInstance;
        if (twilightCalculator != null) {
            return twilightCalculator;
        }
        TwilightCalculator twilightCalculator2 = new TwilightCalculator();
        sInstance = twilightCalculator2;
        return twilightCalculator2;
    }

    public void calculateTwilight(long j, double d, double d2) {
        double d3 = (0.01720197f * (((float) (j - UTC_2000)) / 8.64E7f)) + 6.24006f;
        double sin = (Math.sin(r4 * 3.0f) * 5.236000106378924E-6d) + wa2.k(2.0f * r4, 3.4906598739326E-4d, wa2.k(d3, 0.03341960161924362d, d3)) + 1.796593063d + 3.141592653589793d;
        double sin2 = (Math.sin(2.0d * sin) * (-0.0069d)) + wa2.k(d3, 0.0053d, ((float) Math.round((r3 - J0) - r7)) + J0 + ((-d2) / 360.0d));
        double asin = Math.asin(Math.sin(0.4092797040939331d) * Math.sin(sin));
        double d4 = 0.01745329238474369d * d;
        double sin3 = (Math.sin(-0.10471975803375244d) - (Math.sin(asin) * Math.sin(d4))) / (Math.cos(asin) * Math.cos(d4));
        if (sin3 >= 1.0d) {
            this.state = 1;
            this.sunset = -1L;
            this.sunrise = -1L;
        } else {
            if (sin3 <= -1.0d) {
                this.state = 0;
                this.sunset = -1L;
                this.sunrise = -1L;
                return;
            }
            double acos = (float) (Math.acos(sin3) / 6.283185307179586d);
            this.sunset = Math.round((sin2 + acos) * 8.64E7d) + UTC_2000;
            long round = Math.round((sin2 - acos) * 8.64E7d) + UTC_2000;
            this.sunrise = round;
            if (round >= j || this.sunset <= j) {
                this.state = 1;
            } else {
                this.state = 0;
            }
        }
    }
}
