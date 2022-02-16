import java.util.Scanner;

public class Problem5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int studentScore[] = new int[5];
		int score1st, score2nd, flag=0;
		int i, j, k=1;
		
		System.out.println("Enter exam scores of each student.");
		for(i =0; i<5; i++) {
			System.out.print("Score of student " + (i+1) + ": ");
			studentScore[i] = scan.nextInt();
		}
		
		for(j=0; ; j++) {
			if(flag+k > 4)
				break;
			if(studentScore[flag] < studentScore[flag+k])
				flag = flag+k;
			else
				k++;
		}
		System.out.println("The 1st place is student " + (flag+1) + " with " + studentScore[flag] + " points.");
		studentScore[flag]= -1;
		
		flag = 0;
		k = 1;
		for(j=0; ; j++) {
			if(flag+k > 4)
				break;
			if(studentScore[flag] < studentScore[flag+k])
				flag = flag+k;
			else
				k++;
		}
		System.out.println("The 2nd place is student " + (flag+1) + " with " + studentScore[flag] + " points.");
		
	}

}
