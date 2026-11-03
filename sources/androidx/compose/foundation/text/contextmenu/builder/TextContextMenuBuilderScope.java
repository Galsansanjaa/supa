package androidx.compose.foundation.text.contextmenu.builder;

import androidx.collection.MutableObjectList;
import androidx.compose.foundation.text.contextmenu.data.TextContextMenuComponent;
import androidx.compose.foundation.text.contextmenu.data.TextContextMenuData;
import androidx.compose.foundation.text.contextmenu.data.TextContextMenuSeparator;
import defpackage.ps0;
import defpackage.sb0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class TextContextMenuBuilderScope {
    public static final int $stable = 8;
    private final MutableObjectList<TextContextMenuComponent> components;
    private final MutableObjectList<ps0> filters;

    public TextContextMenuBuilderScope() {
        int i = 0;
        int i2 = 1;
        sb0 sb0Var = null;
        this.components = new MutableObjectList<>(i, i2, sb0Var);
        this.filters = new MutableObjectList<>(i, i2, sb0Var);
    }

    public final void addComponent$foundation(TextContextMenuComponent textContextMenuComponent) {
        this.components.add(textContextMenuComponent);
    }

    public final void addFilter$foundation(ps0 ps0Var) {
        this.filters.add(ps0Var);
    }

    public final TextContextMenuData build$foundation() {
        MutableObjectList mutableObjectList = new MutableObjectList(0, 1, false ? 1 : 0);
        MutableObjectList<TextContextMenuComponent> mutableObjectList2 = this.components;
        Object[] objArr = mutableObjectList2.content;
        int i = mutableObjectList2._size;
        int i2 = 0;
        boolean z = true;
        TextContextMenuComponent textContextMenuComponent = null;
        while (i2 < i) {
            TextContextMenuComponent textContextMenuComponent2 = (TextContextMenuComponent) objArr[i2];
            if (!z || textContextMenuComponent2 != TextContextMenuSeparator.INSTANCE) {
                if (!TextContextMenuBuilderScopeKt.isSeparator(textContextMenuComponent2) || !TextContextMenuBuilderScopeKt.isSeparator(textContextMenuComponent)) {
                    if (!TextContextMenuBuilderScopeKt.isSeparator(textContextMenuComponent2)) {
                        MutableObjectList<ps0> mutableObjectList3 = this.filters;
                        Object[] objArr2 = mutableObjectList3.content;
                        int i3 = mutableObjectList3._size;
                        for (int i4 = 0; i4 < i3; i4++) {
                            if (((Boolean) ((ps0) objArr2[i4]).invoke(textContextMenuComponent2)).booleanValue()) {
                            }
                        }
                    }
                    mutableObjectList.add(textContextMenuComponent2);
                    z = false;
                    textContextMenuComponent = textContextMenuComponent2;
                }
                z = false;
                break;
            }
            i2++;
            z = z;
        }
        if (TextContextMenuBuilderScopeKt.isSeparator((TextContextMenuComponent) (mutableObjectList.isEmpty() ? null : mutableObjectList.content[mutableObjectList._size - 1]))) {
            mutableObjectList.removeAt(mutableObjectList._size - 1);
        }
        return new TextContextMenuData(mutableObjectList.asList());
    }

    public final void separator() {
        this.components.add(TextContextMenuSeparator.INSTANCE);
    }
}
