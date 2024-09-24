let num1 = (Number(prompt("Enter Number : ")))
let num2 = (Number(prompt("Enter Number : ")))
op = prompt("Enter Operator : ");

if (op == '+') {
  document.writeln('Addition : '+(num1+num2))
}
else if(op == '-'){
  document.writeln('Substraction : '+(num1-num2))
}
else if(op == '*'){
  document.writeln('Multiplication : '(num1*num2))
}
else if(op == '/'){
  document.writeln('Divison : '(num1/num2))
}
else{
  document.writeln("Invalid Choice")
}


