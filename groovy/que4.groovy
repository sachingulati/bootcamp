class Person{
  String name, gender, address
  int age
}
class Employee extends Person{
  String empId, company
  int salary
  String toString(){
    return "${name} is a ${gender} aged ${age} who lives at ${address}. He works for ${company} with employee id ${empId} and draws ${salary} lots of money !!!!."
  }
}
Employee p = new Employee(name:"sachin",gender:"Male",address:"my home",age:23,empId:"temp 15-02",company:"TTN Digital", salary:15100)
println p
