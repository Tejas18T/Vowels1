package CollectionFrameworkDemo;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Vowelsapp {
	
	public static int getCountVowels(String str)
	{
		String str1="AEOUIaeoui";
		int count=0;
		Set<Character> S2=new HashSet<>();
		for(int i=0;i<str1.length();i++)
		{
			S2.add(str1.charAt(i));
		}	
	
	    for(int i=0;i<str.length();i++)
	    {
		if(S2.contains(str.charAt(i)))
		{
			count++;
		}
	}
	    return count;
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<String> S1=new TreeSet<>(new Comparator<>() {

			@Override
			public int compare(String o1, String o2) {
				// TODO Auto-generated method stub
				int o1count=getCountVowels(o1);
				int o2count=getCountVowels(o2);
				
				int diff=1;
				if(o1count<o2count)
				{
					diff=-1;
				}
				else if(o1count>o2count)
				{
					diff=1;
				}
				return diff;
			}
		});
        S1.add("utkarsha");
 		S1.add("Saiee");
 		S1.add("amisha");
 		S1.add("mrunal");
 		S1.add("sagar");
		
		
		for(String s3:S1)
		{
			System.out.println(s3);
		}
	}

}
