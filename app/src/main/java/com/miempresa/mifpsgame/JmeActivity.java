package com.miempresa.mifpsgame;

import android.os.Bundle;
import com.jme3.system.android.AndroidHarness;

public class JmeActivity extends AndroidHarness {

    public JmeActivity() {
        // Configuración inicial de jMonkeyEngine para Android
        eglStencilBits = 0;
        screenFullScreen = true;
        mouseEventsEnabled = true;

        // Asignamos la clase principal del juego
        appClass = FPSGame.class.getName();
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
}