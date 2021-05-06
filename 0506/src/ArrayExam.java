import java.util.Scanner;
public class ArrayExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]=new int[5];
		int max=arr[0];
		int count = 0;
		Scanner sc = new Scanner(System.in);
		for(int j=0;j<5;j++){
		System.out.println(j+1+"번 입력");	
		arr[j]=sc.nextInt();
			if (max<arr[j]) {
				max=arr[j];
				count=j+1; }
	}
		System.out.println("가장 큰 수는"+count+"번쨰 숫자인"+max);
	}
}
