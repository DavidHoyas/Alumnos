package com.tiernoparla.alumnos.service;

import com.tiernoparla.alumnos.model.Alumno;
import com.tiernoparla.alumnos.repository.AlumnoRepository;

import java.util.List;

public class AlumnoService {
    private final AlumnoRepository repository;

    public AlumnoService(AlumnoRepository repository) {
        this.repository = repository;
    }

    public void agregarAlumno(Alumno alumno) {
        repository.insertar(alumno);
    }

    public List<Alumno> obtenerAlumnos() {
        return repository.listar();
    }
}

