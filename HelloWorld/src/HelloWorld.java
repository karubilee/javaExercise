
public class HelloWorld {  
    
    public static void main(String[] args) {
        System.out.println("HelloWorld！");
        
        String[] sentences = {"hello", "thank u", "thank u very much"};
        for (String sentence : sentences) {
            System.out.println(sentence);
        }
        
        int[] test = {1,2,3,4};
        for (int test1 : test) {
        	System.out.print(test1);
        }
    }
    
}
