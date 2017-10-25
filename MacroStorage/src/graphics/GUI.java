package graphics;

import java.awt.Button;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.image.BufferStrategy;

import javax.swing.JFrame;

public class GUI {
	private int width, length;
	private Canvas drawing;
	private JFrame frame;
	private Graphics gr;
	private BufferStrategy buff;

	// Constructor for the object
	public GUI(int width, int length) {
		this.width = width;
		this.length = length;
		createInterface();
	}
	

	// Initializes the window and the canvas on which things are drawn
	public void createInterface() {
		frame = new JFrame("Macro Storage");
		frame.setSize(width, length);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		drawing = new Canvas();
		drawing.setPreferredSize(new Dimension(width, length));
		drawing.setBackground(Color.RED);
		frame.add(drawing);
	}
	public void render() {
		buff = drawing.getBufferStrategy();
		if(buff==null){
			drawing.createBufferStrategy(3);
			return;
		}
		gr = buff.getDrawGraphics();
		gr.fillRect(0, 0, 100, 100);
		buff.show();
		gr.dispose();
	}
	
}
