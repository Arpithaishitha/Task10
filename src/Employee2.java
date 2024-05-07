
public class Employee2
{
 private int id;
 private string firstname;
 private string lastname;
 private double montlysalary;
 public employee2(int id, string firstname, lastname, double monthlysalary){
     this.firstname=firstname;
     this.id=id; this.lastname=lastname;
     this.monthlysalary=monthlysalary;
     if(monthlysalary<0)
         monthlysalary=0;
 }
 public void setId(int id){
     this.id=id;
 }
 public int getId(){
     return id;
 }
 public void  setfirstname(string firstname){
     firstname=firstname;
 }
 public string getfirstname(){
     return firstname;
 }
    public void  setlastname(string lastname){
        lastname=lastname;
    }
    public string lastname(){
        return lastname;
}
public void setmontlysalary(double monthlysalary){
 monthysalary=monthlysalary;
 }
 public double getmonthlysalary(){
     return monthlysalary;
 }
 public double getyearlysalary(){
     double yearlysalary=monthlysalary*12;
     return yearlysalary;
 }
 public double getraisesalary(){
     double raise=monthlysalary*0.1;
     double raisesalary=(monthlysalary + raise)*12;
     return raisesalary;
 }
}