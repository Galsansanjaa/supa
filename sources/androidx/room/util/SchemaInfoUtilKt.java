package androidx.room.util;

import androidx.autofill.HintConstants;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.room.util.TableInfo;
import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import defpackage.ai1;
import defpackage.bn2;
import defpackage.ej1;
import defpackage.ie1;
import defpackage.ih2;
import defpackage.jh2;
import defpackage.kw;
import defpackage.lw;
import defpackage.nb0;
import defpackage.pi0;
import defpackage.pw;
import defpackage.rd;
import defpackage.ri0;
import defpackage.um2;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class SchemaInfoUtilKt {
    private static final String[] FTS_OPTIONS = {"tokenize=", "compress=", "content=", "languageid=", "matchinfo=", "notindexed=", "order=", "prefix=", "uncompress="};

    public static final int findAffinity(String str) {
        if (str == null) {
            return 5;
        }
        String upperCase = str.toUpperCase(Locale.ROOT);
        upperCase.getClass();
        if (um2.l0(upperCase, "INT", false)) {
            return 3;
        }
        if (um2.l0(upperCase, "CHAR", false) || um2.l0(upperCase, "CLOB", false) || um2.l0(upperCase, "TEXT", false)) {
            return 2;
        }
        if (um2.l0(upperCase, "BLOB", false)) {
            return 5;
        }
        return (um2.l0(upperCase, "REAL", false) || um2.l0(upperCase, "FLOA", false) || um2.l0(upperCase, "DOUB", false)) ? 4 : 1;
    }

    public static final Set<String> parseFtsOptions(String str) {
        Character ch;
        str.getClass();
        if (str.length() == 0) {
            return ri0.a;
        }
        String substring = str.substring(um2.t0('(', 0, 6, str) + 1, um2.x0(str, ')'));
        ArrayList arrayList = new ArrayList();
        rd rdVar = new rd();
        int i = -1;
        int i2 = 0;
        int i3 = 0;
        while (i2 < substring.length()) {
            char charAt = substring.charAt(i2);
            int i4 = i3 + 1;
            if (charAt != '\"' && charAt != '\'') {
                if (charAt != ',') {
                    if (charAt != '[') {
                        if (charAt != ']') {
                            if (charAt != '`') {
                            }
                        } else if (!rdVar.isEmpty() && (ch = (Character) rdVar.f()) != null && ch.charValue() == '[') {
                            pw.j0(rdVar);
                        }
                    } else if (rdVar.isEmpty()) {
                        rdVar.addFirst(Character.valueOf(charAt));
                    }
                } else if (rdVar.isEmpty()) {
                    String substring2 = substring.substring(i + 1, i3);
                    int length = substring2.length() - 1;
                    int i5 = 0;
                    boolean z = false;
                    while (i5 <= length) {
                        boolean z2 = jh2.s(substring2.charAt(!z ? i5 : length), 32) <= 0;
                        if (z) {
                            if (!z2) {
                                break;
                            }
                            length--;
                        } else if (z2) {
                            i5++;
                        } else {
                            z = true;
                        }
                    }
                    arrayList.add(substring2.subSequence(i5, length + 1).toString());
                    i = i3;
                }
                i2++;
                i3 = i4;
            }
            if (rdVar.isEmpty()) {
                rdVar.addFirst(Character.valueOf(charAt));
            } else {
                Character ch2 = (Character) rdVar.f();
                if (ch2 != null && ch2.charValue() == charAt) {
                    pw.j0(rdVar);
                }
            }
            i2++;
            i3 = i4;
        }
        arrayList.add(um2.N0(substring.substring(i + 1)).toString());
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i6 = 0;
        while (i6 < size) {
            Object obj = arrayList.get(i6);
            i6++;
            String str2 = (String) obj;
            String[] strArr = FTS_OPTIONS;
            int length2 = strArr.length;
            int i7 = 0;
            while (true) {
                if (i7 >= length2) {
                    break;
                }
                if (bn2.h0(str2, strArr[i7], false)) {
                    arrayList2.add(obj);
                    break;
                }
                i7++;
            }
        }
        return kw.P0(arrayList2);
    }

    private static final Map<String, TableInfo.Column> readColumns(SQLiteConnection sQLiteConnection, String str) {
        SQLiteStatement prepare = sQLiteConnection.prepare("PRAGMA table_info(`" + str + "`)");
        try {
            if (!prepare.step()) {
                pi0 pi0Var = pi0.a;
                jh2.r(prepare, null);
                return pi0Var;
            }
            int columnIndexOf = SQLiteStatementUtil.columnIndexOf(prepare, HintConstants.AUTOFILL_HINT_NAME);
            int columnIndexOf2 = SQLiteStatementUtil.columnIndexOf(prepare, ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY);
            int columnIndexOf3 = SQLiteStatementUtil.columnIndexOf(prepare, "notnull");
            int columnIndexOf4 = SQLiteStatementUtil.columnIndexOf(prepare, "pk");
            int columnIndexOf5 = SQLiteStatementUtil.columnIndexOf(prepare, "dflt_value");
            ai1 ai1Var = new ai1();
            do {
                String text = prepare.getText(columnIndexOf);
                ai1Var.put(text, new TableInfo.Column(text, prepare.getText(columnIndexOf2), prepare.getLong(columnIndexOf3) != 0, (int) prepare.getLong(columnIndexOf4), prepare.isNull(columnIndexOf5) ? null : prepare.getText(columnIndexOf5), 2));
            } while (prepare.step());
            ai1 b = ai1Var.b();
            jh2.r(prepare, null);
            return b;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                jh2.r(prepare, th);
                throw th2;
            }
        }
    }

    private static final List<ForeignKeyWithSequence> readForeignKeyFieldMappings(SQLiteStatement sQLiteStatement) {
        int columnIndexOf = SQLiteStatementUtil.columnIndexOf(sQLiteStatement, "id");
        int columnIndexOf2 = SQLiteStatementUtil.columnIndexOf(sQLiteStatement, "seq");
        int columnIndexOf3 = SQLiteStatementUtil.columnIndexOf(sQLiteStatement, TypedValues.TransitionType.S_FROM);
        int columnIndexOf4 = SQLiteStatementUtil.columnIndexOf(sQLiteStatement, TypedValues.TransitionType.S_TO);
        ie1 p = nb0.p();
        while (sQLiteStatement.step()) {
            p.add(new ForeignKeyWithSequence((int) sQLiteStatement.getLong(columnIndexOf), (int) sQLiteStatement.getLong(columnIndexOf2), sQLiteStatement.getText(columnIndexOf3), sQLiteStatement.getText(columnIndexOf4)));
        }
        return kw.F0(nb0.k(p));
    }

    private static final Set<TableInfo.ForeignKey> readForeignKeys(SQLiteConnection sQLiteConnection, String str) {
        SQLiteStatement prepare = sQLiteConnection.prepare("PRAGMA foreign_key_list(`" + str + "`)");
        try {
            int columnIndexOf = SQLiteStatementUtil.columnIndexOf(prepare, "id");
            int columnIndexOf2 = SQLiteStatementUtil.columnIndexOf(prepare, "seq");
            int columnIndexOf3 = SQLiteStatementUtil.columnIndexOf(prepare, "table");
            int columnIndexOf4 = SQLiteStatementUtil.columnIndexOf(prepare, "on_delete");
            int columnIndexOf5 = SQLiteStatementUtil.columnIndexOf(prepare, "on_update");
            List<ForeignKeyWithSequence> readForeignKeyFieldMappings = readForeignKeyFieldMappings(prepare);
            prepare.reset();
            ih2 ih2Var = new ih2();
            while (prepare.step()) {
                if (prepare.getLong(columnIndexOf2) == 0) {
                    int i = (int) prepare.getLong(columnIndexOf);
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    ArrayList arrayList3 = new ArrayList();
                    for (Object obj : readForeignKeyFieldMappings) {
                        if (((ForeignKeyWithSequence) obj).getId() == i) {
                            arrayList3.add(obj);
                        }
                    }
                    int size = arrayList3.size();
                    int i2 = 0;
                    while (i2 < size) {
                        Object obj2 = arrayList3.get(i2);
                        i2++;
                        ForeignKeyWithSequence foreignKeyWithSequence = (ForeignKeyWithSequence) obj2;
                        arrayList.add(foreignKeyWithSequence.getFrom());
                        arrayList2.add(foreignKeyWithSequence.getTo());
                    }
                    ih2Var.add(new TableInfo.ForeignKey(prepare.getText(columnIndexOf3), prepare.getText(columnIndexOf4), prepare.getText(columnIndexOf5), arrayList, arrayList2));
                }
            }
            ih2 o = jh2.o(ih2Var);
            jh2.r(prepare, null);
            return o;
        } finally {
        }
    }

    public static final Set<String> readFtsColumns(SQLiteConnection sQLiteConnection, String str) {
        sQLiteConnection.getClass();
        str.getClass();
        ih2 ih2Var = new ih2();
        SQLiteStatement prepare = sQLiteConnection.prepare("PRAGMA table_info(`" + str + "`)");
        try {
            if (prepare.step()) {
                int columnIndexOf = SQLiteStatementUtil.columnIndexOf(prepare, HintConstants.AUTOFILL_HINT_NAME);
                do {
                    ih2Var.add(prepare.getText(columnIndexOf));
                } while (prepare.step());
            }
            jh2.r(prepare, null);
            return jh2.o(ih2Var);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                jh2.r(prepare, th);
                throw th2;
            }
        }
    }

    public static final Set<String> readFtsOptions(SQLiteConnection sQLiteConnection, String str) {
        sQLiteConnection.getClass();
        str.getClass();
        SQLiteStatement prepare = sQLiteConnection.prepare("SELECT * FROM sqlite_master WHERE `name` = '" + str + '\'');
        try {
            String text = prepare.step() ? prepare.getText(SQLiteStatementUtil.columnIndexOf(prepare, "sql")) : "";
            jh2.r(prepare, null);
            return parseFtsOptions(text);
        } finally {
        }
    }

    private static final TableInfo.Index readIndex(SQLiteConnection sQLiteConnection, String str, boolean z) {
        SQLiteStatement prepare = sQLiteConnection.prepare("PRAGMA index_xinfo(`" + str + "`)");
        try {
            int columnIndexOf = SQLiteStatementUtil.columnIndexOf(prepare, "seqno");
            int columnIndexOf2 = SQLiteStatementUtil.columnIndexOf(prepare, "cid");
            int columnIndexOf3 = SQLiteStatementUtil.columnIndexOf(prepare, HintConstants.AUTOFILL_HINT_NAME);
            int columnIndexOf4 = SQLiteStatementUtil.columnIndexOf(prepare, "desc");
            if (columnIndexOf != -1 && columnIndexOf2 != -1 && columnIndexOf3 != -1 && columnIndexOf4 != -1) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                while (prepare.step()) {
                    if (((int) prepare.getLong(columnIndexOf2)) >= 0) {
                        int i = (int) prepare.getLong(columnIndexOf);
                        String text = prepare.getText(columnIndexOf3);
                        String str2 = prepare.getLong(columnIndexOf4) > 0 ? "DESC" : "ASC";
                        linkedHashMap.put(Integer.valueOf(i), text);
                        linkedHashMap2.put(Integer.valueOf(i), str2);
                    }
                }
                List G0 = kw.G0(linkedHashMap.entrySet(), new Comparator() { // from class: androidx.room.util.SchemaInfoUtilKt$readIndex$lambda$13$$inlined$sortedBy$1
                    @Override // java.util.Comparator
                    public final int compare(T t, T t2) {
                        return ej1.k((Integer) ((Map.Entry) t).getKey(), (Integer) ((Map.Entry) t2).getKey());
                    }
                });
                ArrayList arrayList = new ArrayList(lw.Z(G0, 10));
                Iterator it = G0.iterator();
                while (it.hasNext()) {
                    arrayList.add((String) ((Map.Entry) it.next()).getValue());
                }
                List L0 = kw.L0(arrayList);
                List G02 = kw.G0(linkedHashMap2.entrySet(), new Comparator() { // from class: androidx.room.util.SchemaInfoUtilKt$readIndex$lambda$13$$inlined$sortedBy$2
                    @Override // java.util.Comparator
                    public final int compare(T t, T t2) {
                        return ej1.k((Integer) ((Map.Entry) t).getKey(), (Integer) ((Map.Entry) t2).getKey());
                    }
                });
                ArrayList arrayList2 = new ArrayList(lw.Z(G02, 10));
                Iterator it2 = G02.iterator();
                while (it2.hasNext()) {
                    arrayList2.add((String) ((Map.Entry) it2.next()).getValue());
                }
                TableInfo.Index index = new TableInfo.Index(str, z, L0, kw.L0(arrayList2));
                jh2.r(prepare, null);
                return index;
            }
            jh2.r(prepare, null);
            return null;
        } finally {
        }
    }

    private static final Set<TableInfo.Index> readIndices(SQLiteConnection sQLiteConnection, String str) {
        SQLiteStatement prepare = sQLiteConnection.prepare("PRAGMA index_list(`" + str + "`)");
        try {
            int columnIndexOf = SQLiteStatementUtil.columnIndexOf(prepare, HintConstants.AUTOFILL_HINT_NAME);
            int columnIndexOf2 = SQLiteStatementUtil.columnIndexOf(prepare, "origin");
            int columnIndexOf3 = SQLiteStatementUtil.columnIndexOf(prepare, "unique");
            if (columnIndexOf != -1 && columnIndexOf2 != -1 && columnIndexOf3 != -1) {
                ih2 ih2Var = new ih2();
                while (prepare.step()) {
                    if ("c".equals(prepare.getText(columnIndexOf2))) {
                        TableInfo.Index readIndex = readIndex(sQLiteConnection, prepare.getText(columnIndexOf), prepare.getLong(columnIndexOf3) == 1);
                        if (readIndex == null) {
                            jh2.r(prepare, null);
                            return null;
                        }
                        ih2Var.add(readIndex);
                    }
                }
                ih2 o = jh2.o(ih2Var);
                jh2.r(prepare, null);
                return o;
            }
            jh2.r(prepare, null);
            return null;
        } finally {
        }
    }

    public static final TableInfo readTableInfo(SQLiteConnection sQLiteConnection, String str) {
        sQLiteConnection.getClass();
        str.getClass();
        return new TableInfo(str, readColumns(sQLiteConnection, str), readForeignKeys(sQLiteConnection, str), readIndices(sQLiteConnection, str));
    }

    public static final ViewInfo readViewInfo(SQLiteConnection sQLiteConnection, String str) {
        sQLiteConnection.getClass();
        str.getClass();
        SQLiteStatement prepare = sQLiteConnection.prepare("SELECT name, sql FROM sqlite_master WHERE type = 'view' AND name = '" + str + '\'');
        try {
            ViewInfo viewInfo = prepare.step() ? new ViewInfo(prepare.getText(0), prepare.getText(1)) : new ViewInfo(str, null);
            jh2.r(prepare, null);
            return viewInfo;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                jh2.r(prepare, th);
                throw th2;
            }
        }
    }
}
