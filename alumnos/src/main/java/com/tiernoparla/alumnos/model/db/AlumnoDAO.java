package com.tiernoparla.alumnos.model.db;

import java.util.List;

import com.tiernoparla.alumnos.model.Alumno;

public interface AlumnoDAO {
    void insertar(Alumno alumno);
    List<Alumno> listar();
    public void matricular(Alumno a);
    public void desmatricular(Alumno a);
}

