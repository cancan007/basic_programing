class Student3{
    avg(x,y){
        console.log((x+y)/2);
    }
}

var s = new Student3();
s.name = 'taro';
console.log(s.name);
s.avg(54, 67);