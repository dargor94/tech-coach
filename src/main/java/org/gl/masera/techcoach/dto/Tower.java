package org.gl.masera.techcoach.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Tower {

    private int beaconsQuantity;

    public static Tower builder() {
        return new Tower();
    }

    public Tower beaconsQuantity(int beaconsQuantity) {
        this.beaconsQuantity = beaconsQuantity;
        return this;
    }

    public Tower build() {
        return this;
    }
}
