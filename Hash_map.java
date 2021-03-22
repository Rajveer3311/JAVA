import java.util.*;
import java.util.Map.Entry;
public class Hash_map
{
	public static void main(String[] args) {
		HashMap<Character,Integer> hm=new HashMap<Character,Integer>();
		hm.put('r',1);
		hm.put('s',2);
		// System.out.println(hm.get('r'));
		// System.out.println(hm.getKey(1));
		// System.out.println(hm.getValue('r'));
		for(Entry<Character,Integer> m:hm.entrySet())
		{
			System.out.println(m.getKey()+" "+m.getValue());
		}
	}
}