import java.util.Scanner;


class Marklist {
    public static void main(String agrs[]){
        
        Scanner input=new Scanner(System.in);
        System.out.println("enter the number of students");
		int students = input.nextInt();
		String names[] = new String[students];
		String grade[] = new String[students];
		int mark1[] = new int[students];
		int mark2[] = new int[students];
		int mark3[] = new int[students];
		int total[] = new int[students];
		int average[] = new int[students];
        for(int i=0;i<students;i++){
        System.out.println("Enter your name:");
        names[i]=input.next();
        System.out.println("Enter mark1:");
        mark1[i]=input.nextInt();
        System.out.println("Enter mark2:");
        mark2[i]=input.nextInt();
        System.out.println("Enter mark3:");
        mark3[i]=input.nextInt();
        total[i]=mark1[i] + mark2[i] +mark3[i];
        average[i]=total[i]/3;
        
        if(average[i]>=80 && average[i]<100 ){
            grade[i]="A";

        }
        else if(average[i]>=75 && average[i]<=79.9){
            grade[i]="B+";
        }
        else if(average[i]>=65 && average[i]<=74.9){
            grade[i]="B";}
        else if(average[i]>=55 && average[i]<=64.9){
            grade[i]="C+";}
        else if(average[i]>=50 && average[i]<=54.9){
            grade[i]="C";}
        else if(average[i]>=40 && average[i]<=49.9){
            grade[i]="D";}
        else if(average[i]<40){
            grade[i]="F";
        }}
     System.out.println("-------------------------------------------------------------------------");
     System.out.println("\t\t\tSTUDENT MARKLIST");
     System.out.println("-------------------------------------------------------------------------");
     
     System.out.println("ROLL\tNAME\tMARK1\tMARK2\tMAKR3\tTOTAL\tRESULT\tAVERAGE\tGRADE");
     for(int i=0;i<students;i++){
     System.out.println((i+101)+"\t"+names[i]+"\t"  +mark1[i]+"\t"  +mark2[i]+"\t"  +mark3[i]+"\t"  +total[i]+"\tP"+ "\t" +average[i]+"\t"+grade[i]);
     }
        }
}
