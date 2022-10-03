package dog;

import dog_etc.*;

public class Dog_school {
	public static void main(String[] args) {
		Dog_DTO[] users = new Dog_DTO[] { new Dog_DTO(), new Dog_DTO(), new Dog_DTO() };
		Dog_menu menu = new Dog_menu();
		menu.exec(users);
	}// end main
}// end class
