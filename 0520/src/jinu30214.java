import java.util.Scanner;
public class jinu30214 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("500 ������ �ڿ����� �Է��ϼ���.");
		int sum=0;
		int a=sc.nextInt();
		for(int i=1;i<=a;i++){
			if(i % 3==0 && i % 2==1){
				System.out.println(i);
				sum=i++;
			}
		}
		System.out.println("1~20���� 3�� ����̸鼭 Ȧ���� ���� ����"+sum+"�Դϴ�.");
	}

}
