// var a = 10;
// console.log(a);
// var b = a;
// console.log(b);
// b = 20;
// console.log(a);
// console.log(b);
// console.log("----------");
// var person = {
//     name: "rajshree",
//     getName: function () {
//         return this.name;
//     },
//     address: {
//         city: "Mumbai",
//         state: "Maharashtra",
//         pincode: 400124
//     },
//     places: ["Fort", "Marine Drive", "Juhu Beach", "Girgaon Beach"]
// };
// console.log("Name is :", person.getName());
// var number = 10;
// var number1 = 10;
// console.log(number == number1);
// var number3 = '10';
// console.log(number1 == number3);
// console.log(number1 === number3);
// var status = a > 19 ? "adult" : "minor";
// console.log(status);
// console.log("----------");
// console.log("Name with Address :", person.getName(), person.address.city, person.address.state, person.address.pincode);
// console.log("Places :", person.places);
// console.log(person.places[7]);

// var library=[
//         {
//             id:1,
//             author:'v p kale',
//             name:'kale'
//         },
//         {
//             id:2,
//             author:'Chmapk',
//             name:'Champak'
//         },
//         {
//             id:3,
//             author:'Damadi',
//             name:'damadi'
//         }
//     ];
//     console.log("----------");
//     console.log("Obj",library[0]);
//     console.log("Todays date:",new Date());
//     console.log("Todays date:",new Date(2018));
var hobbies=["Cricket","BasketBall","Tennis"];
// document.getElementById('demo').innerHTML=hobbies;
// var places= ["Fort", "Marine Drive", "Juhu Beach", "Girgaon Beach"];
// var perosn={
//     name:"abc",
//     city:"bengaluru",
//     pin:12345
// };
// for (let index = 0; index < places.length; index++) {
//     console.log( places[index]);    
// }
// for (let index = 0; index < perosn.length; index++) {
//     console.log( perosn[index]);
// }//no length for object hence no output
// console.log("----------");
// hobbies.forEach((val,index) => {
//     console.log("Value:",+val);
//     console.log("Index:",index);
// });
// console.log("----------");

// console.log("----------");
// for (var val of hobbies) {
//     console.log("Hobbies :"+val);
// }
// console.log("----------");
// for (var index in hobbies) {
//     console.log("Hobbies:"+hobbies[index]);
// }
// console.log("----------");
// for (var index in perosn) {
//     console.log("Person:"+perosn[index]);
// }
// hobbies['test']='anything';
// for (var index in hobbies) {
//     console.log("Index:"+index);
//     console.log("Hobbies:"+hobbies[index]);
// }
// console.log("----For Of------");
// for (var index of hobbies) {
//     console.log("Index:"+index);
//     console.log("Hobbies:"+hobbies[index]);
// }
console.log("For of started");
console.time("forof");
for(var i of hobbies){
    var a=[];
}
console.timeEnd("forof");
console.log("For of loop ended");
console.log("For in started");
console.time("forin");
for(var i in hobbies){
    var a=[];
}
console.timeEnd("forin");
console.log("For in ended");
// function alertmsg(val,number){
//     alert(`This is named function value=${val} number=${number}`);//String Interpolation
// }
// (function(){
//     alert("This is IIFE");
// }());
// (function(){
//     alert("This is IIFE123");
// })();
//alertmsg("dfg",12);
varKey();
function varKey(){
    a=20;
    console.log("a in fun"+a);
}
console.log("a outside fun"+a);

// function letKey(){
//     let b=20;
//     console.log("b in fun"+b);
// }
// console.log("b outside fun"+b);
// function constKey(){
//     const c=20;
//     console.log("c in fun"+c);
// }
// console.log("c outside fun"+c);
// var v;
// console.log(v);
// v=10;
// console.log(v);
// fnname();
// function fnname(){
//     console.log("assdf");
// }
// var fnname1=function (){
//     console.log("bbbb");
// }
// fnname1;
// var a={};
// console.log(typeof(hobbies));
// console.log(Array.isArray(hobbies));
// console.log(Array.isArray(a));
// var incl=hobbies.includes("football");
// console.log(incl);
// hobbies.push("football");
// console.log(hobbies);
// hobbies.pop();
// console.log(hobbies);
// hobbies.shift("cric");
// console.log(hobbies);
// hobbies.unshift("new value");
// console.log(hobbies);
// hobbies.splice(0,0,"hjjh");
// console.log(hobbies);
// hobbies.splice(0,2,"xxx","sss");
// console.log(hobbies);
hobbies.slice(0,1);
console.log(hobbies);
let h=hobbies.slice(1);
console.log(h);
console.log(hobbies.join('--'));
console.log(hobbies);
console.log(hobbies.indexOf("Cricket"));
//Callback Function
/*function first(){
    setTimeout(()=>{
        console.log("This is first fun");
    },1000);
}
function second(){
    console.log("This is second fun");
}
first();
second();*/

var item=[
    {
        id:1,
        name:"book",
        price:100
    },
    {
        id:2,
        name:"Pen",
        price:10
    },
    {
        id:3,
        name:"Pencil",
        price:5
    },
    {
        id:4,
        name:"eraser",
        price:2
    },
    {
        id:5,
        name:"bobagok",
        price:700
    }
];
console.log(item);
let mappedIds=item.map((value)=>{
    return value.name
});
console.log(mappedIds);
console.log(item);
let filteredValue=item.filter((value)=>{
    return value.price>10;
});
console.log(filteredValue);
//closure
function counter(){
    var counter=0;
    function getCount(){
        counter++;
        return counter;
    }
    return getCount;
}
var counte=counter();
var value=counte();
console.log(value);
var val2=counte();
console.log(val2);

var Delightsalary=(function(){
    var salary=20000;
    function changeBy(amt){
        salary +=amt;
    }
    return{
        raise:function(){
            changeBy(2000);
        },
        deduct:function(){
            changeBy(-2000);
        },
        currentAmt:function(){
            return salary;
        }
    }
})();
alert(Delightsalary.currentAmt());
Delightsalary.raise();
alert(Delightsalary.currentAmt());
Delightsalary.deduct();
alert(Delightsalary.currentAmt());
var promise=new Promise((res,rej)=>{
    const items=[{id:1,name:"anc"},{id:3,name:"xyz"},{id:4,name:"klhj"},{id:7,name:"poi"}];
    if(items.length > 0){
        res(items);
    }else{
        rej("rejected");
    }
});

promise.then((data)=>{
    console.log(data);
}).catch((reason)=>{
    console.log(reason);
});
//console.log(currentsal);
