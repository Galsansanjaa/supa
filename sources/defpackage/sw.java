package defpackage;

import android.graphics.ColorSpace;
import android.view.ContentInfo;
import android.view.ScrollCaptureSession;
import android.view.contentcapture.ContentCaptureSession;
import androidx.compose.ui.graphics.colorspace.ColorSpaces;
import androidx.compose.ui.graphics.colorspace.DoubleFunction;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentSkipListMap;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public final /* synthetic */ class sw implements DoubleFunction, bs1 {
    public final /* synthetic */ int a;

    public /* synthetic */ sw(int i) {
        this.a = i;
    }

    public static /* bridge */ /* synthetic */ ColorSpace.Rgb c(Object obj) {
        return (ColorSpace.Rgb) obj;
    }

    public static /* bridge */ /* synthetic */ ColorSpace d(Object obj) {
        return (ColorSpace) obj;
    }

    public static /* bridge */ /* synthetic */ ContentInfo e(Object obj) {
        return (ContentInfo) obj;
    }

    public static /* bridge */ /* synthetic */ ScrollCaptureSession f(Object obj) {
        return (ScrollCaptureSession) obj;
    }

    public static /* bridge */ /* synthetic */ ContentCaptureSession g(Object obj) {
        return (ContentCaptureSession) obj;
    }

    @Override // defpackage.bs1
    public Object a() {
        switch (this.a) {
            case 19:
                return new ArrayList();
            case 20:
                return new ConcurrentHashMap();
            case 21:
                return new ConcurrentSkipListMap();
            case 22:
                return new LinkedHashSet();
            case 23:
                return new TreeSet();
            case 24:
                return new ArrayDeque();
            case 25:
                return new be1(true);
            case 26:
                return new LinkedHashMap();
            default:
                return new TreeMap();
        }
    }

    @Override // androidx.compose.ui.graphics.colorspace.DoubleFunction
    public double invoke(double d) {
        switch (this.a) {
            case 11:
                return ColorSpaces.a(d);
            case 12:
                return ColorSpaces.e(d);
            case 13:
                return ColorSpaces.f(d);
            case 14:
                return ColorSpaces.c(d);
            case 15:
                return ColorSpaces.b(d);
            default:
                return ColorSpaces.d(d);
        }
    }
}
