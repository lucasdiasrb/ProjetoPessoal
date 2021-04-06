package br.fasam.mobile.app.model;

import lombok.Data;

@Data
public class Photos {

    private Integer albumId;
    private Integer id;
    private String title;
    private String url;
    private String thumbnailUl;
}
