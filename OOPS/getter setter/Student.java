package com.company.Oops;

public class Student {
 String name;
private int rollNo;
public int getRollNo(){
 return rollNo;
}
public void setRollNo(int num){
 if(num <=0){
  return ;
 }
 rollNo=num;
}

}
