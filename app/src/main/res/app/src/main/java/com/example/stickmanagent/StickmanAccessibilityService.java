package com.example.stickmanagent;

import android.accessibilityservice.AccessibilityService;
import android.view.accessibility.AccessibilityEvent;

public class StickmanAccessibilityService extends AccessibilityService {
    @Override
    public void onAccessibilityEvent(AccessibilityEvent event) {
        // Dito natin hahawakan ang screen events mamaya
    }

    @Override
    public void onInterrupt() {
        // Tinatawag kapag na-interrupt ang service
    }
}
