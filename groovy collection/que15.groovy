class Stack{
  List l = []
  def POP(){
    if(l.size() == 0){
     println "List is Empty!"
     return null
    }
    def element = l.last()
    l = l-element
    return element
  }
  void PUSH(def element){
    l = l+element
  }
  def TOP(){
    if(l.size() == 0) return null
    def element = l.last()
    return element
  }
}
Stack s = new Stack()

s.PUSH(5)
println s.TOP()
println s.POP()