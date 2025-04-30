package com.nqh.mylibrary;

import android.content.Context;
import android.widget.Toast;

/**
 * A utility class for displaying Toast messages.
 */
public class ToastUtil {

    /**
     * Displays a short duration Toast message.
     *
     * @param context the context to use
     * @param message the message to display
     */
    public static void showShort(Context context, String message) {
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show();
    }
}