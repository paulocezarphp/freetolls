/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package freetolls;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author paulo
 */
public class Freetolls extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        Button botao = new Button();
        botao.setText("Seja bem vindo");
        botao.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Funcionou");
            }
        });
        
        StackPane root = new StackPane();
        root.getChildren().add(botao);
        
        
        Scene scene = new Scene(root, 800, 600);
        
        primaryStage.setTitle("FreeTolls - Aplicações");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
