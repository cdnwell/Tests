package test06;

import java.util.Scanner;

public class CafeRe {
	
	static int chMenu;
	static int chosMenu[] = new int [4];
	static int money = 0;
	static int menuNum = 0;
	static int totMoney = 10000;
	//menuNum�� �޴��� ���� �������� �ִ� ������ ���� �ʴ��� ���� ���� �ʿ��� �����̴�.
	static String []menuStr=new String[5]; 
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int pickList;

		while (true) {
			System.out.println("�ޡߡޡ�Cafe�ޡߡޡ�");
			System.out.println("1.�ֹ��ϱ�");
			System.out.println("2.����ϱ�");
			System.out.println("3.����ϱ�");
			System.out.println("4.������");
			pickList = sc.nextInt();
			if (pickList == 1) {
				Menu();
			} else if (pickList == 2) {
				delMenu(menuStr);
			} else if (pickList == 3) {
				buyMenu(menuStr);
			} else if (pickList == 4) {
				System.out.println("ī�並 �����ϴ�.");
				break;
			} else {
				System.out.println("�߸��� ���ڸ� �Է��ϼ̽��ϴ�.");
			}
		}

	}
	
	public static void Menu() {
		int pickList;
		Scanner sc =new Scanner(System.in);
		
		while(true) {
			System.out.println("1.�Ƹ޸�ī��");
			System.out.println("2.ī����");
			System.out.println("3.����������");
			System.out.println("4.���ھ�");
			System.out.println("5.���� �޴���");
			
			pickList= sc.nextInt();
			
			if(pickList == 1) {
				if(totMoney - money >= 2000 && menuNum < 4 ) {
					System.out.println("+�Ƹ޸�ī�� 1��");
					menuStr[menuNum] = "�Ƹ޸�ī��";
					menuNum++;
					money += 2000;
					break;
				}else {
					System.out.println("���� ��:"+totMoney);
					System.out.println("�޴� �Ѿ�:"+money);
					System.out.println("�� �̻� �����Ͻ� �� �����ϴ�!");
					break;
				}
			}else if(pickList == 2) {
				if(totMoney - money >= 3000 && menuNum < 4 ) {
					System.out.println("+ī��� 1��");
					menuStr[menuNum] = "ī���";
					menuNum++;
					money += 3000;
					break;
				}else {			
					System.out.println("���� ��:"+totMoney);
					System.out.println("�޴� �Ѿ�:"+money);
					System.out.println("�� �̻� �����Ͻ� �� �����ϴ�!");
					break;
				}
			}else if(pickList == 3) {
				if(totMoney - money >= 1500 && menuNum < 4 ) {
					System.out.println("+���������� 1��");
					menuStr[menuNum] = "����������";
					menuNum++;
					money += 1500;
					break;
				}else {			
					System.out.println("���� ��:"+totMoney);
					System.out.println("�޴� �Ѿ�:"+money);
					System.out.println("�� �̻� �����Ͻ� �� �����ϴ�!");
					break;
				}
			}else if(pickList == 4) {
				if(totMoney - money >= 1200 && menuNum < 4 ) {
					System.out.println("+���ھ� 1��");
					menuStr[menuNum] = "���ھ�";
					menuNum++;
					money += 1200;
					break;
				}else {
					System.out.println("���� ��:"+totMoney);
					System.out.println("�޴� �Ѿ�:"+money);
					System.out.println("�� �̻� �����Ͻ� �� �����ϴ�!");
					break;
				}
			}else if(pickList == 5) {
				break;
			}else {
				System.out.println("�߸��� ���ڸ� �Է��ϼ̽��ϴ�.");
			}
		}
	}
	
	public static void delMenu(String[] _menuStr) {
		int delNum;
		Scanner sc =new Scanner(System.in);
		if(menuNum==0) {
			System.out.println("����� �ֹ��� �����ϴ�.");
		}else {
			
			for(int i=0;i<menuNum;i++) {
				System.out.println(i+1+"."+_menuStr[i]);
			}
			System.out.println("��� �޴��� ����Ͻðڽ��ϱ�?");
			delNum=sc.nextInt();
			if(delNum>menuNum || delNum < 1 ) {
				System.out.println("�߸��� ��ȣ�� �Է��ϼ̽��ϴ�.");
			}else {
				if(_menuStr[delNum-1].equals("�Ƹ޸�ī��")) {
					money -=2000;
				}else if(_menuStr[delNum-1].equals("ī���")) {
					money -=3000;
				}else if(_menuStr[delNum-1].equals("����������")) {
					money -=1500;
				}else if(_menuStr[delNum-1].equals("���ھ�")) {
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
			System.out.println("���Ը���� �����ϴ�!");
		}else {
			System.out.println("--���� ���--");
			for(int i=0;i<menuNum;i++) {
				System.out.println(i+1+"."+_menuStr[i]);
			}
			System.out.println("���� ��:"+totMoney);
			System.out.println("�޴� �Ѿ�:"+money);
			System.out.print("�����Ͻðڽ��ϱ�?(y/n):");
			buyor=sc.next();
			if(buyor.equals("y")) {
				totMoney=totMoney-money;
				money =0;
				menuNum =0;
				System.out.println("�����ϼ̽��ϴ�!");
				System.out.println("���� ��:"+totMoney);
				for(int i=0;i<4;i++) {
					_menuStr[i]=null;
				}
			}else if(buyor.equals("n")) {
				System.out.println("������ �����մϴ�.");
			}else {
				System.out.println("�߸��� ���ڸ� �Է��ϼ̽��ϴ�.");
			}
		}
		
	}

}
