List l = [1,4,8,9,3,2,1,3]
l.each{
  if (it%2)
    l = l-it
}
print l