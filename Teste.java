import java.lang.Math;
import javax.swing.JFrame;

public class Teste{

	public static void main(String[] args){
		/*
		//Functions f = new Functions();
		//System.out.println(f.fat(5));

		//System.out.println(Math.round(2.56));

		//System.out.println(f.nep(1));	
		
		
		GridBagFrame gridBagFrame = new GridBagFrame(); 
                gridBagFrame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
                gridBagFrame.setSize( 300, 150 ); // set frame size
                gridBagFrame.setVisible( true ); // display frame
                
                Calculadora c = new Calculadora(); 
                c.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
                c.setSize( 400, 200 ); // set frame size
                c.setVisible( true ); // display frame
                */
                ColorSelect colorFrame = new ColorSelect();
                colorFrame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE);
                colorFrame.setSize(500, 500);
                colorFrame.setVisible(true);
	}
}