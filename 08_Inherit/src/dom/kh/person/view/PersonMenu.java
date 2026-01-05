package dom.kh.person.view;

import java.util.Scanner;

import dom.kh.person.controller.PersonController;

public class PersonMenu {
	private Scanner sc = new Scanner(System.in);
	private PersonController pc = new PersonController();

	public void mainMenu() {
		System.out.println("학생은 최대 " + pc.printStudent().length + "명까지 저장할 수 있습니다.");
		System.out.println("현재 저장된 학생은 " + pc.personCount().length + "명입니다.");
		System.out.println("사원은 최대 " + pc.printEmployee().length + "명까지 저장할 수 있습니다.");
		System.out.println("현재 저장된 학생은 " + pc.personCount().length + "명입니다.");

		System.out.println("1. 학생 메뉴");
		System.out.println("2. 사원 메뉴");
		System.out.println("9. 끝내기");

		for (;;) {
			System.out.print("메뉴 번호 : ");
			int menuN = sc.nextInt();
			if (menuN == 1) {
				studentMenu();
			} else if (menuN == 2) {
				employeeMenu();
			} else if (menuN == 9) {
				System.out.println("프로그램 종료");
				break;
			} else {
				System.out.println("잘못 입력하셨습니다. 다시 입력");
				continue;
			}
			break;
		}
	}

	public void studentMenu() {
		System.out.println("1. 학생 추가");
		System.out.println("2. 학생 보기");
		System.out.println("9. 메인으로");

		for (;;) {
			System.out.print("메뉴 번호 : ");
			int menuN = sc.nextInt();
			if (menuN == 1) {
				if (pc.printStudent()[2] != null) {
					for (;;) {
						System.out.println("학생을 담을 수 있는 공간이 꽉 찼기" + " 때문에 학생 추가 메뉴는 더 이상 활성화되지 않습니다");
						System.out.print("메뉴 번호 : ");
						menuN = sc.nextInt();

						if (!(menuN == 2 || menuN == 9)) {
							System.out.println("잘못 입력하셨습니다. 다시 입력");
							continue;
						}
						break;
					}
				}
				insertStudent();
			} else if (menuN == 2) {
				printStudent();
			} else if (menuN == 9) {
				System.out.println("메인으로 돌아갑니다");
				mainMenu();
			} else {
				System.out.println("잘못 입력하셨습니다. 다시 입력");
				continue;
			}
			break;
		}
	}

	public void employeeMenu() {
		System.out.println("1. 사원 추가");
		System.out.println("2. 사원 보기");
		System.out.println("9. 메인으로");

		for (;;) {
			System.out.print("메뉴 번호 : ");
			int menuN = sc.nextInt();
			if (menuN == 1) {
				if (pc.printEmployee()[9] != null) {
					for (;;) {
						System.out.println("사원을 담을 수 있는 공간이 꽉 찼기" + " 때문에 사원 추가 메뉴는 더 이상 활성화되지 않습니다");
						System.out.print("메뉴 번호 : ");
						menuN = sc.nextInt();

						if (!(menuN == 2 || menuN == 9)) {
							System.out.println("잘못 입력하셨습니다. 다시 입력");
							continue;
						}
						break;
					}
				}
				insertEmployee();
			} else if (menuN == 2) {
				printEmployee();
			} else if (menuN == 9) {
				System.out.println("메인으로 돌아갑니다");
				mainMenu();
			} else {
				System.out.println("잘못 입력하셨습니다. 다시 입력");
				continue;
			}
			break;
		}
	}

	public void insertStudent() {
		for (;;) {
			if(pc.printStudent()[2]==null) {
				System.out.print("학생 이름 : ");
				String name = sc.next();

				System.out.print("학생 나이 : ");
				int age = sc.nextInt();

				System.out.print("학생 키 : ");
				double height = sc.nextDouble();

				System.out.print("학생 몸무게 : ");
				double weight = sc.nextDouble();

				System.out.print("학생 학년 : ");
				int grade = sc.nextInt();

				System.out.print("학생 전공 : ");
				String major = sc.next();

				pc.insertStudent(name, age, height, weight, grade, major);
				
				System.out.print("그만하시려면 N(또는 n), 이어하시려면 아무 키나 누르세요 : ");
				char gostop = sc.next().toUpperCase().charAt(0);
				
				if(gostop == 'N') {
					studentMenu();
				}
				else {
					continue;
				}
			}
			else {
				System.out.println("학생을 담을 수 있는 공간이 꽉 찼기 때문에 학생 추가를 "
						+ "종료하고 학생 메뉴로 돌아갑니다.");
				studentMenu();
			}
			
		}
	}

	public void printStudent() {
		for(int i = 0; i<pc.printStudent().length; i++) {
			System.out.println(pc.printStudent()[i]);
		}
	}

	public void insertEmployee() {
		for (;;) {
			if(pc.printEmployee()[9]==null) {
				System.out.print("사원 이름 : ");
				String name = sc.next();

				System.out.print("사원 나이 : ");
				int age = sc.nextInt();

				System.out.print("사원 키 : ");
				double height = sc.nextDouble();

				System.out.print("사원 몸무게 : ");
				double weight = sc.nextDouble();

				System.out.print("사원 급여 : ");
				int salary = sc.nextInt();

				System.out.print("사원 부서 : ");
				String dept = sc.next();

				pc.insertEmployee(name, age, height, weight, salary, dept);
				
				System.out.print("그만하시려면 N(또는 n), 이어하시려면 아무 키나 누르세요 : ");
				char gostop = sc.next().toUpperCase().charAt(0);
				
				if(gostop == 'N') {
					employeeMenu();
				}
				else {
					continue;
				}
			}
			else {
				System.out.println("사원을 담을 수 있는 공간이 꽉 찼기 때문에 사원 추가를 "
						+ "종료하고 사원 메뉴로 돌아갑니다.");
				employeeMenu();
			}
			
		}
	}

	public void printEmployee() {
		for(int i = 0; i<pc.printEmployee().length; i++) {
			System.out.println(pc.printEmployee()[i]);
		}
	}
}
