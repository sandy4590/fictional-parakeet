package introduction;

public class MyClass {
    private int instanceVar; 
    private static int classVar; 
    
    public void setInstanceVar(int value) {
        instanceVar = value;
    }
    
    public int getInstanceVar() {
        return instanceVar;
    }
    
    public static void setClassVar(int value) {
        classVar = value;
    }
    
    public static int getClassVar() {
        return classVar;
    }
    
    public static void main(String[] args) {
        MyClass obj1 = new MyClass();
        MyClass obj2 = new MyClass();
        
        obj1.setInstanceVar(10); 
        obj2.setInstanceVar(20); 
        
        MyClass.setClassVar(5); 
        
       
        System.out.println("obj1 Instance Variable: " + obj1.getInstanceVar());
        System.out.println("obj2 Instance Variable: " + obj2.getInstanceVar());
        System.out.println("Class Variable: " + MyClass.getClassVar());
    }
}
