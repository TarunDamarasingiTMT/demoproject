public class Main {
    public static void main(String args[]){
        var employee1 = new Employee();
        employee1.salary = 50000;
        employee1.extrahours = 10;
        int wage = employee1.calculateWage(20);
        System.out.println(wage);
    }
}
