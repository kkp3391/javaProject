var num1 = 10.5;
var num2 = 20;
console.log(typeof num1);
num1 = '10.05';
num2 = '20.45';
console.log(typeof num1);
var result = parseFloat(num1)+parseFloat(num2);
console.log(result);



var num3 = null;
    num3 = {name:'Hong', 
    age:20
};
console.log(typeof num3);
console.log(num3.name);
console.log(num3.age);

num3 = true;
console.log(typeof num3);
num3 = null;  //null, '', 0 => 거짓
if(num3) {
    console.log('참입니다.');
} else {
    console.log('거짓입니다.');
}

numbers = [];
numbers[0] = 10;
numbers[1] = 20;
// numbers[2] = 'hello';
numbers[2] = 30;
result = 0;
for(var i=0; i<numbers.length; i++) {
    console.log(numbers[i]);
    result += numbers[i];
}
console.log('합계:' + result);


document.write('<table border="1">');
var n1 = window.prompt('첫번째 값:');
for(var i= 1; i < 10; i++) {
    document.write('<tr><td>'+ n1 + '*' +i + '</td>'+ '<td class = "equals"> = </td>' +'<td>' + n1 * i+ '</td>' +'</tr>');
}

document.write('</table>');

// var n2 = window.prompt('두번째 값:');

// console.log(parseInt(n1)+parseInt(n2));



