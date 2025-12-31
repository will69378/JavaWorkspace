package dom.kh.chap01.before.run;

import dom.kh.chap01.before.model.vo.Desktop;
import dom.kh.chap01.before.model.vo.SmartPhone;

public class BeforeRun {
	public static void main(String[] args) {
		Desktop d = new Desktop("삼성", "d-01",
				"데스크탑", 2000000, true);
		
		SmartPhone sp = new SmartPhone("애플", "s-01",
				"아이폰", 800000, "KT");
	}
}
