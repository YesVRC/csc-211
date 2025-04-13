import javax.swing.*;
import java.util.Scanner;

/**
   This program demonstrates the PassFailExam class.
*/

public class PassFailExamDemo
{
   public static void main(String[] args)
   {
      String input;
      int questions;     // Number of questions
      int missed;        // Number of questions missed
      double minPassing; // Minimum passing score

      input = JOptionPane.showInputDialog("How many questions are on the exam? ");
      questions = Integer.parseInt(input);

      input = JOptionPane.showInputDialog("How many questions did the student miss? ");
      missed = Integer.parseInt(input);

      input = JOptionPane.showInputDialog("What is the minimum passing score? ");
      minPassing = Double.parseDouble(input);

      // Create a PassFailExam object.
      PassFailExam exam =
           new PassFailExam(questions, missed, minPassing);

      String[] messages = {
              "Each question counts " +  exam.getPointsEach() + " points.",
              "The exam score is " + exam.getScore(),
              "The exam grade is " + exam.getGrade()

      };
      JOptionPane.showMessageDialog(null,
              messages
              );

      System.exit(0);

   }
}
