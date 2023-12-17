package org.gl.masera.techcoach.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Window {

    private String quality;

    public static Window builder() {
        return new Window();
    }

    public Window quality(String quality) {
        this.quality = quality;
        return this;
    }

    public Window build() {
        return this;
    }

}
