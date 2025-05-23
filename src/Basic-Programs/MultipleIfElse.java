public class MultipleIfElse {
    public static void main(String[] args) {
        int salary = 25400;
        if (salary<= 10000) {
            salary +=1000;
        }
        else if (salary <= 20000) {
            salary += 2000;
        }
        else {
            salary += 3000;
        }
        System.out.println(salary);

    }
}