
    $(document).ready(function () {
        $.ajax({
            url:'../MOCK_DATA.json', success:function(data) {
                console.log(data);
                let table = [];
                table.push('<table border="1">');
                // let trTag = $('<tr/>');
               
                for(let i=0; i<data.length; i++) {
                    table.push('<tr>');
                        for(field in data[i]) { //field단위
                            table.push('<td>' + data[i][field] + '</td>');
                        }
                        table.push('</tr>');
                    
                }
                table.push('</table>')
                let tag = table.join('');
            $('body').html(tag);
            }
        });
    });


    $(document).ready(function () {
        $.ajax({
            url:'../MOCK_DATA.json', success:function(data) {
                let tbl = $('<table border="1" />');
                // let trTag = $('<tr/>');
                for(let i in data) {
                    let $id = data[i].id;
                    let $first_name = data[i].first_name;
                    let $last_name = data[i].last_name;
                    let $gender = data[i].gender;
                    let $email = data[i].email;
                    let $ip_address = data[i].ip_address;

                    let row = $('<tr/>').append(
                                $('<td/>').text($id),
                                $('<td/>').text($first_name),
                                $('<td/>').text($last_name),
                                $('<td/>').text($email),
                                $('<td/>').text($gender),
                                $('<td/>').text($ip_address)
                    );
                    tbl.append(row);
                }
                console.log(data);
                // for(let i=0; i<data.length; i++) {
                // let tdTag = $('<td />').html(data[i].id);
                // trTag.append(tdTag);
            // }
            $('body').append(tbl);
            }
        });
    });


    $.ajax({
        url:'../MOCK_DATA.json', 
        type: 'get',
        data: 'name=hong&age=20',
        dataType:'json',
        success: function (data) {
           let arry = data;
           let ulTag = $('<ul/>');
           $(arry).each(function (idx, obj) {
               console.log(idx,obj);
               // ulTag.append($('<li/>').html('<a href="#">'+ obj.first_name +'</a>'));
               ulTag.append($('<li/>').append($('<a/>').html(obj.first_name).attr('href','get.jsp?name='+ obj.first_name)));
           });
           $('body').append(ulTag);
        },
        error:function (reject) {
            console.error(reject.status, reject.statusText);
        }
    });