import java.util.Scanner;
public class Prob_3 {
public int average(int math,int science, int english) {
int total = math+science+english;
int avg =(int)total/3;
return avg;}
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
System.out.print("수학,과학,영어 순으로 3개의 정수 입력>>");
int math = scan.nextInt();
int science = scan.nextInt();
int english = scan.nextInt();
Prob_3 average = new Prob_3();
System.out.println("평균은 " + average.average(math, science, english));}}