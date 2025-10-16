import java.util.Scanner;
public class studentgrade {    

    public static void main(String []args) {
Scanner sc=new Scanner(System.in);
System.out.println("***Student Grade Information****");
int totalMarks=0;
float avgPercentage;
System.out.println("\n Total Number Of Percentage");
int subjects=sc.nextInt();
if(subjects<=0){
System.out.println("\n Subject must be graether than 0");
return;
}
for(int i=1;i<=subjects;i++){
    System.out.println(i);
int marks=sc.nextInt();
if(marks<0||marks>100){
    System.out.println("\n Invalid Input Please Enter Correct Marks");
    i--;
    continue;
}
totalMarks+=marks;
}
System.out.println("The Sum of all subjects"+totalMarks);
avgPercentage=(float)totalMarks/subjects;
System.out.println("Average percentage"+avgPercentage);
if(avgPercentage>=90){
    System.out.println("|n Grade A");

}
else if(avgPercentage>=80)
    {
        System.out.println("Grade B");
    }
    else if(avgPercentage>=70){
        System.out.println("Grade C");
    }
    else if(avgPercentage>=60){
        System.out.println("Grade D");
    }
    else if(avgPercentage>50){
        System.out.println("Grade E");
    }
    else{
        System.out.println("Grade F (You Need Improvement)");
    }
    sc.close();
}

    }


