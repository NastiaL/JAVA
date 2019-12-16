/*
 * XY6.java
 *
 * Created on __DATE__, __TIME__
 */

package view;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

import server.XYClient;

import model.Uers;

/**
 *
 * @author  __USER__
 */
public class Register extends javax.swing.JFrame {

	/** Creates new form XY6 */
	public Register() {
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
		jPasswordField1 = new javax.swing.JPasswordField();
		jPasswordField2 = new javax.swing.JPasswordField();
		jButton2 = new javax.swing.JButton();
		jButton1 = new javax.swing.JButton();
		jLabel1 = new javax.swing.JLabel();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		jTextField1.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 23));
		jTextField1.setBounds(340, 160, 410, 60);
		jLayeredPane1.add(jTextField1, javax.swing.JLayeredPane.DEFAULT_LAYER);

		jPasswordField1.setFont(new java.awt.Font("ËÎÌå", 0, 23));
		jPasswordField1.setBounds(340, 240, 410, 60);
		jLayeredPane1.add(jPasswordField1,
				javax.swing.JLayeredPane.DEFAULT_LAYER);

		jPasswordField2.setFont(new java.awt.Font("ËÎÌå", 0, 23));
		jPasswordField2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jPasswordField2ActionPerformed(evt);
			}
		});
		jPasswordField2.setBounds(340, 320, 410, 60);
		jLayeredPane1.add(jPasswordField2,
				javax.swing.JLayeredPane.DEFAULT_LAYER);

		jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/sucai/menu.jpg"))); // NOI18N
		jButton2.setBounds(10, 540, 80, 30);
		jLayeredPane1.add(jButton2, javax.swing.JLayeredPane.DEFAULT_LAYER);

		jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/sucai/registerbutton.jpg"))); // NOI18N
		jButton1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton1ActionPerformed(evt);
			}
		});
		jButton1.setBounds(400, 410, 150, 140);
		jLayeredPane1.add(jButton1, javax.swing.JLayeredPane.DEFAULT_LAYER);

		jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/sucai/registerview.jpg"))); // NOI18N
		jLabel1.setBounds(0, 0, 940, 588);
		jLayeredPane1.add(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(
				getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 940,
				javax.swing.GroupLayout.PREFERRED_SIZE));
		layout.setVerticalGroup(layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 588,
				javax.swing.GroupLayout.PREFERRED_SIZE));

		pack();
	}// </editor-fold>
	//GEN-END:initComponents

	private void jPasswordField2ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
		//Uers u = new Uers();
		String name = this.jTextField1.getText();
		String pw1 = this.jPasswordField1.getText();
		String pw2 = this.jPasswordField2.getText();
		try {
			//u.Resigter(name, pw1, pw2);
			XYClient.Resigter(name, pw1, pw2);
			JOptionPane.showMessageDialog(this, "×¢²á³É¹¦");
			this.dispose();
			new Login().setVisible(true);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			JOptionPane.showMessageDialog(this, "×¢²áÊ§°Ü");
		}
	}

	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[]) {
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new Register().setVisible(true);
			}
		});
	}

	//GEN-BEGIN:variables
	// Variables declaration - do not modify
	private javax.swing.JButton jButton1;
	private javax.swing.JButton jButton2;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLayeredPane jLayeredPane1;
	private javax.swing.JPasswordField jPasswordField1;
	private javax.swing.JPasswordField jPasswordField2;
	private javax.swing.JTextField jTextField1;
	// End of variables declaration//GEN-END:variables

}