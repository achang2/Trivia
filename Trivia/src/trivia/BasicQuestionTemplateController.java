/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trivia;

import java.awt.Button;
import java.io.File;
import java.io.FileNotFoundException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Optional;
import java.util.Random;
import java.util.ResourceBundle;
import java.util.Scanner;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;

/**
 * FXML Controller class
 *
 * @author Arthur
 */
public class BasicQuestionTemplateController implements Initializable, ControlledScreen {
    
   ScreensController myController;
   
   @FXML 
   private Label questions;
   
   @FXML 
   private Label a;
   
   @FXML 
   private Label b;
   
   @FXML 
   private Label c;
   
   @FXML 
   private Label d;
   
   @FXML
   private Button answerA;
   
   @FXML
   private Button answerB;
   
   @FXML
   private Button answerC;
   
   @FXML
   private Button answerD; 
   
   @Override
    public void setScreenParent(ScreensController screenParent){
       myController = screenParent;
    }
   Label labelC = null;
   
   int n;
    private File w2;
    /**
     * @author Alec
     */
    public void scan(Scanner s, ArrayList<String> a){
        while(s.hasNext()){
            String q = s.next();
            a.add(q);
        }
    } 
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        /**
         * @author Alec
         */
       File q = new File("Trivia Questions.txt");
       File correct = new File("Correct Answers.txt");
       File w1 = new File("Wrong Answers 1.txt");
       File w2 = new File("Wrong Answers 2.txt");
       File w3 = new File("Wrong Answers 3.txt");
       try{
           Scanner myScan = new Scanner(q);
           ArrayList<String> ques = new ArrayList<String>();
           scan(myScan, ques);
           
           Scanner cor = new Scanner(correct);
           ArrayList<String> correctAnswers = new ArrayList<String>();
           scan(cor, correctAnswers);
           
           Scanner first = new Scanner(w1);
           ArrayList<String> wrong1 = new ArrayList<String>();
           scan(first, wrong1);
           
           Scanner sec = new Scanner(w2);
           ArrayList<String> wrong2 = new ArrayList<String>();
           scan(sec, wrong2);
           
           Scanner third = new Scanner(w3);
           ArrayList<String> wrong3 = new ArrayList<String>();
           scan(third, wrong3);
           
           Random rand = new Random();
           int i = rand.nextInt(ques.size());
           String newQ = ques.get(i);
           String newC = correctAnswers.get(i);
           String newA1 = wrong1.get(i);
           String newA2 = wrong2.get(i);
           String newA3 = wrong3.get(i);
           
           Label questions = new Label(newQ);
           Label labelC = new Label(newC);
           Label firstL = new Label(newA1);
           Label secL = new Label(newA2);
           Label thirdL = new Label(newA3);
           
           int n = rand.nextInt(3);
           
           if(n == 0){
               labelC = a;
               firstL = b;
               secL = c;
               thirdL = d;
           }
           else if(n == 1){
               labelC = b;
               firstL = c;
               secL = d;
               thirdL = a;
           }
           else if(n == 2){
               labelC = c;
               firstL = d;
               secL = a;
               thirdL = b;
           }
           else if(n == 3){
               labelC = d;
               firstL = a;
               secL = b;
               thirdL = c;
           }
           
 
           
       }
       catch (FileNotFoundException caught){
           System.out.println("The file does not exist");
       }
    }

   
    /**
     *
     * @param button
     * @throws java.io.FileNotFoundException
     */
    @FXML
    public void check(ActionEvent button) throws FileNotFoundException{
        if(button.getSource() == answerA){
            if(n==0){
               this.correct(); 
            }else{
               this.incorrect(); 
            }
        }else if(button.getSource() == answerB){
            if(n==1){
               this.correct();
            }else{
                this.incorrect();
            }
        }else if(button.getSource() == answerC){
            if(n==2){
                this.correct();
            }else{
                this.incorrect();
            }
        }else if(button.getSource() == answerD){
            if(n==3){
               this.correct(); 
            }else{
               this.incorrect(); 
            }
        }
    }
    public void correct() throws FileNotFoundException{
        Alert alert = new Alert(AlertType.CONFIRMATION);
        alert.setTitle("Correct!");
        alert.setHeaderText("Correct!");
        alert.setContentText("Congratulations! You got the question correct.");
       Object q = null;
        Scanner myScan = new Scanner((Readable) q);
        ArrayList<String> ques = new ArrayList<>();
        scan(myScan, ques);
       Object correct = null;
        Scanner cor = new Scanner((Readable) correct);
        ArrayList<String> correctAnswers = new ArrayList<>();
        scan(cor, correctAnswers);
       Readable w1 = null;
       Scanner first = new Scanner(w1);
        ArrayList<String> wrong1 = new ArrayList<>();
        scan(first, wrong1);
        w2 = null;
        Scanner sec = new Scanner(w2);
        ArrayList<String> wrong2 = new ArrayList<>();
        scan(sec, wrong2);
       Object w3 = null;
        Scanner third = new Scanner((Readable) w3);
        ArrayList<String> wrong3 = new ArrayList<>();
        scan(third, wrong3);
        Random rand = new Random();
        int i = rand.nextInt(ques.size());
        String newQ = ques.get(i);
        String newC = correctAnswers.get(i);
        String newA1 = wrong1.get(i);
        String newA2 = wrong2.get(i);
        String newA3 = wrong3.get(i);
        Label question = new Label(newQ);
        labelC = new Label(newC);
        Label firstL = new Label(newA1);
        Label secL;
        secL = new Label(newA2);
        Label thirdL = new Label(newA3);
        n = rand.nextInt(3);
        if(n == 0){
            labelC = a;
            firstL = b;
            secL = c;
            thirdL = d;
        }
        else if(n == 1){
            labelC = b;
            firstL = c;
            secL = d;
            thirdL = a;
        }
        else if(n == 2){
            labelC = c;
            firstL = d;
            secL = a;
            thirdL = b;
        }
        else if(n == 3){
            labelC = d;
            firstL = a;
            secL = b;
            thirdL = c;
           }
    }
    public void incorrect(){
        Alert alert = new Alert(AlertType.CONFIRMATION);
        alert.setTitle("Incorrect.!");
        alert.setHeaderText("Incorrect.");
        alert.setContentText("I'm sorry, but that was the wrong answer.");

        ButtonType buttonTypeNext = new ButtonType("Next Question");
        ButtonType buttonTypeBack = new ButtonType("Back to Main");

        alert.getButtonTypes().setAll(buttonTypeNext, buttonTypeBack);

        Optional<ButtonType> result = alert.showAndWait();
        ButtonType buttonTypeOne;
        if (result.get() == buttonTypeNext){
            // switch to the next question page
        } else {
            // switch to the main home page
        }
    }

   
}
    
    

