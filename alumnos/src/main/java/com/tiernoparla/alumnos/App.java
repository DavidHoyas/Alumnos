package com.tiernoparla.alumnos;

import com.tiernoparla.alumnos.controller.AlumnoController;
import com.tiernoparla.alumnos.repository.AlumnoRepository;
import com.tiernoparla.alumnos.service.AlumnoService;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/fichaView.fxml"));
        Parent root = loader.load();

        AlumnoController controller = loader.getController();
        controller.setService(new AlumnoService(new AlumnoRepository()));

        stage.setScene(new Scene(root));
        stage.setTitle("Gestión de Alumnos");
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
