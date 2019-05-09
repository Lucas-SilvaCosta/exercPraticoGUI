import javax.swing.JFrame;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Component;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Calculadora extends JFrame{

	private GridBagConstraints constraints;
	private GridBagLayout layout;

	private JPanel pPrinc;
	private JTextArea tPrincipal;
	private JTextField tSecundario;
	private JButton zero;
	private JButton um;
	private JButton dois;
	private JButton tres;
	private JButton quatro;
	private JButton cinco;
	private JButton seis;
	private JButton sete;
	private JButton oito;
	private JButton nove;
	private JButton ponto;
	private JButton igual;
	private JButton div;
	private JButton mult;
	private JButton sub;
	private JButton soma;
	private JButton fat;
	private JButton exp;
	private JButton raiz2;
	private JButton raiz3;
	private JButton porc;
	private JButton elev2;
	private JButton elev3;
	private JButton elevY;
	private JButton pi;
	private JButton clear;
	private JButton abreP;
	private JButton fechaP;

	private double n1;
	private double n2;
	private double nP;
	private int op;
	private int opP;
	/* 
	*  soma  = 1
	*  sub   = 2
	*  mult  = 3
	*  div   = 4
	*  fat   = 5
	*  exp   = 6
	*  raiz2 = 7
	*  raiz3 = 8
	*  porc  = 9
	*  elev2 = 10
	*  elev3 = 11
	*  elevY = 12
	*
	*/

	public Calculadora(){
		super("Calculadora");

		layout = new GridBagLayout();
		setLayout( layout );
		constraints = new GridBagConstraints();

		tPrincipal = new JTextArea("", 2, 7);
		tSecundario = new JTextField("");
      	constraints.fill = GridBagConstraints.BOTH;
      	constraints.weightx = 0;
      	constraints.weighty = 0;
      	addComponent(tPrincipal, 1, 0, 7, 2);
      	addComponent(tSecundario, 0, 0, 7, 1);

      	constraints.weightx = 100;
      	constraints.weighty = 100;

      	JButton zero = new JButton("0");
		JButton um = new JButton("1");
		JButton dois = new JButton("2");
		JButton tres = new JButton("3");
		JButton quatro = new JButton("4");
		JButton cinco = new JButton("5");
		JButton seis = new JButton("6");
		JButton sete = new JButton("7");
		JButton oito = new JButton("8");
		JButton nove = new JButton("9");
		JButton ponto = new JButton(".");
		JButton igual = new JButton("=");
		JButton div = new JButton("/");
		JButton mult = new JButton("*");
		JButton sub = new JButton("-");
		JButton soma = new JButton("+");
		JButton fat = new JButton("x!");
		JButton exp = new JButton("e^x");
		JButton raiz2 = new JButton("r2");
		JButton raiz3 = new JButton("r3");
		JButton porc = new JButton("porc");
		JButton elev2 = new JButton("x²");
		JButton elev3 = new JButton("x³");
		JButton elevY = new JButton("x^y");
		JButton pi = new JButton("π");
		JButton clear = new JButton("C");
		JButton abreP = new JButton("(");
		JButton fechaP = new JButton(")");
		
		addComponent(fat   , 3, 0, 1, 1);
		addComponent(exp   , 3, 1, 1, 1);
		addComponent(clear , 3, 2, 1, 1);
		addComponent(um    , 3, 3, 1, 1);
		addComponent(dois  , 3, 4, 1, 1);
		addComponent(tres  , 3, 5, 1, 1);
		addComponent(div   , 3, 6, 1, 1);
		addComponent(elev2 , 4, 0, 1, 1);
		addComponent(elev3 , 4, 1, 1, 1);
		addComponent(elevY , 4, 2, 1, 1);
		addComponent(quatro, 4, 3, 1, 1);
		addComponent(cinco , 4, 4, 1, 1);
		addComponent(seis  , 4, 5, 1, 1);
		addComponent(mult  , 4, 6, 1, 1);
		addComponent(raiz2 , 5, 0, 1, 1);
		addComponent(raiz3 , 5, 1, 1, 1);
		addComponent(porc  , 5, 2, 1, 1);
		addComponent(sete  , 5, 3, 1, 1);
		addComponent(oito  , 5, 4, 1, 1);
		addComponent(nove  , 5, 5, 1, 1);
		addComponent(sub   , 5, 6, 1, 1);
		addComponent(pi    , 6, 0, 1, 1);
		addComponent(abreP , 6, 1, 1, 1);
		addComponent(fechaP, 6, 2, 1, 1);
		addComponent(zero  , 6, 3, 1, 1);
		addComponent(ponto , 6, 4, 1, 1);
		addComponent(igual , 6, 5, 1, 1);
		addComponent(soma  , 6, 6, 1, 1);

		Bhandler bHandler = new Bhandler();
		zero.addActionListener(bHandler);
		um.addActionListener(bHandler);
		dois.addActionListener(bHandler);
		tres.addActionListener(bHandler);
		quatro.addActionListener(bHandler);
		cinco.addActionListener(bHandler);
		seis.addActionListener(bHandler);
		sete.addActionListener(bHandler);
		oito.addActionListener(bHandler);
		nove.addActionListener(bHandler);
		igual.addActionListener(bHandler);
		ponto.addActionListener(bHandler);
		abreP.addActionListener(bHandler);
		fechaP.addActionListener(bHandler);
		clear.addActionListener(bHandler);
		div.addActionListener(bHandler);
		mult.addActionListener(bHandler);
		sub.addActionListener(bHandler);
		soma.addActionListener(bHandler);
		fat.addActionListener(bHandler);
		exp.addActionListener(bHandler);
		raiz2.addActionListener(bHandler);
		raiz3.addActionListener(bHandler);
		porc.addActionListener(bHandler);
		elev2.addActionListener(bHandler);
		elev3.addActionListener(bHandler);
		elevY.addActionListener(bHandler);
		pi.addActionListener(bHandler);
	

	}

	private void addComponent( Component component, int row, int column, int width,
	  int height ){
    	constraints.gridx = column;
    	constraints.gridy = row;
    	constraints.gridwidth = width;
    	constraints.gridheight = height;
    	layout.setConstraints( component, constraints );
    	add( component );
    }

    private class Bhandler implements ActionListener{
    	@Override
    	public void actionPerformed(ActionEvent e){
    		Calcula c = new Calcula();
    		//System.out.println(e.getActionCommand());
    		switch(String.format(e.getActionCommand())){
    			case "0":
    				tPrincipal.setText(tPrincipal.getText()+"0");
    				break;
    			case "1":
    				tPrincipal.setText(tPrincipal.getText()+"1");
    				break;
    			case "2":
    				tPrincipal.setText(tPrincipal.getText()+"2");
    				break;
    			case "3":
    				tPrincipal.setText(tPrincipal.getText()+"3");
    				break;
    			case "4":
    				tPrincipal.setText(tPrincipal.getText()+"4");
    				break;
    			case "5":
    				tPrincipal.setText(tPrincipal.getText()+"5");
    				break;
    			case "6":
    				tPrincipal.setText(tPrincipal.getText()+"6");
    				break;
    			case "7":
    				tPrincipal.setText(tPrincipal.getText()+"7");
    				break;
    			case "8":
    				tPrincipal.setText(tPrincipal.getText()+"8");
    				break;
    			case "9":
    				tPrincipal.setText(tPrincipal.getText()+"9");
    				break;
    			case ".":
    				tPrincipal.setText(tPrincipal.getText()+".");
    				break;
    			case "(":
    				if(op!=0){
    					opP = op;
    					op = 0;
    					nP = n1;
    					n1 = 0;
    				}
    				tSecundario.setText(tSecundario.getText()+"(");
    				break;
    			case ")":
    				if(op!=0){
    					double res = c.calcAux(n1, Double.parseDouble(tPrincipal.getText()), op);
    					if(opP!=0){
	    					double resP = c.calcAux(res, nP, opP);
	    					tPrincipal.setText(Double.toString(resP));
    					}
    				}else{
    					tPrincipal.setText(Double.toString(n1));
    				}
					tSecundario.setText("");
    				op=0;
    				break;
    			case "C":
    				n1 = 0;
    				tPrincipal.setText("");
    				tSecundario.setText("");
    				break;
    			case "/":
	    			if(op!=0){
    					n1 = c.calcAux(n1, Double.parseDouble(tPrincipal.getText()), op);
    					tSecundario.setText(Double.toString(n1)+"/");
    				}else{
    					n1 = Double.parseDouble(tPrincipal.getText());
    					tSecundario.setText(tSecundario.getText()+n1+"/");
    				}
    				tPrincipal.setText("");
    				op = 4;
    				break;
    			case "*":
    				if(op!=0){
    					n1 = c.calcAux(n1, Double.parseDouble(tPrincipal.getText()), op);
    					tSecundario.setText(Double.toString(n1)+"*");
    				}else{
    					n1 = Double.parseDouble(tPrincipal.getText());
    					tSecundario.setText(tSecundario.getText()+n1+"*");
    				}
    				tPrincipal.setText("");
    				op = 3;
    				break;
    			case "-":
    				if(op!=0){
    					n1 = c.calcAux(n1, Double.parseDouble(tPrincipal.getText()), op);
    					tSecundario.setText(Double.toString(n1)+"-");
    				}else{
    					n1 = Double.parseDouble(tPrincipal.getText());
    					tSecundario.setText(tSecundario.getText()+n1+"-");
    				}
    				tPrincipal.setText("");
    				op = 2;
    				break;
    			case "+":
    				if(op!=0){
    					n1 = c.calcAux(n1, Double.parseDouble(tPrincipal.getText()), op);
    					tSecundario.setText(Double.toString(n1)+"+");
    				}else{
    					n1 = Double.parseDouble(tPrincipal.getText());
    					tSecundario.setText(tSecundario.getText()+n1+"+");
    				}
    				tPrincipal.setText("");
    				op = 1;
    				break;
    			case "x!":
    				tPrincipal.setText(Double.toString(c.calcAux(Double.parseDouble(tPrincipal.getText()), 0, 5)));
    				break;
    			case "e^x":
    				tPrincipal.setText(Double.toString(c.calcAux(Double.parseDouble(tPrincipal.getText()), 0, 6)));
    				break;
    			case "r2":
    				tPrincipal.setText(Double.toString(c.calcAux(Double.parseDouble(tPrincipal.getText()), 0, 7)));
    				break;
    			case "r3":
    				tPrincipal.setText(Double.toString(c.calcAux(Double.parseDouble(tPrincipal.getText()), 0, 8)));
    				break;
    			case "porc":
    				if(op!=0){
    					n1 = c.calcAux(n1, Double.parseDouble(tPrincipal.getText()), op);
    					tSecundario.setText(Double.toString(n1)+" porcento de");
    				}else{
    					n1 = Double.parseDouble(tPrincipal.getText());
    					tSecundario.setText(tSecundario.getText()+n1+" porcento de");
    				}
    				tPrincipal.setText("");
    				op = 9;
    				break;
    			case "x²":
    				tPrincipal.setText(Double.toString(c.calcAux(Double.parseDouble(tPrincipal.getText()), 0, 10)));
    				break;
    			case "x³":
    				tPrincipal.setText(Double.toString(c.calcAux(Double.parseDouble(tPrincipal.getText()), 0, 11)));
    				break;
    			case "x^y":
    				if(op!=0){
    					n1 = c.calcAux(n1, Double.parseDouble(tPrincipal.getText()), op);
    					tSecundario.setText(Double.toString(n1)+"^");
    				}else{
    					n1 = Double.parseDouble(tPrincipal.getText());
    					tSecundario.setText(tSecundario.getText()+n1+"^");
    				}
    				tPrincipal.setText("");
    				op = 12;
    				break;
    			case "π":
    				tPrincipal.setText("3.16");
    				System.out.println("Entrou");
    				break;
    			case "=":
    				if(op!=0){
    					double res = c.calcAux(n1, Double.parseDouble(tPrincipal.getText()), op);
    					tPrincipal.setText(Double.toString(res));
    				}else{
    					tPrincipal.setText(Double.toString(n1));
    				}
					tSecundario.setText("");
    				op=0;
    				break;
			}

    		/*
    		if(String.format(e.getActionCommand()).equals("0")){
    			tSecundario.setText(tSecundario.getText()+"0");
    		}*/
    		//tPrincipal.setText(tPrincipal.getText()+e.getActionCommand().getText());

    	}
    }


}