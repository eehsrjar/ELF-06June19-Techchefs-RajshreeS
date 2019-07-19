window.onload=function(){
	
};
function validateForm(){
    var id=document.forms[0].id.value;   
    var pass=document.forms[0].password.value;
    
    if(id.length >=1 && pass.length >= 4){
        document.forms[0].loginButton.disabled=false;
    }else {
    	document.getElementById('div2').innerHTML='<p>Please enter valid employee Id and password</p>';
        document.forms[0].loginButton.disabled=true;
    }
}