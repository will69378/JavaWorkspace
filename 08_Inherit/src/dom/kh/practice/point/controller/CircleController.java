
package dom.kh.practice.point.controller;

import dom.kh.practice.point.model.vo.Circle;

public class CircleController {
	private Circle c = new Circle();
	
	public String calcArea(int x, int y, int radius) {
		c.setX(x);
		c.setY(y);
		c.setRadius(radius);
		
		double ans = Math.PI * radius * radius;
		String result = x+", "+y+", "+radius+" / "+ans;
		return result;
	}
	
	public String calcCircum(int x, int y, int radius) {
		c.setX(x);
		c.setY(y);
		c.setRadius(radius);
		
		double ans = Math.PI * radius * 2;
		String result = x+", "+y+", "+radius+" / "+ans;
		return result;
	}
}
