window.onload=function(){

};
function change(){
    document.getElementById('img2').src="./images/img5.jpg";
    document.getElementById('img3').src="./images/img6.jpg";
    document.getElementById('img4').src="./images/img7.jpg";
    var div1=document.createElement('div');
    div1.setAttribute("id","pics");   
    document.body.appendChild(div1);
    
    var img=document.createElement('img');    
    img.setAttribute("src","./images/img8.jpg");
    img.setAttribute("height","250px");
    img.setAttribute("width","250px");
    div1.appendChild(img);
    var img2=document.createElement('img');    
    img2.setAttribute("src","./images/img2.jpg");
    img2.setAttribute("height","250px");
    img2.setAttribute("width","250px");
    div1.appendChild(img2);
    var img3=document.createElement('img');    
    img3.setAttribute("src","./images/img3.jpg");
    img3.setAttribute("height","250px");
    img3.setAttribute("width","250px");
    div1.appendChild(img3);
   
}
function back(){
   
    document.getElementById('img2').setAttribute("src","./images/img2.jpg");
    document.getElementById('img3').setAttribute("src","./images/img3.jpg");
    document.getElementById('img4').setAttribute("src","./images/img4.jpg");
    var con=document.getElementById('pics');
    document.body.removeChild(con);
}