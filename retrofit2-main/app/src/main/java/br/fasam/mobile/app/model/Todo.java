package br.fasam.mobile.app.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Todo {

    private Integer userId;
    private Integer id;
    private String title;
    private boolean completed;

}
