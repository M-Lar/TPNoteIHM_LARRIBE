package application;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;

import javafx.scene.control.RadioButton;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.Button;
import javafx.scene.canvas.Canvas;

import javafx.scene.input.MouseEvent;

import java.io.File;

public class Controller {
	
    @FXML private RadioButton RbtnSelect;

    @FXML private RadioButton RbtnElipse;
    @FXML private RadioButton RbtnRect;
    @FXML private RadioButton RbtnLine;

    @FXML private ColorPicker colorPicker;
    
    @FXML private Button btnDelete;
    @FXML private Button btnClone;
    
    @FXML private Canvas Can;
    
    
    public Controller(){
        super();
    }
    
    @FXML
    public void initialize(){
    	
    	RbtnElipse.setOnMouseClicked(event -> {
    		System.out.println("Elipse");
        });
    	RbtnRect.setOnMouseClicked(event -> {
    		System.out.println("Rect");
        });
    	RbtnLine.setOnMouseClicked(event -> {
    		System.out.println("Line");
        });
		
    	
    	btnDelete.setOnMouseClicked(event -> {
    		System.out.println("Delete");
        });
    	btnClone.setOnMouseClicked(event -> {
    		System.out.println("Clone");
        });
    	

    }
}
