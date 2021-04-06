package br.fasam.mobile.app.model;

import java.util.ArrayList;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Planet extends BasicModel {

    private String name;

    private String rotationPeriod;

    private String orbitalPeriod;

    private String diameter;

    private String climate;

    private String gravity;

    private String terrain;

    private String surfaceWater;

    private String population;

    private List<String> residents = new ArrayList<>();

    private List<String> films = new ArrayList<>();

    private String created;

    private String edited;

    private String url;
}
