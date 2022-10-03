package dog_etc;

import java.util.Scanner;

public class Deposit implements Dog_Controller
	Scanner sc = new Scanner(System.in);

	@Override
	public void exec(Dog_DTO[] users) {
		// 변수
		String inputId = "", inputPass = "";
		int userNum = -1;
		int inputMoney = 0;
		Scanner sc = new Scanner(System.in);
		// 입력
		System.out.println("┌───────────────────────┐");
		System.out.println("│  ♡ 회원권 금액 추가 납입하기 ♡\t│");
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
		// 아이디가 맞지 않을 경우
		if (userNum == -1) {
			System.out.println(
					"┌───────────────────────┐\r\n" + "│  ※※등록되지 않은 원생입니다※※\t│\r\n" + "└───────────────────────┘\r\n");
		} else {
			// user2로 비밀번호 맞는지 확인하고 입금 처리
			if (inputPass.equals(users[userNum].getPass())) {
				System.out.print(
						"┌───────────────────────┐\n" + "│   ♡♡♡♡♡원생 정보 확인♡♡♡♡♡\t│\r\n" + "└───────────────────────┘\r\n"
								+ " ▒ 반갑습니다. " + users[userNum].getId() + "보호자님:)\r\n" + "☞ 회원권 추가 납입 금액 > ");
				inputMoney = sc.nextInt();
				inputMoney += users[userNum].getBalance();
				users[userNum].setBalance(inputMoney);
				System.out.println(" ▒ 이름: " + users[userNum].getId() + "\r\n" + " ▒ 생년월일 : " + users[userNum].getPass()
						+ "\r\n" + " ▒ 충전 후 회원권 잔액: " + users[userNum].getBalance());
			} else {
				System.out.println("┌───────────────────────┐\r\n" + "│  ※입력정보를 다시 확인해주세요※\t│\r\n"
						+ "└───────────────────────┘\r\n" + "Name > " + inputId + "\r\n" + "Birth > " + inputPass
						+ "\r\n");
			}
		}

	}// end main
}// end class
