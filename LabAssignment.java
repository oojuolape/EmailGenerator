import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;

public class LabAssignment4 extends JPanel implements ActionListener {
    private JLabel toLabel;
    private JLabel ccLabel;
    private JLabel bccLabel;
    private JLabel subjectLabel;
    private JLabel messageLabel;
    private PrintWriter outField;
    
    protected JTextField toField;
    protected JTextField ccField;
    protected JTextField bccField;
    protected JTextField subjectField;
    protected JTextArea messageArea;
    protected JButton sendButton;

    public LabAssignment4() {
        // TODO
        toLabel = new JLabel ("To:");
        toField = new JTextField(12);
        toField.addActionListener(this);
        
        ccLabel = new JLabel("Cc: ");
        ccField = new JTextField(12);
        ccField.addActionListener(this);
        
        bccLabel = new JLabel("Bcc: ");
        bccField = new JTextField(12);
        bccField.addActionListener(this);
        
        subjectLabel = new JLabel("Subject: ");
        subjectField = new JTextField(12);
        subjectField.addActionListener(this);
        
        messageLabel = new JLabel("Message: ");
        messageArea = new JTextArea("");
        
        sendButton = new JButton("Send!");
        sendButton.addActionListener(this);
        
        setLayout(new FlowLayout());
        add(toLabel);
        add(toField);
        add(ccLabel);
        add(ccField);
        add(bccLabel);
        add(bccField);
        add(subjectLabel);
        add(subjectField);
        add(messageLabel);
        add(messageArea);
        add(sendButton);
        
        
        
    }

    public void actionPerformed(ActionEvent event) {
        // TODO
        // The file to write has the path "./Root/res/email.txt".
        try{
            outField = new PrintWriter("./Root/res/email.txt");
            String to = toField.getText();
            String cc = ccField.getText();
            String bcc = bccField.getText();
            String subject = subjectField.getText();
            String message = messageArea.getText();
            if(outField != null && event.getSource() == sendButton){
                outField.println("To: " + to);
				outField.println("CC: " + cc);
				outField.println("Bcc: " + bcc);
				outField.println("Subject: " + subject);
				outField.println("Message: " + message) ;
				outField.close();
				
				bccField.setText("");
				toField.setText("");
				ccField.setText("");
				subjectField.setText("");
				messageArea.setText("");
            }
        }
        
        catch(FileNotFoundException e){
            outField = null;
        }
        
    }
}