package com.example.vrapk;

import android.app.Activity;
import android.os.Bundle;
import android.opengl.GLSurfaceView;
import com.google.vr.ndk.base.AndroidCompat;

public class MainActivity extends Activity {
    private GLSurfaceView glSurfaceView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        AndroidCompat.setVrModeEnabled(this, true);
        glSurfaceView = new GLSurfaceView(this);
        glSurfaceView.setRenderer(new VRRenderer());
        setContentView(glSurfaceView);
    }

    @Override
    protected void onPause() {
        super.onPause();
        glSurfaceView.onPause();
    }

    @Override
    protected void onResume() {
        super.onResume();
        glSurfaceView.onResume();
    }
}