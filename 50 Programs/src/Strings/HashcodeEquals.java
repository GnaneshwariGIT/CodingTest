package Strings;

public class HashcodeEquals {

	public static void main(String[] args) {
		
        String s = "hello";
        String s2 = "hello";
        String s3 = new String("hello");
        System.out.println("before " + s.hashCode());
        System.out.println(s);
        
        String s1 = s + "world";
        System.out.println("after " + s.hashCode());
        System.out.println(s1);
        
        if(s.equals(s2)){
            System.out.println("Strings are equal");
        }
        if (s.equals(s3)){
            System.out.println("Strings are equal");
        }
                
        StringBuffer buff = new StringBuffer(s);
        System.out.println("before " + buff.hashCode());
        System.out.println(buff);
        
        buff= buff.append("world");
        System.out.println("after " + buff.hashCode());
        System.out.println(buff);
        if(s.equals(s2)){
            System.out.println("Strings are equal");}
	}

}
	
