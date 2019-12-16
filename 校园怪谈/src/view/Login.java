/*
 * XY2.java
 *
 * Created on __DATE__, __TIME__
 */

package view;

import java.io.IOException;
import java.net.UnknownHostException;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

import server.XYClient;

import model.Admin;
import model.Uers;

/**
 *
 * @author  __USER__
 */
public class Login extends javax.swing.JFrame {

	/** Creates new form XY2 */
	public Login() {
		initComponents();
		this.setLocationRelativeTo(null);
		this.setIconImage(new ImageIcon(getClass().getResource(
				"/images/logo.png")).getImage());
	}

	//GEN-BEGIN:initComponents
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {

		jLayeredPane1 = new javax.swing.JLayeredPane();
		jTextField1 = new javax.swing.JTextField();
		jButton1 = new javax.swing.JButton();
		jPasswordField1 = new javax.swing.JPasswordField();
		jButton2 = new javax.swing.JButton();
		jRadioButton1 = new javax.swing.JRadioButton();
		jRadioButton2 = new javax.swing.JRadioButton();
		jLabel1 = new javax.swing.JLabel();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setTitle("Login");

		jTextField1.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 23));
		jTextField1.setBounds(340, 190, 410, 50);
		jLayeredPane1.add(jTextField1, javax.swing.JLayeredPane.DEFAULT_LAYER);

		jButton1.setBackground(new java.awt.Color(255, 0, 0));
		jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/sucai/loginbutton.jpg"))); // NOI18N
		jButton1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				try {
					jButton1ActionPerformed(evt);
				} catch (UnknownHostException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		jButton1.setBounds(400, 410, 140, 140);
		jLayeredPane1.add(jButton1, javax.swing.JLayeredPane.DEFAULT_LAYER);

		jPasswordField1.setFont(new java.awt.Font("ËÎÌå", 0, 23));
		jPasswordField1.setBounds(340, 300, 410, 50);
		jLayeredPane1.add(jPasswordField1,
				javax.swing.JLayeredPane.DEFAULT_LAYER);

		jButton2.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 22));
		jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/sucai/register.jpg"))); // NOI18N
		jButton2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton2ActionPerformed(evt);
			}
		});
		jButton2.setBounds(10, 540, 150, 40);
		jLayeredPane1.add(jButton2, javax.swing.JLayeredPane.DEFAULT_LAYER);

		jRadioButton1.setBackground(new java.awt.Color(88, 0, 0));
		jRadioButton1.setForeground(new java.awt.Color(255, 255, 255));
		jRadioButton1.setText("\u7528\u6237");
		jRadioButton1.setBounds(350, 360, 70, 30);
		jLayeredPane1
				.add(jRadioButton1, javax.swing.JLayeredPane.DEFAULT_LAYER);

		jRadioButton2.setBackground(new java.awt.Color(89, 0, 51));
		jRadioButton2.setForeground(new java.awt.Color(255, 255, 255));
		jRadioButton2.setText("\u7ba1\u7406\u5458");
		jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jRadioButton2ActionPerformed(evt);
			}
		});
		jRadioButton2.setBounds(430, 360, 90, 30);
		jLayeredPane1
				.add(jRadioButton2, javax.swing.JLayeredPane.DEFAULT_LAYER);

		jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/sucai/loginview.jpg"))); // NOI18N
		jLabel1.setBounds(0, 0, 941, 588);
		jLayeredPane1.add(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(
				getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 937,
				javax.swing.GroupLayout.PREFERRED_SIZE));
		layout.setVerticalGroup(layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 590,
				javax.swing.GroupLayout.PREFERRED_SIZE));

		pack();
	}// </editor-fold>
	//GEN-END:initComponents

	private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
		new Register().setVisible(true);
		this.dispose();
	}

	private void jButton1ActionPerformed(java.awt.event.ActionEvent evt)
			throws UnknownHostException, IOException, ClassNotFoundException {
		String name = this.jTextField1.getText();
		String pw = this.jPasswordField1.getText();
		//int uid = Integer.parseInt(uid);
		if (this.jRadioButton1.isSelected()) {
			//Uers u = new Uers();
			//u = u.login(name, pw);
			try {
				Uers u = XYClient.login(name, pw);
				if (u == null) {
					JOptionPane.showMessageDialog(this, "µÇÂ½Ê§°Ü");

				} else
					JOptionPane.showMessageDialog(this, "µÇÂ½³É¹¦");
				
				new Menu(u).setVisible(true);
				//new Menu(u).setVisible(true);
				this.dispose();

			} catch (Exception e) {
				// TODO Auto-generated catch block
				JOptionPane.showMessageDialog(this, e.getMessage());

			}

		} else if (this.jRadioButton2.isSelected()) {

			//Admin a = new Admin();
			try {
				//a = a.login(uid, pw);
				int uid = Integer.parseInt(name);
				Admin a = XYClient.alogin(uid, pw);
				if (a == null) {
					JOptionPane.showMessageDialog(this, "µÇÂ½Ê§°Ü");
				} else
					JOptionPane.showMessageDialog(this, "µÇÂ½³É¹¦");
				new Uersmenu(a).setVisible(true);
				this.dispose();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				JOptionPane.showMessageDialog(this, e.getMessage());
			}
		}
	}

	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[]) {
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new Login().setVisible(true);
			}
		});
	}

	//GEN-BEGIN:variables
	// Variables declaration - do not modify
	javax.swing.JButton jButton1;
	javax.swing.JButton jButton2;
	javax.swing.JLabel jLabel1;
	javax.swing.JLayeredPane jLayeredPane1;
	javax.swing.JPasswordField jPasswordField1;
	javax.swing.JRadioButton jRadioButton1;
	javax.swing.JRadioButton jRadioButton2;
	javax.swing.JTextField jTextField1;
	// End of variables declaration//GEN-END:variables

}