public class CustomerMain { 
         public static void main(String[] args) { 
                 Customer My_Customer; 
                 RegularCustomer regularCustomer = new RegularCustomer("Leo", 658); 
                 SeniorCustomer seniorCustomer = new SeniorCustomer("Nico", 658); 
  
                 My_Customer = regularCustomer; 
                 System.out.println(My_Customer.getName()+" " +My_Customer.calculateBill()); 
  
                 My_Customer = seniorCustomer; 
                 System.out.println(My_Customer.getName()+" "+My_Customer.calculateBill()); 
         } 
 }
