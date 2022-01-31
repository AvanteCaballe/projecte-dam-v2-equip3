package com.example.application.data.entity;

import com.example.application.data.AbstractEntity;
import com.example.application.data.repositories.ImatgeRepository;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.server.StreamResource;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

@Entity
public class Imatge extends AbstractEntity{

    @NotEmpty
    private String title = "";

    @NotEmpty
    private String author = "";

    @NotEmpty
    private String theme = "";

    @NotEmpty
    private byte[] imatge;

    public Imatge(String title, String author, String theme) {
        this.title = title;
        this.author = author;
        this.theme = theme;
    }

    public Imatge() {

    }



    public static byte[] getBytesFromFile(String imagePath) throws IOException {
        File file = new File(imagePath);
        return Files.readAllBytes(file.toPath());
    }

    public byte[] getSrc() {
        return imatge;
    }

    public void setSrc(byte[] src) {
        this.imatge = src;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }
}
