public class Student extends Quiz { 

         public int Total_Score = 100; 

         public int Max_Score = 50; 

          

         public void divide (int Total_Score, int Max_Score) { 

                 Grade = Total_Score / Max_Score; 

         } 

  

         public Student(String name, double grade) { 

                 super(name, grade); 

         } 

  

         @Override 

         public double calculateGrade() { 

                 return (Total_Score / Max_Score); 

         } 

 }
