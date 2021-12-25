package ma.education.tp6.annotations;

public class TestReflectionAnnotation {

    public static void main(String[] args) {
        Class c =Calculatrice.class;
        Programmer programmer= (Programmer) c.getAnnotation(Programmer.class);
        Class c2 =CalculatriceFille.class;
        Programmer programmer2= (Programmer) c2.getAnnotation(Programmer.class);
        System.out.println(programmer.name());
        System.out.println(programmer.id());
        System.out.println(programmer2.name());
        System.out.println(programmer2.id());
    }





}
