    //    var t = "Hello Thank you good luck to you";
    //    document.write(t.charAt(16),"<br/>");
    //    document.write(t.indexOf("you"),"<br/>");
    //    document.write(t.indexOf("you",16),"<br/>");
    // //    document.write(t.lastindexOf("you"),"<br/>");
    // //    document.write(t.lastindexOf("you",25),"<br/>");
    //    document.write(t.match("luck"),"<br/>");
    //    document.write(t.match("you"),"<br/>");
    //    document.write(t.substr(21,4),"<br/>");
    //    document.write(t.substring(6,12),"<br/>");
    //    document.write(t.replace("you","me"),"<br/>");
    //    document.write(t.toLowerCase(),"<br/>");
    //    document.write(t.toUpperCase(),"<br/>");
    //    document.write(t.length,"<br/>");
    //    var s = t.split("");

    //    document.write(s[0],"<br/>");
    //    document.write(s[4],"<br/>");

    //    var str="A";
    //    var t = str.charCodeAt(0);

    //    document.write(t);
    //    document.write(String.fromCharCode(65),"<br/>");

    var userEmail = prompt("당신의 이메일 주소는?","");
    var arrUrl = [".co.kr", ".com", ".net",".or.kr",".go.kr"];

    var check1 = false;
    var check2 = false;

    if(userEmail.indexOf("@")>0) {check1=true;}

    for(var i =0; i<arrUrl.length; i++) {
        if(userEmail.indexOf(arrUrl[i])>0) {
            check2=true
        }
    }

    if(check1 && check2) {
        document.write(userEmail);
    } else {
        alert("이메일 형식이 잘못되었습니다.");
    }
    
console.log(this);