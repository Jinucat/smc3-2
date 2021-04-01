import java.util.Scanner;
public class prob_01 {

	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int math, science, english;
		math=sc.nextInt();
		science=sc.nextInt();
		english=sc.nextInt();
		int t=average(math, science, english);
		
		System.out.println("∆Ú±’¿∫"+t);
	}
	public static int average(int math, int science, int english){
		int t=math + science + english;
		t=t/3;
		return t;
	}

}
