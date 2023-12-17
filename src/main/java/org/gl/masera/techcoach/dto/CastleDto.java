package org.gl.masera.techcoach.dto;

import lombok.Getter;
import lombok.Setter;
import org.springframework.util.ObjectUtils;

import java.util.List;

@Getter
@Setter
public class CastleDto {

    private List<Door> doors;
    private List<Wall> walls;
    private List<Tower> towers;

    public static CastleDto builder() {
        return new CastleDto();
    }

    public CastleDto build() {
        return this;
    }

    public CastleDto doors(List<Door> doors) {
        if (!ObjectUtils.isEmpty(doors)) {
            this.doors = doors;
        }
        return this;
    }

    public CastleDto walls(List<Wall> walls) {
        if (!ObjectUtils.isEmpty(walls)) {
            this.walls = walls;
        }
        return this;
    }

    public CastleDto towers(List<Tower> towers) {
        if (!ObjectUtils.isEmpty(towers)) {
            this.towers = towers;
        }
        return this;
    }

}
