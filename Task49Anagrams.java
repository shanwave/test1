package src;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public abstract class Task49Anagrams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		String[] strc= {"eat", "tea", "tan", "ate", "nat", "bat","aat","taa"};
	//	String[] strc= {"eat", "tea"};
		//groupAnagrams(strc);
		
		System.out.println(groupAnagrams(strc));
	}
	
	
	 private static  List<List<String>> groupAnagrams(String[] strs) {
		 
		 if(strs==null) return null;
	//	 if(strs.length<=1) return List.add(strs);
    	
		 List<List<String>> li = new ArrayList<List<String>>();
		 
	//	 List<String> supplierNames1 = new ArrayList<String>();
		
	//	 List<String> supplierNames3 = new Vector<String>();
		 
	//	 List<String> supplierNames = Arrays.asList("sup1", "sup2", "sup3");
	//	 ArrayList<Integer> arrlist = new ArrayList<Integer>(5);
		 
		 List<String> group = new LinkedList<String>();
		 group.add(strs[0]);
		 li.add(0, group);
		// System.out.println(li.size());
		 int j;
		 for(int i=1;i<strs.length;i++){
			 for(j=0;j<li.size();j++){
				 List<String> groupA = new LinkedList<String>();
				 
				 groupA=li.get(j);
				 if(isAnagrams(groupA.get(0),strs[i])){
					 groupA.add(strs[i]);
					 li.remove(j);
					 li.add(j, groupA);
				//	 System.out.println(li.size());
				//	 System.out.println(i);
					 break;
				 } 
				
			
			 }
			 
			 	if(j == li.size()){
			    List<String> groupB = new LinkedList<String>();
			  
				 groupB.add(strs[i]);
				 li.add(groupB);
			 	}
			//	 System.out.println(li.size());
			//	 System.out.println(i);
				 
		 }
		 
	//	 List<String> group = new LinkedList<String>();
	//	 group.add("aaa");
	//	 group.add("bbb");
		// groupA.add("sup5");
	//	 li.add(3, group);
	//	 group =li.get(0);
		// li.add(3, {"se","aa"});
	//	 System.out.println(group);
	//	 System.out.println(li.size());

		
		 return li;
		 
	 }
	 
	 private static boolean  isAnagrams(String str1, String str2){
		 if(str1.length()!=str2.length()) return false;
		 char[] ar = str1.toCharArray(); 
		 Arrays.sort(ar);
		 char[] ar2 = str2.toCharArray();
		 Arrays.sort(ar2);
		// return (Arrays.sort(str1.toCharArray())).equal(Arrays.sort(str2.toCharArray()))?true:false;
		 
	//	 System.out.println(ar);
	//	 System.out.println(ar2);
		 
	//	 System.out.println(Arrays.equals(ar,ar2));
		 return Arrays.equals(ar,ar2);
	 }
}
