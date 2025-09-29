package com.tiernoparla.alumnos.service;

import java.util.List;

import com.tiernoparla.alumnos.model.Alumno;
import com.tiernoparla.alumnos.model.db.AlumnoDAO;

public class AlumnoService {
    private final AlumnoDAO dao;

    public AlumnoService(AlumnoDAO dao) {
        this.dao = dao;
    }

    public void agregarAlumno(Alumno alumno) {
        dao.insertar(alumno);
    }

    public List<Alumno> obtenerAlumnos() {
        return dao.listar();
    }
}
