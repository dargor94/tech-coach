package org.gl.masera.techcoach.dto;

import lombok.Getter;
import lombok.Setter;
import org.springframework.util.ObjectUtils;

import java.util.List;

@Getter
@Setter
public class Door {

    private String material;
    private String color;
    private List<Window> windows;

    public static Door builder() {
        return new Door();
    }

    public Door material(String material) {
        this.material = material;
        return this;
    }

    public Door color(String color) {
        this.color = color;
        return this;
    }

    public Door windows(List<Window> windows) {
        if (!ObjectUtils.isEmpty(windows)) {
            this.windows = windows;
        }
        return this;
    }

    public Door build() {
        return this;
    }


}
