package strings;

/*
 * Program: To find first repeated character from given string
 */
import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class FirstRepeatedCharacter {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter String ");
        String s=scan.nextLine();
        Map <Character,Integer>map=new HashMap<>();
        for(int i=0;i<s.length();i++) {
        	Character ch=s.charAt(i);
        	map.put(ch, map.getOrDefault(ch, 0)+1);
        	
        }
        for(int j=0;j<s.length();j++) {
        	Character ch=s.charAt(j);
        	if(map.get(ch)>1) {
        		System.out.println(ch+" is first Repeated Character instring ");
        		break;
        	}
        }

	}

}
