package com.uptodown.activities;

import com.uptodown.R;
import com.uptodown.core.view.UptodownTextView;
import defpackage.co2;
import defpackage.kf0;
import defpackage.nt0;
import defpackage.v8;
import defpackage.xl;
import java.util.ArrayList;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class Gallery extends xl {
    public static final /* synthetic */ int V = 0;
    public ArrayList T;
    public final co2 S = new co2(new kf0(this, 10));
    public final v8 U = new v8(this, 2);

    public final nt0 C0() {
        return (nt0) this.S.getValue();
    }

    public final void D0(int i) {
        UptodownTextView uptodownTextView = C0().n;
        Integer valueOf = Integer.valueOf(i + 1);
        ArrayList arrayList = this.T;
        uptodownTextView.setText(getString(R.string.gallery_item_count, valueOf, arrayList != null ? Integer.valueOf(arrayList.size()) : null));
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x005d  */
    @Override // defpackage.xl, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r5) {
        /*
            r4 = this;
            super.onCreate(r5)
            nt0 r5 = r4.C0()
            android.widget.RelativeLayout r5 = r5.a
            r4.setContentView(r5)
            androidx.activity.OnBackPressedDispatcher r5 = r4.getOnBackPressedDispatcher()
            v8 r0 = r4.U
            r5.addCallback(r4, r0)
            android.content.Intent r5 = r4.getIntent()
            r0 = 0
            if (r5 == 0) goto L4c
            java.lang.String r1 = "bundle"
            android.os.Bundle r5 = r5.getBundleExtra(r1)
            if (r5 == 0) goto L4c
            java.lang.String r1 = "images"
            boolean r2 = r5.containsKey(r1)
            if (r2 == 0) goto L3f
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 34
            if (r2 < r3) goto L39
            java.lang.Class<xb2> r2 = defpackage.xb2.class
            java.util.ArrayList r1 = r5.getParcelableArrayList(r1, r2)
            goto L3d
        L39:
            java.util.ArrayList r1 = r5.getParcelableArrayList(r1)
        L3d:
            r4.T = r1
        L3f:
            java.lang.String r1 = "index"
            boolean r2 = r5.containsKey(r1)
            if (r2 == 0) goto L4c
            int r5 = r5.getInt(r1)
            goto L4d
        L4c:
            r5 = r0
        L4d:
            lt0 r1 = new lt0
            r1.<init>(r4)
            nt0 r2 = r4.C0()
            androidx.viewpager2.widget.ViewPager2 r2 = r2.o
            r2.setAdapter(r1)
            if (r5 <= 0) goto L66
            nt0 r1 = r4.C0()
            androidx.viewpager2.widget.ViewPager2 r1 = r1.o
            r1.setCurrentItem(r5, r0)
        L66:
            nt0 r1 = r4.C0()
            androidx.viewpager2.widget.ViewPager2 r1 = r1.o
            mt0 r2 = new mt0
            r2.<init>(r4)
            r1.registerOnPageChangeCallback(r2)
            r4.D0(r5)
            nt0 r5 = r4.C0()
            android.widget.ImageView r5 = r5.b
            it0 r1 = new it0
            r1.<init>(r4, r0)
            r5.setOnClickListener(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.uptodown.activities.Gallery.onCreate(android.os.Bundle):void");
    }
}