/* To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*package trivia;

import java.io.File;
import java.io.FileNotFoundException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Optional;
import java.util.Random;
import java.util.ResourceBundle;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;

/**
 * FXML Controller class
 *
 * @author Arthur
 */
/*public class BasicQuestionTemplateController implements Initializable {
    
   @FXML 
   private Label questions;
   
   @FXML 
   private Label a;
   
   @FXML 
   private Label b;
   
   @FXML 
   private Label c;
   
   @FXML 
   private Label d;
   
   @FXML
   private Button answerA;
   
   @FXML
   private Button answerB;
   
   @FXML
   private Button answerC;
   
   @FXML
   private Button answerD; 
   
   Label labelC = null;
   
   int n;
    private File w2;
    /**
     * @author Alec
     * @param url
     * @param rb
     * @author Alec*/
   /*@Override
    public void initialize(URL url, ResourceBundle rb) {
        /**
         * @author Alec
         */
       /*File q = new File("Trivia Questions.txt");
       File correct = new File("Correct Answers.txt");
       File w1 = new File("Wrong Answers 1.txt");
       File w2 = null;
       File w3 = new File("Wrong Answers 3.txt");
       Scanner myScan = null;
        
       try {
            myScan = new Scanner(q);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(BasicQuestionTemplateController.class.getName()).log(Level.SEVERE, null, ex);
        }
           ArrayList<String> ques = new ArrayList<>();
           scan(myScan, ques);
           
           Scanner cor = null;
        try {
            cor = new Scanner(correct);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(BasicQuestionTemplateController.class.getName()).log(Level.SEVERE, null, ex);
        }
           ArrayList<String> correctAnswers = new ArrayList<>();
           scan(cor, correctAnswers);
           
           Scanner first = null;
        try {
            first = new Scanner(w1);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(BasicQuestionTemplateController.class.getName()).log(Level.SEVERE, null, ex);
        }
           ArrayList<String> wrong1 = new ArrayList<>();
           scan(first, wrong1);
           
           Scanner sec = null;
        try {
            sec = new Scanner(w2);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(BasicQuestionTemplateController.class.getName()).log(Level.SEVERE, null, ex);
        }
           ArrayList<String> wrong2 = new ArrayList<>();
           scan(sec, wrong2);
           
           Scanner third = null;
        try {
            third = new Scanner(w3);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(BasicQuestionTemplateController.class.getName()).log(Level.SEVERE, null, ex);
        }
           ArrayList<String> wrong3 = new ArrayList<>();
           scan(third, wrong3);
           
           Random rand = new Random();
           int i = rand.nextInt(ques.size());
           String newQ = ques.get(i);
           String newC = correctAnswers.get(i);
           String newA1 = wrong1.get(i);
           String newA2 = wrong2.get(i);
           String newA3 = wrong3.get(i);
           
           questions = new Label(newQ);
           labelC = new Label(newC);
           Label firstL = new Label(newA1);
           Label secL = new Label(newA2);
           Label thirdL = new Label(newA3);
           
           n = rand.nextInt(3);
           
           if(n == 0){
               a = labelC;
               b = firstL;
               c = secL;
               d = thirdL;
           }
           else if(n == 1){
               b = labelC;
               c = firstL;
               d = secL;
               a = thirdL;
           }
           else if(n == 2){
               c = labelC;
               d = firstL;
               a = secL;
               b = thirdL;
           }
           else if(n == 3){
               d = labelC;
               a = firstL;
               b = secL;
               c = thirdL;
           }
           
 
    }
    public BasicQuestionTemplateController() {
        this.w2 = new File("Wrong Answers 2.txt");
    }

    private void scan(Scanner myScan, ArrayList<String> ques) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }    

        
    

    

    /**
     *
     * @param button
     * @throws java.io.FileNotFoundException
     */
    /*@FXML
    public void check(ActionEvent button) throws FileNotFoundException{
        if(button.getSource() == answerA){
            if(n==0){
               this.correct(); 
            }else{
               this.incorrect(); 
            }
        }else if(button.getSource() == answerB){
            if(n==1){
               this.correct();
            }else{
                this.incorrect();
            }
        }else if(button.getSource() == answerC){
            if(n==2){
                this.correct();
            }else{
                this.incorrect();
            }
        }else if(button.getSource() == answerD){
            if(n==3){
               this.correct(); 
            }else{
               this.incorrect(); 
            }
        }
    }
    public void correct() throws FileNotFoundException{
        Alert alert = new Alert(AlertType.CONFIRMATION);
        alert.setTitle("Correct!");
        alert.setHeaderText("Correct!");
        alert.setContentText("Congratulations! You got the question correct.");
       Object q = null;
        Scanner myScan = new Scanner((Readable) q);
        ArrayList<String> ques = new ArrayList<>();
        scan(myScan, ques);
       Object correct = null;
        Scanner cor = new Scanner((Readable) correct);
        ArrayList<String> correctAnswers = new ArrayList<>();
        scan(cor, correctAnswers);
       Readable w1 = null;
       Scanner first = new Scanner(w1);
        ArrayList<String> wrong1 = new ArrayList<>();
        scan(first, wrong1);
        w2 = null;
        Scanner sec = new Scanner(w2);
        ArrayList<String> wrong2 = new ArrayList<>();
        scan(sec, wrong2);
       Object w3 = null;
        Scanner third = new Scanner((Readable) w3);
        ArrayList<String> wrong3 = new ArrayList<>();
        scan(third, wrong3);
        Random rand = new Random();
        int i = rand.nextInt(ques.size());
        String newQ = ques.get(i);
        String newC = correctAnswers.get(i);
        String newA1 = wrong1.get(i);
        String newA2 = wrong2.get(i);
        String newA3 = wrong3.get(i);
        Label question = new Label(newQ);
        labelC = new Label(newC);
        Label firstL = new Label(newA1);
        Label secL;
        secL = new Label(newA2);
        Label thirdL = new Label(newA3);
        n = rand.nextInt(3);
        if(n == 0){
            labelC = a;
            firstL = b;
            secL = c;
            thirdL = d;
        }
        else if(n == 1){
            labelC = b;
            firstL = c;
            secL = d;
            thirdL = a;
        }
        else if(n == 2){
            labelC = c;
            firstL = d;
            secL = a;
            thirdL = b;
        }
        else if(n == 3){
            labelC = d;
            firstL = a;
            secL = b;
            thirdL = c;
           }
    }
    public void incorrect(){
        Alert alert = new Alert(AlertType.CONFIRMATION);
        alert.setTitle("Incorrect.!");
        alert.setHeaderText("Incorrect.");
        alert.setContentText("I'm sorry, but that was the wrong answer.");

        ButtonType buttonTypeNext = new ButtonType("Next Question");
        ButtonType buttonTypeBack = new ButtonType("Back to Main");

        alert.getButtonTypes().setAll(buttonTypeNext, buttonTypeBack);

        Optional<ButtonType> result = alert.showAndWait();
        ButtonType buttonTypeOne;
        if (result.get() == buttonTypeNext){
            // switch to the next question page
        } else {
            // switch to the main home page
        }
    }
}
    
    

    

       /* ButtonType buttonTypeNext = new ButtonType("Next Question");
        ButtonType buttonTypeBack = new ButtonType("Back to Main");

        alert.getButtonTypes().setAll(buttonTypeNext, buttonTypeBack);

        Optional<ButtonType> result = alert.showAndWait();
        ButtonType buttonTypeOne;
        if (result.get() == buttonTypeNext){
            // switch to the next question page
        } else {
            // switch to the main home page
        }*/ 
