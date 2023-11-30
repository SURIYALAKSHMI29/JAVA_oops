import java.awt.BorderLayout; import java.awt.Color;
import java.awt.FlowLayout; import java.awt.Point;
import java.awt.event.ActionEvent; import java.awt.event.ActionListener; import java.awt.event.MouseAdapter; import java.awt.event.MouseEvent; import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.table.DefaultTableModel; import javax.swing.JMenuBar;
import javax.swing.*;
import java.awt.event.WindowAdapter; import java.awt.event.WindowEvent; import java.sql.Connection;
import java.sql.DriverManager; import java.sql.ResultSet; import java.sql.Statement; import java.util.ArrayList; import java.util.*;

public class GUI extends JFrame implements ActionListener { JPanel northPanel= new JPanel();
JPanel southPanel= new JPanel();
JLabel welcomeText = new JLabel("Welcome to Lifeline! Pick up your choice from the menu above, or double click on a patient's record.");
static JTable patientsTable = new JTable() {
private static final long serialVersionUID = 1L; public boolean isCellEditable(int row, int column) {

return false;
};
};
static DefaultTableModel model = new DefaultTableModel(){}; JMenuBar menuBar = new JMenuBar();
JMenu fileMenu = new JMenu("File");
JMenu patientsMenu = new JMenu("Patients"); JMenu lifeLineMenu = new JMenu("Lifelines"); JMenu aboutMenu = new JMenu("About Us"); JMenu contactMenu = new JMenu("Contact Us"); JMenuItem fileExit = new JMenuItem("Exit");
JMenuItem addPatientMenu = new JMenuItem("Add patient"); JMenuItem removePatientMenu = new JMenuItem("Remove Patient"); JMenuItem updatePatientMenu = new JMenuItem("Update Patient"); JMenuItem addLifelineMenu = new JMenuItem("Add a Lifeline Record");
JMenuItem showLifelineMenu = new JMenuItem("Show the Lifeline of a user"); JMenuItem showAboutUs = new JMenuItem("Click Here");
JMenuItem showContactUs = new JMenuItem("Click Here");

public static void main(String[] args) {
GUI graphicUserInterface = new GUI(); patientsTable.setModel(model); loadData();
}


//Graphical user interface constructor public GUI(){
//Adding Menus Mnemonics fileMenu.setMnemonic('F'); patientsMenu.setMnemonic('P'); lifeLineMenu.setMnemonic('L'); aboutMenu.setMnemonic('A'); contactMenu.setMnemonic('C'); setLayout(new BorderLayout()); setSize(800,600); setTitle("Lifeline");
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); setLocationRelativeTo(null);
setVisible(true); setResizable(false); add("North", northPanel); add("South", southPanel); northPanel.add(menuBar); southPanel.add(welcomeText);

//Adding the Table
add(new JScrollPane(patientsTable));
//End of adding the Table
//Adding menus to menubar menuBar.add(fileMenu);
menuBar.add( Box.createHorizontalStrut( 30 ) ); menuBar.add(patientsMenu);
menuBar.add( Box.createHorizontalStrut( 30 ) ); menuBar.add(lifeLineMenu);

menuBar.add( Box.createHorizontalStrut( 30 ) ); menuBar.add(aboutMenu);
menuBar.add( Box.createHorizontalStrut( 30 ) ); menuBar.add(contactMenu);

//Adding submenus to menus fileMenu.add(fileExit); patientsMenu.add(addPatientMenu); patientsMenu.add(updatePatientMenu); patientsMenu.add(removePatientMenu); lifeLineMenu.add(addLifelineMenu); lifeLineMenu.add(showLifelineMenu); aboutMenu.add(showAboutUs); contactMenu.add(showContactUs);

//Adding the ActionListeners fileExit.addActionListener(this); addPatientMenu.addActionListener(this); updatePatientMenu.addActionListener(this); removePatientMenu.addActionListener(this); addLifelineMenu.addActionListener(this); showLifelineMenu.addActionListener(this); showAboutUs.addActionListener(this); showContactUs.addActionListener(this); aboutMenu.addActionListener(this);

//Mouse listener for the JTable patientsTable.addMouseListener(new MouseAdapter() {\

