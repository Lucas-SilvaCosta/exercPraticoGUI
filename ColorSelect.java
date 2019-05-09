import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.Box;
import javax.swing.JColorChooser;
import java.awt.Container;
import java.awt.Color;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.MouseMotionListener;
import javax.swing.*;

public class ColorSelect extends JFrame{
	private BorderLayout borderlayout;

	private JButton cor;
	private JButton cancel;
	private JButton ok;
	private JButton aumenta;
	private JButton diminui;
	private JButton apaga;

	private Color color =  new Color(238, 238, 238);

	private int pointCount = 0; // nÃºmero de contagem de pontos
	private Point[] points = new Point[10000]; // array de 10000 referencias ons.awt.Point

	public ColorSelect(){
		super("ColorSelect");

		borderlayout = new BorderLayout(5, 5);
		setLayout(borderlayout);

		PaintPanel center = new PaintPanel();
		center.setBackground(Color.WHITE);
		add(center, BorderLayout.CENTER);
		
		JPanel west = new JPanel();
		Box westBox = Box.createVerticalBox();
		cor = new JButton("Cor");
		cor.addActionListener(
			new ActionListener() {
				@Override 
				public void actionPerformed(ActionEvent arg0) {
					color = JColorChooser.showDialog(ColorSelect.this, "Escolhe uma cor", color); 
					if (color == null){color =  new Color(238, 238, 238);}
					center.editaCor(color);
				}
			}
		);
		cancel = new JButton("Cancel");
		cancel.addActionListener(
			new ActionListener() {
				@Override 
				public void actionPerformed(ActionEvent arg0) {
					getContentPane().setBackground( new Color(238, 238, 238));
				}
			}
		);
		ok = new JButton("OK");
		ok.addActionListener(
			new ActionListener() {
				@Override 
				public void actionPerformed(ActionEvent arg0) {
					getContentPane().setBackground(color);
				}
			}
		);
		westBox.add(cor);
		westBox.add(Box.createVerticalStrut(10));
		westBox.add(cancel);
		westBox.add(Box.createVerticalStrut(10));
		westBox.add(ok);
		west.add(westBox);
		add(west, BorderLayout.WEST);

		JPanel north = new JPanel();
		aumenta = new JButton("Aumenta");
		aumenta.addActionListener(
			new ActionListener() {
				@Override 
				public void actionPerformed(ActionEvent arg0) {
					System.out.println("ouviu");
					center.aumentaTamanho();
				}
			}
		);
		diminui = new JButton("Diminui");
		diminui.addActionListener(
			new ActionListener() {
				@Override 
				public void actionPerformed(ActionEvent arg0) {
					center.diminuiTamanho();
				}
			}
		);
		apaga = new JButton("Apaga");
		apaga.addActionListener(
			new ActionListener() {
				@Override 
				public void actionPerformed(ActionEvent arg0) {
					center.apaga();
				}
			}
		);
		north.add(aumenta);
		north.add(diminui);
		north.add(apaga);
		add(north, BorderLayout.NORTH);
	}

}