package com.tiernoparla.alumnos.model.db;

import java.util.ArrayList;
import java.util.List;

import com.tiernoparla.alumnos.model.Alumno;

public class AlumnoDAOImp implements AlumnoDAO {
    private final List<Alumno> alumnos = new ArrayList<>();

    @Override
    public void insertar(Alumno alumno) {
        alumnos.add(alumno);
    }

    @Override
    public List<Alumno> listar() {
        return new ArrayList<>(alumnos);
    }

    @Override
    public void matricular(Alumno a) {
        throw new UnsupportedOperationException("Unimplemented method 'matricular'");
    }

    @Override
    public void desmatricular(Alumno a) {
        throw new UnsupportedOperationException("Unimplemented method 'desmatricular'");
    }
}

