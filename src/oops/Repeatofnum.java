package oops;

public class Repeatofnum {

	public static void main(String[] args) {
		
		String s="pappayaa";
		int count;
		char st[] =s.toCharArray();
		System.out.println("String ="+s);
		
		for(int i=0;i<st.length;i++) {
			count =1;
			for(int j=i+1;j<st.length;j++) 
			{
				if( st[i]==st[j]) 
				{
					count++;
					st[j]='0';
					
				}
			}
			if(count>1 && st[i]!='0')  
			{
				System.out.print(st[i]);
				System.out.println("count ="+count);
			}
		
		}

	}

}
