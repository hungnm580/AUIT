package com.fit.GUI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

/**
 * @author duongtd
 * content panel for main view
 */

public class ContentPanel extends JPanel{
	private JPanel header;
	private JPanel body;
	
	private JLabel webTitle;
	private JTextField webAddress;
	private JTextArea logArea;
	private JScrollPane jScrollPane;
	private JFileChooser jFileChooser;
	private JButton btnFile;
	
	public ContentPanel(){
		super(new BorderLayout());
		
		//FlowLayout flowLayoutHeader = new FlowLayout();
		header = new JPanel();
		header.setLayout(new BorderLayout());
		
		webTitle = new JLabel("Web address: ");
		webTitle.setBorder(BorderFactory.createEmptyBorder(10, 0,10,10)); 
		
		webAddress = new JTextField();
//		webAddress.setBorder(BorderFactory.createEmptyBorder(10,10,10,10)); 
				
		btnFile = new JButton("Open .xls folder");
//		btnFile.setBorder(BorderFactory.createEmptyBorder(10,10,10,10)); 
		
		header.add(webTitle, BorderLayout.WEST);
		header.add(webAddress, BorderLayout.CENTER);
		JPanel tempPanel = new JPanel();
		tempPanel.add(btnFile);
		tempPanel.setBorder(new EmptyBorder(0, 20, 0, 0));
		header.add(tempPanel, BorderLayout.EAST);
		
		
		body = new JPanel(new BorderLayout());
		logArea = new JTextArea();
		logArea.setBorder(new LineBorder(Color.GRAY, 1));
//		logArea.setBorder(BorderFactory.createS(10,10,10,10));
		
		body.add(logArea);
		body.setBorder(new EmptyBorder(10, 0, 0, 0));
		
		this.add(header, BorderLayout.PAGE_START);
		this.add(body, BorderLayout.CENTER);
		
		this.setBorder(new EmptyBorder(10,  10, 10,  10));
		
//		this.setMinimumSize(new Dimension(400, 300));
	}
}
