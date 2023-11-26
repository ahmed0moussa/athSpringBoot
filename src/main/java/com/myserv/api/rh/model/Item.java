package com.myserv.api.rh.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import nonapi.io.github.classgraph.json.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@Document()
@Setter
@Getter
public class Item {
    @Id
    private String id ;
    private String label;
    private String link;
    private List<SubItems> subItems;
    private boolean active= false;
}
