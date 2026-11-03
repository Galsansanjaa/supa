package com.uptodown.activities;

import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.appcompat.widget.SwitchCompat;
import androidx.core.content.ContextCompat;
import com.uptodown.R;
import com.uptodown.UptodownApp;
import com.uptodown.activities.GdprPrivacySettings;
import defpackage.a93;
import defpackage.co2;
import defpackage.e13;
import defpackage.ej1;
import defpackage.kf0;
import defpackage.tt0;
import defpackage.xl;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class GdprPrivacySettings extends xl {
    public static final /* synthetic */ int T = 0;
    public final co2 S = new co2(new kf0(this, 12));

    public final a93 C0() {
        return (a93) this.S.getValue();
    }

    public final void D0() {
        boolean isChecked = C0().q.isChecked();
        if (ej1.q(this, "gdpr_crashlytics_allowed", false) != isChecked) {
            ej1.P(this, "gdpr_crashlytics_allowed", isChecked);
        }
        boolean isChecked2 = C0().o.isChecked();
        if (ej1.q(this, "gdpr_analytics_allowed", false) != isChecked2) {
            ej1.P(this, "gdpr_analytics_allowed", isChecked2);
        }
        boolean isChecked3 = C0().p.isChecked();
        if (ej1.q(this, "gdpr_tracking_allowed", false) != isChecked3) {
            ej1.P(this, "gdpr_tracking_allowed", isChecked3);
        }
        if (!ej1.q(this, "gdpr_tracking_allowed", false)) {
            setResult(0);
            return;
        }
        e13 e13Var = UptodownApp.J;
        e13.F(this);
        e13.j(this);
        setResult(-1);
    }

    public final void E0() {
        if (C0().s.getVisibility() == 0) {
            C0().r.setText(R.string.save);
            C0().r.setOnClickListener(new tt0(this, 5));
            C0().s.setVisibility(8);
        }
    }

    public final void F0(SwitchCompat switchCompat, TextView textView, boolean z) {
        if (z) {
            switchCompat.setTextColor(ContextCompat.getColor(this, R.color.text_primary));
            textView.setTextColor(ContextCompat.getColor(this, R.color.text_primary));
        } else {
            switchCompat.setTextColor(ContextCompat.getColor(this, R.color.grey_70));
            textView.setTextColor(ContextCompat.getColor(this, R.color.grey_70));
        }
    }

    @Override // defpackage.xl, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C0().a);
        final int i = 0;
        C0().b.setOnClickListener(new tt0(this, i));
        C0().w.setText("⚠ " + getString(R.string.tracking_disabled_warning_gdpr) + " ⚠");
        C0().o.setChecked(ej1.q(this, "gdpr_analytics_allowed", false));
        C0().q.setChecked(ej1.q(this, "gdpr_crashlytics_allowed", false));
        C0().p.setChecked(ej1.q(this, "gdpr_tracking_allowed", false));
        final int i2 = 1;
        if (ej1.q(this, "gdpr_requested", false)) {
            F0(C0().o, C0().t, C0().o.isChecked());
            F0(C0().q, C0().v, C0().q.isChecked());
            F0(C0().p, C0().u, C0().p.isChecked());
        } else {
            F0(C0().o, C0().t, true);
            F0(C0().q, C0().v, true);
            F0(C0().p, C0().u, true);
            C0().o.setChecked(true);
            C0().q.setChecked(true);
            C0().p.setChecked(true);
        }
        if (C0().p.isChecked()) {
            C0().w.setVisibility(8);
        } else {
            C0().w.setVisibility(0);
        }
        C0().o.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(this) { // from class: ut0
            public final /* synthetic */ GdprPrivacySettings b;

            {
                this.b = this;
            }

            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                int i3 = i;
                GdprPrivacySettings gdprPrivacySettings = this.b;
                switch (i3) {
                    case 0:
                        int i4 = GdprPrivacySettings.T;
                        compoundButton.getClass();
                        gdprPrivacySettings.F0(gdprPrivacySettings.C0().o, gdprPrivacySettings.C0().t, z);
                        gdprPrivacySettings.E0();
                        return;
                    case 1:
                        int i5 = GdprPrivacySettings.T;
                        compoundButton.getClass();
                        gdprPrivacySettings.F0(gdprPrivacySettings.C0().q, gdprPrivacySettings.C0().v, z);
                        gdprPrivacySettings.E0();
                        return;
                    default:
                        int i6 = GdprPrivacySettings.T;
                        compoundButton.getClass();
                        gdprPrivacySettings.F0(gdprPrivacySettings.C0().p, gdprPrivacySettings.C0().u, z);
                        gdprPrivacySettings.E0();
                        if (gdprPrivacySettings.C0().p.isChecked()) {
                            gdprPrivacySettings.C0().w.setVisibility(8);
                            return;
                        } else {
                            gdprPrivacySettings.C0().w.setVisibility(0);
                            return;
                        }
                }
            }
        });
        C0().q.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(this) { // from class: ut0
            public final /* synthetic */ GdprPrivacySettings b;

            {
                this.b = this;
            }

            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                int i3 = i2;
                GdprPrivacySettings gdprPrivacySettings = this.b;
                switch (i3) {
                    case 0:
                        int i4 = GdprPrivacySettings.T;
                        compoundButton.getClass();
                        gdprPrivacySettings.F0(gdprPrivacySettings.C0().o, gdprPrivacySettings.C0().t, z);
                        gdprPrivacySettings.E0();
                        return;
                    case 1:
                        int i5 = GdprPrivacySettings.T;
                        compoundButton.getClass();
                        gdprPrivacySettings.F0(gdprPrivacySettings.C0().q, gdprPrivacySettings.C0().v, z);
                        gdprPrivacySettings.E0();
                        return;
                    default:
                        int i6 = GdprPrivacySettings.T;
                        compoundButton.getClass();
                        gdprPrivacySettings.F0(gdprPrivacySettings.C0().p, gdprPrivacySettings.C0().u, z);
                        gdprPrivacySettings.E0();
                        if (gdprPrivacySettings.C0().p.isChecked()) {
                            gdprPrivacySettings.C0().w.setVisibility(8);
                            return;
                        } else {
                            gdprPrivacySettings.C0().w.setVisibility(0);
                            return;
                        }
                }
            }
        });
        C0().m.setOnClickListener(new tt0(this, i2));
        final int i3 = 2;
        C0().p.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(this) { // from class: ut0
            public final /* synthetic */ GdprPrivacySettings b;

            {
                this.b = this;
            }

            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                int i32 = i3;
                GdprPrivacySettings gdprPrivacySettings = this.b;
                switch (i32) {
                    case 0:
                        int i4 = GdprPrivacySettings.T;
                        compoundButton.getClass();
                        gdprPrivacySettings.F0(gdprPrivacySettings.C0().o, gdprPrivacySettings.C0().t, z);
                        gdprPrivacySettings.E0();
                        return;
                    case 1:
                        int i5 = GdprPrivacySettings.T;
                        compoundButton.getClass();
                        gdprPrivacySettings.F0(gdprPrivacySettings.C0().q, gdprPrivacySettings.C0().v, z);
                        gdprPrivacySettings.E0();
                        return;
                    default:
                        int i6 = GdprPrivacySettings.T;
                        compoundButton.getClass();
                        gdprPrivacySettings.F0(gdprPrivacySettings.C0().p, gdprPrivacySettings.C0().u, z);
                        gdprPrivacySettings.E0();
                        if (gdprPrivacySettings.C0().p.isChecked()) {
                            gdprPrivacySettings.C0().w.setVisibility(8);
                            return;
                        } else {
                            gdprPrivacySettings.C0().w.setVisibility(0);
                            return;
                        }
                }
            }
        });
        C0().n.setOnClickListener(new tt0(this, i3));
        C0().r.setOnClickListener(new tt0(this, 3));
        C0().s.setOnClickListener(new tt0(this, 4));
    }

    @Override // defpackage.xl, defpackage.rr1, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        super.onResume();
        if (ej1.q(this, "gdpr_requested", false)) {
            return;
        }
        ej1.P(this, "gdpr_requested", true);
        ej1.P(this, "gdpr_analytics_allowed", true);
        ej1.P(this, "gdpr_crashlytics_allowed", true);
        ej1.P(this, "gdpr_tracking_allowed", true);
    }
}
