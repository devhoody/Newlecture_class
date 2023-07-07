package ex15.oop.isa;
/*
 * 230707
 * Frame을 이용한 상속 연습
 */

import java.awt.Frame;
import java.awt.Graphics;

public class GameFrame extends Frame {
	@Override
	public void paint(Graphics g) {
//		super.paint(g);
		g.drawLine(0, 0, 300, 300);
	}
}
