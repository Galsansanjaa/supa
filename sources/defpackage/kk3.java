package defpackage;

import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.SignInAccount;
import com.google.android.gms.auth.api.signin.internal.SignInConfiguration;
import com.google.android.gms.fido.common.Transport;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class kk3 implements Parcelable.Creator {
    public final /* synthetic */ int a;

    public /* synthetic */ kk3(int i) {
        this.a = i;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: CFG modification limit reached, blocks count: 615
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:64)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:44)
        */
    @Override // android.os.Parcelable.Creator
    public final java.lang.Object createFromParcel(android.os.Parcel r25) {
        /*
            Method dump skipped, instructions count: 1990
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kk3.createFromParcel(android.os.Parcel):java.lang.Object");
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new fk3[i];
            case 1:
                return new GoogleSignInAccount[i];
            case 2:
                return new hk3[i];
            case 3:
                return new GoogleSignInOptions[i];
            case 4:
                return new fl3[i];
            case 5:
                return new nl3[i];
            case 6:
                return new jk1[i];
            case 7:
                return new ql3[i];
            case 8:
                return new rl3[i];
            case 9:
                return new SignInAccount[i];
            case 10:
                return new ro[i];
            case 11:
                return new so[i];
            case 12:
                return new iu0[i];
            case 13:
                return new no[i];
            case 14:
                return new oo[i];
            case 15:
                return new po[i];
            case 16:
                return new qo[i];
            case 17:
                return new jb2[i];
            case 18:
                return new kb2[i];
            case 19:
                return new SignInConfiguration[i];
            case 20:
                return new gj2[i];
            case 21:
                return new ij2[i];
            case 22:
                return new je[i];
            case 23:
                return new gw[i];
            case 24:
                return new uz[i];
            case 25:
                return new Transport[i];
            case 26:
                return new qe4[i];
            case 27:
                return new qn3[i];
            case 28:
                return new ep3[i];
            default:
                return new jv0[i];
        }
    }
}
