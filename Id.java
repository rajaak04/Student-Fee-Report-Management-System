package files;
import javax.swing.*;
import java.awt.event.*;
import java.awt.print.PrinterException;
public class Id implements ActionListener{
    JFrame j;
    JLabel h,h1,h2,h3,h4,h5,h6,h7,h8,h9,h10,h11,h12,h13,h17;
    JTextField t1,t2,t3,t4,t5,t7,t8,t9;
    JTextArea t6,t10;
    JRadioButton b1,b2,b3,b4,b5,b6;
    JComboBox<String> c,c1,c2;
    JList l,l1;
    JButton b,B1,B2,B3;
    String a1,a2,a3,a4,a5,a6,a7,a8,a9,a10,a11,a12,a13,a14,a15,a16,a17,data;
   
    Id(){
       
   
     j=new JFrame("Student Fee Report");
     h=new JLabel("Student Fee Report Management System");
    h1= new JLabel("Name of the Student:  ");
    t1=new  JTextField();
    h2= new JLabel("Name of the Father:  ");
    t2=new  JTextField();
    h3= new JLabel("Roll Number:  ");
    t3=new  JTextField();
    h4= new JLabel("Email Id:  ");
    t4=new  JTextField();
    h5= new JLabel("Contact Number:  ");
    t5=new  JTextField();
    h6= new JLabel("Address:  ");
    h7= new JLabel("Gender:  ");
    t6=new JTextArea();
    h8= new JLabel("Nationality:  ");
    t7=new JTextField();
    h9= new JLabel("Gender: ");
    b1=new JRadioButton("Male");
    b2=new JRadioButton("Female");
    b3=new JRadioButton("SEAS");
    b4=new JRadioButton("SLABS");
    b5=new JRadioButton("HOSTELLER");
    b6=new JRadioButton("DAY SCHOLAR");
    h11=new JLabel("Points Secured in 10th:  ");
    h12=new JLabel("  Percentage in 12th:");
    t8=new JTextField();
    t9=new JTextField();
    t10=new JTextArea();
    String name[]={"2015","2016","2017"};
    String name1[]={"2017","2018","2019"};
    String name2[]={"CSE","CSBS","MECH","ECE","EEE"};
    c=new JComboBox<>(name);
    c1=new JComboBox<>(name1);
    c2=new JComboBox<>(name2);
     h13 = new JLabel("");
    h13.setBounds(690, 366, 554, 14);
    h17 = new JLabel("Groups offered here are:");
    h17.setBounds(812, 74, 142, 14);
    h10=new JLabel("Year of passing 10th");
    DefaultListModel<String> d=new DefaultListModel();
    d.addElement("CSE(2,50,000)");
    d.addElement("CSBS(2,50,000)");
    d.addElement("ECE(2,50,000)");;
    d.addElement("EEE(2,50,000)");
    d.addElement("MECH(2,50,000)");
    l=new JList<>(d);
    DefaultListModel<String> d1=new DefaultListModel();
    d1.addElement("2 SHARE(1,50,000)");
    d1.addElement("3 SHARE(1,40,000)");
    d1.addElement("5 SHARE(1,20,000)");;
    d1.addElement("8 SHARE(1,10,000)");
    d1.addElement("Bus(40,000)");
    l1=new JList<>(d1);
    b=new JButton("Show");
    b.addActionListener(new ActionListener() {
    	public void actionPerformed(ActionEvent e) {
    		if(l.getSelectedIndex()!=-1) {
    			if(l1.getSelectedIndex()!=-1) {
    			data="You have Selected the Group: "+ l.getSelectedValue()+"and the Facility of Hostel with"+l1.getSelectedValue();
    			h13.setText(data);
    		}}
    		
    	}
    });
    B1=new JButton("Generate Recipt");
    B1.addActionListener(new ActionListener() {
    	public void actionPerformed(ActionEvent e) {
    		a1=h1.getText()+t1.getText()+"\n";
    		a2=a1+h2.getText()+t2.getText()+"\n";
    		a3=a2+h3.getText()+t3.getText()+"\n";
    		a4=a3+h4.getText()+t4.getText()+"\n";
    		a5=a4+h5.getText()+t5.getText()+"\n";
    		a6=a5+h6.getText()+t6.getText()+"\n";
    		if(b1.isSelected()) {
    			a7=b1.getText();
    		}
    		if(b2.isSelected()) {
    			a7=b2.getText();
    		}
    		a8=a6+h7.getText()+a7+"\n";
    		a9=a8+h8.getText()+t7.getText()+"\n";
    		a10=a9+h10.getText()+c.getItemAt(c.getSelectedIndex())+"-"+c1.getItemAt(c1.getSelectedIndex())+"\n";
    		a11=a10+h11.getText()+t8.getText()+"\n";
    		a12=a11+h17.getText()+c2.getItemAt(c2.getSelectedIndex())+"\n";
    		if(b3.isSelected()) {
    			a13=b3.getText();
    		}
    		if(b4.isSelected()) {
    			a13=b4.getText();
    		}
    		a14=a12+a13+"\n";
    		if(b5.isSelected()) {
    			a15=b5.getText();
    		}
    		if(b6.isSelected()) {
    			a15=b6.getText();
    		}
    		a16=a14+a15+"\n";
    		a17=a16+h12.getText()+t9.getText();
    		
    		
    		
    		
            t10.setText(a17);
    		
    	}
    });
    B2=new JButton("Reset");
    B3=new JButton("Print");
    B3.addActionListener(new ActionListener() {
    	public void actionPerformed(ActionEvent e) {
    		try {
				t10.print();
			} catch (PrinterException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
    	}
    });
   
    h.setBounds(500,1,300,40);
    h1.setBounds(10,30,150,90);
    h2.setBounds(10,80,150,90);
    h3.setBounds(10,130,150,90);
    h4.setBounds(10,180,70,90);
    h5.setBounds(10,230,150,90);
    h6.setBounds(10,290,80,90);
   
    h7.setBounds(10,380,80,90);
    h8.setBounds(10,430,80,90);
    t1.setBounds(200,68,250,15);
    t2.setBounds(200,118,250,15);
    t3.setBounds(200,168,250,15);
    t4.setBounds(200,218,250,15);
    t5.setBounds(200,268,250,15);
    t6.setBounds(200,328,250,70);
    t7.setBounds(200,467,250,15);
    t8.setBounds(200,600,250,15);
    t9.setBounds(1100,68,250,15);
    b1.setBounds(200,420,100,20);
    b2.setBounds(320,395,250,70);
    b3.setBounds(500,58,100,30);
    b4.setBounds(600,58,100,30);
    b5.setBounds(500,108,100,30);
    b6.setBounds(600,108,120,30);
    h10.setBounds(10,480,130,90);
    h11.setBounds(10,560,150,90);
    h12.setBounds(980,30,400,90);
    c.setBounds(200,510,250,30);
    c1.setBounds(200,540,250,30);
    c2.setBounds(820,114,100,22);
    l.setBounds(690,218,110,100);
    l1.setBounds(900,218,110,100);
    b.setBounds(1100,218,70,40);
    B1.setBounds(690,400,200,25);
    B2.setBounds(890,400,200,25);
    B3.setBounds(1088,400,200,25);
    t10.setBounds(690,447,600,400);
    B2.addActionListener(this);


     j.getContentPane().add(h);
    j.getContentPane().add(h1);
    j.getContentPane().add(h2);
    j.getContentPane().add(h3);
    j.getContentPane().add(h4);
    j.getContentPane().add(h5);
    j.getContentPane().add(h6);
    j.getContentPane().add(h7);
    j.getContentPane().add(t1);
    j.getContentPane().add(t2);
    j.getContentPane().add(t3);
    j.getContentPane().add(t4);
    j.getContentPane().add(t5);
    j.getContentPane().add(t6);
    j.getContentPane().add(h7);
    j.getContentPane().add(h8);
    j.getContentPane().add(b1);
    j.getContentPane().add(b2);
    j.getContentPane().add(t7);
    j.getContentPane().add(h10);
    j.getContentPane().add(c);
    j.getContentPane().add(c1);
    j.getContentPane().add(t8);
    j.getContentPane().add(h11);
    j.getContentPane().add(b3);
    j.getContentPane().add(b4);
    j.getContentPane().add(b5);
    j.getContentPane().add(b6);
    j.getContentPane().add(h12);
    j.getContentPane().add(t9);
    j.getContentPane().add(c2);
    j.getContentPane().add(l);
    j.getContentPane().add(l1);
    j.getContentPane().add(b);
    j.getContentPane().add(B1);
    j.getContentPane().add(B2);
    j.getContentPane().add(B3);
    j.getContentPane().add(t10);
    j.getContentPane().add(h13);

    j.getContentPane().add(h17);
    
    j.getContentPane().setLayout(null);
    
    
 
    j.setVisible(true);
    j.setSize(1268,788);
    
    }
    public void actionPerformed(ActionEvent e){
        String data=" ";
        if(e.getSource() == B2){
            t1.setText(" ");
             t2.setText(" ");
              t3.setText(" ");
               t4.setText(" ");
                t5.setText(" ");
                 t6.setText(" ");
                  t7.setText(" ");
                   t8.setText(" ");
                    t9.setText(" ");
                     t10.setText(" ");
           
           
        }
        
        }
    

public static void main(String[] args){
    Id f =new Id();
}	
}