package defpackage;

import android.util.SparseArray;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class sx {
    public static final sx a;
    public static final /* synthetic */ sx[] b;

    /* JADX INFO: Fake field, exist only in values array */
    sx EF0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, sx, java.lang.Object] */
    static {
        Enum r0 = new Enum("NOT_SET", 0);
        ?? r1 = new Enum("EVENT_OVERRIDE", 1);
        a = r1;
        b = new sx[]{r0, r1};
        SparseArray sparseArray = new SparseArray();
        sparseArray.put(0, r0);
        sparseArray.put(5, r1);
    }

    public static sx valueOf(String str) {
        return (sx) Enum.valueOf(sx.class, str);
    }

    public static sx[] values() {
        return (sx[]) b.clone();
    }
}
