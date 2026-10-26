package com.miempresa.mifpsgame;

import com.jme3.app.SimpleApplication;
import com.jme3.light.AmbientLight;
import com.jme3.light.DirectionalLight;
import com.jme3.math.ColorRGBA;
import com.jme3.math.Vector3f;
import com.jme3.bullet.BulletAppState;

public class FPSGame extends SimpleApplication {
    private BulletAppState bulletAppState;

    @Override
    public void simpleInitApp() {
        // Inicializar motor de físicas
        bulletAppState = new BulletAppState();
        stateManager.attach(bulletAppState);

        // Configurar iluminación básica
        setupLighting();
    }

    @Override
    public void simpleUpdate(float tpf) {
        // Lógica del juego por fotograma
    }

    private void setupLighting() {
        AmbientLight ambient = new AmbientLight();
        ambient.setColor(ColorRGBA.White.mult(0.3f));
        rootNode.addLight(ambient);

        DirectionalLight sun = new DirectionalLight();
        sun.setDirection(new Vector3f(-0.5f, -1f, -0.5f).normalizeLocal());
        sun.setColor(ColorRGBA.White);
        rootNode.addLight(sun);
    }
}
