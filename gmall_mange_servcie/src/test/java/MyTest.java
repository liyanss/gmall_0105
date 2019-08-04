public class MyTest {
    public static void main(String[] args) {
        int hello = new Myclass().getHello();
        System.out.println(hello);
    }
}
class Myclass{
    public int  getHello() {
        Integer a=null;

        try {
            a = new Integer(20);
            //
            // a=10/0;

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("4444444400000日太5t");
            //a=20;
        }
        return a;
    }

}