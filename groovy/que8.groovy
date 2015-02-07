List l = [1,4,2,5]
Closure checknum = {List list, int num->
list.contains(num)
}
checknum(l,5)