package com.google.android.material.animation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import androidx.dynamicanimation.animation.DynamicAnimation;
import androidx.dynamicanimation.animation.SpringAnimation;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public class AnimationCoordinator {
    private final List<Animator> durationAnimations = new ArrayList();
    private final List<DynamicAnimation<?>> dynamicAnimations = new ArrayList();
    private final List<Listener> listeners = new ArrayList();
    private int animationsRunning = 0;
    private boolean started = false;

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes4.dex */
    public interface Listener {
        void onAnimationsEnd();

        void onAnimationsStart();
    }

    private void notifyAnimationsEnd() {
        Iterator<Listener> it = this.listeners.iterator();
        while (it.hasNext()) {
            it.next().onAnimationsEnd();
        }
        this.started = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onAnimationFinished() {
        int i = this.animationsRunning - 1;
        this.animationsRunning = i;
        if (i == 0) {
            notifyAnimationsEnd();
        }
    }

    public void addAnimator(Animator animator) {
        this.durationAnimations.add(animator);
    }

    public void addDynamicAnimation(DynamicAnimation<?> dynamicAnimation) {
        this.dynamicAnimations.add(dynamicAnimation);
    }

    public void addListener(Listener listener) {
        this.listeners.add(listener);
    }

    public void clear() {
        ArrayList arrayList = new ArrayList(this.durationAnimations);
        this.durationAnimations.clear();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((Animator) obj).end();
        }
        ArrayList arrayList2 = new ArrayList(this.dynamicAnimations);
        this.dynamicAnimations.clear();
        int size2 = arrayList2.size();
        int i2 = 0;
        while (i2 < size2) {
            Object obj2 = arrayList2.get(i2);
            i2++;
            DynamicAnimation dynamicAnimation = (DynamicAnimation) obj2;
            if (dynamicAnimation instanceof SpringAnimation) {
                SpringAnimation springAnimation = (SpringAnimation) dynamicAnimation;
                if (springAnimation.canSkipToEnd()) {
                    springAnimation.skipToEnd();
                } else {
                    springAnimation.cancel();
                }
            } else {
                dynamicAnimation.cancel();
            }
        }
        this.listeners.clear();
        this.animationsRunning = 0;
        this.started = false;
    }

    public void removeListener(Listener listener) {
        this.listeners.remove(listener);
    }

    public void start() {
        if (this.started) {
            return;
        }
        this.started = true;
        Iterator<Listener> it = this.listeners.iterator();
        while (it.hasNext()) {
            it.next().onAnimationsStart();
        }
        this.animationsRunning = this.dynamicAnimations.size();
        if (!this.durationAnimations.isEmpty()) {
            this.animationsRunning++;
        }
        if (this.animationsRunning == 0) {
            notifyAnimationsEnd();
            return;
        }
        DynamicAnimation.OnAnimationEndListener onAnimationEndListener = new DynamicAnimation.OnAnimationEndListener() { // from class: com.google.android.material.animation.AnimationCoordinator.1
            @Override // androidx.dynamicanimation.animation.DynamicAnimation.OnAnimationEndListener
            public void onAnimationEnd(DynamicAnimation dynamicAnimation, boolean z, float f, float f2) {
                dynamicAnimation.removeEndListener(this);
                AnimationCoordinator.this.onAnimationFinished();
            }
        };
        for (DynamicAnimation<?> dynamicAnimation : this.dynamicAnimations) {
            dynamicAnimation.addEndListener(onAnimationEndListener);
            dynamicAnimation.start();
        }
        if (this.durationAnimations.isEmpty()) {
            return;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        AnimatorSetCompat.playTogether(animatorSet, new ArrayList(this.durationAnimations));
        animatorSet.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.animation.AnimationCoordinator.2
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                AnimationCoordinator.this.onAnimationFinished();
            }
        });
        animatorSet.start();
    }
}
