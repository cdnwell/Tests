package test06;

import java.util.Scanner;

public class CafeRe {
	
	static int chMenu;
	static int chosMenu[] = new int [4];
	static int money = 0;
	static int menuNum = 0;
	static int totMoney = 10000;
	//menuNum은 메뉴가 구입 가능한지 최대 갯수를 넘지 않는지 보기 위해 필요한 변수이다.
	static String []menuStr=new String[5]; 
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int pickList;

		while (true) {
			System.out.println("◇◆◇◆Cafe◇◆◇◆");
			System.out.println("1.주문하기");
			System.out.println("2.취소하기");
			System.out.println("3.계산하기");
			System.out.println("4.나가기");
			pickList = sc.nextInt();
			if (pickList == 1) {
				Menu();
			} else if (pickList == 2) {
				delMenu(menuStr);
			} else if (pickList == 3) {
				buyMenu(menuStr);
			} else if (pickList == 4) {
				System.out.println("카페를 나갑니다.");
				break;
			} else {
				System.out.println("잘못된 숫자를 입력하셨습니다.");
			}
		}

	}
	
	public static void Menu() {
		int pickList;
		Scanner sc =new Scanner(System.in);
		
		while(true) {
			System.out.println("1.아메리카노");
			System.out.println("2.카페라뗴");
			System.out.println("3.에스프레소");
			System.out.println("4.코코아");
			System.out.println("5.이전 메뉴로");
			
			pickList= sc.nextInt();
			
			if(pickList == 1) {
				if(totMoney - money >= 2000 && menuNum < 4 ) {
					System.out.println("+아메리카노 1잔");
					menuStr[menuNum] = "아메리카노";
					menuNum++;
					money += 2000;
					break;
				}else {
					System.out.println("가진 돈:"+totMoney);
					System.out.println("메뉴 총액:"+money);
					System.out.println("더 이상 구매하실 수 없습니다!");
					break;
				}
			}else if(pickList == 2) {
				if(totMoney - money >= 3000 && menuNum < 4 ) {
					System.out.println("+카페라떼 1잔");
					menuStr[menuNum] = "카페라떼";
					menuNum++;
					money += 3000;
					break;
				}else {			
					System.out.println("가진 돈:"+totMoney);
					System.out.println("메뉴 총액:"+money);
					System.out.println("더 이상 구매하실 수 없습니다!");
					break;
				}
			}else if(pickList == 3) {
				if(totMoney - money >= 1500 && menuNum < 4 ) {
					System.out.println("+에스프레소 1잔");
					menuStr[menuNum] = "에스프레소";
					menuNum++;
					money += 1500;
					break;
				}else {			
					System.out.println("가진 돈:"+totMoney);
					System.out.println("메뉴 총액:"+money);
					System.out.println("더 이상 구매하실 수 없습니다!");
					break;
				}
			}else if(pickList == 4) {
				if(totMoney - money >= 1200 && menuNum < 4 ) {
					System.out.println("+코코아 1잔");
					menuStr[menuNum] = "코코아";
					menuNum++;
					money += 1200;
					break;
				}else {
					System.out.println("가진 돈:"+totMoney);
					System.out.println("메뉴 총액:"+money);
					System.out.println("더 이상 구매하실 수 없습니다!");
					break;
				}
			}else if(pickList == 5) {
				break;
			}else {
				System.out.println("잘못된 숫자를 입력하셨습니다.");
			}
		}
	}
	
	public static void delMenu(String[] _menuStr) {
		int delNum;
		Scanner sc =new Scanner(System.in);
		if(menuNum==0) {
			System.out.println("취소할 주문이 없습니다.");
		}else {
			
			for(int i=0;i<menuNum;i++) {
				System.out.println(i+1+"."+_menuStr[i]);
			}
			System.out.println("어느 메뉴를 취소하시겠습니까?");
			delNum=sc.nextInt();
			if(delNum>menuNum || delNum < 1 ) {
				System.out.println("잘못된 번호를 입력하셨습니다.");
			}else {
				if(_menuStr[delNum-1].equals("아메리카노")) {
					money -=2000;
				}else if(_menuStr[delNum-1].equals("카페라떼")) {
					money -=3000;
				}else if(_menuStr[delNum-1].equals("에스프레소")) {
					money -=1500;
				}else if(_menuStr[delNum-1].equals("코코아")) {
					money -=1200;
				}
				
				for(int i = delNum-1 ;i<menuNum;i++) {
						_menuStr[i]=_menuStr[i+1];
						
				}
				menuNum--;
			}
		}
	}
	
	public static void buyMenu(String[] _menuStr) {
		Scanner sc =new Scanner(System.in);
		
		String buyor;
		if(menuNum == 0) {
			System.out.println("구입목록이 없습니다!");
		}else {
			System.out.println("--구입 목록--");
			for(int i=0;i<menuNum;i++) {
				System.out.println(i+1+"."+_menuStr[i]);
			}
			System.out.println("가진 돈:"+totMoney);
			System.out.println("메뉴 총액:"+money);
			System.out.print("구입하시겠습니까?(y/n):");
			buyor=sc.next();
			if(buyor.equals("y")) {
				totMoney=totMoney-money;
				money =0;
				menuNum =0;
				System.out.println("구입하셨습니다!");
				System.out.println("남은 돈:"+totMoney);
				for(int i=0;i<4;i++) {
					_menuStr[i]=null;
				}
			}else if(buyor.equals("n")) {
				System.out.println("구입을 보류합니다.");
			}else {
				System.out.println("잘못된 문자를 입력하셨습니다.");
			}
		}
		
	}

}
