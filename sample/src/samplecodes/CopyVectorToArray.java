package samplecodes;

import java.util.Vector;

public class CopyVectorToArray {

    public static void main(String a[]){
        Vector<String> vct = new Vector<String>();
        vct.add("Hi");
        vct.add("How");
        vct.add("are");
        vct.add("You");
        System.out.println("Actual vector:"+vct);
        String[] copyArr = new String[vct.size()];
        vct.copyInto(copyArr);
        System.out.println("Copied Array content:");
        for(String str:copyArr){
            System.out.println(str);
        }
    }

}
