package androidx.browser.trusted;

import android.net.Uri;
import android.os.Bundle;
import androidx.core.os.BundleCompat;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class FileHandlingData {
    public static final String KEY_URIS = "androidx.browser.trusted.KEY_URIS";
    public final List<Uri> uris;

    public FileHandlingData(List<Uri> list) {
        Objects.requireNonNull(list);
        this.uris = list;
    }

    public static FileHandlingData fromBundle(Bundle bundle) {
        return new FileHandlingData(BundleCompat.getParcelableArrayList(bundle, KEY_URIS, Uri.class));
    }

    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        if (this.uris != null) {
            bundle.putParcelableArrayList(KEY_URIS, new ArrayList<>(this.uris));
        }
        return bundle;
    }
}
