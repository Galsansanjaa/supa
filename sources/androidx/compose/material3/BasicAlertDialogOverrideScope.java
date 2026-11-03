package androidx.compose.material3;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.window.DialogProperties;
import defpackage.os0;
import defpackage.sb0;
import defpackage.ts0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class BasicAlertDialogOverrideScope {
    public static final int $stable = 0;
    private final ts0 content;
    private final Modifier modifier;
    private final os0 onDismissRequest;
    private final DialogProperties properties;

    public BasicAlertDialogOverrideScope(os0 os0Var, Modifier modifier, DialogProperties dialogProperties, ts0 ts0Var) {
        this.onDismissRequest = os0Var;
        this.modifier = modifier;
        this.properties = dialogProperties;
        this.content = ts0Var;
    }

    public /* synthetic */ BasicAlertDialogOverrideScope(os0 os0Var, Modifier modifier, DialogProperties dialogProperties, ts0 ts0Var, int i, sb0 sb0Var) {
        this(os0Var, (i & 2) != 0 ? Modifier.Companion : modifier, (i & 4) != 0 ? new DialogProperties(false, false, false, 7, (sb0) null) : dialogProperties, ts0Var);
    }

    public final ts0 getContent() {
        return this.content;
    }

    public final Modifier getModifier() {
        return this.modifier;
    }

    public final os0 getOnDismissRequest() {
        return this.onDismissRequest;
    }

    public final DialogProperties getProperties() {
        return this.properties;
    }
}
