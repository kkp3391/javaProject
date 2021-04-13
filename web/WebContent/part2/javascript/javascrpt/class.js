class student {
    constructor(sno, name) {
        this.sno = sno;
        this.name = name;
    }
    setNmae(name) {
        this.name = name;
    }
    getName() {
        return this.name;
    }
    showInfo() {
        return this.sno+''+this.name;
    }
    static toShow() {
        return 'Hello';
    }
}
let s1 = new student('1111', 'Hong kildong');
console.log(s1.getName);
// console.log(s2.showInfo());
console.log(student.toShow());