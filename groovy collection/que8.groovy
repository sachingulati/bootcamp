class Employee{
String name
int age,salary
String toString(){
  "\nName: " + name +", age: "+ age +", salary: " + salary
}
}

List<Employee> l = [new Employee(name:"emp1",age:25,salary:25000),
new Employee(name:"emp2",age:26,salary:2600),
new Employee(name:"emp3",age:27,salary:27000),
new Employee(name:"emp4",age:28,salary:2800),
new Employee(name:"emp5",age:29,salary:29000),
new Employee(name:"emp6",age:30,salary:3000),
new Employee(name:"emp7",age:31,salary:31000),
new Employee(name:"emp8",age:32,salary:32000),
new Employee(name:"emp9",age:33,salary:33000),
new Employee(name:"emp10",age:34,salary:34000)
]
println "Salary less than 5000: " + l.findAll{
if (it.salary <5000)
  return true
}
println "Youngest: " + l.min {it.age}
println "Oldest: " + l.max {it.age}
println "Max Salary: " + l.max {it.salary}
println "Name List: " +l.collect {it.name}