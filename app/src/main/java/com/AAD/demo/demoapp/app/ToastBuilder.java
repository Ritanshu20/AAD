package com.AAD.demo.demoapp.app;

import android.content.Context;
import android.widget.Toast;

public class ToastBuilder {
    public static void build(Context context, String message) {
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show();
    }
}
