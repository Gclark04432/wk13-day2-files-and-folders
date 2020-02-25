package com.codeclan.example.filesandfolders.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.sun.tools.javah.Gen;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = " folders")
public class Folder {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String title;

    @JsonIgnoreProperties("folders")
    @OneToMany
    private List<File> files;

    public Folder(String title) {
        this.title = title;
        files = new ArrayList<>();
    }

    public Folder() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
