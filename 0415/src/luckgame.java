import java.util.Scanner;
public class luckgame {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("[1:가위 2:바위 3:보]");
		int a=scan.nextInt();
		int b=(int) (Math.random()*3+1-1)+1;
		game(a,b);}
	public static void game(int a,int b){
		String c="마! 지대로 입력해라";
		switch(a){
		case 1:
			c = "가위!";
			break;
		case 2:
		case 3:
			c = "보자기!";
			break;}
		String d="마! 지대로 입력해라";
		switch(b){
		case 1:
			d = "가위!";
			break;
		case 2:
			d = "바위!";
			break;
		case 3:
			d = "보자기!";
			break;}
		System.out.println("-------- 가위 바위 보 !----------");
		System.out.printf("[나: %s] VS [컴퓨터: %s]\n",c,d);
		if((b==1&&a==1)||(b==2&&a==2)||(b==3&&a==3)){
			System.out.println("무승부...");} else if((b==1&&a==2)||(b==2&&a==3)||(b==3&&a==1)){
			System.out.println("승리!");} else if((b==1&&a==3)||(b==2&&a==1)||(b==3&&a==2)){
			System.out.println("패배");}
		else if(a>3){
			System.out.println("값을 잘못 입력하셨어요");}}}