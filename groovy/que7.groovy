println "Using for loop"
for(int i = 1; i<=10;i++)
  print i*3 + " "
println "\nUsing Range" 
(1..10).each {print it*3 + " "}

println "\nUsing List"
List l = new ArrayList([1,2,3,4,5,6,7,8,9,10])
l.each{print it*3 + " "}
println "\n_______________________________"