# EmailGenerator


The email generator that I created is a program that implements a prototype user interface for composing an email message.The program should also display a dialog box alerting the user that the message has been sent. When the user closes the dialog box, all text fields and text areas should be emptied.

#Implementation
In this program, I created it repetitely. This program contains two classes: "LabAssignment.java" and "Main.java". "LabAssignment.java" I created the Send button, To field, From field, and Subject Field. 


##LabAssignment4.java
###Methods
public class LabAssignment extends JPanel implements ActionListener: is actually the method in which I Created all of the following fields: To, From, Subject message, and I created a send button.

public void actionPerformed(ActionEvent event): In this function, I created it where it sends the user a null message if the user don't fill out all of the necessary fields. 


##Main.java
The main class is short and sweet. All I did was the system.out.println to tell the program to tell what I wanted the output to say. 

#How to run LabAssignment.java
I assume you have the Java Development Kit installed on your machine, so you will just run this like any other java program:

Open the command prompt in the directory containing "Main.java" and "LabAssignment.java".

Compile the Main class by typing: "javac Main.java" and hit enter in the command prompt.

Now that the program is compiled, run it by typing "java Main" and hit enter.




