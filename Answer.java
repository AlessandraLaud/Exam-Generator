/*
    Name: Sakshi Maheshwari
*/

import java.io.PrintWriter;
import java.util.*;
import java.util.Random;
import javax.swing.DefaultListModel;
import javax.swing.*;

public abstract class Answer {

    protected Answer(){
    }
    public Answer(Scanner sc){
    }
    public abstract void print();
    public abstract void print(DefaultListModel listModel, String answerNum);
    public abstract double getCredit(Answer rightAnswer);
    public abstract void save(PrintWriter p);

    public abstract void printGUI(JTextArea area);

}