package androidx.compose.runtime.snapshots;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.pk2;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class SnapshotStateList$Companion$CREATOR$1 implements Parcelable.ClassLoaderCreator<SnapshotStateList<Object>> {
    public static /* synthetic */ Object a(Parcel parcel, ClassLoader classLoader, int i) {
        return parcel.readValue(classLoader);
    }

    @Override // android.os.Parcelable.Creator
    public SnapshotStateList<Object> createFromParcel(Parcel parcel) {
        return createFromParcel(parcel, (ClassLoader) null);
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public SnapshotStateList<Object> createFromParcel(Parcel parcel, ClassLoader classLoader) {
        if (classLoader == null) {
            classLoader = SnapshotStateList$Companion$CREATOR$1.class.getClassLoader();
        }
        return SnapshotStateListKt.SnapshotStateList(parcel.readInt(), new pk2(0, parcel, classLoader));
    }

    @Override // android.os.Parcelable.Creator
    public SnapshotStateList<Object>[] newArray(int i) {
        return new SnapshotStateList[i];
    }
}
