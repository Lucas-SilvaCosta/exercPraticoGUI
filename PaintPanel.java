import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.MouseMotionListener;
import javax.swing.*;

public class PaintPanel extends JPanel {

	private int pointCount = 0;
	private Point[] points = new Point[10000];
	private Color cor = new Color(238, 238, 238);
	private int tamanho = 4;

	public PaintPanel() {
		addMouseMotionListener(
				new MouseMotionAdapter() {
					public void mouseDragged(MouseEvent event) {
						if (pointCount < points.length) {
							points[pointCount] = event.getPoint();
							pointCount++;
							repaint();
						}
					}
				}
		);

	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g); 
		for (int i = 0; i < pointCount; i++) {
			g.setColor(cor);
			g.fillOval(points[i].x, points[i].y, tamanho, tamanho);
		}
	}

	public void aumentaTamanho(){
		if(tamanho >= 4 && tamanho <100){
			tamanho = tamanho+1;
		}
	}
	public void diminuiTamanho(){
		if(tamanho > 4 && tamanho <=100){
			tamanho = tamanho-1;
		}
	}

	public void editaCor(Color c){
		cor = c;
	}

	public void apaga(){
		pointCount = 0;
	}
}