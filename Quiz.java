public abstract class Quiz { 
         protected String Student_Name; 
         protected double Grade; 
         public int Total_Score; 
         public int Max_Score; 
  
         public Quiz(String name, double grade) { 
                 this.Student_Name = name; 
                 this.Grade = 0; 
         } 
          
         public Quiz(int Total_Score, int Max_Score) { 
                 this.Total_Score = 100; 
                 this.Max_Score= 50; 
         } 
          
         public double getGrade () { 
                 return Grade; 
         } 
          
         public void setTotalScore(int Tscore) { 
                 Grade = Tscore; 
         } 
          
         public String getStudentName () { 
                 return Student_Name; 
         } 
          
         public void setStudentName (String name) { 
                 Student_Name = name; 
         } 
          
         public abstract double calculateGrade(); 
     
 }
