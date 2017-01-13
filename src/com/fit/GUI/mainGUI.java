package com.fit.GUI;


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 * @author duongtd
 * main view
 */

public class mainGUI extends JFrame{
	public mainGUI(){
		super();
		this.setVisible(true);
		this.setSize(600, 400);
		
		this.setContentPane(new ContentPanel());
		
//		String tempLookAndFeel = "com.sun.java.swing.plaf.windows.WindowsClassicLookAndFeel";
		String tempLookAndFeel = "javax.swing.plaf.nimbus.NimbusLookAndFeel";
		try {
			UIManager.setLookAndFeel(tempLookAndFeel);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnsupportedLookAndFeelException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		setLookAndFeel(tempLookAndFeel);
	}
		
	public static void main(String[] args){
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				new mainGUI();
			}
		});
	}
}
