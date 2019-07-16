window.onload=function(){
    
};
function validateForm(){
    var email=document.forms[0].email.value;
    var re = /^(([^<>()\[\]\\.,;:\s@"]+(\.[^<>()\[\]\\.,;:\s@"]+)*)|(".+"))@((\[[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\])|(([a-zA-Z\-0-9]+\.)+[a-zA-Z]{2,}))$/;
    var result= re.test(String(email).toLowerCase());
    if(!result && email.length < 6){
        document.getElementById('div2').innerHTML='<p>Please enter valid email Id</p>';
    }
   
    var pass=document.forms[0].password.value;
    console.log(pass);
    var pass2=document.forms[0].pass.value;
    console.log(pass2);
    
    if(pass.length < 6 || pass2.length < 6){
        document.getElementById('div2').innerHTML='<p>Passwords length should be more than 6</p>';
    }
    if(pass!==pass2){
        document.getElementById('div2').innerHTML='<p>Passwords are not same</p>';
    } 
    if(email.length > 6 && pass.length > 6 && pass2.length > 6 && pass===pass2){
        document.forms[0].myButton.disabled=false;
    }else {
        document.forms[0].myButton.disabled=true;
    }
}
function show(){
    var toggle=document.getElementById('password');

    if(toggle.type === "password"){
        toggle.type= "text";
    }else{
        toggle.type="password";
    }
}