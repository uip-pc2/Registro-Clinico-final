package sample;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Optional;

public class Uno {
    @FXML
    TextField txtusername;
    @FXML
    TextField txtcedula;
    @FXML
    TextField txtcelular;
    @FXML
    TextField txtfecha;
    @FXML
    TextField txtcita;
    @FXML
    TextField txtpoliza;
    @FXML
    TextField txtdoctor;
    @FXML
    TextField txtenfermedad;
    @FXML
    TextField txthistorial;
    @FXML
    Button btn_enviar;

    public void enviar(ActionEvent actionEvent) throws IOException {
      //  String st = 0.0;
        String st1 = txtusername.getText();
        String st2 = txtcedula.getText();
        String st3 = txtcelular.getText();
        String st4 = txtfecha.getText();
        String st5 = txtcita.getText();
        String st6 = txtpoliza.getText();
        String st7 = txtdoctor.getText();
        String st8 = txtenfermedad.getText();
        String st9 = txthistorial.getText();
        if (st1.isEmpty()) {
            Alert alerta = new Alert(Alert.AlertType.ERROR);
            alerta.setTitle("Error en nombre");
            alerta.setHeaderText("Mira, hubo un error...");
            alerta.setContentText("El nombre no debe estar vacio.");
            alerta.showAndWait();
            txtusername.setText("");
            return;
        } else if (st2.isEmpty()){
            Alert alerta = new Alert(Alert.AlertType.ERROR);
            alerta.setTitle("Error en la cedula");
            alerta.setHeaderText("Mira, hubo un error...");
            alerta.setContentText("La cedula no debe estar vacio.");
            alerta.showAndWait();
            txtcedula.setText("");
            return;
        }
        else if (st3.isEmpty()){
            Alert alerta = new Alert(Alert.AlertType.ERROR);
            alerta.setTitle("Error en Celular");
            alerta.setHeaderText("Mira, hubo un error...");
            alerta.setContentText("El celular no debe estar vacio.");
            alerta.showAndWait();
            txtcelular.setText("");
            return;
        }
        else if (st4.isEmpty()){
            Alert alerta = new Alert(Alert.AlertType.ERROR);
            alerta.setTitle("Error en la fecha");
            alerta.setHeaderText("Mira, hubo un error...");
            alerta.setContentText("La fecha no debe estar vacio.");
            alerta.showAndWait();
            txtfecha.setText("");
            return;
        }
        else if (st5.isEmpty()){
            Alert alerta = new Alert(Alert.AlertType.ERROR);
            alerta.setTitle("Error en la cita");
            alerta.setHeaderText("Mira, hubo un error...");
            alerta.setContentText("La cita no debe estar vacio.");
            alerta.showAndWait();
            txtcita.setText("");
            return;
        }
        else if (st6.isEmpty()){
            Alert alerta = new Alert(Alert.AlertType.ERROR);
            alerta.setTitle("Error en Sub-total");
            alerta.setHeaderText("Mira, hubo un error...");
            alerta.setContentText("La poliza no debe estar vacio.");
            alerta.showAndWait();
            txtpoliza.setText("");
            return;
        }
        else if (st7.isEmpty()){
            Alert alerta = new Alert(Alert.AlertType.ERROR);
            alerta.setTitle("Error en doctor");
            alerta.setHeaderText("Mira, hubo un error...");
            alerta.setContentText("el doctor no debe estar vacio.");
            alerta.showAndWait();
            txtdoctor.setText("");
            return;
        }
        else if (st8.isEmpty()){
            Alert alerta = new Alert(Alert.AlertType.ERROR);
            alerta.setTitle("Error en enfermedad");
            alerta.setHeaderText("Mira, hubo un error...");
            alerta.setContentText("La enfermedad no debe estar vacio.");
            alerta.showAndWait();
            txtenfermedad.setText("");
            return;
        }
        else if (st9.isEmpty()){
            Alert alerta = new Alert(Alert.AlertType.ERROR);
            alerta.setTitle("Error en historial");
            alerta.setHeaderText("Mira, hubo un error...");
            alerta.setContentText("El historial no debe estar vacio.");
            alerta.showAndWait();
            txthistorial.setText("");
            return;
        }


//        else {
//            try {
//                st = Double.parseDouble(st1);
//            } catch (NumberFormatException e) {
//                Alert alerta = new Alert(Alert.AlertType.ERROR);
//                alerta.setTitle("Error en Sub-total");
//                alerta.setHeaderText("Mira, hubo un error...");
//                alerta.setContentText("El sub-total es un numero.");
//                alerta.showAndWait();
//                txtusername.setText("");
//                return;
//            }
            Stage stage = (Stage) btn_enviar.getScene().getWindow();
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Dos.fxml"));
            Parent root = null;
                try {
                    root = (Parent) fxmlLoader.load();
                } catch (Exception e) {
                    Alert alerta = new Alert(Alert.AlertType.ERROR);
                    alerta.setTitle("Error de Aplicacion");
                    alerta.setHeaderText("Mira, hubo un error...");
                    alerta.setContentText("Lo siento. Llama al administrador.");
                    alerta.showAndWait();
                    Platform.exit();
                }
            Dos sc = fxmlLoader.<Dos>getController();
            sc.setText(st1,st2,st3,st4,st5,st6,st7,st8,st9);
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
//        }
    }

    public void limpiar(ActionEvent actionEvent) {
        txtusername.setText("");
        txtcedula.setText("");
        txtcelular.setText("");
        txtfecha.setText("");
        txtcita.setText("");
        txtpoliza.setText("");
        txtdoctor.setText("");
        txtenfermedad.setText("");
        txthistorial.setText("");
    }

    public void salir(ActionEvent actionEvent) {
        Alert alerta = new Alert(Alert.AlertType.CONFIRMATION);
        alerta.setTitle("Confirmacion de Salida");
        alerta.setHeaderText("Usted esta saliendo de la aplicacion");
        alerta.setContentText("Esta seguro de esto?");
        Optional<ButtonType> resultado = alerta.showAndWait();
        if (resultado.get() == ButtonType.OK) {
            Platform.exit();
        }
    }


}
