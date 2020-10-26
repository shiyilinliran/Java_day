package main.java.JavaDay7;

/**
 * @ClassName MarketEmployee
 * @Description TODO
 * @Author admin
 * @Date 2020/10/26
 **/
public class MarketEmployee extends BaseEmployee {
    private String id;
    private static final String ADMIN = "admin";
    private static final int higher_salary = 3000;
    private static final int lower_salary = 1000;

    public MarketEmployee(String id) {
        this.id = id;
    }

    public MarketEmployee() {
    }

    @Override
    public void print(){
        super.print();
        System.out.println("这是一个MarketEmpoyee类");
    }
    @Override
    public int getSalary() {
        if(ADMIN.equals(this.id)){
            return higher_salary;
        }else {
            return lower_salary;
        }
    }
}
