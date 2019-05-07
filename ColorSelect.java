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

	private Color color = Color.LIGHT_GRAY;

	private int pointCount = 0; // nÃºmero de contagem de pontos
	private Point[] points = new Point[10000]; // array de 10000 referencias ons.awt.Point

	public ColorSelect(){
		super("ColorSelect");

		borderlayout = new BorderLayout(5, 5);
		setLayout(borderlayout);
		
		JPanel west = new JPanel();
		Box westBox = Box.createVerticalBox();
		cor = new JButton("Cor");
		cor.addActionListener(
			new ActionListener() {
				@Override 
				public void actionPerformed(ActionEvent arg0) {
					color = JColorChooser.showDialog(ColorSelect.this, "Escolhe uma cor", color); 
					if (color == null){color = Color.LIGHT_GRAY;}
				}
			}
		);
		cancel = new JButton("Cancel");
		cancel.addActionListener(
			new ActionListener() {
				@Override 
				public void actionPerformed(ActionEvent arg0) {
					getContentPane().setBackground(Color.LIGHT_GRAY);
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

		//PaintPanel center = new PaintPanel();
		JPanel center = new JPanel();
		/*
		center.addMouseMotionListener(
				new MouseMotionAdapter() { // classe interna anÃ´nima
					public void mouseDragged(MouseEvent event) { // armazena coordenadas de arrastar e repinta
						if (pointCount < points.length) {
							points[pointCount] = event.getPoint(); // localiza o ponto
							pointCount++; // incrementa o nÃºmero de pontos em array
							repaint(); // repinta JFrame
						}
					}

				}// fim classe interna
		);// fim chamada addMouseMotionListener
		*/
		Mhandler mHandler = new Mhandler();
		center.addMouseMotionListener(mHandler);
		center.setBackground(Color.WHITE);
		add(center, BorderLayout.CENTER);

		JPanel north = new JPanel();
		aumenta = new JButton("Aumenta");
		diminui = new JButton("Diminui");
		apaga = new JButton("Apaga");
		apaga.addActionListener(
			new ActionListener() {
				@Override 
				public void actionPerformed(ActionEvent arg0) {
					center.setBackground(Color.WHITE);
				}
			}
		);
		north.add(aumenta);
		north.add(diminui);
		north.add(apaga);
		add(north, BorderLayout.NORTH);
	}

	private class Mhandler extends JPanel implements MouseMotionListener{
		@Override
		public void mouseDragged(MouseEvent event) { // armazena coordenadas de arrastar e repinta
			if (pointCount < points.length) {
				System.out.println("ouviu");
				points[pointCount] = event.getPoint(); // localiza o ponto
				pointCount++; // incrementa o nÃºmero de pontos em array
				repaint(); // repinta JFrame
			}
		}
		@Override // trata evento quando mouse eh movido

		public void mouseMoved(MouseEvent event) {

			// TODO Auto-generated method stub

		}
		public void paintComponent(Graphics g) {
			super.paintComponent(g); // limpa area de desenho
			System.out.println("Chamou");
			// desenha todos os pontos no array
			for (int i = 0; i < pointCount; i++) {
				g.setColor(color);
				g.fillOval(points[i].x, points[i].y, 4, 4);
			}
		}
	}

}