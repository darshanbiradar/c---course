import java.awt.Font;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import javax.swing.*;

public class student {
    private static JFrame f;   
    private static JButton  topperlist,invscore;
    private static JTextField h;
    private static JLabel l1,l2;
    public static void main(String[] args){
        Font font=new Font("Cooper Black",Font.BOLD,18);
        File file=new File("D:\\c++ course\\termwork\\data.txt"); 
        try{
            Scanner scan=new Scanner(file);
        }catch(IOException e){
            JOptionPane.showMessageDialog(f, e, "File Not Found", 1);
        }
        f=new JFrame("Detail Catalog");
        f.setSize(400, 400);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLayout(null);
        f.setLocationRelativeTo(null);

        l1=new JLabel("Greetings Teacher");
        l1.setBounds(50, 20, 180, 20);
        l1.setFont(font);
        f.add(l1);

        l2=new JLabel("How may I Help you Today...");
        l2.setFont(font);
        l2.setBounds(0, 0, 0, 0);
        l2.setSize(0, 0);

        f.setVisible(true);

    }

}
