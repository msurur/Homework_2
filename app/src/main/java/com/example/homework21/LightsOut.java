package com.example.homework21;

public class LightsOut {
    private boolean[][] lights;

    public LightsOut() {
        lights = new boolean[5][5]; // Initialize a 5x5 grid of lights
    }

    public void toggleLights(int row, int col) {
        // Toggle the state of the light at the specified row and column and adjacent lights
        lights[row][col] = !lights[row][col];

    }

    public boolean isWin() {
        // Check if all lights are turned off
        for (boolean[] row : lights) {
            for (boolean light : row) {
                if (light) {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean isLightOn(int row, int col) {
        return lights[row][col];
    }
}
