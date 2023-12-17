package org.gl.masera.techcoach.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Wall {

    private String material;

    public static Wall builder() {
        return new Wall();
    }

    public Wall material(String material) {
        this.material = material;
        return this;
    }

    public Wall build() {
        return this;
    }

}
