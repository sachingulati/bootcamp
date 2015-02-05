function calcInt()
{
  var amount = prompt("Enter principle:");
  var rate = prompt("Enter Rate of interest: ");
  var years = prompt("Enter number of years: ");
  document.getElementById('output').innerHTML = " " + amount*rate*years/100;
}

var x=setInterval(function (){
  var d = new Date();
  var time = ""+d.getHours()+":"+d.getMinutes()+":"+d.getSeconds();
  document.getElementById('clock').innerHTML = time;
},1000);

function checkPal()
{
  var str = prompt("Enter String:");
  var flag = true;
  var i = 0;
  for(i = 0;flag && i<str.length/2;i++)
    if(str.charAt(i) != str.charAt(str.length-i-1))
        flag = false;
  var result = "Palindrome";
  if(!flag)
    result = "Not Palindrome";
  document.getElementById('output').innerHTML = "Result: " +result;
}
function areaCircle()
{
  var radius = prompt("enter Radius: ");
  document.getElementById('output').innerHTML = "Result: "+radius*radius*3.14;
}
function validateForm()
{
  var name = document.getElementById('formname').value;
  var age = document.getElementById('formage').value;
  var flag = true;
  if(name.length==0 || name==null)
  {
    flag = false;
    document.getElementById('nameError').innerHTML="please provide your name";
  }
  if(age.length==0 || age == null)
  {
    flag = false;
    document.getElementById('ageError').innerHTML="please provide age";
  }
  if(age<18)
  {
    flag = false;
    document.getElementById('nameAge').innerHTML="age needs to be more than 18";
  }
   console.log("flaggg:::" +flag);
  return flag;
}
