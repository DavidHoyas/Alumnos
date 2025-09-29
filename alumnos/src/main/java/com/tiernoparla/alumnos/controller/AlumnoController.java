package com.tiernoparla.alumnos.controller;

import com.tiernoparla.alumnos.model.Alumno;
import com.tiernoparla.alumnos.service.AlumnoService;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

public class AlumnoController {

    @FXML private TextField nombreField;
    @FXML private TextField apellidosField;
    @FXML private TextField edadField;
    @FXML private Button insertarButton;
    @FXML private Button listarButton;
    @FXML private ListView<String> listaAlumnos;

    private AlumnoService service;
    private final ObservableList<String> alumnosObservable = FXCollections.observableArrayList();

    public void setService(AlumnoService service) {
        this.service = service;
        listaAlumnos.setItems(alumnosObservable);
    }

    @FXML
    public void insertarAlumno() {
        String nombre = nombreField.getText().trim();
        String apellidos = apellidosField.getText().trim();
        String edadTexto = edadField.getText().trim();

        if (nombre.isEmpty() || apellidos.isEmpty() || edadTexto.isEmpty()) {
            mostrarAlerta("Error", "Todos los campos son obligatorios.");
            return;
        }

        try {
            int edad = Integer.parseInt(edadTexto);
            if (edad <= 0) {
                mostrarAlerta("Error", "La edad debe ser un número positivo.");
                return;
            }

            Alumno alumno = new Alumno(nombre, apellidos, edad);
            service.agregarAlumno(alumno);
            limpiarCampos();
            listarAlumnos();
        } catch (NumberFormatException e) {
            mostrarAlerta("Error", "La edad debe ser un número válido.");
        }
    }

    @FXML
    public void listarAlumnos() {
        alumnosObservable.clear();
        if (service != null) {
            service.obtenerAlumnos()
                    .forEach(a -> alumnosObservable.add(
                            a.getNombre() + " " + a.getApellidos() + " - " + a.getEdad()
                    ));
        }
    }

    private void limpiarCampos() {
        nombreField.clear();
        apellidosField.clear();
        edadField.clear();
    }

    private void mostrarAlerta(String titulo, String mensaje) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle(titulo);
        alert.setHeaderText(null);
        alert.setContentText(mensaje);
        alert.showAndWait();
    }
}
