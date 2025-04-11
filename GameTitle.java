package MyProject2;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class GameTitle extends Frame implements ActionListener {
	
	Button btnStart = new Button("S T A R T");	//인트로 시작버튼
	Button btnExit = new Button("E X I T"); 	//인트로 Exit버튼
	Button btnScore= new Button("점수판");	//점수 기록
	
	Image imgTitle = Toolkit.getDefaultToolkit().getImage("BackGround.png");
	Font font30 = new Font("SansSerif", Font.PLAIN, 30);
	Font font25 = new Font("SansSerif", Font.PLAIN, 25);
	Font font20 = new Font("SansSerif", Font.PLAIN, 20);

	GameTitle(){
		super("MiniGame");
		this.setSize(500, 500);
		init();
		start();
		this.setLocation(2700, 400);
		this.setVisible(true);
	}
	void init() {
		this.setLayout(null);
		
		this.add(btnStart);
		this.add(btnExit);
		this.add(btnScore);
		
		btnStart.setFont(font20);
		btnExit.setFont(font20);
		btnScore.setFont(font20);
		
		
		btnStart.setBounds(140,350,200,40);
		btnExit.setBounds(140,400,200,40);
		btnScore.setBounds(350,350,90,30);
	}
	void start() {
		btnScore.addActionListener(this);
		btnStart.addActionListener(this);
		btnExit.addActionListener(this);
		
		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(1);
			}
		});
	}
	public void paint(Graphics g) {
		g.drawImage(imgTitle, 0, 0, 500, 500, this);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		
		
			if(e.getSource()==btnStart) { HangMan hm = new HangMan();this.setVisible(false);} 			//타이틀 START 버튼 클릭
			else if(e.getSource()==btnExit){System.exit(1);}											//타이틀 EXIT  버튼 클릭 종료
			else if(e.getSource()==btnScore) {Score score = new Score();}
			
	}
}
