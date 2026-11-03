package com.google.android.material.color.utilities;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class DislikeAnalyzer {
    private DislikeAnalyzer() {
        throw new UnsupportedOperationException();
    }

    public static Hct fixIfDisliked(Hct hct) {
        return isDisliked(hct) ? Hct.from(hct.getHue(), hct.getChroma(), 70.0d) : hct;
    }

    public static boolean isDisliked(Hct hct) {
        return ((((double) Math.round(hct.getHue())) > 90.0d ? 1 : (((double) Math.round(hct.getHue())) == 90.0d ? 0 : -1)) >= 0 && (((double) Math.round(hct.getHue())) > 111.0d ? 1 : (((double) Math.round(hct.getHue())) == 111.0d ? 0 : -1)) <= 0) && ((((double) Math.round(hct.getChroma())) > 16.0d ? 1 : (((double) Math.round(hct.getChroma())) == 16.0d ? 0 : -1)) > 0) && ((((double) Math.round(hct.getTone())) > 65.0d ? 1 : (((double) Math.round(hct.getTone())) == 65.0d ? 0 : -1)) < 0);
    }
}
