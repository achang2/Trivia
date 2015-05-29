/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*package trivia;

import javafx.application.Application;
//import javafx.fxml.FXMLLoader;
//import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
//import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author Arthur
 */
/*public class Trivia extends Application {
    
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
    }*/
    /*public void start(Stage primaryStage) { 

       ScreensController mainContainer = new ScreensController(); 
         boolean loadScreen = mainContainer.loadScreen(Trivia.Welcome_Page, 
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
    }*/

    /**
     * @param args the command line arguments
     */
    /*public static void main(String[] args) {
        launch(args);
        
    }
    
}*/
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trivia;

import java.net.URL;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
//import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
//import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author Shoshana
 */
public class Trivia extends Application {
    public static int counter = 0;
     
     public static final String Title_Page = "Title Page"; 
     public static final String Title_Page_FXML = "TitlePage.fxml"; 
     public static final String Home_Page = "Home Page"; 
     public static final String Home_Page_FXML = "HomePage.fxml"; 
     public static final String ROULETTE_SCREEN = "roulette"; 
     public static final String ROULETTE_SCREEN_FXML = "roulette.fxml"; 
     public static final String Basic_Question_Template = "Basic Question Template";
     public static final String Basic_Question_Template_FXML = "BasicQuestionTemplate.fxml";
     public static final String Modes = "Modes Page";
     public static final String Modes_FXML = "Modes2.fxml";
     public static Stage firstStage;

    @Override
     public void start(Stage primaryStage) throws Exception { 
       firstStage = primaryStage;
       /*
       ScreensController mainContainer = new ScreensController(); 
       mainContainer.loadScreen(Trivia.Home_Page, 
                            Trivia.Home_Page_FXML); 
       mainContainer.loadScreen(Trivia.Title_Page, 
                            Trivia.Title_Page_FXML); 
       mainContainer.loadScreen(Trivia.Home_Page, 
                            Trivia.Home_Page_FXML); 

       mainContainer.setScreen(Trivia.Home_Page); 
       */
/*
       Group root = new Group(); 
       root.getChildren().addAll(mainContainer); 
       Scene scene = new Scene(root); 
       primaryStage.setScene(scene); 
       primaryStage.show();
*/     
        URL path = getClass().getResource("HomePage.fxml");
        Parent root = FXMLLoader.load(path);
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    /**
     *
     * @param secondStage
     */
    public static void switchScene(){
         ScreensController mainContainer;
         mainContainer = new ScreensController();
         mainContainer.loadScreen(Trivia.Basic_Question_Template,
                                  Trivia.Basic_Question_Template_FXML);
         mainContainer.setScreen(Trivia.Basic_Question_Template);
         
        Group root = new Group(); 
        root.getChildren().addAll(mainContainer); 
        Scene scene = new Scene(root); 
        firstStage.setScene(scene); 
        firstStage.show();
     }
    
    public static void backToMain(){
         ScreensController mainContainer;
         mainContainer = new ScreensController();
         mainContainer.loadScreen(Trivia.Home_Page,
                                  Trivia.Home_Page_FXML);
         mainContainer.setScreen(Trivia.Home_Page);
         
        Group root = new Group(); 
        root.getChildren().addAll(mainContainer); 
        Scene scene = new Scene(root); 
        firstStage.setScene(scene); 
        firstStage.show();
     }
    
    
    public static void switchToModes(){
        ScreensController mainContainer; 
        mainContainer = new ScreensController();
        mainContainer.loadScreen(Trivia.Modes,
                                 Trivia.Modes_FXML);
        mainContainer.setScreen(Trivia.Modes);
        
        Group root = new Group(); 
        root.getChildren().addAll(mainContainer); 
        Scene scene = new Scene(root); 
        firstStage.setScene(scene); 
        firstStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
