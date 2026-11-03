package com.google.android.material.animation;

import android.animation.TypeEvaluator;
import defpackage.lt;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public class ArgbEvaluatorCompat implements TypeEvaluator<Integer> {
    private static final ArgbEvaluatorCompat instance = new ArgbEvaluatorCompat();

    public static ArgbEvaluatorCompat getInstance() {
        return instance;
    }

    @Override // android.animation.TypeEvaluator
    public Integer evaluate(float f, Integer num, Integer num2) {
        int intValue = num.intValue();
        float f2 = ((intValue >> 24) & 255) / 255.0f;
        int intValue2 = num2.intValue();
        float f3 = ((intValue2 >> 24) & 255) / 255.0f;
        float pow = (float) Math.pow(((intValue >> 16) & 255) / 255.0f, 2.2d);
        float pow2 = (float) Math.pow(((intValue >> 8) & 255) / 255.0f, 2.2d);
        float pow3 = (float) Math.pow((intValue & 255) / 255.0f, 2.2d);
        float pow4 = (float) Math.pow(((intValue2 >> 16) & 255) / 255.0f, 2.2d);
        float pow5 = (float) Math.pow(((intValue2 >> 8) & 255) / 255.0f, 2.2d);
        float pow6 = (float) Math.pow((intValue2 & 255) / 255.0f, 2.2d);
        float M = lt.M(f3, f2, f, f2);
        float M2 = lt.M(pow4, pow, f, pow);
        float M3 = lt.M(pow5, pow2, f, pow2);
        float M4 = lt.M(pow6, pow3, f, pow3);
        float pow7 = ((float) Math.pow(M2, 0.45454545454545453d)) * 255.0f;
        float pow8 = ((float) Math.pow(M3, 0.45454545454545453d)) * 255.0f;
        return Integer.valueOf(Math.round(((float) Math.pow(M4, 0.45454545454545453d)) * 255.0f) | (Math.round(pow7) << 16) | (Math.round(M * 255.0f) << 24) | (Math.round(pow8) << 8));
    }
}
