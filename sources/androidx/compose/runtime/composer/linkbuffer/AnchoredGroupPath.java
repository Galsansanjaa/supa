package androidx.compose.runtime.composer.linkbuffer;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
final class AnchoredGroupPath extends SourceInformationGroupPath {
    private final int group;

    public AnchoredGroupPath(int i) {
        super(null);
        this.group = i;
    }

    public boolean equals(Object obj) {
        return (obj instanceof AnchoredGroupPath) && ((AnchoredGroupPath) obj).group == this.group;
    }

    public final int getGroup() {
        return this.group;
    }

    @Override // androidx.compose.runtime.composer.linkbuffer.SourceInformationGroupPath
    public Object getIdentity(SlotTableAddressSpace slotTableAddressSpace) {
        return slotTableAddressSpace.anchorOfAddress(this.group);
    }

    public int hashCode() {
        return this.group * 31;
    }
}
