/*
 * XY3.java
 *
 * Created on __DATE__, __TIME__
 */

package view;

import java.awt.Image;

import javax.swing.ImageIcon;

import server.XYClient;
import model.Photo;
import model.Uers;

/**
 *
 * @author  __USER__
 */
public class X2S2 extends javax.swing.JFrame {

	/** Creates new form XY3 */
	private Uers u;
	Photo J;

	public X2S2(Uers u) {
		this.u = u;
		initComponents();
		this.setLocationRelativeTo(null);
		jButton1.setContentAreaFilled(false);
		this.setIconImage(new ImageIcon(getClass().getResource(
				"/images/logo.png")).getImage());
		int n = 40;
		try {
			J = XYClient.photo(n);
			XYClient.photo(n);
			ImageIcon ico = new ImageIcon(getClass()
					.getResource(J.getAddress()));
			Image temp = ico.getImage().getScaledInstance(
					this.jLabel1.getWidth(), this.jLabel1.getHeight(),
					ico.getImage().SCALE_DEFAULT);
			ico = new ImageIcon(temp);
			this.jLabel1.setIcon(ico);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	//GEN-BEGIN:initComponents
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {

		jLayeredPane1 = new javax.swing.JLayeredPane();
		jButton1 = new javax.swing.JButton();
		jLabel1 = new javax.swing.JLabel();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		jButton1.setBackground(new java.awt.Color(255, 255, 255));
		jButton1.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 30));
		jButton1.setForeground(new java.awt.Color(255, 255, 255));
		jButton1.setText("\u6e38\u620f\u7ed3\u675f");
		jButton1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton1ActionPerformed(evt);
			}
		});
		jButton1.setBounds(660, 480, 190, 60);
		jLayeredPane1.add(jButton1, javax.swing.JLayeredPane.DEFAULT_LAYER);
		jLabel1.setBounds(0, 0, 910, 580);
		jLayeredPane1.add(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(
				getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 910,
				javax.swing.GroupLayout.PREFERRED_SIZE));
		layout.setVerticalGroup(layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				jLayeredPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 580,
				Short.MAX_VALUE));

		pack();
	}// </editor-fold>
	//GEN-END:initComponents

	private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
		new Xuan3(u).setVisible(true);
		this.dispose();
	}

	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[]) {
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new X2S2(null).setVisible(true);
			}
		});
	}

	//GEN-BEGIN:variables
	// Variables declaration - do not modify
	private javax.swing.JButton jButton1;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLayeredPane jLayeredPane1;
	// End of variables declaration//GEN-END:variables

}