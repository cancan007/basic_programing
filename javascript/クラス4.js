class Student4{
    constructor(){
        this.name = 'chen';
    }

    avg(math, eng){
        console.log((math+eng)/2);
    }
}

var s1 = new Student4();
s1.name = 'taro';
console.log(s1.name);
s1.avg(43, 76);

var s2 = new Student4()
console.log(s2.name);
s2.avg(86, 54);