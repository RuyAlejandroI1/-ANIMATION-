package Personaje;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Panel;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class Ventana extends JFrame {

    private int X = 500; 
    private int Y = 500;

	public Ventana() {
		this.setLayout(null);
		this.setTitle("Personaje");
		this.setSize(500, 500);
		this.Components();
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
       		
	public void Components() {
		
		// Caja de texto
		JTextArea Caja = new JTextArea();
		Caja.setBounds(50, 400, 400, 50);
		Caja.setFocusable(true);
		this.add(Caja);

		Caja.addKeyListener(new KeyListener() {

			@Override			
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
			}

			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub
			}

		@Override

            public void keyPressed(KeyEvent e) {
			String ch=String.valueOf(e.getKeyChar());
			System.out.println(ch);
			
			int x = 0;
			int y = 0;
			int X= 210;
			int Y =230;
			int Xn= 240;
			int Yn =230;
			
			if (ch.equals("a")) { x=x+1;}
			if (ch.equals("w")) { Y=Y-1;}
			if (ch.equals("w")) { Y=Y-1;}
			
			Caja.setBounds(x, y, 500, 500);
			Caja.setBackground(Color.black);
			Caja.setBounds(X, Y, 20, 5);
			Caja.setBackground(Color.red);
			Caja.setBounds(X, Y, 20, 5);
			Caja.setBackground(Color.red);


			
		}
		});

		// PIXELART
		Color c1 = new Color(51, 153, 255);
		Color c2 = new Color(69, 83, 114);
		Color c3 = new Color(51, 102, 204);
		Color RUBIO = new Color(204, 153, 0);
		Color c5 = new Color(69, 83, 114);
		Color Carnita = new Color(245, 237, 227);
		Color c7 = new Color(97, 106, 127);
		Color AmarilloCorona = new Color(220, 209, 145);
		Color gris = new Color(201, 202, 206);
		Color Cuadricula = new Color(50, 205, 50);

		// sKULLHEART

		Panel PanC1 = new Panel();
		PanC1.setBounds(250, 320, 5, 10);
		PanC1.setBackground(Color.black);
		this.add(PanC1);

		Panel PanC2 = new Panel();
		PanC2.setBounds(216, 320, 5, 10);
		PanC2.setBackground(Color.black);
		this.add(PanC2);

		Panel PanC3 = new Panel();
		PanC3.setBounds(232, 310, 8, 15);
		PanC3.setBackground(Color.black);
		this.add(PanC3);

		Panel PanDCR = new Panel();
		PanDCR.setBounds(215, 320, 8, 8);
		PanDCR.setBackground(c3);
		this.add(PanDCR);

		Panel PanDCR1 = new Panel();
		PanDCR1.setBounds(248, 320, 8, 8);
		PanDCR1.setBackground(c3);
		this.add(PanDCR1);

		Panel PanDCR2 = new Panel();
		PanDCR2.setBounds(227, 335, 5, 5);
		PanDCR2.setBackground(Color.black);
		this.add(PanDCR2);

		Panel PanDCR3 = new Panel();
		PanDCR3.setBounds(240, 335, 5, 5);
		PanDCR3.setBackground(Color.black);
		this.add(PanDCR3);

		Panel PanA = new Panel();
		PanA.setBounds(258, 320, 7, 7);
		PanA.setBackground(c2);
		this.add(PanA);

		Panel PanB = new Panel();
		PanB.setBounds(250, 310, 8, 8);
		PanB.setBackground(c2);
		this.add(PanB);

		Panel PanC = new Panel();
		PanC.setBounds(216, 310, 10, 5);
		PanC.setBackground(c2);
		this.add(PanC);
		Panel PanD = new Panel();
		PanD.setBounds(205, 320, 5, 10);
		PanD.setBackground(c2);
		this.add(PanD);
		Panel PanE = new Panel();
		PanE.setBounds(216, 365, 10, 5);
		PanE.setBackground(c2);
		this.add(PanE);
		Panel PanF = new Panel();
		PanF.setBounds(200, 365, 10, 10);
		PanF.setBackground(c2);
		this.add(PanF);
		Panel PanG = new Panel();
		PanG.setBounds(200, 345, 15, 10);
		PanG.setBackground(c2);
		this.add(PanG);
		Panel PanH = new Panel();
		PanH.setBounds(260, 345, 10, 15);
		PanH.setBackground(c2);
		this.add(PanH);

		// skullheart
		Panel Pan000 = new Panel();
		Pan000.setBounds(222, 335, 10, 10);
		this.add(Pan000);

		Panel PanI0 = new Panel();
		PanI0.setBounds(240, 335, 10, 10);
		this.add(PanI0);

		Panel PanI00 = new Panel();
		PanI00.setBounds(225, 355, 3, 10);
		PanI00.setBackground(c1);
		this.add(PanI00);

		Panel PanX0 = new Panel();
		PanX0.setBounds(235, 355, 3, 10);
		PanX0.setBackground(c1);
		this.add(PanX0);

		Panel PanX00 = new Panel();
		PanX00.setBounds(245, 355, 3, 10);
		PanX00.setBackground(c1);
		this.add(PanX00);

		Panel Pan0 = new Panel();
		Pan0.setBounds(216, 320, 40, 40);
		Pan0.setBackground(Color.black);
		this.add(Pan0);

		Panel Pan00 = new Panel();
		Pan00.setBounds(220, 355, 32, 10);
		Pan00.setBackground(Color.black);
		this.add(Pan00);

		// FUEGO SKULLHEART

		Panel PanX2 = new Panel();
		PanX2.setBounds(212, 315, 47, 50);
		PanX2.setBackground(c1);
		this.add(PanX2);

		Panel PanX1 = new Panel();
		PanX1.setBounds(208, 310, 55, 60);
		PanX1.setBackground(c3);
		this.add(PanX1);

		// ROSTRO, Y DELLALLES

		// pelo

		Panel PanP1 = new Panel();
		PanP1.setBounds(205, 220, 10, 10);
		PanP1.setBackground(RUBIO);
		this.add(PanP1);

		Panel PanP2 = new Panel();
		PanP2.setBounds(240, 220, 10, 10);
		PanP2.setBackground(RUBIO);
		this.add(PanP2);

		Panel PanP3 = new Panel();
		PanP3.setBounds(215, 220, 10, 5);
		PanP3.setBackground(RUBIO);
		this.add(PanP3);

		Panel PanP4 = new Panel();
		PanP4.setBounds(235, 220, 5, 5);
		PanP4.setBackground(RUBIO);
		this.add(PanP4);

		Panel PanP5 = new Panel();
		PanP5.setBounds(255, 220, 10, 10);
		PanP5.setBackground(RUBIO);
		this.add(PanP5);

		Panel PanP6 = new Panel();
		PanP6.setBounds(205, 230, 5, 5);
		PanP6.setBackground(RUBIO);
		this.add(PanP6);

		Panel PanP7 = new Panel();
		PanP7.setBounds(245, 220, 5, 5);
		PanP7.setBackground(RUBIO);
		this.add(PanP7);

		// ojos
		Panel PanO1 = new Panel();
		PanO1.setBounds(210, 230, 20, 3);
		PanO1.setBackground(Color.black);
		this.add(PanO1);

		Panel PanO2 = new Panel();
		PanO2.setBounds(240, 230, 20, 3);
		PanO2.setBackground(Color.black);
		this.add(PanO2);

		// sonrisa

		Panel PanSN = new Panel();
		PanSN.setBounds(222, 246, 5, 4);
		PanSN.setBackground(Color.black);
		this.add(PanSN);

		Panel PanSN2 = new Panel();
		PanSN2.setBounds(227, 248, 15, 3);
		PanSN2.setBackground(Color.black);
		this.add(PanSN2);

		Panel PanDR1 = new Panel();
		PanDR1.setBounds(202, 255, 7, 7);
		PanDR1.setBackground(c5);
		this.add(PanDR1);

		Panel PanDR2 = new Panel();
		PanDR2.setBounds(260, 255, 7, 7);
		PanDR2.setBackground(c5);
		this.add(PanDR2);

		// cara o piel

		Panel PanR = new Panel();
		PanR.setBounds(205, 220, 60, 40);
		PanR.setBackground(Carnita);
		this.add(PanR);

		Panel PanM = new Panel();
		PanM.setBounds(230, 280, 10, 25);
		PanM.setBackground(Carnita);
		this.add(PanM);

		// AGATHA VELO

		Panel PanS = new Panel();
		PanS.setBounds(210, 200, 5, 20);
		PanS.setBackground(Color.black);
		this.add(PanS);

		Panel PanS1 = new Panel();
		PanS1.setBounds(255, 200, 5, 20);
		PanS1.setBackground(Color.black);
		this.add(PanS1);

		Panel PanS2 = new Panel();
		PanS2.setBounds(210, 200, 45, 5);
		PanS2.setBackground(Color.black);
		this.add(PanS2);

		Panel PanS3 = new Panel();
		PanS3.setBounds(200, 210, 15, 5);
		PanS3.setBackground(Color.black);
		this.add(PanS3);

		Panel PanS4 = new Panel();
		PanS4.setBounds(255, 210, 15, 5);
		PanS4.setBackground(Color.black);
		this.add(PanS4);

		Panel PanS5 = new Panel();
		PanS5.setBounds(220, 190, 5, 10);
		PanS5.setBackground(Color.black);
		this.add(PanS5);

		Panel PanS6 = new Panel();
		PanS6.setBounds(245, 190, 5, 10);
		PanS6.setBackground(Color.black);
		this.add(PanS6);

		Panel PanS7 = new Panel();
		PanS7.setBounds(240, 190, 15, 4);
		PanS7.setBackground(Color.black);
		this.add(PanS7);

		Panel PanS8 = new Panel();
		PanS8.setBounds(215, 190, 15, 4);
		PanS8.setBackground(Color.black);
		this.add(PanS8);

		Panel PanS9 = new Panel();
		PanS9.setBounds(230, 195, 10, 5);
		PanS9.setBackground(Color.black);
		this.add(PanS9);

		Panel PanDV1 = new Panel();
		PanDV1.setBounds(260, 190, 7, 7);
		PanDV1.setBackground(c2);
		this.add(PanDV1);

		Panel PanDV2 = new Panel();
		PanDV2.setBounds(202, 190, 7, 7);
		PanDV2.setBackground(c2);
		this.add(PanDV2);

		Panel PanVel = new Panel();
		PanVel.setBounds(205, 190, 60, 60);
		PanVel.setBackground(Color.white);
		this.add(PanVel);

		// AGATHA TUNICA

		Panel PanD1 = new Panel();
		PanD1.setBounds(195, 180, 10, 10);
		PanD1.setBackground(Color.black);
		this.add(PanD1);

		Panel PanD2 = new Panel();
		PanD2.setBounds(265, 180, 10, 10);
		PanD2.setBackground(Color.black);
		this.add(PanD2);

		Panel PanD3 = new Panel();
		PanD3.setBounds(189, 290, 10, 10);
		PanD3.setBackground(Color.black);
		this.add(PanD3);

		Panel PanD4 = new Panel();
		PanD4.setBounds(271, 290, 10, 10);
		PanD4.setBackground(Color.black);
		this.add(PanD4);

		Panel PanD5 = new Panel();
		PanD5.setBounds(190, 300, 10, 30);
		PanD5.setBackground(Color.black);
		this.add(PanD5);

		Panel PanD6 = new Panel();
		PanD6.setBounds(270, 300, 10, 30);
		PanD6.setBackground(Color.black);
		this.add(PanD6);

		Panel PanT1 = new Panel();
		PanT1.setBackground(c7);
		PanT1.setBounds(227, 300, 40, 5);
		this.add(PanT1);

		Panel PanT2 = new Panel();
		PanT2.setBackground(c7);
		PanT2.setBounds(205, 300, 40, 5);
		this.add(PanT2);

		Panel PanT3 = new Panel();
		PanT3.setBackground(c7);
		PanT3.setBounds(221, 285, 40, 5);
		this.add(PanT3);

		Panel PanT4 = new Panel();
		PanT4.setBackground(c7);
		PanT4.setBounds(210, 285, 40, 5);
		this.add(PanT4);

		Panel PanT5 = new Panel();
		PanT5.setBackground(c7);
		PanT5.setBounds(205, 270, 10, 5);
		this.add(PanT5);

		Panel PanT6 = new Panel();
		PanT6.setBackground(c7);
		PanT6.setBounds(255, 270, 10, 5);
		this.add(PanT6);

		Panel PanT7 = new Panel();
		PanT7.setBackground(c7);
		PanT7.setBounds(205, 270, 5, 15);
		this.add(PanT7);

		Panel PanT8 = new Panel();
		PanT8.setBackground(c7);
		PanT8.setBounds(260, 270, 5, 15);
		this.add(PanT8);

		Panel PanCZ = new Panel();
		PanCZ.setBounds(232, 262, 5, 20);
		PanCZ.setBackground(Color.yellow);
		this.add(PanCZ);
		Panel PanCl = new Panel();
		PanCl.setBounds(230, 260, 10, 5);
		PanCl.setBackground(Color.lightGray);
		this.add(PanCl);

		Panel PanCl1 = new Panel();
		PanCl1.setBounds(215, 265, 10, 5);
		PanCl1.setBackground(Color.lightGray);
		this.add(PanCl1);

		Panel PanCl2 = new Panel();
		PanCl2.setBounds(245, 265, 10, 5);
		PanCl2.setBackground(Color.lightGray);
		this.add(PanCl2);

		Panel Pan35 = new Panel();
		Pan35.setBounds(224, 265, 20, 5);
		Pan35.setBackground(Color.yellow);
		this.add(Pan35);

		Panel Pan36 = new Panel();
		Pan36.setBounds(195, 185, 5, 200);
		Pan36.setBackground(c7);
		this.add(Pan36);

		Panel Pan37 = new Panel();
		Pan37.setBounds(270, 185, 5, 200);
		Pan37.setBackground(c7);
		this.add(Pan37);

		Panel Pan38 = new Panel();
		Pan38.setBounds(200, 185, 70, 170);
		Pan38.setBackground(c2);
		this.add(Pan38);

		Panel Pan39 = new Panel();
		Pan39.setBounds(125, 350, 225, 40);
		Pan39.setBackground(c2);
		this.add(Pan39);

		Panel Pan40 = new Panel();
		Pan40.setBounds(108, 370, 265, 20);
		Pan40.setBackground(c2);
		this.add(Pan40);

		// DOUBLE OJOS

		Panel Pan41 = new Panel();
		Pan41.setBounds(285, 135, 6, 6);
		Pan41.setBackground(Color.black);
		this.add(Pan41);

		Panel Pan42 = new Panel();
		Pan42.setBounds(310, 130, 10, 10);
		Pan42.setBackground(Color.black);
		this.add(Pan42);

		Panel Pan43 = new Panel();
		Pan43.setBounds(290, 150, 10, 10);
		Pan43.setBackground(Color.black);
		this.add(Pan43);

		Panel Pan44 = new Panel();
		Pan44.setBounds(280, 120, 10, 10);
		Pan44.setBackground(Color.black);
		this.add(Pan44);

		Panel Pan45 = new Panel();
		Pan45.setBounds(260, 140, 10, 10);
		Pan45.setBackground(Color.black);
		this.add(Pan45);

		Panel Pan46 = new Panel();
		Pan46.setBounds(260, 140, 40, 20);
		Pan46.setBackground(Color.red);
		this.add(Pan46);

		Panel Pan47 = new Panel();
		Pan47.setBounds(280, 120, 40, 20);
		Pan47.setBackground(Color.red);
		this.add(Pan47);

		Panel Pan48 = new Panel();
		Pan48.setBounds(270, 50, 10, 10);
		Pan48.setBackground(Color.black);
		this.add(Pan48);

		Panel Pan49 = new Panel();
		Pan49.setBounds(270, 90, 10, 10);
		Pan49.setBackground(Color.black);
		this.add(Pan49);

		Panel Pan50 = new Panel();
		Pan50.setBounds(275, 70, 6, 6);
		Pan50.setBackground(Color.black);
		this.add(Pan50);

		Panel Pan51 = new Panel();
		Pan51.setBounds(270, 50, 20, 30);
		Pan51.setBackground(Color.red);
		this.add(Pan51);

		Panel Pan52 = new Panel();
		Pan52.setBounds(260, 70, 20, 30);
		Pan52.setBackground(Color.red);
		this.add(Pan52);
		// CORONA
		Panel Pan53 = new Panel();
		Pan53.setBounds(198, 40, 10, 10);
		this.add(Pan53);

		Panel Pan54 = new Panel();
		Pan54.setBounds(208, 30, 10, 10);
		this.add(Pan54);

		Panel Pan55 = new Panel();
		Pan55.setBounds(300, 30, 10, 10);
		this.add(Pan55);

		Panel Pan56 = new Panel();
		Pan56.setBounds(310, 40, 10, 10);
		this.add(Pan56);

		Panel Pan57 = new Panel();
		Pan57.setBounds(300, 40, 10, 10);
		Pan57.setBackground(AmarilloCorona);
		this.add(Pan57);

		Panel Pan58 = new Panel();
		Pan58.setBounds(208, 40, 10, 10);
		Pan58.setBackground(AmarilloCorona);
		this.add(Pan58);

		Panel Pan59 = new Panel();
		Pan59.setBounds(198, 30, 120, 10);
		Pan59.setBackground(AmarilloCorona);
		this.add(Pan59);

		Panel Pan60 = new Panel();
		Pan60.setBounds(198, 30, 10, 90);
		Pan60.setBackground(AmarilloCorona);
		this.add(Pan60);

		Panel Pan61 = new Panel();
		Pan61.setBounds(310, 30, 10, 90);
		Pan61.setBackground(AmarilloCorona);
		this.add(Pan61);

		Panel Pan62 = new Panel();
		Pan62.setBounds(176, 65, 25, 20);
		Pan62.setBackground(AmarilloCorona);
		this.add(Pan62);

		Panel Pan63 = new Panel();
		Pan63.setBounds(320, 65, 25, 20);
		Pan63.setBackground(AmarilloCorona);
		this.add(Pan63);

		Panel Pan64 = new Panel();
		Pan64.setBounds(170, 55, 10, 40);
		Pan64.setBackground(AmarilloCorona);
		this.add(Pan64);

		Panel Pan65 = new Panel();
		Pan65.setBounds(340, 55, 10, 40);
		Pan65.setBackground(AmarilloCorona);
		this.add(Pan65);

		Panel Pan66 = new Panel();
		Pan66.setBounds(240, 4, 40, 10);
		Pan66.setBackground(AmarilloCorona);
		this.add(Pan66);

		Panel Pan67 = new Panel();
		Pan67.setBounds(250, 5, 20, 25);
		Pan67.setBackground(AmarilloCorona);
		this.add(Pan67);

		Panel Pan68 = new Panel();
		Pan68.setBounds(208, 30, 10, 10);
		Pan68.setBackground(AmarilloCorona);
		this.add(Pan68);

		Panel Pan69 = new Panel();
		Pan69.setBounds(300, 30, 10, 10);
		Pan69.setBackground(AmarilloCorona);
		this.add(Pan69);

		Panel Pan70 = new Panel();
		Pan70.setBounds(188, 20, 10, 10);
		Pan70.setBackground(AmarilloCorona);
		this.add(Pan70);

		Panel Pan71 = new Panel();
		Pan71.setBounds(320, 20, 10, 10);
		Pan71.setBackground(AmarilloCorona);
		this.add(Pan71);

		Panel Pan72 = new Panel();
		Pan72.setBounds(198, 10, 10, 10);
		Pan72.setBackground(AmarilloCorona);
		this.add(Pan72);

		Panel Pan73 = new Panel();
		Pan73.setBounds(310, 10, 10, 10);
		Pan73.setBackground(AmarilloCorona);
		this.add(Pan73);

		Panel Pan74 = new Panel();
		Pan74.setBounds(178, 30, 10, 10);
		Pan74.setBackground(AmarilloCorona);
		this.add(Pan74);

		Panel Pan75 = new Panel();
		Pan75.setBounds(330, 30, 10, 10);
		Pan75.setBackground(AmarilloCorona);
		this.add(Pan75);

		// DOUBLESOMBRA
		Panel PanDT7 = new Panel();
		PanDT7.setBounds(140, 250, 20, 20);
		PanDT7.setBackground(Color.black);
		this.add(PanDT7);

		Panel PanDT8 = new Panel();
		PanDT8.setBounds(355, 200, 20, 20);
		this.add(PanDT8);

		Panel PanDT9 = new Panel();
		PanDT9.setBounds(400, 200, 20, 20);
		this.add(PanDT9);

		Panel PanDT10 = new Panel();
		PanDT10.setBounds(390, 190, 20, 20);
		this.add(PanDT10);

		Panel PanDT11 = new Panel();
		PanDT11.setBounds(350, 210, 20, 20);
		this.add(PanDT11);

		Panel Pan76 = new Panel();
		Pan76.setBounds(330, 120, 10, 10);
		this.add(Pan76);

		Panel PanDT = new Panel();
		PanDT.setBounds(320, 200, 20, 50);
		this.add(PanDT);

		Panel PanDT1 = new Panel();
		PanDT1.setBounds(130, 260, 30, 60);
		this.add(PanDT1);

		Panel PanDT2 = new Panel();
		PanDT2.setBounds(90, 250, 20, 20);
		this.add(PanDT2);

		Panel PanDT3 = new Panel();
		PanDT3.setBounds(70, 165, 20, 20);
		this.add(PanDT3);

		Panel PanDT4 = new Panel();
		PanDT4.setBounds(330, 180, 20, 20);
		this.add(PanDT4);

		Panel PanDT5 = new Panel();
		PanDT5.setBounds(80, 150, 20, 20);
		this.add(PanDT5);

		Panel PanDT6 = new Panel();
		PanDT6.setBounds(110, 290, 40, 40);
		this.add(PanDT6);

		Panel Pan77 = new Panel();
		Pan77.setBounds(138, 150, 200, 200);
		Pan77.setBackground(Color.black);
		this.add(Pan77);

		Panel Pan78 = new Panel();
		Pan78.setBounds(148, 120, 190, 200);
		Pan78.setBackground(Color.black);
		this.add(Pan78);

		Panel Pan79 = new Panel();
		Pan79.setBounds(158, 100, 160, 150);
		Pan79.setBackground(Color.black);
		this.add(Pan79);

		Panel Pan80 = new Panel();
		Pan80.setBounds(198, 30, 120, 100);
		Pan80.setBackground(Color.black);
		this.add(Pan80);

		Panel Pan81 = new Panel();
		Pan81.setBounds(178, 60, 100, 100);
		Pan81.setBackground(Color.black);
		this.add(Pan81);

		Panel Pan82 = new Panel();
		Pan82.setBounds(90, 200, 60, 60);
		Pan82.setBackground(Color.black);
		this.add(Pan82);

		Panel Pan83 = new Panel();
		Pan83.setBounds(80, 160, 40, 80);
		Pan83.setBackground(Color.black);
		this.add(Pan83);

		Panel Pan84 = new Panel();
		Pan84.setBounds(360, 200, 50, 80);
		Pan84.setBackground(Color.black);
		this.add(Pan84);

		Panel Pan85 = new Panel();
		Pan85.setBounds(320, 260, 80, 40);
		Pan85.setBackground(Color.black);
		this.add(Pan85);

	}

}
