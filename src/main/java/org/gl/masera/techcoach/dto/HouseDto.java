package org.gl.masera.techcoach.dto;

import lombok.Getter;
import lombok.Setter;
import org.springframework.util.ObjectUtils;

import java.util.List;

@Getter
@Setter
public class HouseDto {

    private List<Door> doors;
    private List<Wall> walls;


    public static HouseDto builder() {
        return new HouseDto();
    }

    public HouseDto build() {
        return this;
    }

    public HouseDto doors(List<Door> doors) {
        if (!ObjectUtils.isEmpty(doors)) {
            this.doors = doors;
        }
        return this;
    }

    public HouseDto walls(List<Wall> walls) {
        if (!ObjectUtils.isEmpty(walls)) {
            this.walls = walls;
        }
        return this;
    }

}
