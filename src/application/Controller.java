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
import javafx.scene.Parent;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Shape;
import javafx.scene.input.MouseEvent;

import formes.*;


import java.io.File;
import java.util.ArrayList;

public class Controller {
	
    @FXML private RadioButton RbtnSelect;

    @FXML private RadioButton RbtnElipse;
    @FXML private RadioButton RbtnRect;
    @FXML private RadioButton RbtnLine;

    @FXML private ColorPicker colorPicker;
    
    @FXML private Button btnDelete;
    @FXML private Button btnClone;
    
    @FXML private Pane paneID;
    
    
    public Controller(){
        super();
    }
    
    
    Line line = null;
    Rectangle rectangle = null;
    Ellipse ellipse = null;
    ArrayList<Shape> formes;
    
    double x;
    double y;
    
    @FXML
    public void initialize(){
    	
    	RbtnSelect.setOnMouseClicked(event -> {
    		System.out.println("Select");
        });
    	
    	
    	RbtnElipse.setOnMouseClicked(event -> {
    		System.out.println("Elipse");
        });
    	RbtnRect.setOnMouseClicked(event -> {
    		System.out.println("Rect"+ RbtnLine.isSelected());
        });
    	RbtnLine.setOnMouseClicked(event -> {
    		System.out.println("Line"+ RbtnLine.isSelected());
    		
        });
    	drawLine();
    	
    	
    	 
		System.out.println("hello");
		paneID.setOnMouseClicked(event -> {
			//System.out.println(RbtnLine.isSelected());
			if(RbtnLine.isSelected()) {
    			if(line == null) {
    				line = new Ligne(event.getX(), event.getY(), event.getX(), event.getY());
    				line.setStroke(colorPicker.getValue());
    	            paneID.getChildren().add(line);
    			} else {
    				line = null;
    			}
			} else if (RbtnRect.isSelected()) {
				if(rectangle == null) {
					x= event.getX(); y= event.getY();
					rectangle = new Rect(x, y, 1, 1);
					rectangle.setFill(colorPicker.getValue());
    	            paneID.getChildren().add(rectangle);
    			} else {
    				rectangle = null;
    			}
				
			} else if (RbtnElipse.isSelected()) {
				if(ellipse == null) {
					System.out.println("1");
					ellipse = new Elli(event.getX(), event.getY(), 1, 1);
					System.out.println("2");
					ellipse.setFill(colorPicker.getValue());
					System.out.println("3");
    	            paneID.getChildren().add(ellipse);
    			} else {
    				ellipse = null;
    			}
			}
		});
   		
   		paneID.setOnMouseMoved(event -> {
  			if(RbtnLine.isSelected()) {
	   	        if (line != null) {
	   	            line.setEndX(event.getX());
	   	            line.setEndY(event.getY());
	   	        }
  			} else if (RbtnRect.isSelected()) {
  				if (rectangle != null) {
  					//System.out.println(x+" "+event.getX());
  					//System.out.println(y+" "+event.getY());
  					//if(event.getX()<x) rectangle.setX(event.getX());
  					rectangle.setWidth(event.getX()-rectangle.getX());
  					//if(event.getY()<y) rectangle.setY(event.getY());
  					rectangle.setHeight(event.getY()-rectangle.getY());
	   	        }
			} else if (RbtnElipse.isSelected()) {
				if (ellipse != null) {
					ellipse.setRadiusX(Math.abs(event.getX()-ellipse.getCenterX()));
					ellipse.setRadiusY(Math.abs(event.getY()-ellipse.getCenterY()));
					//formes.add(arg0)
				}
			}
   	    });
    	
    	

    	colorPicker.setOnAction(event -> {
    		System.out.println(colorPicker.getValue());
        });
    	
    	
    	btnDelete.setOnMouseClicked(event -> {
    		System.out.println("Delete");
    		paneID.getChildren().clear();
        });
    	btnClone.setOnMouseClicked(event -> {
    		System.out.println("Clone");
        });
    	

    }
    
    public void drawLine() {
    	
    }
}
