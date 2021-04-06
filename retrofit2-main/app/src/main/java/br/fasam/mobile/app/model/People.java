package br.fasam.mobile.app.model;

import java.util.ArrayList;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class People extends BasicModel{

    private String name;

    private String height;

    private String mass;

    private String hairColor;

    private String skinColor;

    private String eyeColor;

    private String birthYear;

    private String gender;

    private String homeworld;

    private List<String> films = new ArrayList<>();

    private List<String> species = new ArrayList<>();

    private List<String> vehicles = new ArrayList<>();

    private List<String> starships = new ArrayList<>();

    private String created;

    private String edited;

    private String url;

}