
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int x=sc.nextInt();
		int y=sc.nextInt();
		int t=sc.nextInt();
		ArrayList<Integer> al1=new ArrayList<>();
		ArrayList<Integer> al2=new ArrayList<>();
		for(int i=1;i<=n;i++){
		    if(i%x==0){
		        al1.add(i);
		    }
		}
		for(int j=1;j<=n;j++){
		    if(j%y==0){
		        al2.add(j);
		    }
		}
		for(int k=0;k<al1.size();k++){
		    for(int l=0;l<al2.size();l++){
		        if(al1.get(k)+al2.get(l)==t){
		            System.out.println(al1.get(k)+","+al2.get(l));
		            
		        }
		    }
		}
	}
}
