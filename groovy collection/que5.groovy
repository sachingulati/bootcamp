List l = [1,4,8,9,3,2,1,3]
List l2 = []
l.eachWithIndex{index,num->
  if (index%2)
    l2 = l2 + l[index]
}
l = l-l2
print l