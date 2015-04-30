/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trivia;

import javafx.application.Application;
//import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
//import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author Arthur
 */
public class Trivia extends Application {
    
     public static final String Welcome_Page = "Welcome Page"; 
     public static final String Welcome_Page_FXML = "WelcomePage.fxml"; 
     public static final String Title_Page = "Title Page"; 
     public static final String Title_Page_FXML = "TitlePage.fxml"; 
     public static final String Home_Page = "Home Page"; 
     public static final String Home_Page_FXML = "HomePage.fxml"; 
     public static final String ROULETTE_SCREEN = "roulette"; 
     public static final String ROULETTE_SCREEN_FXML = "roulette.fxml"; 
    
    @Override
     public void start(Stage primaryStage) { 

       ScreensController mainContainer = new ScreensController(); 
       mainContainer.loadScreen(Trivia.Welcome_Page, 
                            Trivia.Welcome_Page_FXML); 
       mainContainer.loadScreen(Trivia.Title_Page, 
                            Trivia.Title_Page_FXML); 
       mainContainer.loadScreen(Trivia.Home_Page, 
                            Trivia.Home_Page_FXML); 

       mainContainer.setScreen(Trivia.Welcome_Page); 

       Group root = new Group(); 
       root.getChildren().addAll(mainContainer); 
       Scene scene = new Scene(root); 
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
