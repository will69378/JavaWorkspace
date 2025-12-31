package dom.kh.chap01.after.run;

import dom.kh.chap01.after.model.vo.*;

public class Run {
	public static void main(String[] args) {
		DeskTop dt = new DeskTop("삼성", "s-01",
				"데스크탑", 2000000, true);
		
		SmartPhone sp = new SmartPhone("삼성", "s-01",
				"핸드폰", 2000000, "KT");
		
		Tv t = new Tv("삼성", "s-11",
				"티비", 2000000, 60);
		
		System.out.println(dt.information());
	}
}
