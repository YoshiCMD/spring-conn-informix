package com.codecmd.informix.domain;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "testtable", schema = "informix")
public class TestTable implements Serializable {

    @Id
    @SequenceGenerator(initialValue = 1, name = "ExampleSequence")
    @Column(name = "inf_id")
    private Integer id;

    @Column(name = "name")
    public String name;

    @Column(name = "description")
    public String description;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
