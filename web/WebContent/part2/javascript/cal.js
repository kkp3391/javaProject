function createCal() {

        
    // 2021년 4월
    let today = new Date();
    let thisYear = today.getFullYear(); // 2021
    let thisMonth = today.getMonth(); // 4
    let thisDate = today.getDate(); // 6
    let thisDay = today.getDay(); // 0:일, 1:월, 2:화, 3:수, 4:목, 5:금, 6:토
    console.log(today);
    console.log(thisYear);
    console.log(thisMonth);
    console.log(thisDate);
    console.log(thisDay);

    let lastDate = new Date(thisYear, thisMonth + 1, 0).getDate(); // 이번달 마지막날.
    let firstDate = new Date(thisYear, thisMonth, 1); // 이번달 1일 의 요일 값 == 4
    let firstDay = firstDate.getDay();
    let days = ['일', '월', '화', '수', '목', '금', '토'];
    document.write('<table border="1">');
    //요일 생성
    document.write('<tr>');
    for (let i = 0; i < days.length; i++) {
        document.write('<th>' + days[i] + '</th>');
    }


    // 값 넣기 
    document.write('</tr><tr>');
    for (let i = 0; i < firstDay; i++) {
        document.write('<td></td>');
    }
    for (let i = 1; i <= lastDate; i++) {
        document.write('<td>' + i + '</td>')
        if (i % 7 == (7 - firstDay)) {
            document.write('</tr><tr>');
        }
    }
    document.write('</tr></table>');
}