package com.kh.chap03_generic.run;

import com.kh.chap03_generic.model.vo.Child1;
import com.kh.chap03_generic.model.vo.Child2;
import com.kh.chap03_generic.model.vo.Generic;
import com.kh.chap03_generic.model.vo.GenericExtends;
import com.kh.chap03_generic.model.vo.Parent;

public class Run {
	public static void main(String[] args) {
		/*

1. 제네릭 등장 이전 프로그래밍 방식
	- 컬렉션 데이터를 추가시 항상 Object 객체로 저장해야 했다
	- 저장된 데이터를 꺼내서 활용시에는 항상 강제형변환이 필요했다
	- 단, 형변환시에 잘못된 자료형으로의 형변환을 진행한다면 에러가 발생할 수 있었다
	List l = new ArrayList();
		for(Object o : l) {
			String s = (String) o;
		}
		
2. 제네릭 등장
	- 데이터의 자료형을 일반화 시켜서 여러 자료형을 다룰 수 있게 만든 문법
	
	- 클래스의 메서드의 반환형, 매개변수, 필드의 자료형들을 미리 확정
	짓지 않고 파라미터화 하여 나중에 지정할 수 있게 만드는 문법
	
	- 즉, 제네릭을 사용하면 다양한 자료형들을 저장할 수 있게 때문에 타입변수라고도 함
	
	- 제네릭을 사용하면 런타임이 아닌 컴파일 시점에서 에러를 캐치할 수 있으므로 타입안정성을 확보할 수 있다.

	- 대입될 데이터의 자료형을 미리 지정하지 않고, 컴파일 시점에서 내 맘대로 지정하여 사용하여 재사용성 증가
	
	
3. 제네릭의 extends
	- 제네릭에서의 extends는 클래스 간의 상속이 아니라 제네릭으로 지정한 자료형의 범위를 제한시키는데 사용
	상속시킨 클래스는 상속받은 자료형만 대입 가능하고,  인터페이스는 구현한 클래스만 대입 가능하다
	
	
4. 와일드카드 ( ? )
	- Generic에 들어가야할 자료형을 모르는 경우 사용
	- 와일드카드의 의미는 어떤 자료형이 들어올지 모른다의 의미로 사용하며
	모든 자료형이 들어올 수 있다는 의미는 아님
	- ?는 extends와 super 예약어 (상속시키는 클래스와 인터페이스) 로 자료형의 범위를 제한할 수 있음
	- ? extends T : 상한제한 => 와일드카드의 범위를 T 또는 T의 자식들로 제한하는 기능
	- ? super T : 하한제한 => 범위를 T 또는 T의 조상들로 제한
	- ?로 타입변수 사용시 검사가 불가능해 에러가 발생
	
	
	그래서 ?를 제대로 사용하려면 extends와 super로 범위를 제한해야함
	
	
		1) extends를 통한 상한제한 : 데이터를 가져오고자 할때 적절
		GenericExtends<? extends Parent> unknown2 = new GenericExtends<>();

	
		2) super를 통한 하한제한 : 값을 대입하고 할때 적절
		GenericExtends<? super Parent> unknown3 = new GenericExtends<>();
	
		타입변수에 extends를 통한 타입 제한이 없는 경우, 데이터는 항상 Object 형태로만 추출이 가능
		 */
		
		GenericExtends<?> unknown = new GenericExtends<>();
		//unknown.setType(new Parent());
		
		GenericExtends<? extends Parent> unknown2 = new GenericExtends<>();
		unknown2.getType();
		GenericExtends<? super Parent> unknown3 = new GenericExtends<>();
		
		Child1 c = (Child1) new Parent();
		Child2 c2 = new Child2();
		
		unknown3.setType(new Parent());
		unknown3.setType(new Child1());
		unknown3.setType(new Child2());
		
		Generic<Integer, String> g1 = new Generic<>();
		g1.setT(111111);
		g1.setG("김지원");
		Generic.printTest("lala");
		Generic.<String>printTest("명지원");
		
		GenericExtends<Parent> parent = new GenericExtends<>();
		GenericExtends<Child1> child1 = new GenericExtends<>();
		
		parent.setType(new Parent());
		parent.printing();
		
		
		
		
	}
}
