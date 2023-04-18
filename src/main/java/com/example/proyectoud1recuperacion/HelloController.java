package com.example.proyectoud1recuperacion;

import com.example.proyectoud1recuperacion.model.DocsItem;
import com.example.proyectoud1recuperacion.model.Response;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class HelloController implements Initializable {
    @FXML
    private TableView<DocsItem> tabla;

    @FXML

    private TableColumn titulo;
    @FXML

    private TableColumn autor;
    @FXML

    private TableColumn publicacion;

    @FXML
    private ComboBox parametroBusqueda;

    @FXML
    private TextField busqueda;

    @FXML
    private TextField nombreFichero;

    String stringNombreFichero = new String();


    @FXML
    protected void mostrarTabla() throws MalformedURLException {
        String busquedaFormateada = busqueda.getText();
        busquedaFormateada = busquedaFormateada.replace(" ","+");
        //Borramos posibles datos ya añadidos a la tabla
        tabla.getItems().clear();
        //Clasificaciones de la API cambiando unicamente el año de la temporada
        URL jsonURL = new URL("https://openlibrary.org/search.json?"+parametroBusqueda.getValue()+"="+busquedaFormateada);
        //Incluimos la informacion a la tabla por medio de GETs y un ObjectMapper
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            Response response = objectMapper.readValue(jsonURL, Response.class);
            for (DocsItem libro:response.getDocs()){

                tabla.getItems().add(libro);

            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        //Incluimos los años al ComboBox
        parametroBusqueda.setItems(FXCollections.observableArrayList("author","title"));

    }

    public void exportarJSON(ActionEvent actionEvent) {
        //Exportamos la informacion de la tabla a un fichero json por medio de un ObjectMapper de forma ya formateada
        stringNombreFichero = nombreFichero.getText();
        ObjectMapper objectMapper = new ObjectMapper();
        ArrayList<DocsItem> exportars = new ArrayList<>();
        for (DocsItem exportar : tabla.getItems()){

            exportars.add(exportar);

        }
        try {
            objectMapper.writerWithDefaultPrettyPrinter().writeValue(new File(stringNombreFichero + ".json"),exportars);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public void exportarXML(ActionEvent actionEvent) {
        //Exportamos la informacion de la tabla a un fichero xml por medio de un XmlMapper de forma ya formateada
        stringNombreFichero = nombreFichero.getText();
        XmlMapper xmlMapper = new XmlMapper();
        ArrayList<DocsItem> exportars = new ArrayList<>();
        for (DocsItem exportar : tabla.getItems()){

            exportars.add(exportar);

        }
        try {
            xmlMapper.writerWithDefaultPrettyPrinter().writeValue(new File(stringNombreFichero + ".xml"),exportars);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public void exportarTexto(ActionEvent actionEvent) {
        //Exportamos la informacion de la tabla a un fichero txt en formato toString por medio de un FileWriter
        stringNombreFichero = nombreFichero.getText();

        try (BufferedWriter escritor = new BufferedWriter(new FileWriter(stringNombreFichero + ".txt"));) {

            for (DocsItem exportar : tabla.getItems()) {
                escritor.write(String.valueOf(exportar));
                escritor.newLine();
            }
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }


    }

    public void exportarBinario(ActionEvent actionEvent) {
        //Exportamos la informacion de la tabla a un fichero bin por medio de un FileOutputStream e implementando las clases con Serializable
        stringNombreFichero = nombreFichero.getText();

        try (ObjectOutputStream escritor = new ObjectOutputStream(new FileOutputStream(stringNombreFichero + ".bin"));) {
            for (DocsItem exportar : tabla.getItems()) {
                escritor.writeObject(exportar);
            }
        } catch (IOException ex) {
            System.err.println(ex);
        }


    }

}