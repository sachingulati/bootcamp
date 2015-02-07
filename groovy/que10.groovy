File f = new File("odd output")
int i = 1
f.text = ''
new File("que1.groovy").eachLine {
  if(i++%2)
   f << it
  f<< "\n"
}