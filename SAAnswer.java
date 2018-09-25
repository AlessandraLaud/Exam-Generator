/*
    Name: Sakshi Maheshwari
*/

import java.io.PrintWriter;
import java.util.Scanner;

import javax.swing.*;
import javax.swing.DefaultListModel;
public class SAAnswer extends Answer{

    protected String text;

    public SAAnswer(String text){

        this.text = text;
    }

    public SAAnswer(Scanner sc){
        super(sc);
        text = sc.nextLine();
    }

    public void print(){
        System.out.println(text);
    }

    public void print(DefaultListModel listModel, String answerNum){
        listModel.addElement(answerNum + text);
    }

    public double getCredit(Answer rightAnswer){

        String correctAnswer = ((SAAnswer)rightAnswer).text.toLowerCase();

        if ((text.toLowerCase()).equals(correctAnswer)){
            return 1.0;
        }
        else{
            return 0.0;
        }
    }

    public void save(PrintWriter p){
        p.println(text);
    }

    public void printGUI(JTextArea area) {
        area.append(text + "\n");
    }
}