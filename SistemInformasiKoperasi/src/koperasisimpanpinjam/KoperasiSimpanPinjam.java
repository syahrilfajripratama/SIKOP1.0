/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package koperasisimpanpinjam;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author User
 */
public class KoperasiSimpanPinjam extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("Koperasi .fxml"));
        
        Scene scene = new Scene(root);
        stage.setTitle("SIKOP 1.0");
        stage.setScene(scene);
        stage.show();
    }


    public static void main(String[] args) {
          launch(args);
    }
}
