File f = new File("no white space output")
f.text = ''
new File("que1.groovy").text.getChars().each {
if(it != ' ' && it!='\t' && it!='\n')
  f<<it
}