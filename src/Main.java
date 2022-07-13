
import GUI.WIndow;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;
import java.util.Scanner;
import javax.swing.table.DefaultTableModel;
import javax.swing.JComboBox;
//import javax.swing.border.Border;


public class Main {
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				new WIndow();
			}
		});
	}
}
