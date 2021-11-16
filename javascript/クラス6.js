var Student = class{
    constructor(name){
        this.name = name;
    }

    avg(m, e){
        console.log((m+e)/2);
    }
}

var s1 = new Student('kanero');
console.log(s1.name);
s1.avg(53, 78);

var s2 = new Student('goto');
console.log(s2.name);
s2.avg(43, 76);