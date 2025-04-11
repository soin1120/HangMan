package MyProject2;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Score extends Frame implements ActionListener{
	static int highScore=0;		//최고점수
	TextArea taScoreHistory= new TextArea("최고 점수는 : "+highScore);
	Button btnBack = new Button("뒤로가기");
	Font font30 = new Font("SansSerif", Font.PLAIN, 30);
	Font font25 = new Font("SansSerif", Font.PLAIN, 25);
	Font font20 = new Font("SansSerif", Font.PLAIN, 20);
	Font font15 = new Font("SansSerif", Font.PLAIN, 15);
	
	Score(){
		super("MiniGame");
		this.setSize(400, 300);
		init();
		start();
		this.setLocation(2750, 500);
		this.setVisible(true);
	}
	void init(){
		this.setLayout(null);
		
		this.add(taScoreHistory);
		this.add(btnBack);
		
		btnBack.setFont(font20);
		taScoreHistory.setFont(font20);
		
		btnBack.setBounds(30,40,100,50);
		taScoreHistory.setBounds(25,100,350,150);
		
	}
	void start(){
		btnBack.addActionListener(this);
		
		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				setVisible(false);
			}
		});
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btnBack) {GameTitle gt = new GameTitle();this.setVisible(false);}
		
	}
}
