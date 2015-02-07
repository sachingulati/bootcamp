class Person{
  String name, gender, address
  int age
}
Person p = new Person(name:"sachin",gender:"Male",address:"my home",age:23)
println """Via dot operator:
name:    ${p.name}
age:     ${p.age}
gender:  ${p.gender}
address: ${p.address}
"""
println """Via getter:
name:    ${p.getName()}
age:     ${p.getAge()}
gender:  ${p.getGender()}
address: ${p.getAddress()}"""
