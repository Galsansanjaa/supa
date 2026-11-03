package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class jr3 implements Parcelable.Creator {
    public final /* synthetic */ int a;

    public /* synthetic */ jr3(int i) {
        this.a = i;
    }

    public static void a(iv3 iv3Var, Parcel parcel, int i) {
        String str = iv3Var.a;
        int U = xu3.U(parcel, 20293);
        xu3.K(parcel, 2, str);
        xu3.J(parcel, 3, iv3Var.b, i);
        xu3.K(parcel, 4, iv3Var.m);
        long j = iv3Var.n;
        xu3.S(parcel, 5, 8);
        parcel.writeLong(j);
        long j2 = iv3Var.o;
        xu3.S(parcel, 6, 8);
        parcel.writeLong(j2);
        xu3.Y(parcel, U);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: CFG modification limit reached, blocks count: 605
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:64)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:44)
        */
    @Override // android.os.Parcelable.Creator
    public final java.lang.Object createFromParcel(android.os.Parcel r27) {
        /*
            Method dump skipped, instructions count: 1764
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jr3.createFromParcel(android.os.Parcel):java.lang.Object");
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new oq3[i];
            case 1:
                return new fa2[i];
            case 2:
                return new gr3[i];
            case 3:
                return new as3[i];
            case 4:
                return new vs3[i];
            case 5:
                return new wt3[i];
            case 6:
                return new o12[i];
            case 7:
                return new m12[i];
            case 8:
                return new eu3[i];
            case 9:
                return new p12[i];
            case 10:
                return new q12[i];
            case 11:
                return new r12[i];
            case 12:
                return new t12[i];
            case 13:
                return new u12[i];
            case 14:
                return new p72[i];
            case 15:
                return new ou3[i];
            case 16:
                return new ur2[i];
            case 17:
                return new wr2[i];
            case 18:
                return new zx3[i];
            case 19:
                return new zk0[i];
            case 20:
                return new le[i];
            case 21:
                return new k53[i];
            case 22:
                return new l53[i];
            case 23:
                return new n63[i];
            case 24:
                return new o63[i];
            case 25:
                return new gv3[i];
            case 26:
                return new iv3[i];
            case 27:
                return new ux[i];
            case 28:
                return new oe[i];
            default:
                return new Scope[i];
        }
    }
}
