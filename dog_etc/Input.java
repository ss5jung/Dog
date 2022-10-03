package dog_etc;

import java.util.Scanner;

public class Input implements Dog_Control {
	Scanner sc = new Scanner(System.in);

	@Override
	public void exec(Dog_DTO[] users) {
		// 변수
		int userIndex = -1;
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < users.length; i++) {
			if ((users[i].getId()) == null) {
				userIndex = i;
				break;
			}
		}
		if (userIndex == -1) {
			System.out.println("※※추가적인 신규 원생 등록이 불가능합니다※※");
		} else {
			// 입력
			System.out.println("┌───────────────────────┐");
			System.out.println("│  ♡ 반려동물 원생 등록하기 ♡\t│");
			System.out.println("└───────────────────────┘");
			System.out.print("☞ 반려동물의 이름을 입력해주세요 > ");
			users[userIndex].setId(sc.next());
			System.out.print("☞ 반려동물의 생일을 입력해주세요(yymmdd) > ");
			users[userIndex].setPass(sc.next());
			System.out.print("☞ 후추유치원에서 사용하실 회원권 금액을 입력해주세요 > ");
			users[userIndex].setBalance(sc.nextDouble());
		}
	}
}// end class
