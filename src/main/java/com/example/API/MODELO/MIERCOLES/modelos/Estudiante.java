package com.example.API.MODELO.MIERCOLES.modelos;

import com.example.API.MODELO.MIERCOLES.ayudas.EstadosUsuario;
import com.example.API.MODELO.MIERCOLES.ayudas.RolesUsuario;
import jakarta.persistence.*;

import javax.annotation.processing.Generated;
import java.time.LocalDate;

@Entity
@Table(name = "estudiantes")
public class Estudiante {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "promedio", nullable = false, unique = false)
    private Double promedio;


    @Column(name = "fechaNacimiento", nullable = true, unique = false)
    private LocalDate fechaNacimiento;


    public Estudiante() {
    }


    public Estudiante(Integer id, Double promedio, LocalDate fechaNacimiento) {
        this.id = id;
        this.promedio = promedio;
        this.fechaNacimiento = fechaNacimiento;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getPromedio() {
        return promedio;
    }

    public void setPromedio(Double promedio) {
        this.promedio = promedio;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }




}