package com.tiernoparla.alumnos.repository;

import com.tiernoparla.alumnos.model.Alumno;
import java.util.ArrayList;
import java.util.List;

public class AlumnoRepository {
    private final List<Alumno> alumnos = new ArrayList<>();

    public void insertar(Alumno alumno) {
        alumnos.add(alumno);
    }

    public List<Alumno> listar() {
        return new ArrayList<>(alumnos);
    }
}
