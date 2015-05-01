/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trivia;

import java.io.File;
import java.io.FileNotFoundException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Random;
import java.util.ResourceBundle;
import java.util.Scanner;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.Button;

/**
 *
 * @author Arthur
 */
public class HomePageController implements Initializable, ControlledScreen {
    
    ScreensController myController;
    
    @FXML
    private Label question;
    
    @FXML
    private button newGame;
            
    private Label a;
    
    @FXML
    private Label b;
    
    @FXML
    private Label c;
    
    @FXML
    private Label d;
    
    @FXML
    /**
     * @author Alec
     */
    public void scan(Scanner s, ArrayList<String> a){
        while(s.hasNext()){
            String q = s.next();
            a.add(q);
        }
    }
            
    
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
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
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }
    
    @Override
    public void setScreenParent(ScreensController screenParent){ 
        myController = screenParent; 
    } 
    
}
