/* let name=document.getElementById('name');
console.log(name);
console.log(name.textContent);
name.style.color="green";
var demoCollection=document.getElementsByClassName('demo');
console.log(demoCollection);
demoCollection[0].style.fontSize='40px';
demoCollection[1].style.fontSize='60px';
demoCollection[1].style.display="hidden";
 */
//document.getElementById('myButton').className='button';
document.getElementById('myButton').classList='button button1';
//var querySelect=document.querySelector('p');
var querySelect=document.querySelectorAll('p');
console.log(querySelect);

let input=document.createElement('input');
document.body.appendChild(input);
var demoClass=document.getElementsByClassName('demo');
console.log("By Class Name "+demoClass.length);

var demoClass1=document.querySelectorAll('.demo');
console.log("By Query selector "+demoClass1.length);

//write the number of elements in each array(values match)
console.log("number of elements with getElementsByClassName "+demoClass.length);
console.log("number of elements with  querySelectorAll "+demoClass1.length);

//Change one element's class to blue
//document.getElementById('type').className="blue";

//write the number of elements in each array(values differ)
console.log("number of elements with getElementsByClassName "+demoClass.length);
console.log("number of elements with  querySelectorAll "+demoClass1.length);

/* document.write("<h4>On Document Message</h4>");
document.getElementById('div1').innerHTML='<input type="text" id="name" value=23>';
document.write('<input type="text" id="name">');
document.getElementById('div1').textContent='<input type="text" id="name">';
 */
let button=document.getElementById('myButton');
/* button.onclick= function createNewElement(){
     document.getElementById('div1').innerHTML='<a href="https://www.google.com">Anchor Tag</a>';
 };
 */
window.onload=function(){
    document.getElementById('myButton').textContent='Dont click';
}
button.addEventListener('click',()=>{
    document.getElementById('div1').innerHTML='<a href="https://www.google.com">Anchor Tag</a>';
});

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
var jsonItem=JSON.stringify(item);
console.log("JSON obj "+jsonItem);
var back=JSON.parse(jsonItem);
console.log("Obj Back "+back);
var n=prompt('Enter number');
console.log("Fact:"+fact(n));
function fact(n){
    if(n==0)
    return 1;
    else{
       return n*fact(n-1);
        
    }
}
