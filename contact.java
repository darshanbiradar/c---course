import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.Scanner;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

class file{
    private File f;
    public file(String f){
        this.f=new File(f);
    }
    public String namesearch(String s){
        try{
        Scanner scan=new Scanner(f);
            while (scan.hasNextLine()){
                String data =scan.next();
                if(s.equalsIgnoreCase(data))
                {

                }
        }
        return"";
    }
   }
}
public class contact  implements ActionListener{
    private  static JFrame f;
    private static JTextField t1;
    private static JButton submit;
    private static JLabel head,text;
    public static void main(String[] args){
        f= new JFrame("Contacts");
        f.setLayout(null);
        f.setSize(400, 400);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        head= new JLabel("Search in Contacts File");
        head.setBounds(120, 30, 140, 50);
        head.setFont(new Font("Calibri",Font.BOLD,14));
        f.add(head);
        text=new JLabel("Name:");
        text.setBounds(40,80,50,30);
        text.setFont(new Font("Calibri",Font.PLAIN,12));
        f.add(text);

        t1=new JTextField();
        t1.setBounds(90,80,160,30);
        f.add(t1);

        submit= new JButton("Search");
        submit.setBounds(80,120,100,30);
        submit.addActionListener(new contact());
        f.add(submit);
        

        f.setVisible(true);
    }
    
    public void actionPerformed(ActionEvent e){
        
    }
    
}
