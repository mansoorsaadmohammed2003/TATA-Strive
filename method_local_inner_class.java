class outer_class{
    public void method(){
        class inner_class{
            public void inner_method(){
                System.out.println("Able to Acess the inner classes method");
            }
        }
        inner_class obj1=new inner_class();
        obj1.inner_method();
    }
}
public class method_local_inner_class {
    public static void main(String[] args) {
        outer_class obj=new outer_class();
        obj.method();
    }
}
