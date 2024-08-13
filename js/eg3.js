function saveEnquiry()
{
var firstName=document.getElementById('firstName').value;
var lastName=document.getElementById('lastName').value;
var age=document.getElementById('age').value;
var dataToSend='firstName='+encodeURI(firstName)+'&lastName='+encodeURI(lastName)+'&age='+encodeURI(age);
var section=document.getElementById('whatever');
section.innerHTML="";
alert(dataToSend);
var xmlHttpRequest=new XMLHttpRequest();
xmlHttpRequest.onreadystatechange=function(){
if(this.readyState==4)
{
if(this.status==200)
{
var responseData=this.responseText;
section.innerHTML=responseData;
}
else
{
alert('somthing not good');
}
}
};
xmlHttpRequest.open('POST','servletThree',true);
xmlHttpRequest.setRequestHeader('Content-Type','application/x-www-form-urlencoded');
xmlHttpRequest.send(dataToSend);
}
