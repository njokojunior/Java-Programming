public class RethrowingErrors {
    public static void main(String[] args){
        try{
            someMethods();
        }
        catch (Exception exception){
            exception.printStackTrace();
        }
    }

    public static void someMethods() throws Exception{
        try{
            someMethods2();
        }
        catch(Exception exception){
            throw new Exception("Exception thrown in someMethod1", exception);
        }
    }

    public static void someMethods2() throws Exception{
            throw new Exception("Exception thrown in someMethods2");
    }
}