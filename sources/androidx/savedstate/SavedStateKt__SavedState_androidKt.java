package androidx.savedstate;

import android.os.Bundle;
import androidx.core.os.BundleKt;
import defpackage.dv1;
import defpackage.pi0;
import defpackage.ps0;
import defpackage.vy2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
final /* synthetic */ class SavedStateKt__SavedState_androidKt {
    public static final Bundle savedState(Bundle bundle, ps0 ps0Var) {
        bundle.getClass();
        ps0Var.getClass();
        Bundle bundle2 = new Bundle(bundle);
        ps0Var.invoke(SavedStateWriter.m8457boximpl(SavedStateWriter.m8459constructorimpl(bundle2)));
        return bundle2;
    }

    public static final Bundle savedState(Map<String, ? extends Object> map, ps0 ps0Var) {
        dv1[] dv1VarArr;
        map.getClass();
        ps0Var.getClass();
        if (map.isEmpty()) {
            dv1VarArr = new dv1[0];
        } else {
            ArrayList arrayList = new ArrayList(map.size());
            for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
                arrayList.add(new dv1(entry.getKey(), entry.getValue()));
            }
            dv1VarArr = (dv1[]) arrayList.toArray(new dv1[0]);
        }
        Bundle bundleOf = BundleKt.bundleOf((dv1[]) Arrays.copyOf(dv1VarArr, dv1VarArr.length));
        ps0Var.invoke(SavedStateWriter.m8457boximpl(SavedStateWriter.m8459constructorimpl(bundleOf)));
        return bundleOf;
    }

    public static /* synthetic */ Bundle savedState$default(Bundle bundle, ps0 ps0Var, int i, Object obj) {
        if ((i & 2) != 0) {
            ps0Var = new ps0() { // from class: androidx.savedstate.SavedStateKt__SavedState_androidKt$savedState$3
                @Override // defpackage.ps0
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    m8371invokexApjlu4(((SavedStateWriter) obj2).m8497unboximpl());
                    return vy2.a;
                }

                /* renamed from: invoke-xApjlu4, reason: not valid java name */
                public final void m8371invokexApjlu4(Bundle bundle2) {
                    bundle2.getClass();
                }
            };
        }
        bundle.getClass();
        ps0Var.getClass();
        Bundle bundle2 = new Bundle(bundle);
        ps0Var.invoke(SavedStateWriter.m8457boximpl(SavedStateWriter.m8459constructorimpl(bundle2)));
        return bundle2;
    }

    public static Bundle savedState$default(Map map, ps0 ps0Var, int i, Object obj) {
        dv1[] dv1VarArr;
        if ((i & 1) != 0) {
            map = pi0.a;
        }
        if ((i & 2) != 0) {
            ps0Var = new ps0() { // from class: androidx.savedstate.SavedStateKt__SavedState_androidKt$savedState$1
                @Override // defpackage.ps0
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    m8370invokexApjlu4(((SavedStateWriter) obj2).m8497unboximpl());
                    return vy2.a;
                }

                /* renamed from: invoke-xApjlu4, reason: not valid java name */
                public final void m8370invokexApjlu4(Bundle bundle) {
                    bundle.getClass();
                }
            };
        }
        map.getClass();
        ps0Var.getClass();
        if (map.isEmpty()) {
            dv1VarArr = new dv1[0];
        } else {
            ArrayList arrayList = new ArrayList(map.size());
            for (Map.Entry entry : map.entrySet()) {
                arrayList.add(new dv1((String) entry.getKey(), entry.getValue()));
            }
            dv1VarArr = (dv1[]) arrayList.toArray(new dv1[0]);
        }
        Bundle bundleOf = BundleKt.bundleOf((dv1[]) Arrays.copyOf(dv1VarArr, dv1VarArr.length));
        ps0Var.invoke(SavedStateWriter.m8457boximpl(SavedStateWriter.m8459constructorimpl(bundleOf)));
        return bundleOf;
    }
}
