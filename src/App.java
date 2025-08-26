public class App {
    public static void main(String[] args) throws Exception {
        //Data types
        int x = 5;
        char c = 'C';
        String one = "hello";
        double z = 2.098;
        
        int y;//decleration
        y = 72;//initilization
        int infractedStudents;
        //camelCasing
        final int CONNY = 5;
        //constants are all caps
        System.out.println(x-3);
        x = x - 3;
        x -= 3;//cooler way of writig ^
        System.out.println(x);
        //comparisons
        boolean b = true;
        System.out.println(b);
        System.out.println(!b);
        //Conditional
        if(!b) System.out.println("b Passed");
        // = is setting a variable, while == is comparing the values

        //Short circuit Evaluation : when the system skips running the second half of the eveluation because the conclusion is reached by only reading the first line.
        int divisor = 0;
        if(divisor != 0 && 5/divisor >1) System.out.println("Oh no!");

    }
}
