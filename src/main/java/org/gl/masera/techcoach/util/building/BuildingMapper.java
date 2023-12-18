package org.gl.masera.techcoach.util.building;

import org.gl.masera.techcoach.dto.*;

import java.util.Collections;
import java.util.List;

public class BuildingMapper {

    private BuildingMapper() {

    }

    public static CastleDto toCastleDto() {
        return CastleDto.builder()
                .doors(toDoors())
                .walls(toWalls())
                .towers(toTowers())
                .build();
    }

    public static HouseDto toHouseDto() {
        return HouseDto.builder()
                .doors(toDoors())
                .walls(toWalls())
                .build();
    }

    private static List<Wall> toWalls() {
        return Collections.singletonList(
                Wall.builder()
                        .material("material")
                        .build()
        );
    }

    private static List<Door> toDoors() {
        return Collections.singletonList(
                Door.builder()
                        .material("material")
                        .color("color")
                        .windows(toWindows())
                        .build()
        );
    }

    private static List<Window> toWindows() {
        return Collections.singletonList(
                Window.builder()
                        .quality("quality")
                        .build()
        );
    }


    private static List<Tower> toTowers() {
        return Collections.singletonList(
                Tower.builder()
                        .beaconsQuantity(1)
                        .build()
        );
    }

}
