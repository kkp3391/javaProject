
var fruit='Cherry';
fruit = ['Cherry','Strawberry','Melon'];
document.write('<h1>hello</h1>');
document.write('<ul>');
document.write('<li>Apple</li>');
document.write('<li>Banana</li>');
document.write('<li>'+fruit+'</li>');
document.write('</ul>');
for (var i=0; i<fruit.length; i++) {
 document.write('<li>' + fruit[i]+ '</li>');

}


function trun_on() {
    var bulbon = 10;
    bulbon = 'hello';
    bulbon = document.getElementById('img1');
    bulbon.setAttribute('class', 'img');
    bulbon.setAttribute('src','https://www.w3schools.com/js/pic_bulbon.gif');
    console.log(bulbon);
        
    }
    
    function turn_off() {
        img = 'screen';
        console.log(img);
        var bulboff = document.getElementById('img1');
    bulboff.setAttribute('src','https://www.w3schools.com/js/pic_bulboff.gif');
    console.log(bulboff);
    }
    turn_off();
    console.log(img);