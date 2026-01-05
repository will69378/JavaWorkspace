package dom.kh.practice.point.controller;

import dom.kh.practice.point.model.vo.Rectangle;

public class RectangleController {
	private Rectangle r = new Rectangle();
	public String calcArea(int x, int y, int height, int width) {
		r.setX(x);
		r.setY(y);
		r.setHeight(height);
		r.setWidth(width);
		
		double ans = width * height;
		String result = x+", "+y+", "+width+", "+height+" / "+ans;
		return result;
	}
	
	public String calcPerimeter(int x, int y, int height, int width) {
		r.setX(x);
		r.setY(y);
		r.setHeight(height);
		r.setWidth(width);
		
		double ans = 2 * (width+height);
		String result = x+", "+y+", "+width+", "+height+" / "+ans;
		return result;
	}
}
