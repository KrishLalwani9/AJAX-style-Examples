function populateDesignations()
{
var designationsComboBox=document.getElementById("designationsComboBox");
var xmlHttpRequest=new XMLHttpRequest(); //by the help of this pointer we can send request and receive response
xmlHttpRequest.onreadystatechange=function(){ 
if(this.readyState==4)
{
if(this.status==200)
{
var responseData=this.responseText;
var obj;
var splits=responseData.split(",");
for(var i=0;i<splits.length;i=i+2)
{
obj=document.createElement("option");
obj.text=splits[i+1];
obj.value=splits[i];
designationsComboBox.appendChild(obj);
}

}
else
{
alert("some problem");
}
}
};
xmlHttpRequest.open("GET","servletOne",true);
xmlHttpRequest.send();
}
window.addEventListener('load',populateDesignations);
