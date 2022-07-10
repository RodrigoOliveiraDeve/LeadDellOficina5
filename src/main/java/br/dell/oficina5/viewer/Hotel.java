package br.dell.oficina5.viewer;

import javafx.application.Application;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

public class Hotel extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FlowPane flowPane = new FlowPane();
        Scene scene = new Scene(flowPane, 300, 500);
        VBox cena = new VBox();
        HBox buttons = new HBox();
        HBox sexo = new HBox();
        HBox check = new HBox();

        cena.setAlignment(Pos.CENTER_LEFT);
        cena.setTranslateX(10);
        cena.setSpacing(10);

        buttons.setSpacing(30);
        
        sexo.setSpacing(20);

        check.setSpacing(20);
        
        TextField nome = new TextField();
        TextField endereco = new TextField();
        TextField CPF = new TextField();
        TextField RG = new TextField();
        TextField Idade = new TextField();
        RadioButton M = new RadioButton("M");
        RadioButton F = new RadioButton("F");
        ComboBox cbQuarto = new ComboBox();
        CheckBox checkIn = new CheckBox("Check in");
        CheckBox checkOut = new CheckBox("Check out");
        Button salvar = new Button("Salvar");
        Button buscar = new Button("Buscar");
        Button remover = new Button("Remover");

        sexo.getChildren().addAll(M, F);
        buttons.getChildren().addAll(salvar, buscar, remover);
        check.getChildren().addAll(checkIn, checkOut);

        cena.getChildren().addAll(
                new Label("Nome:"), nome,
                new Label("Endereço:"), endereco,
                new Label("CPF:"), CPF,
                new Label("RG:"), RG,
                new Label("Idade:"), Idade,
                new Label("Sexo:"), sexo,
                new Label("Quartos:"), cbQuarto,
                check, new Separator(Orientation.HORIZONTAL), buttons);

        flowPane.getChildren().addAll(cena);

        stage.setTitle("Hotel");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}