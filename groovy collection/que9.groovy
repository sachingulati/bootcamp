String s = "this string needs to be split"
println "tokenize:"
println s.tokenize(" ")
println s.tokenize()
println "Split: "
println s.split(" ")
println s.split(/\s/)
println "tokenize: "
println s.tokenize(/\s/)

String a = "are.you.trying.to.split.me.mister?"
println a.tokenize(".")
println "Split: "
println a.split(".")
