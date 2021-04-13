let obj= {}; //new object
obj.color = 'white';
obj.price = 1000000;
obj.info = function() {
    return obj.color + '' + obj.price
}
console.log(obj.color);
console.log(obj.price);
console.log(obj.info());

function getTime() {
let show = document.getElementById('show');
let time = new Date();
let year = time.getFullYear();
let month = time.getMonth();
let date = time.getDate();
let hh = time.getHours();
let mm = time.getMinutes();
let ss = time.getSeconds();

show.innerHTML = year + '년' + (month+1)+ '월' + date+ '일' + hh + ':' +mm + ':'+ss;
}
setInterval(function(){getTime();},1000);
getTime();

var today = new Date();
var nowYear = today.getFullYear();
var theDate = new Date(nowYear, 11, 31);
var diffDate = theDate.getTime() - today.getTime();
var result = Math.ceil(diffDate/(60*1000*60*24));
document.write("연말 D-day"+result+"일 남았습니다.");

//점심시간 . 현재시간. 점심시간까지 남은시간
//  let time1 = new Date();
//  let h1 = time.getHours();
//  let m1 = time.getMinutes();
//  let s1 = time.getSeconds();
//  let nowHours = today.getTime();
//  let theH = new Date(nowHours, 12,50);
//  let difH = theH.getTime()- time1.getTime();
//  var re = math.ceil(difH);
//  document.write(re);

Math.abs(-100);
for(let i=0; i<10; i++)
console.log(Math.floor(Math.random()*45)+1);

console.log(Math.max(2,4,6,1,-1));