package MyProject2;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class HangMan extends Frame implements ActionListener{
	
	 StringBuilder sb = new StringBuilder();
	 int rand;
	int score;
	int life = 7; 		//남은목숨
	
	Image imgHangMan =Toolkit.getDefaultToolkit().getImage("HangMan0.png");
	Label lbLife = new Label("남은목숨: ");
	Label lbLife2 = new Label(""+life);
	Label lbScore = new Label("현재점수: ");							//현재점수
	Label lbScore2 = new Label("0");
	Label lbHighScore = new Label("최고점수: ");					//최고점수
	Label lbHighScore2= new Label("0");
	Label lbCorrect = new Label(""+Label.CENTER); 			//단어 나오는곳
	Button btnBack = new Button("뒤로가기");
	Button btnScore = new Button("스코어");
	Button btnA = new Button("A");
	Button btnB = new Button("B");
	Button btnC = new Button("C");
	Button btnD = new Button("D");
	Button btnE = new Button("E");
	Button btnF = new Button("F");
	Button btnG = new Button("G");
	Button btnH = new Button("H");
	Button btnI = new Button("I");
	Button btnJ = new Button("J");
	Button btnK = new Button("K");
	Button btnL = new Button("L");
	Button btnM = new Button("M");
	Button btnN = new Button("N");
	Button btnO = new Button("O");
	Button btnP = new Button("P");
	Button btnQ = new Button("Q");
	Button btnR = new Button("R");
	Button btnS = new Button("S");
	Button btnT = new Button("T");
	Button btnU = new Button("U");
	Button btnV = new Button("V");
	Button btnW = new Button("W");
	Button btnX = new Button("X");
	Button btnY = new Button("Y");
	Button btnZ = new Button("Z");
	Button btnClear = new Button("다음문제");
	Font font40 = new Font("SansSerif", Font.PLAIN, 40);
	Font font30 = new Font("SansSerif", Font.PLAIN, 30);
	Font font25 = new Font("SansSerif", Font.PLAIN, 25);
	Font font20 = new Font("SansSerif", Font.PLAIN, 20);
	Font font15 = new Font("SansSerif", Font.PLAIN, 15);
	//Image imgTitle = Toolkit.getDefaultToolkit().getImage("BackGround.png");
	
	
	
	
	HangMan(){
		super("HangMan");
		this.setSize(650, 500);
		init();
		start();
		this.setLocation(2700, 400);
		this.setVisible(true);
	}
	
	void init() {
		this.setLayout(null);
		this.add(lbCorrect); this.add(btnClear);this.add(btnBack);
		this.add(lbLife);this.add(lbLife2);
		this.add(lbScore);this.add(lbHighScore);
		this.add(lbScore2);this.add(lbHighScore2);
		this.add(btnA);this.add(btnB);this.add(btnC);this.add(btnD);this.add(btnE);this.add(btnF);this.add(btnG);this.add(btnH);this.add(btnI);
		this.add(btnJ);this.add(btnK);this.add(btnL);this.add(btnM);this.add(btnN);this.add(btnO);this.add(btnP);this.add(btnQ);this.add(btnR);
		this.add(btnS);this.add(btnT);this.add(btnU);this.add(btnV);this.add(btnW);this.add(btnX);this.add(btnY);this.add(btnZ);
		
		lbCorrect.setFont(font40);
		lbScore.setFont(font20);lbHighScore.setFont(font20);
		lbScore2.setFont(font20);lbHighScore2.setFont(font20);
		lbLife.setFont(font15);lbLife2.setFont(font15);
		
		
		lbScore.setBounds(450,300,80,30);lbScore2.setBounds(550,300,100,30);		//현재점수  
		lbHighScore.setBounds(450,340,80,30);lbHighScore2.setBounds(550,340,80,30);	//최고점수
		lbLife.setBounds(480,370,60,30); lbLife2.setBounds(560,370,30,30);			//남은목숨
		lbCorrect.setBounds(250,50,300,50);btnClear.setBounds(540,100,60,40);btnBack.setBounds(30,50,50,30);
		btnA.setBounds(50,400,30,30);btnB.setBounds(90,400,30,30);btnC.setBounds(130,400,30,30);btnD.setBounds(170,400,30,30);btnE.setBounds(210,400,30,30);
		btnF.setBounds(250,400,30,30);btnG.setBounds(290,400,30,30);btnH.setBounds(330,400,30,30);btnI.setBounds(370,400,30,30);btnJ.setBounds(410,400,30,30);
		btnK.setBounds(450,400,30,30);btnL.setBounds(490,400,30,30);btnM.setBounds(530,400,30,30);btnN.setBounds(570,400,30,30);
		btnO.setBounds(90,440,30,30);btnP.setBounds(130,440,30,30);btnQ.setBounds(170,440,30,30);btnR.setBounds(210,440,30,30);btnS.setBounds(250,440,30,30);
		btnT.setBounds(290,440,30,30);btnU.setBounds(330,440,30,30);btnV.setBounds(370,440,30,30);btnW.setBounds(410,440,30,30);btnX.setBounds(450,440,30,30);
		btnY.setBounds(490,440,30,30);btnZ.setBounds(530,440,30,30);
	}
	
	void start() {
		btnClear.addActionListener(this);
		btnBack.addActionListener(this);
		btnA.addActionListener(this);
		btnB.addActionListener(this);
		btnC.addActionListener(this);
		btnD.addActionListener(this);
		btnE.addActionListener(this);
		btnF.addActionListener(this);
		btnG.addActionListener(this);
		btnH.addActionListener(this);
		btnI.addActionListener(this);
		btnJ.addActionListener(this);
		btnK.addActionListener(this);
		btnL.addActionListener(this);
		btnM.addActionListener(this);
		btnN.addActionListener(this);
		btnO.addActionListener(this);
		btnP.addActionListener(this);
		btnQ.addActionListener(this);
		btnR.addActionListener(this);
		btnS.addActionListener(this);
		btnT.addActionListener(this);
		btnU.addActionListener(this);
		btnV.addActionListener(this);
		btnW.addActionListener(this);
		btnX.addActionListener(this);
		btnY.addActionListener(this);
		btnZ.addActionListener(this);
		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(1);
			}
		});
	}
	public void paint(Graphics g) {
		g.drawImage(imgHangMan, 100, 100, 300, 300, this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		boolean lifeCheck = false;
		String[] word = {"BANANA","APPLE","GRAPE","ABC"}; //문제들 -> 메모장에서 가져와서 쓸것!
		//life가 0일시 GAME OVER 알람창 생성
		
		
        if(e.getSource()==btnBack) { GameTitle gt = new GameTitle(); this.setVisible(false); }
        else if(e.getSource()==btnClear)
		{
			rand = (int)(Math.random()*word.length);
			// Clear버튼 클릭시 모든 버튼 활성화
			btnA.setEnabled(true);btnB.setEnabled(true);btnC.setEnabled(true);btnD.setEnabled(true);btnE.setEnabled(true);
			btnF.setEnabled(true);btnG.setEnabled(true);btnH.setEnabled(true);btnI.setEnabled(true);btnJ.setEnabled(true);
			btnK.setEnabled(true);btnL.setEnabled(true);btnM.setEnabled(true);btnN.setEnabled(true);btnO.setEnabled(true);
			btnP.setEnabled(true);btnQ.setEnabled(true);btnR.setEnabled(true);btnS.setEnabled(true);btnT.setEnabled(true);
			btnU.setEnabled(true);btnV.setEnabled(true);btnW.setEnabled(true);btnX.setEnabled(true);btnY.setEnabled(true);
			btnZ.setEnabled(true);
			sb.setLength(0);								//sb값 초기화
			
			for (int i = 0; i < word[rand].length(); i++)   //예시 APPLE 0 ~ 4 5번 반복
			{
	            sb.append("_ ");  							// 각 문자를(_ )로 표시 
	        }
	
			lbCorrect.setText(sb.toString());	//상단 문제에 sb값을 출력
			System.out.println("Clear시 sb : "+sb);
			System.out.println("Clear시 word[rand]="+word[rand]);
		}
		else if(e.getSource()==btnA)
			 {
				
				 for(int i=0;i<word[rand].length();i++) 	
					{
					 if(word[rand].charAt(i)=='A')			
					 {
						 score += 20;
						 lbScore2.setText(""+score);
						 if(score>=Score.highScore) { Score.highScore = score;lbHighScore2.setText(""+Score.highScore); }
						 sb.setCharAt(i*2, 'A'); 			// i번째에 *2를 준 이유는 생성시 (_ ) 즉 띄어쓰기를 줫기 때문 
						 lifeCheck = true;
					 }
					}
				 lbCorrect.setText(sb.toString());
				 btnA.setEnabled(false);
				 if(lifeCheck==false) {life-=1;lbLife2.setText(""+life);}
				 System.out.println("A버튼 sb ="+sb);
				 System.out.println("A버튼 이름 ="+word[rand]);
				 
			 }
		else if(e.getSource() == btnB) {
		    for (int i = 0; i < word[rand].length(); i++) {
		        if (word[rand].charAt(i) == 'B'){
		        	score += 20;
					lbScore2.setText(""+score);
					if(score>=Score.highScore) { Score.highScore = score;lbHighScore2.setText(""+Score.highScore); }
		            sb.setCharAt(i * 2, 'B');
		            lifeCheck = true;
		        }
		    }
		    
		    lbCorrect.setText(sb.toString());
		    btnB.setEnabled(false);
		    if(lifeCheck==false) {life-=1;lbLife2.setText(""+life);}
		    System.out.println("life = "+life);
		   
		}
		else if(e.getSource() == btnC) {
		    for (int i = 0; i < word[rand].length(); i++) {
		        if (word[rand].charAt(i) == 'C')
		        {
		        	score += 20;
					 lbScore2.setText(""+score);
					 if(score>=Score.highScore) { Score.highScore = score;lbHighScore2.setText(""+Score.highScore); }
		            sb.setCharAt(i * 2, 'C');
		            lifeCheck = true;
		        }
		    }
		    if(lifeCheck==false) {life-=1;lbLife2.setText(""+life);}
		    lbCorrect.setText(sb.toString());
		    btnC.setEnabled(false);
		    System.out.println("life = "+life);
		}
		else if(e.getSource() == btnD) {
		    for (int i = 0; i < word[rand].length(); i++) {
		        if (word[rand].charAt(i) == 'D') {
		        	 score += 20;
					 lbScore2.setText(""+score);
					 if(score>=Score.highScore) { Score.highScore = score;lbHighScore2.setText(""+Score.highScore); }
		            sb.setCharAt(i * 2, 'D');
		            lifeCheck = true;
		        }
		    }
		    lbCorrect.setText(sb.toString());
		    btnD.setEnabled(false);
		    if(lifeCheck==false) {life -= 1;lbLife2.setText(""+life);}
		}else if(e.getSource() == btnE) {
		    for (int i = 0; i < word[rand].length(); i++) {
		        if (word[rand].charAt(i) == 'E') {
		        	 score += 20;
					 lbScore2.setText(""+score);
					 if(score>=Score.highScore) { Score.highScore = score;lbHighScore2.setText(""+Score.highScore); }
		            sb.setCharAt(i * 2, 'E');
		            lifeCheck = true;
		        }
		    }
		    lbCorrect.setText(sb.toString());
		    btnE.setEnabled(false);
		    if(lifeCheck==false) {life -= 1;lbLife2.setText(""+life);}
		}else if(e.getSource() == btnF) {
		    for (int i = 0; i < word[rand].length(); i++) {
		        if (word[rand].charAt(i) == 'F') {
		        	 score += 20;
					 lbScore2.setText(""+score);
					 if(score>=Score.highScore) { Score.highScore = score;lbHighScore2.setText(""+Score.highScore); }
		            sb.setCharAt(i * 2, 'F');
		            lifeCheck = true;
		        }
		    }
		    lbCorrect.setText(sb.toString());
		    btnF.setEnabled(false);
		    if(lifeCheck==false) {life -= 1;lbLife2.setText(""+life);}
		}else if(e.getSource() == btnG) {
		    for (int i = 0; i < word[rand].length(); i++) {
		        if (word[rand].charAt(i) == 'G') {
		        	 score += 20;
					 lbScore2.setText(""+score);
					 if(score>=Score.highScore) { Score.highScore = score;lbHighScore2.setText(""+Score.highScore); }
		            sb.setCharAt(i * 2, 'G');
		            lifeCheck = true;
		        }
		    }
		    lbCorrect.setText(sb.toString());
		    btnG.setEnabled(false);
		    if(lifeCheck==false) {life-=1;lbLife2.setText(""+life);}
		}else if(e.getSource() == btnH) {
		    for (int i = 0; i < word[rand].length(); i++) {
		        if (word[rand].charAt(i) == 'H') {
		        	 score += 20;
					 lbScore2.setText(""+score);
					 if(score>=Score.highScore) { Score.highScore = score;lbHighScore2.setText(""+Score.highScore); }
		            sb.setCharAt(i * 2, 'H');
		            lifeCheck = true;		            
		        }
		    }
		    lbCorrect.setText(sb.toString());
		    btnH.setEnabled(false);
		    if(lifeCheck==false) {life-=1;lbLife2.setText(""+life);}
		}else if(e.getSource() == btnI) {
		    for (int i = 0; i < word[rand].length(); i++) {
		        if (word[rand].charAt(i) == 'I') {
		        	 score += 20;
					 lbScore2.setText(""+score);
					 if(score>=Score.highScore) { Score.highScore = score;lbHighScore2.setText(""+Score.highScore); }
		            sb.setCharAt(i * 2, 'I');
		            lifeCheck = true;
		        }
		    }
		    lbCorrect.setText(sb.toString());
		    btnI.setEnabled(false);
		    if(lifeCheck==false) {life-=1;lbLife2.setText(""+life);}
		}else if(e.getSource() == btnJ) {
		    for (int i = 0; i < word[rand].length(); i++) {
		        if (word[rand].charAt(i) == 'J') {
		            sb.setCharAt(i * 2, 'J');
		            lifeCheck = true;
		        }
		    }
		    lbCorrect.setText(sb.toString());
		    btnJ.setEnabled(false);
		    if(lifeCheck==false) {life-=1;lbLife2.setText(""+life);}
		}else if(e.getSource() == btnK) {
		    for (int i = 0; i < word[rand].length(); i++) {
		        if (word[rand].charAt(i) == 'K') {
		        	 score += 20;
					 lbScore2.setText(""+score);
					 if(score>=Score.highScore) { Score.highScore = score;lbHighScore2.setText(""+Score.highScore); }
		            sb.setCharAt(i * 2, 'K');
		            lifeCheck = true;
		        }
		    }
		    lbCorrect.setText(sb.toString());
		    btnK.setEnabled(false);
		    if(lifeCheck==false) {life-=1;lbLife2.setText(""+life);}
		}else if(e.getSource() == btnL) {
		    for (int i = 0; i < word[rand].length(); i++) {
		        if (word[rand].charAt(i) == 'L') {
		        	 score += 20;
					 lbScore2.setText(""+score);
					 if(score>=Score.highScore) { Score.highScore = score;lbHighScore2.setText(""+Score.highScore); }
		            sb.setCharAt(i * 2, 'L');
		            lifeCheck = true;
		        }
		    }
		    lbCorrect.setText(sb.toString());
		    btnL.setEnabled(false);
		    if(lifeCheck==false) {life-=1;lbLife2.setText(""+life);}
		}else if(e.getSource() == btnM) {
		    for (int i = 0; i < word[rand].length(); i++) {
		        if (word[rand].charAt(i) == 'M') {
		        	 score += 20;
					 lbScore2.setText(""+score);
					 if(score>=Score.highScore) { Score.highScore = score;lbHighScore2.setText(""+Score.highScore); }
		            sb.setCharAt(i * 2, 'M');
		            lifeCheck = true;
		        }
		    }
		    lbCorrect.setText(sb.toString());
		    btnM.setEnabled(false);
		    if(lifeCheck==false) {life-=1;lbLife2.setText(""+life);}
		}else if(e.getSource() == btnN) {
		    for (int i = 0; i < word[rand].length(); i++) {
		        if (word[rand].charAt(i) == 'N') {
		        	score += 20;
		        	lbScore2.setText(""+score);
		            sb.setCharAt(i * 2, 'N');
		            lifeCheck = true;
		        }
		    }
		    lbCorrect.setText(sb.toString());
		    btnN.setEnabled(false);
		    if(lifeCheck==false) {life-=1;lbLife2.setText(""+life);}
		}else if(e.getSource() == btnO) {
		    for (int i = 0; i < word[rand].length(); i++) {
		        if (word[rand].charAt(i) == 'O') {
		        	 score += 20;
					 lbScore2.setText(""+score);
					 if(score>=Score.highScore) { Score.highScore = score;lbHighScore2.setText(""+Score.highScore); }
		            sb.setCharAt(i * 2, 'O');
		            lifeCheck = true;
		        }
		    }
		    lbCorrect.setText(sb.toString());
		    btnO.setEnabled(false);
		    if(lifeCheck==false) {life-=1;lbLife2.setText(""+life);}
		}else if(e.getSource() == btnP) {
		    for (int i = 0; i < word[rand].length(); i++) {
		        if (word[rand].charAt(i) == 'P') {
		        	 score += 20;
					 lbScore2.setText(""+score);
					 if(score>=Score.highScore) { Score.highScore = score;lbHighScore2.setText(""+Score.highScore); }
		            sb.setCharAt(i * 2, 'P');
		            lifeCheck = true;
		        }
		    }
		    lbCorrect.setText(sb.toString());
		    btnP.setEnabled(false);
		    if(lifeCheck==false) {life-=1;lbLife2.setText(""+life);}
		}else if(e.getSource() == btnQ) {
		    for (int i = 0; i < word[rand].length(); i++) {
		        if (word[rand].charAt(i) == 'Q') {
		        	 score += 20;
					 lbScore2.setText(""+score);
					 if(score>=Score.highScore) { Score.highScore = score;lbHighScore2.setText(""+Score.highScore); }
		            sb.setCharAt(i * 2, 'Q');
		            lifeCheck = true;
		        }
		    }
		    lbCorrect.setText(sb.toString());
		    btnQ.setEnabled(false);
		    if(lifeCheck==false) {life-=1;lbLife2.setText(""+life);}
		}else if(e.getSource() == btnR) {
		    for (int i = 0; i < word[rand].length(); i++) {
		        if (word[rand].charAt(i) == 'R') {
		            sb.setCharAt(i * 2, 'R');
		            score += 20;
					 lbScore2.setText(""+score);
					 if(score>=Score.highScore) { Score.highScore = score;lbHighScore2.setText(""+Score.highScore); }
					 lifeCheck = true;
		        }
		    }
		    lbCorrect.setText(sb.toString());
		    btnR.setEnabled(false);
		    if(lifeCheck==false) {life-=1;lbLife2.setText(""+life);}
		}else if(e.getSource() == btnS) {
		    for (int i = 0; i < word[rand].length(); i++) {
		        if (word[rand].charAt(i) == 'S') {
		        	 score += 20;
					 lbScore2.setText(""+score);
					 if(score>=Score.highScore) { Score.highScore = score;lbHighScore2.setText(""+Score.highScore); }
		            sb.setCharAt(i * 2, 'S');
		            lifeCheck = true;
		        }
		    }
		    lbCorrect.setText(sb.toString());
		    btnS.setEnabled(false);
		    if(lifeCheck==false) {life-=1;lbLife2.setText(""+life);}
		}else if(e.getSource() == btnT) {
		    for (int i = 0; i < word[rand].length(); i++) {
		        if (word[rand].charAt(i) == 'T') {
		        	 score += 20;
					 lbScore2.setText(""+score);
					 if(score>=Score.highScore) { Score.highScore = score;lbHighScore2.setText(""+Score.highScore); }
		            sb.setCharAt(i * 2, 'T');
		            lifeCheck=false;
		        }
		    }
		    lbCorrect.setText(sb.toString());
		    btnT.setEnabled(false);
		    if(lifeCheck==false) {life-=1;lbLife2.setText(""+life);}
		}else if(e.getSource() == btnU) {
		    for (int i = 0; i < word[rand].length(); i++) {
		        if (word[rand].charAt(i) == 'U') {
		        	 score += 20;
					 lbScore2.setText(""+score);
					 if(score>=Score.highScore) { Score.highScore = score;lbHighScore2.setText(""+Score.highScore); }
		            sb.setCharAt(i * 2, 'U');
		            lifeCheck = true;
		        }
		    }
		    lbCorrect.setText(sb.toString());
		    btnU.setEnabled(false);
		    if(lifeCheck==false) {life-=1;lbLife2.setText(""+life);}
		}else if(e.getSource() == btnV) {
		    for (int i = 0; i < word[rand].length(); i++) {
		        if (word[rand].charAt(i) == 'V') {
		        	 score += 20;
					 lbScore2.setText(""+score);
					 if(score>=Score.highScore) { Score.highScore = score;lbHighScore2.setText(""+Score.highScore); }
		            sb.setCharAt(i * 2, 'V');
		            lifeCheck = true;
		        }
		    }
		    lbCorrect.setText(sb.toString());
		    btnV.setEnabled(false);
		    if(lifeCheck==false) {life-=1;lbLife2.setText(""+life);}
		}else if(e.getSource() == btnW) {
		    for (int i = 0; i < word[rand].length(); i++) {
		        if (word[rand].charAt(i) == 'W') {
		        	 score += 20;
					 lbScore2.setText(""+score);
					 if(score>=Score.highScore) { Score.highScore = score;lbHighScore2.setText(""+Score.highScore); }
		            sb.setCharAt(i * 2, 'W');
		            lifeCheck = true;
		        }
		    }
		    lbCorrect.setText(sb.toString());
		    btnW.setEnabled(false);
		    if(lifeCheck==false) {life-=1;lbLife2.setText(""+life);}
		}else if(e.getSource() == btnX) {
		    for (int i = 0; i < word[rand].length(); i++) {
		        if (word[rand].charAt(i) == 'X') {
		        	 score += 20;
					 lbScore2.setText(""+score);
					 if(score>=Score.highScore) { Score.highScore = score;lbHighScore2.setText(""+Score.highScore); }
		            sb.setCharAt(i * 2, 'X');
		            lifeCheck = true;
		        }
		    }
		    lbCorrect.setText(sb.toString());
		    btnX.setEnabled(false);
		    if(lifeCheck==false) {life-=1;lbLife2.setText(""+life);}
		}else if(e.getSource() == btnY) {
		    for (int i = 0; i < word[rand].length(); i++) {
		        if (word[rand].charAt(i) == 'Y') {
		        	 score += 20;
					 lbScore2.setText(""+score);
					 if(score>=Score.highScore) { Score.highScore = score;lbHighScore2.setText(""+Score.highScore); }
		            sb.setCharAt(i * 2, 'Y');
		            lifeCheck = true;
		        }
		    }
		    lbCorrect.setText(sb.toString());
		    btnY.setEnabled(false);
		    if(lifeCheck==false) {life-=1;lbLife2.setText(""+life);}
		}else if(e.getSource() == btnZ) {
		    for (int i = 0; i < word[rand].length(); i++) {
		        if (word[rand].charAt(i) == 'Z') {
		        	 score += 20;
					 lbScore2.setText(""+score);
					 if(score>=Score.highScore) { Score.highScore = score;lbHighScore2.setText(""+Score.highScore); }
		            sb.setCharAt(i * 2, 'Z');
		            lifeCheck = true;
		        }
		    }
		    lbCorrect.setText(sb.toString());
		    btnZ.setEnabled(false);
		    if(lifeCheck==false) {life-=1;lbLife2.setText(""+life);}
		}
        
        if(life==7) {imgHangMan=Toolkit.getDefaultToolkit().getImage("HangMan0.png");}
		else if(life==6) {imgHangMan=Toolkit.getDefaultToolkit().getImage("HangMan1.png");}
		else if(life==5) {imgHangMan=Toolkit.getDefaultToolkit().getImage("HangMan2.png");}
		else if(life==4) {imgHangMan=Toolkit.getDefaultToolkit().getImage("HangMan3.png");}
		else if(life==3) {imgHangMan=Toolkit.getDefaultToolkit().getImage("HangMan4.png");}
		else if(life==2) {imgHangMan=Toolkit.getDefaultToolkit().getImage("HangMan5.png");}
		else if(life==1) {imgHangMan=Toolkit.getDefaultToolkit().getImage("HangMan6.png");}
		else if(life==0) {imgHangMan=Toolkit.getDefaultToolkit().getImage("HangMan7.png");}
        this.repaint();
        if(life==0) {alam();}	//목숨이0일시 알람 실행
	}
	void alam() {
		
			score=0;
			lbScore2.setText("0");
			final Dialog dlg = new Dialog(this, "알림창", true);
			dlg.setLayout(null);		
			
			Label lbMsg = new Label("G A M E _ O V E R",Label.CENTER);
			Button bt = new Button("돌아가기");
			
			dlg.add(lbMsg);
			dlg.add(bt);
			lbMsg.setBounds(100,50,100,30);
			bt.setBounds(100, 120, 100, 30);			
			bt.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					dlg.setVisible(false);
				}
				
			});			
			dlg.setSize(300, 200);
			dlg.setLocation(2850, 550);
			dlg.setVisible(true);
			life=7;
			lbLife2.setText(""+life);
		}
	
}

