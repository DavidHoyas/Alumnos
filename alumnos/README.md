# Ejercicio de pruebas


## Introducción
Aplicación de escritorio en **JavaFX** para gestionar alumnos (nombre, apellidos, edad).  
Permite **insertar**, **matricular**, **desmatricular** y **listar** alumnos.

---

## Tecnologías
- Java 17+  
- JavaFX 21.0.2  
- Maven  
- Lombok  
- JUnit 5 + Mockito  

---

## Estructura principal
- `App.java` → punto de entrada JavaFX  
- `controller/AlumnoController.java` → gestiona la interfaz  
- `model/Alumno.java` → entidad con Lombok  
- `model/db/AlumnoDAO.java` y `AlumnoDAOImp.java` → capa de acceso a datos  
- `service/AlumnoService.java` → lógica de negocio  
- `resources/fxml/main.fxml` → interfaz gráfica  
- `test/java/dao/AlumnoDAOImpTest.java` → comprueba la inserción y recuperación de alumnos

---

## Repositorio
GitHub, clonar repositorio:  
   ```bash
   git clone https://github.com/DavidHoyas/Alumnos [nombre_de_la_carpeta]
