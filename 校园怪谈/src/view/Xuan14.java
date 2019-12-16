/*
 * XY2.java
 *
 * Created on __DATE__, __TIME__
 */

package view;

import java.awt.Image;
import java.io.IOException;

import javax.swing.ImageIcon;

import model.Photo;
import model.Uers;
import server.XYClient;

/**
 *
 * @author  __USER__
 */
public class Xuan14 extends javax.swing.JFrame {

	/** Creates new form XY2 */
	private Uers u;
	Photo J;
	public Xuan14(Uers u) {
		this.u = u;
		initComponents();
		this.setLocationRelativeTo(null);
		jButton1.setContentAreaFilled(false);
		jButton2.setContentAreaFilled(false);
		jButton3.setContentAreaFilled(false);
		this.setIconImage(new ImageIcon(getClass().getResource(
				"/images/logo.png")).getImage());
		int n = 63;
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
		jButton2 = new javax.swing.JButton();
		jButton3 = new javax.swing.JButton();
		jLabel1 = new javax.swing.JLabel();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		jButton1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				try {
					jButton1ActionPerformed(evt);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		jButton1.setBounds(310, 470, 290, 60);
		jLayeredPane1.add(jButton1, javax.swing.JLayeredPane.DEFAULT_LAYER);

		jButton2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton2ActionPerformed(evt);
			}
		});
		jButton2.setBounds(310, 300, 290, 60);
		jLayeredPane1.add(jButton2, javax.swing.JLayeredPane.DEFAULT_LAYER);

		jButton3.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				try {
					jButton3ActionPerformed(evt);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		jButton3.setBounds(310, 385, 290, 60);
		jLayeredPane1.add(jButton3, javax.swing.JLayeredPane.DEFAULT_LAYER);
		jLabel1.setBounds(0, 0, 910, 580);
		jLayeredPane1.add(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(
				getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				jLayeredPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 910,
				Short.MAX_VALUE));
		layout.setVerticalGroup(layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 580,
				javax.swing.GroupLayout.PREFERRED_SIZE));

		pack();
	}// </editor-fold>
	//GEN-END:initComponents

	private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) throws IOException, ClassNotFoundException {
	}

	private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
		new X14(u).setVisible(true);
		this.dispose();
	}

	private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) throws IOException, ClassNotFoundException {
		
	
	}

	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[]) {
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new Xuan14(null).setVisible(true);
			}
		});
	}

	//GEN-BEGIN:variables
	// Variables declaration - do not modify
	private javax.swing.JButton jButton1;
	private javax.swing.JButton jButton2;
	private javax.swing.JButton jButton3;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLayeredPane jLayeredPane1;
	// End of variables declaration//GEN-END:variables

}