var h1 = document.getElementsByTagName('h2')[0],
    start = document.getElementById('start'),   
    seconds = 0, minutes = 0, t;


function add() {
    seconds++;
    if (seconds >= 60) {
        seconds = 0;
        minutes++;       
    }
    
    h1.textContent =  (minutes ? (minutes > 9 ? minutes : "0" + minutes) : "00") + ":" + (seconds > 9 ? seconds : "0" + seconds);

    timer();
}
function timer() {
    var val=document.forms[0].min.value;
    console.log("min",val);
    for(;seconds<val*60;seconds++){
    t = setTimeout(add, 1000);
    }
};
start.onclick=timer;


