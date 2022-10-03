package dog_etc;

import java.util.Scanner;

public class Dog_menu {
	Dog_DTO[] users;

	public void exec(Dog_DTO[] users) {
		// 변수
		int num = 0;
		Scanner sc = new Scanner(System.in);
		Input input = new Input();
		Show show = new Show();
		Deposit deposit = new Deposit();
		Withdraw withdraw = new Withdraw();
		Delete delete = new Delete();

		do {
			// 메뉴 출력화면
			System.out.print("┌───────────────────────┐\n" + "│ ♥♥♥♥♥후추 애견 유치원♥♥♥♥♥\t│\r\n"
					+ "│ --------------------- │\r\n" + "│ ▽1. 반려동물 원생 등록하기\t│\r\n" + "│ ▽2. 반려동물 원생정보 조회하기\t│\r\n"
					+ "│ ▽3. 회원권 금액 추가 납입하기\t│\r\n" + "│ ▽4. 회원권 금액 환불하기\t│\r\n" + "│ ▽5. 반려동물 원생 탈퇴하기\t│\r\n"
					+ "│ ▽9. 종료\t\t│\r\n" + "└───────────────────────┘\r\n");
			System.out.print(" ◈ 메뉴를 선택하세요 > ");
			num = sc.nextInt();
			// System.out.println("=====================");

			switch (num) {
			case 1:
				input.exec(users);
				break;
			case 2:
				show.exec(users);
				break;
			case 3:
				deposit.exec(users);
				break;
			case 4:
				withdraw.exec(users);
				break;
			case 5:
				delete.exec(users);
				break;
			case 9:
				System.out.println("♥♥♥♥♥후추 애견 유치원을 이용해주셔서 감사합니다♥♥♥♥♥");
				break;
			}
		} while (num != 9);

	}// end main
}// end class
