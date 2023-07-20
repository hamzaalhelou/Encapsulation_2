/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package C;

/**
 *
 * @author moatasem
 */
public class Main {
    
        public static void main(String[] args) {
 
        Employee e = new Employee();
 
        e.setName("osas");     // لن يقبله لأنه أصغر من حرفين
        e.setAge(21);
        e.setSalary(1500000);
 
        System.out.println(e.getName());
        System.out.println("Age: "    +e.getAge());
        System.out.println("Salary: " +e.getSalary());
 
    }
    
}
