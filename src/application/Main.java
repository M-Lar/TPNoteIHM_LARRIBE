package application;

import javafx.application.Application;

import javafx.fxml.FXMLLoader;

import javafx.scene.Parent;

import javafx.scene.Scene;

import javafx.stage.Stage;
import javafx.scene.layout.GridPane;


public class Main extends Application {

	 @Override
	 public void start(Stage primaryStage) throws Exception {
		Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
		//GridPane root = new GridPane();
	 	primaryStage.setTitle("Exemple");
	  	primaryStage.setScene(new Scene(root));
	 	primaryStage.show();
	        
	 }

	 public static void main(String[] args) {
	    //System.out.println("1");
	    launch(args);
	    //System.out.println("2");
	 }
}

	
