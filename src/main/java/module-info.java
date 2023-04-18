module com.example.proyectoud1recuperacion {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    //requires eu.hansolo.tilesfx;
    requires com.almasb.fxgl.all;

    requires com.fasterxml.jackson.annotation;
    requires com.fasterxml.jackson.databind;
    requires com.fasterxml.jackson.dataformat.xml;

    opens com.example.proyectoud1recuperacion to javafx.fxml;
    exports com.example.proyectoud1recuperacion;

    opens com.example.proyectoud1recuperacion.model;
    exports com.example.proyectoud1recuperacion.model;

}