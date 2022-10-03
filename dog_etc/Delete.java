package dog_etc;

import java.util.Scanner;

public class Delete implements Dog_Controller
	Scanner sc = new Scanner(System.in);

	@Override
	public void exec(Bank_v7[] users) {
		// 변수
		String inputId = "", inputPass = "";
		int userNum = -1;
		char ans = '\u0000';

		Scanner sc = new Scanner(System.in);
		// 입력
		System.out.println("┌───────────────────────┐");
		System.out.println("│   ♡ 반려동물 원생 탈퇴하기 ♡\t│");
		System.out.println("└───────────────────────┘");
		System.out.print("☞ 반려동물의 이름을 입력해주세요 >");
		inputId = sc.next();
		System.out.print("☞ 반려동물의 생일을 입력해주세요(yymmdd) > ");
		inputPass = sc.next();
		// 처리
		// inputId를 아이디 배열에서 찾기
		for (int i = 0; i < users.length; i++) {
			if (inputId.equals(users[i].getId())) {
				userNum = i;
				break;
			}
		}
		if (userNum == -1) {
			System.out.println(
					"┌───────────────────────┐\r\n" + "│  ※※등록되지 않은 원생입니다※※\t│\r\n" + "└───────────────────────┘\r\n");
		} else {
			if (inputPass.equals(users[userNum].getPass())) {
				System.out.print("☞ 후추 유치원에서 탈퇴하시겠습니까?(Y/N)");
				ans = sc.next().charAt(0);
				if (ans == 'Y' || ans == 'y') {
					users[userNum].setId(null);
					users[userNum].setPass(null);
					users[userNum].setBalance(0.0);
					System.out.println("▒ 탈퇴가 완료되었습니다.");
				} else {
					System.out.println("▒ 탈퇴가 취소되었습니다.");
				}
			} else {
				System.out.println("┌───────────────────────┐\r\n" + "│  ※입력정보를 다시 확인해주세요※\t│\r\n"
						+ "└───────────────────────┘\r\n" + "Name > " + inputId + "\r\n" + "Birth > " + inputPass
						+ "\r\n");
			}
		} // end if-else문
	}// end main
}// end class
