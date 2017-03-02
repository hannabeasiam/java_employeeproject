import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;

public class EmployeeGUITester extends JFrame {

	private JPanel contentPane;
	private JTextField txtFirstName;
	private JTextField txtLastName;
	private JTextField txtDepartment;
	private JTextField txtStartYear;
	private JTextField txtSocialSecurityNumber;
	private JTextField txtDepartmentCode;
	private JTextField txtWeeklyhoursworked;
	private JTextField txtHourlyRate;
	private JLabel lblDepartment;
	private JLabel lblStartYear;
	private JLabel lblDepartmentCode;
	private JLabel lblHourlyRate;
	private JLabel lblNewLabel;
	private JLabel lblLname;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JButton btnClear;
	private JButton btnClearEntry;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				//Open a try catch to catch any exceptions
				try {
					//Instantiate the frame derived from the gui class
					EmployeeGUITester frame = new EmployeeGUITester();
					//Make the frame visible 
					frame.setVisible(true);
					//pass any exception
				} catch (Exception e) {
					//display stack strace
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public EmployeeGUITester() {
		//Make sure the frame exit when you hit
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//set the size of the window
		setBounds(100, 100, 450, 380);
		//instantiate a new jPannel
		contentPane = new JPanel();
		//make an the border even with identical parameters
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		//now that we created a content pane lets apply it
		setContentPane(contentPane);
				contentPane.setLayout(null);
		
		txtFirstName = new JTextField();
		txtFirstName.setText("First Name");
		txtFirstName.setBounds(56, 6, 151, 26);
		contentPane.add(txtFirstName);
		txtFirstName.setColumns(10);
		
		txtLastName = new JTextField();
		txtLastName.setText("Last Name");
		txtLastName.setBounds(56, 39, 151, 26);
		contentPane.add(txtLastName);
		txtLastName.setColumns(10);
		
		txtDepartment = new JTextField();
		txtDepartment.setText("Department");
		txtDepartment.setBounds(293, 6, 151, 26);
		contentPane.add(txtDepartment);
		txtDepartment.setColumns(10);
		
		txtStartYear = new JTextField();
		txtStartYear.setText("2013");
		txtStartYear.setBounds(293, 39, 151, 26);
		contentPane.add(txtStartYear);
		txtStartYear.setColumns(10);
		
		txtSocialSecurityNumber = new JTextField();
		txtSocialSecurityNumber.setText("111223333");
		txtSocialSecurityNumber.setBounds(56, 66, 151, 26);
		contentPane.add(txtSocialSecurityNumber);
		txtSocialSecurityNumber.setColumns(10);
		
		txtDepartmentCode = new JTextField();
		txtDepartmentCode.setText("1231");
		txtDepartmentCode.setBounds(293, 66, 151, 26);
		contentPane.add(txtDepartmentCode);
		txtDepartmentCode.setColumns(10);
		
		txtWeeklyhoursworked = new JTextField();
		txtWeeklyhoursworked.setText("27");
		txtWeeklyhoursworked.setBounds(56, 92, 151, 26);
		contentPane.add(txtWeeklyhoursworked);
		txtWeeklyhoursworked.setColumns(10);
		
		txtHourlyRate = new JTextField();
		txtHourlyRate.setText("54.30");
		txtHourlyRate.setBounds(293, 92, 151, 26);
		contentPane.add(txtHourlyRate);
		txtHourlyRate.setColumns(10);
		
		//Here is a label we created called  lblPrint we want to make sure this is about all references to it
		//in this example its higher than necessary but works fine
		JLabel lblPrint = new JLabel("");
		lblPrint.setVerticalAlignment(SwingConstants.TOP);
		lblPrint.setHorizontalAlignment(SwingConstants.CENTER);
		lblPrint.setBounds(6, 130, 427, 190);
		contentPane.add(lblPrint);
		

		//here we create labels  set font types and bounds for the lable whih can also be done in the gui
		lblDepartment = new JLabel("Department");
		lblDepartment.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		lblDepartment.setBounds(213, 11, 81, 16);
		contentPane.add(lblDepartment);
		
		lblStartYear = new JLabel("Start Year");
		lblStartYear.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		lblStartYear.setBounds(213, 44, 81, 16);
		contentPane.add(lblStartYear);
		
		lblDepartmentCode = new JLabel("Dep code");
		lblDepartmentCode.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		lblDepartmentCode.setBounds(213, 71, 81, 16);
		contentPane.add(lblDepartmentCode);
		
		lblHourlyRate = new JLabel("Hourly rate");
		lblHourlyRate.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		lblHourlyRate.setBounds(213, 97, 81, 16);
		contentPane.add(lblHourlyRate);
		
		lblNewLabel = new JLabel("fName");
		lblNewLabel.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		lblNewLabel.setBounds(6, 6, 49, 21);
		contentPane.add(lblNewLabel);
		
		lblLname = new JLabel("lName");
		lblLname.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		lblLname.setBounds(6, 44, 49, 16);
		contentPane.add(lblLname);
		
		lblNewLabel_1 = new JLabel("SSN");
		lblNewLabel_1.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		lblNewLabel_1.setBounds(6, 71, 49, 16);
		contentPane.add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("Hours");
		lblNewLabel_2.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		lblNewLabel_2.setBounds(6, 97, 49, 16);
		contentPane.add(lblNewLabel_2);
		
		//here a button that text will be red and il use to clear everything
		btnClear = new JButton("Clear all!");
		btnClear.setForeground(Color.RED);
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//notice in the button that clears everything
				//all i do is set the text for the label and boxes to null
				txtFirstName.setText(null);;
				txtLastName.setText(null);
				txtDepartment.setText(null);
				txtStartYear.setText(null);
				txtSocialSecurityNumber.setText(null);
				txtDepartmentCode.setText(null);
				txtWeeklyhoursworked.setText(null);
				txtHourlyRate.setText(null);
				
				lblPrint.setText(null);
			
			}
		});
		btnClear.setBounds(269, 323, 81, 29);
		contentPane.add(btnClear);
		
		JButton btnNewButton = new JButton("Process");
		btnNewButton.setForeground(Color.BLUE);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				//this one is for the most part self explanatory but i'l still give a briefing'
				//created a string builder to elegantly store errors
				StringBuilder errors = new StringBuilder();
				//set variables
				int errorCount = 0, sYear = 0, depCode = 0;
				double hrsWorked = 0, hRate = 0;
				
				
				//Checks for numbers in fields.

				
				//similar statement that Checks if feilds are empty
				//keep in mind the text box named txtFistName so i use the .getText() method 
				//to get what the user entered
				if (txtFirstName.getText().isEmpty()){
					//Notice how if i get errors I just append them to my 
					//error variable and I will display them all later!
					errors.append("\n\u2022Please enter first name.");
					//Here were also keeping trak of how many errors we have because if we have even one error
					//we will display it instead of what the user entered.
					errorCount++;
				}
				if (txtLastName.getText().isEmpty()){
					errors.append("\n\u2022Please enter last name.");
					errorCount++;
				}
				if (txtDepartment.getText().isEmpty()){
					errors.append("\n\u2022Please enter deparrtment name.");
					errorCount++;
				}
				if (txtStartYear.getText().isEmpty()){
					errors.append("\n\u2022Please enter start year.");
					errorCount++;
				}
				
				else{
					//this try catch block will try to parse integers, if it can't it will execute the code in the catch block
					try {
						sYear = Integer.parseInt(txtStartYear.getText());
					} catch (NumberFormatException e1) {
						
						errorCount++;
						errors.append("\n\u2022Please enter only numbers for start year.");
					}
				}
			
				
				if (txtSocialSecurityNumber.getText().isEmpty()){
					errors.append("\n\u2022Please enter SSN.");
					errorCount++;
				}
				
				//checks the lenth
				else if(txtSocialSecurityNumber.getText().length() != 9){
					errorCount++;
					errors.append("\n\u2022Please enter only 9 numbers for SSN, not " + txtSocialSecurityNumber.getText().length());
				}
				
				 if(!txtSocialSecurityNumber.getText().isEmpty()){
					
					 try {
						int testI = Integer.parseInt(txtSocialSecurityNumber.getText());
					} catch (NumberFormatException e1) {
						
						errorCount++;
						errors.append("\n\u2022Please enter only numbers for SSN.");
					}
				}	
				
				
				if (txtDepartmentCode.getText().isEmpty()){
					errors.append("\n\u2022Please enter department code.");
					errorCount++;
				}
				else{
					try {
						depCode = Integer.parseInt(txtDepartmentCode.getText());
					} catch (NumberFormatException e1) {
						
						errorCount++;
						errors.append("\n\u2022Please enter only numbers for department code.");
					}
				}
				
				if (txtWeeklyhoursworked.getText().isEmpty()){
					errors.append("\n\u2022Please enter weekly hours worked.");
					errorCount++;
				}
				
				else{
					try {
						hrsWorked = Double.parseDouble(txtWeeklyhoursworked.getText());

					} catch (NumberFormatException e1) {
						
						errorCount++;
						errors.append("\n\u2022Please enter only numbers for hours worked.");
					}
					
				}
				if (txtHourlyRate.getText().isEmpty()){
					errors.append("\n\u2022Please enter hourly rate.");
					errorCount++;
				}
				
				else{
					try {
						hRate = Double.parseDouble(txtHourlyRate.getText());

					} catch (NumberFormatException e1) {
						
						errorCount++;
						errors.append("\n\u2022Please enter only numbers for hourly rate.");
					}
				}
				
				///herers what i meant by if theres even on error we will display the error list in red
				if (errorCount > 0){
					lblPrint.setText("<html><pre><font color='red'>" +errors+"</font></pre></html>");
				}
				
				

			//if there are nor errors display what the user entered
				//first set the values
				else{
				String fName = txtFirstName.getText();
				String lName = txtLastName.getText();
				String dep = txtDepartment.getText();
				String ssn = txtSocialSecurityNumber.getText();
				
				//second instantiate class
				PartTimeEmployee pte = new PartTimeEmployee();
				
				pte.setFirstName(fName);
				pte.setLastName(lName);
				pte.getIDnumber();
				pte.setDepartment(dep);
				pte.setDepCode(depCode);
				pte.setSocial(ssn);
				pte.setStartYear(sYear);
				pte.setHourlyRate(hRate);
				pte.setWeeklyHoursWorked(hrsWorked);
				
				//now we just set the text of the label to the content of the toString class
				lblPrint.setText("<html> <pre>"+pte.toString() +"</pre><html>");
				}
				
			}
		});
		btnNewButton.setBounds(188, 323, 81, 29);
		contentPane.add(btnNewButton);
		
		//This button is similar to the other clear button but it only clears the text boxes
		btnClearEntry = new JButton("clear entries");
		btnClearEntry.setForeground(Color.ORANGE);
		btnClearEntry.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				txtFirstName.setText(null);;
				txtLastName.setText(null);
				txtDepartment.setText(null);
				txtStartYear.setText(null);
				txtSocialSecurityNumber.setText(null);
				txtDepartmentCode.setText(null);
				txtWeeklyhoursworked.setText(null);
				txtHourlyRate.setText(null);
				
			}
		});
		btnClearEntry.setBounds(341, 323, 109, 29);
		contentPane.add(btnClearEntry);
		
		//This button sets the text fields for quick submissions

		btnNewButton_1 = new JButton("Autofill");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				txtFirstName.setText("Michelle");;
				txtLastName.setText("Levine");
				txtDepartment.setText("Professor");
				txtStartYear.setText("2017");
				txtSocialSecurityNumber.setText("777889999");
				txtDepartmentCode.setText("2143");
				txtWeeklyhoursworked.setText("55");
				txtHourlyRate.setText("73");
				
			}
		});
		btnNewButton_1.setForeground(Color.GREEN);
		btnNewButton_1.setBounds(109, 323, 81, 29);
		contentPane.add(btnNewButton_1);
		
		//This button is similar to the other clear button but it only clears what was outputted to the label

		btnNewButton_2 = new JButton("Clear output");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				lblPrint.setText(null);

			}
		});
		btnNewButton_2.setForeground(Color.PINK);
		btnNewButton_2.setBounds(0, 323, 109, 29);
		contentPane.add(btnNewButton_2);
		
	
		
	
	}
}
