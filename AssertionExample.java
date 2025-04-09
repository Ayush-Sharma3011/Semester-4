public class AssertionExample{
    public static void main(String[] args){
        int age = -5;
        assert age>=18:"age must be 18 or above";
        System.out.println("Eligible to vote");
    }
}