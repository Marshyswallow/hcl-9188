package StringMethod;

public class Method {
    public static void main(String[] args){
        String s1=new String("Vishal");
        System.out.println(s1.length());
        System.out.println(s1.isEmpty());
        System.out.println(s1.isBlank());

        String s2="hello world";
        System.out.println(s2.charAt(4));
        char[] arr=s2.toCharArray();
        String temp="";
        for(char ch:arr){
            temp+=ch;
        }
        System.out.println(temp);

        String s3="my name is vishal";
        String s4="MY NAME IS VISHAL";


//        COMPARISON
        System.out.println(s1.equals(s2));
        System.out.println(s3.equalsIgnoreCase(s4));
        System.out.println(s3.compareTo(s4));

//        searching
        System.out.println(s3.contains("is"));
        System.out.println(s3.indexOf('i'));
        System.out.println(s3.lastIndexOf('i'));
        System.out.println(s3.startsWith("my"));
        System.out.println(s3.endsWith("my"));


//        Extraction
        System.out.println(s1.substring(1,4));


    }
}
