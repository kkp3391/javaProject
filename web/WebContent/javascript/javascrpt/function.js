        //정의문
        let result = square('a');
        function square(num) {
            if(num==null){
                return 0;
            } else if(num ==isNaN()) { 
                return 0;
            }
            return num*num;
        }
        let result= square(3);
        //표현식
        let fnc = function(num) {
            return num*num;
        }
        console.log(result);
        
        //
        let count = 0;
        function myfnc() {
            let cnt = 0;
            count++;
            cnt++;
            document.write(cnt + '<br>');
        }
        myfnc();
        
        let theFnc = function() {
            let cnt = 0;
            count++;
            cnt++;
            document.write(cnt + '<br>');
        }
        theFnc();


        let colors = ['yellow','red','blue','aqua'];
    let i = 0;
    function changeColor() {
        let bdy = document.getElementsByTagName('body');
        // bdy=document.getElementById('bdy');
        console.log(bdy[0]);
        bdy[0].style.backgroundColor = colors[i%4];
        i++;
    }

    function map(func,ary) {
        let result = [];
        for(let i=0; i < ary.length; i++) {
            result[i] = func(ary[i]);
        }
        return result;
    }
    let fun = function(x) {
        return x*x;

    }
    let arr = [0,1,2,4];
    let result = map(fun,arr);
    console.log(result);

    function callFunc() {
        let sum = 0;
        for(let i=0; i<arguments.length; i++) {
            sum+= arguments[i];
        }
        return sum;
    }
    console.log(callFunc(2,3,4,5,6,7));

    function callArySum(arr) {
        let sum = 0;
        for(let i=0; i<arr.length; i++) {
            sum+= arr[i];
        }
        return sum;
    }
    let aryy = [1,2,3,4,5];
    console.log(callArySum(aryy));

    //재귀함수.
    let factorial = function fac(num) {
        return num < 2 ? 1 : num*fac(num-1);
    }
    result =  factorial(3);
    console.log(result);

    //
    function outside(x) {
        function inside(y) {
            return x+y;
        }
        return inside;
    }
    let fn_inside = outside(2);
    let res = fn_inside(3);
    console.log(res);

    res = outside(2)(3);
    console.log(res);