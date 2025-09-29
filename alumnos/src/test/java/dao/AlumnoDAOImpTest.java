package dao;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.tiernoparla.alumnos.model.Alumno;
import com.tiernoparla.alumnos.model.db.AlumnoDAO;
import com.tiernoparla.alumnos.model.db.AlumnoDAOImp;

class AlumnoDAOImpTest {

    private AlumnoDAO dao;

    @BeforeEach
    void setUp() {
        dao = new AlumnoDAOImp();
    }

    @Test
    void insertarAlumnoDeberiaGuardarlo() {
        Alumno alumno = new Alumno("David", "Hoyas", 19);

        dao.insertar(alumno);
        List<Alumno> resultado = dao.listar();

        assertEquals(1, resultado.size());
        assertEquals("David", resultado.get(0).getNombre());
    }

    @Test
    void listarDeberiaDevolverListaVaciaSiNoHayAlumnos() {
        List<Alumno> resultado = dao.listar();

        assertTrue(resultado.isEmpty());
    }
}
