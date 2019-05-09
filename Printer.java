import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Component;
import java.awt.Dimension;
import javax.swing.*;

public class Printer extends JFrame{

	private JLabel label1, label2;
	private JTextArea ta1, ta2, ta3;
	private JButton b1, b2, b3, b4;
	private JCheckBox cb1, cb2, cb3, cb4;
	private JRadioButton rb1, rb2, rb3;
	private ButtonGroup bg;
	private JComboBox cb;
	private JPanel pC, pS, pE;

	public Printer(){
		super("My printer");

		setLayout(new FlowLayout());

		Box bMaior = Box.createHorizontalBox();
		Box bMenor = Box.createVerticalBox();

		pC = new JPanel(new FlowLayout(FlowLayout.LEFT));
		Box bC1 = Box.createVerticalBox();
		Box bC2 = Box.createHorizontalBox();
		Box bL = Box.createHorizontalBox();
		label1 = new JLabel("Printer: MyPrinter");
		ta1 = new JTextArea("", 4, 5);
		ta2 = new JTextArea("", 4, 5);
		ta3 = new JTextArea("", 4, 5);
		cb1 = new JCheckBox("Image");
		cb2 = new JCheckBox("Text");
		cb3 = new JCheckBox("Code");
		rb1 = new JRadioButton("Selection");
		rb2 = new JRadioButton("All");
		rb3 = new JRadioButton("Applet");
		bg = new ButtonGroup();
		label1.setAlignmentY(Component.LEFT_ALIGNMENT);
		//bC1.add(Box.createVerticalStrut(20));
		//bC2.add(Box.createHorizontalStrut(20));
		bL.add(label1);
		bL.add(Box.createHorizontalStrut(175));
		bC1.add(bL);
		label1.setAlignmentY(Component.LEFT_ALIGNMENT);
		bC2.add(ta1);
		Box bC3 = Box.createVerticalBox();
		bC3.add(cb1);
		bC3.add(cb2);
		bC3.add(cb3);
		bC2.add(bC3);
		bC2.add(ta2);
		Box bC4 = Box.createVerticalBox();
		bC4.add(rb1);
		bC4.add(rb2);
		bC4.add(rb3);
		bC2.add(bC4);
		bC2.add(ta3);
		bC1.add(bC2);
		pC.add(bC1);
		bg.add(rb1);
		bg.add(rb2);
		bg.add(rb3);
		//add(pC, BorderLayout.CENTER);
		bMenor.add(pC);

		pS = new JPanel(new FlowLayout(FlowLayout.LEADING));
		Box bS1 = Box.createHorizontalBox();
		bS1.add(Box.createHorizontalStrut(20));
		label2 = new JLabel("Print Quality:");
		String[] names = {"High"};
		cb = new JComboBox<String>(names);
		cb.setMaximumRowCount(2);
		cb4 = new JCheckBox("Print to File");
		bS1.add(label2);
		bS1.add(Box.createHorizontalStrut(30));
		bS1.add(cb);
		bS1.add(Box.createHorizontalStrut(30));
		bS1.add(cb4);
		pS.add(bS1);
		//pS.add(Box.createVerticalStrut(100));
		//add(pS, BorderLayout.SOUTH);
		bMenor.add(pS);
		bMaior.add(bMenor);

		pE = new JPanel(new FlowLayout(FlowLayout.LEFT));
		Box bE1 = Box.createVerticalBox();
		b1 = new JButton("OK");
		b2 = new JButton("Cancel");
		b3 = new JButton("Setup");
		b4 = new JButton("Help");
		bE1.add(b1);
		bE1.add(Box.createVerticalStrut(10));
		bE1.add(b2);
		bE1.add(Box.createVerticalStrut(10));
		bE1.add(b3);
		bE1.add(Box.createVerticalStrut(10));
		bE1.add(b4);
		pE.add(bE1);
		//add(pE, BorderLayout.EAST);
		bMaior.add(pE);
		add(bMaior);
		System.out.println(b2.getMinimumSize());
		System.out.println(b1.getMinimumSize());
		System.out.println(b1.getPreferredSize());
		System.out.println(b1.getSize());

	}
}