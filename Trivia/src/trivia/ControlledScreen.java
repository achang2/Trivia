/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trivia;

/**
 *
 * @author Shoshana
 */
public abstract class ControlledScreen {
    //This method will allow the injection of the Parent ScreenPane 
    protected ScreensController myController;
    public void setScreenParent(ScreensController screenParent){ 
        myController = screenParent; 
    } 
}
