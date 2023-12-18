package org.gl.masera.techcoach.wrapper;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public abstract class ColorDecorator implements Color {

    private final Color color;

    @Override
    public void fillAtBackground() {
        color.fillAtBackground();
    }
}
