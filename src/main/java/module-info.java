module br.dell.oficina5 {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires validatorfx;
    requires eu.hansolo.tilesfx;
    requires com.almasb.fxgl.all;

    exports br.dell.oficina5.models;
    opens br.dell.oficina5.models to javafx.fxml;
    exports br.dell.oficina5.viewer;
    opens br.dell.oficina5.viewer to javafx.fxml;
    exports br.dell.oficina5.controller;
    opens br.dell.oficina5.controller to javafx.fxml;
}