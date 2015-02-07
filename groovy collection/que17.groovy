Map m = [friend1:20, friend2:21, friend3:22, friend4:23, friend5:24, friend6:25, friend7:26, friend8:27, friend9:28, friend10:29]
m.each{
println it
}
println ""
m.eachWithIndex{
println it
}
println ""
m.keySet().each {
println it + ":" + m.get(it)
}
println "" 
m.findAll().each{
println it
}