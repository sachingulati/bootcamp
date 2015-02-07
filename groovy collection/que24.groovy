String url = "http://www.google.com?name=johny&age=20&hobby=cricket"
String keys = url.tokenize('?')[1]
keys.tokenize('&').each{
List key = it.tokenize('=')
println "Key: " + key[0] + ",\t Value: " + key[1]
}