var Student = class{
    constructor(name){
        this.name = name;
    }

    cal_avg(data){
        var sum  =0;
        for(var i=0; i < data.length; i++){
            sum += data[i];
        }
        var avg = sum/data.length;
        return avg;
    }

    judge(avg){
        if(avg > 60){
            console.log('passed');
        }else{
            console.log('failed');
        }
    }
}

var s = new Student('pychan');
var data = [78, 82, 12, 43, 42];
var avg = s.cal_avg(data);

console.log(data.length);
console.log(s.name);
console.log(avg);
s.judge(avg);
