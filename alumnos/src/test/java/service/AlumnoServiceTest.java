package service;

import com.tiernoparla.alumnos.model.Alumno;
import com.tiernoparla.alumnos.repository.AlumnoRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class AlumnoServiceTest {

    private AlumnoRepository repository;
    private AlumnoService service;

    @BeforeEach
    void setUp() {
        repository = mock(AlumnoRepository.class);
        service = new AlumnoService(repository);
    }

    @Test
    void agregarAlumnoTest() {
        Alumno alumno = new Alumno("Juan", "Pérez", 20);
        service.agregarAlumno(alumno);
        verify(repository, times(1)).insertar(alumno);
    }

    @Test
    void obtenerAlumnosTest() {
        List<Alumno> alumnos = List.of(new Alumno("Ana", "García", 22));
        when(repository.listar()).thenReturn(alumnos);
        assertEquals(alumnos, service.obtenerAlumnos());
    }
}

