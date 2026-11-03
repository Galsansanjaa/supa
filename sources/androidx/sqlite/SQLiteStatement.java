package androidx.sqlite;

import java.util.List;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public interface SQLiteStatement extends AutoCloseable {
    /* renamed from: bindBlob */
    void mo8364bindBlob(int i, byte[] bArr);

    void bindBoolean(int i, boolean z);

    /* renamed from: bindDouble */
    void mo8365bindDouble(int i, double d);

    void bindFloat(int i, float f);

    void bindInt(int i, int i2);

    /* renamed from: bindLong */
    void mo8366bindLong(int i, long j);

    /* renamed from: bindNull */
    void mo8367bindNull(int i);

    /* renamed from: bindText */
    void mo8368bindText(int i, String str);

    /* renamed from: clearBindings */
    void mo8369clearBindings();

    @Override // java.lang.AutoCloseable
    void close();

    byte[] getBlob(int i);

    boolean getBoolean(int i);

    int getColumnCount();

    String getColumnName(int i);

    List<String> getColumnNames();

    int getColumnType(int i);

    double getDouble(int i);

    float getFloat(int i);

    int getInt(int i);

    long getLong(int i);

    String getText(int i);

    boolean isNull(int i);

    void reset();

    boolean step();
}
