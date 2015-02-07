class Person{
  String name, gender, address
  int age
}
class Employee extends Person{
  String empId, company
  int salary
  void setCompany(String n){
     company = "modified company " + n
  }
}
Employee p = new Employee(name:"sachin",gender:"Male",address:"my home",age:23,empId:"temp 15-02",company:"TTN Digital", salary:15100)
println """Via dot operator:
name:    ${p.name}
age:     ${p.age}
gender:  ${p.gender}
address: ${p.address}
empId:   ${p.empId}
company: ${p.company}
salary:  ${p.salary}
"""
println """Via getter:
name:    ${p.getName()}
age:     ${p.getAge()}
gender:  ${p.getGender()}
address: ${p.getAddress()}
empId:   ${p.getEmpId()}
company: ${p.getCompany()}
salary:  ${p.getSalary()}
"""
p.@company = "changed"
println p.company