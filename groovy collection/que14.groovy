(1..100).each{
if(it%3==0 && it%5==0)
  print "FizzBuzz "
else if(it%3==0)
  print "Fizz "
else if(it%5==0)
  print "Buzz "
else
  print it + " "
}
print " "