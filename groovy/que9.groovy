File newfile = new File("../output")
newfile.text = ''
new File("../groovy").eachFile{
newfile << it.text
}