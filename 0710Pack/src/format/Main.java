package format;

public class Main {

	public static void main(String[] args) {
		
		int i,j;
		String x = "*";
		
		for(i=1;i<=7;i=i+1) {
			if(i==2) {
				for(j=i-1;j<=i+1;j++) {
					if(j==2) {
						continue;
					}
					System.out.print(x +"\t\t\t");
				}
				System.out.println("");
			}
				for(j=1;j<=i;j++) {
					System.out.print("\t\t\t" + x);
				}
				
				System.out.println("");
				
			
			}
	}

}
