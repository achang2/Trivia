/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trivia;

import java.net.URL;
import java.util.ArrayList;
import java.util.Random;
import java.util.ResourceBundle;
import java.util.Scanner;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Label;

/**
 * FXML Controller class
 *
 * @author Arthur
 */
public class BasicQuestionTemplateController implements Initializable {
    
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
   
    
    /**
     * @author Alec
     * @param s
     * @param a
     */
    public void scan(Scanner s, ArrayList<String> a){
        while(s.hasNext()){
            String q = s.next();
            a.add(q);
        }
    } 
    /**
     * Initializes the controller class.
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {     
 // TODO
    }
    public void check(){
        /*this method should check to see if the inputted answer is correct.
        *If the answer is correct, it should call the correct method. 
        *Otherwise, it should call the incorrect method.
        */        
    }
    public void correct(){
        Alert alert = new Alert(AlertType.CONFIRMATION);
        alert.setTitle("Correct!");
        alert.setHeaderText("Correct!");
        alert.setContentText("Congratulations! You got the question correct.");
        Readable q = null;
        Scanner myScan = new Scanner(q);
        ArrayList<String> ques = new ArrayList<>();
        scan(myScan, ques);
        Readable correct = null;
        Scanner cor = new Scanner(correct);
        ArrayList<String> correctAnswers = new ArrayList<>();
        scan(cor, correctAnswers);
        Readable w1 = null;
        Scanner first = new Scanner(w1);
        ArrayList<String> wrong1 = new ArrayList<>();
        scan(first, wrong1);
        Readable w2 = null;
        Scanner sec = new Scanner(w2);
        ArrayList<String> wrong2 = new ArrayList<>();
        scan(sec, wrong2);
        Readable w3 = null;
        Scanner third = new Scanner(w3);
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
        Label labelC = new Label(newC);
        Label firstL = new Label(newA1);
        Label secL;
        secL = new Label(newA2);
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
    /*public void incorrect(){
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
    }*/
