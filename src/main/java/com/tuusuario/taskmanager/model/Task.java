package com.tuusuario.taskmaster.model;  // Esto indica que la clase Task está en el paquete model

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity  // Marca esta clase como una entidad de la base de datos
public class Task {

    @Id  // Indica que esta propiedad será la clave primaria
    @GeneratedValue(strategy = GenerationType.IDENTITY)  // Generación automática del valor de la ID
    private Long id;
    private String title;
    private String description;
    private boolean completed;

    // Getters y Setters (métodos para acceder y modificar los atributos)

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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }
}
