import java.util.Scanner;
public class luckgame {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("[1:���� 2:���� 3:��]");
		int a=scan.nextInt();
		int b=(int) (Math.random()*3+1-1)+1;
		game(a,b);}
	public static void game(int a,int b){
		String c="��! ����� �Է��ض�";
		switch(a){
		case 1:
			c = "����!";
			break;
		case 2:
		case 3:
			c = "���ڱ�!";
			break;}
		String d="��! ����� �Է��ض�";
		switch(b){
		case 1:
			d = "����!";
			break;
		case 2:
			d = "����!";
			break;
		case 3:
			d = "���ڱ�!";
			break;}
		System.out.println("-------- ���� ���� �� !----------");
		System.out.printf("[��: %s] VS [��ǻ��: %s]\n",c,d);
		if((b==1&&a==1)||(b==2&&a==2)||(b==3&&a==3)){
			System.out.println("���º�...");} else if((b==1&&a==2)||(b==2&&a==3)||(b==3&&a==1)){
			System.out.println("�¸�!");} else if((b==1&&a==3)||(b==2&&a==1)||(b==3&&a==2)){
			System.out.println("�й�");}
		else if(a>3){
			System.out.println("���� �߸� �Է��ϼ̾��");}}}