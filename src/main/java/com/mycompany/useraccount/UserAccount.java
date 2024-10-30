/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.useraccount;

import java.util.Scanner;
import javax.swing.*;

/**
 *
 * @author Blessing
 */
public class UserAccount {

    public static void main(String[] args) {
           //Class instance creation
        Login infor = new Login();
        Task upload = new Task();

        
             //creating a scannner
        Scanner sc = new Scanner(System.in);
        
        //prompting user to enter name, lastname
        System.out.println("Enter your name:");
       
        infor.setName(sc.next());
        
        System.out.println("Enter your lastname:");
       
        infor.setsurname(sc.next());
        
        
        //creating username and password
        System.out.println("Create a username not longer than 5 characters and contains an underscore");
        String initialUsername = sc.next();
        
        
        
       System.out.println("Create a password longer than 7 characters");
       String initialPassword = sc.next();
       
         //Proccess of verifying conditions for registration
       if(infor.checkUserName(initialUsername) && infor.checkPasswordComplexity(initialPassword) ){
           
        //callinng the registerUser method
        String register;
                register= infor.registerUser(initialUsername, initialPassword);
        System.out.println(register);
        
}
       
       
       //login to account
       if(initialUsername.contains("_") && initialUsername.length() <= 5 && infor.checkPasswordComplexity(initialPassword)){
       //prompting user to enter username and password
       System.out.println("Enter your username:");
      String finalUserName= sc.next();
       
       
       System.out.println("Enter your password:");
        
       String finalpassWord = sc.next();
       
       //testing if password and username entered matches recorded passoword and username
       if(infor.loginUser( finalUserName, finalpassWord, initialUsername , initialPassword)){
                 
      
           //calling loginstatus method
           String status = infor.returnLoginStatus(finalUserName, finalpassWord ,initialUsername ,initialPassword );
           System.out.println(status);
           
            final JDialog print = new JDialog();
            print.setAlwaysOnTop(true);
            
            JOptionPane.showMessageDialog(print,"Welcome to Easykanban","Welcome",JOptionPane.INFORMATION_MESSAGE);
            
          
            
             int options = 0;
             //while loop till option quit is choosen
            while(options !=3){
             
            
            String [] response = {"1. Add task", "2. Show report", "3. Quit"};//array for menu option
            
            //JOptionPane to get option from user
             int menu =JOptionPane.showOptionDialog(print, "Choose option from the given menu:", "Menu", options, JOptionPane.PLAIN_MESSAGE, null, response, response[0]);
             options = menu;
            
            //switch case for different option choices
            switch(options){
                
                //add task option
                case 0:
                    
                    //asking user to enter tasks
                    int tasks =Integer.parseInt(JOptionPane.showInputDialog(print, "How many task do you want to enter?", "task entered", JOptionPane.QUESTION_MESSAGE));
                    String [] definetasks = new String [tasks];
                    
                   for (int i =0; i < definetasks.length; i++) {
                       
                      String taskName = JOptionPane.showInputDialog(print, "Enter task name:");
                      
                      
                      String taskDescription =JOptionPane.showInputDialog(print, "Enter task description:");
                      
                      if(upload.checktaskdescription(taskDescription)){
                       JOptionPane.showMessageDialog(print,"Task successfully captured","Task Capture",JOptionPane.INFORMATION_MESSAGE);
               
                      }
                      else {
                       JOptionPane.showMessageDialog(print,"Please enter a task description of less than 50 characters","Task Capture",JOptionPane.ERROR_MESSAGE);   
                      }
                      
                      String developer_details =  JOptionPane.showInputDialog(print, "Enter developer's fullname:");
                      
                      int time = Integer.parseInt(JOptionPane.showInputDialog(print, "Enter task duration (in hours)", "task duration", JOptionPane.PLAIN_MESSAGE));
                      
                     String taskID =upload.createTaskID(taskName, developer_details,i);
                     JOptionPane.showMessageDialog(print,upload.createTaskID(taskName, developer_details,i),"task ID",JOptionPane.INFORMATION_MESSAGE);
                    
                     
                      int statusOption = 0;
                       
                     String [] statusChoice = {"To Do", "Done", "Doing"};
                     int taskStatus =JOptionPane.showOptionDialog(print, "Enter status of task", "task status", options,JOptionPane.QUESTION_MESSAGE,null, statusChoice, statusChoice[0]);
                      
                     statusOption =taskStatus;
                    
                     String statusToUser = "";
                     switch (statusOption){
                         case 0: 
                          statusToUser = "To Do";
                          JOptionPane.showMessageDialog(print,statusToUser,"status",JOptionPane.INFORMATION_MESSAGE);
                         break;
                         case 1:
                             statusToUser = "Done";
                             JOptionPane.showMessageDialog(print,statusToUser,"status",JOptionPane.INFORMATION_MESSAGE);
                         break;
                         
                         case 2: 
                              statusToUser = "Doing";
                             JOptionPane.showMessageDialog(print, statusToUser,"status",JOptionPane.INFORMATION_MESSAGE);
                         break;
                     }
                     //create.printTaskdetails(taskDescription, taskID, taskname,  developerDetails,  tasks, statusOption, duration );
                     JOptionPane.showMessageDialog(print,upload.printTaskdetails(taskDescription, taskID, taskName,  developer_details,  i, statusToUser, time ) , "Full task details", JOptionPane.INFORMATION_MESSAGE);
                     int totalHours = 0;
                     
                     
                     JOptionPane.showMessageDialog(print,"Total time:"+ upload.returnTotalhours(time)+" hours","Total time", JOptionPane.INFORMATION_MESSAGE);

                     
                   }
                                       break;
                    //show report option
                case 1:
                    //message to user that option 2 is in development
                    JOptionPane.showMessageDialog(print,"Coming Soon","Task",JOptionPane.INFORMATION_MESSAGE);
                    break;
                    //quit option
                case 2:
                    options = 3;
                    break;
                default: JOptionPane.showMessageDialog(print,"Invalid option"," error!!",JOptionPane.ERROR_MESSAGE);
            }
            }
       }
       else{
            //calling loginstatus method
           String status = infor.returnLoginStatus( finalUserName, finalpassWord,initialUsername , initialPassword);
           System.out.println(status);
       }
       
       }
       else{
            String register;
                register= infor.registerUser(initialUsername, initialPassword);
        System.out.println(register);
       }
    }
}
