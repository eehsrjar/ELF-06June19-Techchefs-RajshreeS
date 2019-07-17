window.onload=function(){
    
};
function validateForm(){    
    if(email.length > 6 && pass.length > 6 && pass2.length > 6 && pass===pass2){
        document.forms[0].myButton.disabled=false;
    }else {
        document.forms[0].myButton.disabled=true;
    }
}
function storeData(){
    let email=document.forms[0].email.value;
    let ps=document.forms[0].password.value;
    console.log(email);
    console.log(ps);
    var table=document.body.getElementsByTagName('table');
    console.log(table);
    if(table.length>0){     
        let tableRow2=document.createElement('tr');
        let td=document.createElement('td');
        let td2=document.createElement('td');
        td.appendChild(document.createTextNode(email));
        td2.appendChild(document.createTextNode(ps));
        tableRow2.appendChild(td);
        tableRow2.appendChild(td2);
        table[0].appendChild(tableRow2);
    }else{
        table=document.createElement('table');        
        document.body.appendChild(table);
        let tableRow=document.createElement('tr');
        let th1=document.createElement('th');
        let thData=document.createTextNode('Name');
        let th2=document.createElement('th');
        let thData2=document.createTextNode('Password');
        th1.appendChild(thData);
        tableRow.appendChild(th1)
        th2.appendChild(thData2);
        tableRow.appendChild(th2);
        table.appendChild(tableRow);
        let tableRow2=document.createElement('tr');
        let td=document.createElement('td');
        let td2=document.createElement('td');
        td.appendChild(document.createTextNode(email));
        td2.appendChild(document.createTextNode(ps));
        tableRow2.appendChild(td);
        tableRow2.appendChild(td2);
        table.appendChild(tableRow2);

    }
}