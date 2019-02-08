package com.company;

import javax.swing.JFrame;

public class  Main {

		public static void main(String[] args) {
			Reader r = new Reader("Calculator");
			r.setVisible(true);
			r.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			r.setSize(200, 235);
			r.setResizable(false);
			r.setLocationRelativeTo(null);
		}

}