public void mousePressed(MouseEvent me) { int row= patientsTable.getSelectedRow();
if (me.getClickCount() == 2) {
Object[] possibleValues = {"Remove the Patient", "Update the Patient", "Show Lifeline", "Add a Lifeline"};
Object SelectedValue= JOptionPane.showInputDialog(null, "Choose your option", "Select an Action", JOptionPane.INFORMATION_MESSAGE, null, possibleValues, possibleValues[0]);
String id = (String) patientsTable.getModel().getValueAt(row, 0); if(SelectedValue=="Remove the Patient"){
RemovePatientForm removePatient= new
 
RemovePatientForm();
 

removePatient.setIdText(id);
}
 



1);
 
if(SelectedValue=="Update the Patient"){
UpdatePatientForm updatePatient = new UpdatePatientForm(); String name = (String) patientsTable.getModel().getValueAt(row,
String surname = (String)
 
patientsTable.getModel().getValueAt(row, 2);
String birth = (String) patientsTable.getModel().getValueAt(row,
3);
String blood = (String)
patientsTable.getModel().getValueAt(row, 4);
String phone = (String) patientsTable.getModel().getValueAt(row, 5);
String email = (String)
patientsTable.getModel().getValueAt(row, 6);
String country = (String) patientsTable.getModel().getValueAt(row, 7);
updatePatient.setAllText(id, name, surname, birth, blood, phone,
 
email, country);


ShowLifelineRecords();
 

}
if(SelectedValue=="Show Lifeline"){ ShowLifelineRecords record = new

record.showLifeline(id);
 
}
if(SelectedValue=="Add a Lifeline"){
AddLifelineRecord add = new AddLifelineRecord(); add.setId(id);
}
}
}
});

this.addWindowListener(new WindowAdapter() public void windowActivated(WindowEvent e) {
loadData();
}
});
}
public void actionPerformed(ActionEvent arg0) { if(arg0.getSource()==fileExit){
System.exit(DO_NOTHING_ON_CLOSE);
}
if(arg0.getSource()==addPatientMenu){ addPatientForm f1= new addPatientForm();
}
if(arg0.getSource()== updatePatientMenu){ UpdatePatientForm f2 = new UpdatePatientForm();
}
if(arg0.getSource()==removePatientMenu){ RemovePatientForm f3 = new RemovePatientForm();
}
if(arg0.getSource()==addLifelineMenu){ AddLifelineRecord f4 = new AddLifelineRecord();
}
if(arg0.getSource()==showLifelineMenu){ ShowLifelineRecords f5 = new ShowLifelineRecords();
}
if(arg0.getSource()== showAboutUs){
AboutUs f6 = new AboutUs();
}
if(arg0.getSource()==showContactUs){ ContactUs f7 = new ContactUs();
}
}
public static void loadData(){
//Connecting to the database
final String DATABASE_URL="jdbc:mysql://localhost/javaproject"; Connection connection = null;
Statement statement = null;
 

try{
ResultSet resultSet = null;
Object[] columnsName = new Object[8]; columnsName[0] = "ID";
columnsName[1] = "Name"; columnsName[2] = "Surname";
columnsName[3] = "Date of Birth (yyyy-mm-dd)"; columnsName[4]="Blood Type"; columnsName[5]="Phone Number"; columnsName[6]="Email"; columnsName[7]="Country"; model.setColumnIdentifiers(columnsName); Object[] rowData = new Object[8];

connection=DriverManager.getConnection(DATABASE_URL,"root",""); statement = connection.createStatement();
resultSet= statement.executeQuery("select * from lifeliners"); model.setRowCount(0);
while(resultSet.next()){
rowData[0] = resultSet.getString("p_id"); rowData[1] = resultSet.getString("p_name"); rowData[2] = resultSet.getString("p_surname"); rowData[3] = resultSet.getString("p_date_of_birth"); rowData[4] = resultSet.getString("p_blood_type"); rowData[5] = resultSet.getString("p_phone"); rowData[6] = resultSet.getString("p_email"); rowData[7] = resultSet.getString("p_country"); model.addRow(rowData);

}
}
catch(Exception exc){
exc.printStackTrace();
}
}} 

 
