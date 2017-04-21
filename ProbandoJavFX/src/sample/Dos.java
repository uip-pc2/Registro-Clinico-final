package sample;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import java.io.*;
import java.util.*;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Dos {
    @FXML
    Label nombre;
    @FXML
    Label cedula;
    @FXML
    Label celular;
    @FXML
   Label  fecha;
    @FXML
    Label cita;
    @FXML
    Label poliza;
    @FXML
    Label doctor;
    @FXML
    Label enfermedad;
    @FXML
    TextField historia;
    @FXML
    Button btn_atras;
    @FXML
    Button btn_guardar;

    public void setText( String st1, String st2, String st3, String st4, String st5, String st6, String st7, String st8, String st9){

    nombre.setText(st1) ;

        cedula.setText(st2);
        celular.setText(st3);
        fecha.setText(st4);
        cita.setText(st5);
        poliza.setText(st6);
        doctor.setText(st7);
        enfermedad.setText(st8);
        historia.setText(st9);



    }

    public void atras(MouseEvent mouseEvent) {
        Stage stage = (Stage) btn_atras.getScene().getWindow();
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Uno.fxml"));
        Parent root = null;
        try {
            root = (Parent)fxmlLoader.load();
        } catch (IOException e) {
            Alert alerta = new Alert(Alert.AlertType.ERROR);
            alerta.setTitle("Error de Aplicacion");
            alerta.setHeaderText("Mira, hubo un error...");
            alerta.setContentText("Lo siento. Llama al administrador.");
            alerta.showAndWait();
            Platform.exit();
        }
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void guardar(MouseEvent mouseEvent) {
        File archivo = new File("RegistroClinico.log");
        if (!archivo.exists()) {
            try {
                archivo.createNewFile();
            } catch (IOException e) {
                Alert alerta = new Alert(Alert.AlertType.ERROR);
                alerta.setTitle("Error de Aplicacion");
                alerta.setHeaderText("Mira, hubo un error...");
                alerta.setContentText("Lo siento. Llama al administrador.");
                alerta.showAndWait();
                return;
            }
        }
        try {
            FileWriter fw = new FileWriter(archivo.getAbsoluteFile(), true);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write("-------------------------------------------------" );
            bw.write("\n");
            bw.write("\n");
            bw.write("El nombre es: " + nombre.getText());
            bw.write("\n");
            bw.write("Cedula es:: " + cedula.getText());
            bw.write("\n");
            bw.write("Celular es: " + celular.getText());
            bw.write("\n");
            bw.write("La fecha es: " + fecha.getText());
            bw.write("\n");
            bw.write("La cita fue: " + cita.getText());
            bw.write("\n");
            bw.write("La poliza: " + poliza.getText());
            bw.write("\n");
            bw.write("El nombre del doctor es: " + doctor.getText());
            bw.write("\n");
            bw.write("Enfermedad:  " + enfermedad.getText());
            bw.write("\n");
            bw.write("Historial:  " + historia.getText());
            bw.write("\n");
            bw.write("\n");
            bw.write("-------------------------------------------------" );
            bw.close();
        } catch (IOException e) {
            Alert alerta = new Alert(Alert.AlertType.ERROR);
            alerta.setTitle("Error de Aplicacion");
            alerta.setHeaderText("Mira, hubo un error...");
            alerta.setContentText("Lo siento. Llama al administrador.");
            alerta.showAndWait();
            return;
        }

        Stage stage = (Stage) btn_atras.getScene().getWindow();
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Uno.fxml"));
        Parent root = null;
        try {
            root = (Parent)fxmlLoader.load();
        } catch (IOException e) {
            Alert alerta = new Alert(Alert.AlertType.ERROR);
            alerta.setTitle("Error de Aplicacion");
            alerta.setHeaderText("Mira, hubo un error...");
            alerta.setContentText("Lo siento. Llama al administrador.");
            alerta.showAndWait();
            Platform.exit();
        }
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }
}
