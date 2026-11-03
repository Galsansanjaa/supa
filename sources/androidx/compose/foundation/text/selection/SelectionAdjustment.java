package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.StringHelpersKt;
import androidx.compose.foundation.text.selection.Selection;
import androidx.compose.foundation.text.selection.SelectionAdjustment;
import androidx.compose.foundation.text.selection.SelectionLayout;
import defpackage.jh2;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public interface SelectionAdjustment {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes.dex */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final SelectionAdjustment Character;
        private static final SelectionAdjustment CharacterWithWordAccelerate;
        private static final SelectionAdjustment None;
        private static final SelectionAdjustment Paragraph;
        private static final SelectionAdjustment Word;

        static {
            final int i = 0;
            None = new SelectionAdjustment() { // from class: re2
                @Override // androidx.compose.foundation.text.selection.SelectionAdjustment
                public final Selection adjust(SelectionLayout selectionLayout) {
                    Selection None$lambda$0;
                    Selection Character$lambda$0;
                    Selection Word$lambda$0;
                    Selection Paragraph$lambda$0;
                    Selection CharacterWithWordAccelerate$lambda$0;
                    switch (i) {
                        case 0:
                            None$lambda$0 = SelectionAdjustment.Companion.None$lambda$0(selectionLayout);
                            return None$lambda$0;
                        case 1:
                            Character$lambda$0 = SelectionAdjustment.Companion.Character$lambda$0(selectionLayout);
                            return Character$lambda$0;
                        case 2:
                            Word$lambda$0 = SelectionAdjustment.Companion.Word$lambda$0(selectionLayout);
                            return Word$lambda$0;
                        case 3:
                            Paragraph$lambda$0 = SelectionAdjustment.Companion.Paragraph$lambda$0(selectionLayout);
                            return Paragraph$lambda$0;
                        default:
                            CharacterWithWordAccelerate$lambda$0 = SelectionAdjustment.Companion.CharacterWithWordAccelerate$lambda$0(selectionLayout);
                            return CharacterWithWordAccelerate$lambda$0;
                    }
                }
            };
            final int i2 = 1;
            Character = new SelectionAdjustment() { // from class: re2
                @Override // androidx.compose.foundation.text.selection.SelectionAdjustment
                public final Selection adjust(SelectionLayout selectionLayout) {
                    Selection None$lambda$0;
                    Selection Character$lambda$0;
                    Selection Word$lambda$0;
                    Selection Paragraph$lambda$0;
                    Selection CharacterWithWordAccelerate$lambda$0;
                    switch (i2) {
                        case 0:
                            None$lambda$0 = SelectionAdjustment.Companion.None$lambda$0(selectionLayout);
                            return None$lambda$0;
                        case 1:
                            Character$lambda$0 = SelectionAdjustment.Companion.Character$lambda$0(selectionLayout);
                            return Character$lambda$0;
                        case 2:
                            Word$lambda$0 = SelectionAdjustment.Companion.Word$lambda$0(selectionLayout);
                            return Word$lambda$0;
                        case 3:
                            Paragraph$lambda$0 = SelectionAdjustment.Companion.Paragraph$lambda$0(selectionLayout);
                            return Paragraph$lambda$0;
                        default:
                            CharacterWithWordAccelerate$lambda$0 = SelectionAdjustment.Companion.CharacterWithWordAccelerate$lambda$0(selectionLayout);
                            return CharacterWithWordAccelerate$lambda$0;
                    }
                }
            };
            final int i3 = 2;
            Word = new SelectionAdjustment() { // from class: re2
                @Override // androidx.compose.foundation.text.selection.SelectionAdjustment
                public final Selection adjust(SelectionLayout selectionLayout) {
                    Selection None$lambda$0;
                    Selection Character$lambda$0;
                    Selection Word$lambda$0;
                    Selection Paragraph$lambda$0;
                    Selection CharacterWithWordAccelerate$lambda$0;
                    switch (i3) {
                        case 0:
                            None$lambda$0 = SelectionAdjustment.Companion.None$lambda$0(selectionLayout);
                            return None$lambda$0;
                        case 1:
                            Character$lambda$0 = SelectionAdjustment.Companion.Character$lambda$0(selectionLayout);
                            return Character$lambda$0;
                        case 2:
                            Word$lambda$0 = SelectionAdjustment.Companion.Word$lambda$0(selectionLayout);
                            return Word$lambda$0;
                        case 3:
                            Paragraph$lambda$0 = SelectionAdjustment.Companion.Paragraph$lambda$0(selectionLayout);
                            return Paragraph$lambda$0;
                        default:
                            CharacterWithWordAccelerate$lambda$0 = SelectionAdjustment.Companion.CharacterWithWordAccelerate$lambda$0(selectionLayout);
                            return CharacterWithWordAccelerate$lambda$0;
                    }
                }
            };
            final int i4 = 3;
            Paragraph = new SelectionAdjustment() { // from class: re2
                @Override // androidx.compose.foundation.text.selection.SelectionAdjustment
                public final Selection adjust(SelectionLayout selectionLayout) {
                    Selection None$lambda$0;
                    Selection Character$lambda$0;
                    Selection Word$lambda$0;
                    Selection Paragraph$lambda$0;
                    Selection CharacterWithWordAccelerate$lambda$0;
                    switch (i4) {
                        case 0:
                            None$lambda$0 = SelectionAdjustment.Companion.None$lambda$0(selectionLayout);
                            return None$lambda$0;
                        case 1:
                            Character$lambda$0 = SelectionAdjustment.Companion.Character$lambda$0(selectionLayout);
                            return Character$lambda$0;
                        case 2:
                            Word$lambda$0 = SelectionAdjustment.Companion.Word$lambda$0(selectionLayout);
                            return Word$lambda$0;
                        case 3:
                            Paragraph$lambda$0 = SelectionAdjustment.Companion.Paragraph$lambda$0(selectionLayout);
                            return Paragraph$lambda$0;
                        default:
                            CharacterWithWordAccelerate$lambda$0 = SelectionAdjustment.Companion.CharacterWithWordAccelerate$lambda$0(selectionLayout);
                            return CharacterWithWordAccelerate$lambda$0;
                    }
                }
            };
            final int i5 = 4;
            CharacterWithWordAccelerate = new SelectionAdjustment() { // from class: re2
                @Override // androidx.compose.foundation.text.selection.SelectionAdjustment
                public final Selection adjust(SelectionLayout selectionLayout) {
                    Selection None$lambda$0;
                    Selection Character$lambda$0;
                    Selection Word$lambda$0;
                    Selection Paragraph$lambda$0;
                    Selection CharacterWithWordAccelerate$lambda$0;
                    switch (i5) {
                        case 0:
                            None$lambda$0 = SelectionAdjustment.Companion.None$lambda$0(selectionLayout);
                            return None$lambda$0;
                        case 1:
                            Character$lambda$0 = SelectionAdjustment.Companion.Character$lambda$0(selectionLayout);
                            return Character$lambda$0;
                        case 2:
                            Word$lambda$0 = SelectionAdjustment.Companion.Word$lambda$0(selectionLayout);
                            return Word$lambda$0;
                        case 3:
                            Paragraph$lambda$0 = SelectionAdjustment.Companion.Paragraph$lambda$0(selectionLayout);
                            return Paragraph$lambda$0;
                        default:
                            CharacterWithWordAccelerate$lambda$0 = SelectionAdjustment.Companion.CharacterWithWordAccelerate$lambda$0(selectionLayout);
                            return CharacterWithWordAccelerate$lambda$0;
                    }
                }
            };
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Selection Character$lambda$0(SelectionLayout selectionLayout) {
            return SelectionAdjustmentKt.ensureAtLeastOneChar(None.adjust(selectionLayout), selectionLayout);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Selection CharacterWithWordAccelerate$lambda$0(SelectionLayout selectionLayout) {
            Selection.AnchorInfo end;
            Selection.AnchorInfo access$updateSelectionBoundary;
            Selection.AnchorInfo start;
            Selection.AnchorInfo anchorInfo;
            Selection previousSelection = selectionLayout.getPreviousSelection();
            if (previousSelection == null) {
                return Word.adjust(selectionLayout);
            }
            if (selectionLayout.isStartHandle()) {
                end = previousSelection.getStart();
                access$updateSelectionBoundary = SelectionAdjustmentKt.access$updateSelectionBoundary(selectionLayout, selectionLayout.getStartInfo(), end);
                anchorInfo = previousSelection.getEnd();
                start = access$updateSelectionBoundary;
            } else {
                end = previousSelection.getEnd();
                access$updateSelectionBoundary = SelectionAdjustmentKt.access$updateSelectionBoundary(selectionLayout, selectionLayout.getEndInfo(), end);
                start = previousSelection.getStart();
                anchorInfo = access$updateSelectionBoundary;
            }
            if (jh2.k(access$updateSelectionBoundary, end)) {
                return previousSelection;
            }
            return SelectionAdjustmentKt.ensureAtLeastOneChar(new Selection(start, anchorInfo, selectionLayout.getCrossStatus() == CrossStatus.CROSSED || (selectionLayout.getCrossStatus() == CrossStatus.COLLAPSED && start.getOffset() > anchorInfo.getOffset())), selectionLayout);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Selection None$lambda$0(SelectionLayout selectionLayout) {
            return new Selection(selectionLayout.getStartInfo().anchorForOffset(selectionLayout.getStartInfo().getRawStartHandleOffset()), selectionLayout.getEndInfo().anchorForOffset(selectionLayout.getEndInfo().getRawEndHandleOffset()), selectionLayout.getCrossStatus() == CrossStatus.CROSSED);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Selection Paragraph$lambda$0(SelectionLayout selectionLayout) {
            return SelectionAdjustmentKt.access$adjustToBoundaries(selectionLayout, new BoundaryFunction() { // from class: androidx.compose.foundation.text.selection.SelectionAdjustment$Companion$Paragraph$1$1
                @Override // androidx.compose.foundation.text.selection.BoundaryFunction
                /* renamed from: getBoundary-fzxv0v0 */
                public final long mo2106getBoundaryfzxv0v0(SelectableInfo selectableInfo, int i) {
                    return StringHelpersKt.getParagraphBoundary(selectableInfo.getInputText(), i);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Selection Word$lambda$0(SelectionLayout selectionLayout) {
            return SelectionAdjustmentKt.access$adjustToBoundaries(selectionLayout, new BoundaryFunction() { // from class: androidx.compose.foundation.text.selection.SelectionAdjustment$Companion$Word$1$1
                @Override // androidx.compose.foundation.text.selection.BoundaryFunction
                /* renamed from: getBoundary-fzxv0v0 */
                public final long mo2106getBoundaryfzxv0v0(SelectableInfo selectableInfo, int i) {
                    return selectableInfo.getTextLayoutResult().m7458getWordBoundaryjx7JFs(i);
                }
            });
        }

        public final SelectionAdjustment getCharacter() {
            return Character;
        }

        public final SelectionAdjustment getCharacterWithWordAccelerate() {
            return CharacterWithWordAccelerate;
        }

        public final SelectionAdjustment getNone() {
            return None;
        }

        public final SelectionAdjustment getParagraph() {
            return Paragraph;
        }

        public final SelectionAdjustment getWord() {
            return Word;
        }
    }

    Selection adjust(SelectionLayout selectionLayout);
}
