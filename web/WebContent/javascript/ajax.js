let xhtp = new XMLHttpRequest();
xhtp.onreadystatechange = function() {
    console.log(xhtp.readyState, xhtp.status);
if(xhtp.readyState ==4 && xhtp.status ==200) {
    console.log(xhtp.responseText);
    let data= JSON.parse(xhtp.responseText);
    console.log(data);
    for(obj of data) {
        for(field in obj) {
            console.log(field, obj[field]);
        }
    }
}
    
}
xhtp.open('get','MOCK_DATA.json');
xhtp.send();
