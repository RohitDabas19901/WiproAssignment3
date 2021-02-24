<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

 
 
    <script type="text/javascript" src="/JS/jquery-3.5.1.min.js"></script>
    <script type="text/javascript" src="/JS/main.js"></script>
    
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    
</head>
<body>
 
 <input type="text" id="mymobile"  onkeyup="checkPhoneNo();"  onkeydown="checkPhoneNo();"   placeholder="Please enter phone book name" >
 <div id="value" style="width:100%;">
 </div>
 
 </br>
 
 <select name="phonenoList" id="phoneList">
  <option value="rohit">rohit</option>
  <option value="mohit">mohit</option>
  <option value="dinesh">dinesh</option>
  <option value="ramesh">ramesh</option>
  <option value="mohit2">mohit2</option>
  <option value="mohit3">mohit3</option>
  <option value="kanika">kanika</option>
 </select>
 
 <script>

 
 function checkPhoneNo()
 {
	 var value = $('#mymobile').val();
	 value=value.toLowerCase(); 
	 var html="";
	 var phonenameList="rohit,mohit,dinesh,ramesh,mohit2,mohit3,kanika".toLowerCase();
	 if(value!="")
		 {
		 var splitphone= phonenameList.split(',');
		 
		 for(var i = 0; i < splitphone.length; i++)
		 {
		     var res = splitphone[i].match(/value/g);
		     var n = splitphone[i].indexOf(value);
		     if(n==-1)
		     {
		    	 
		     }else
		    	 {
		    	   html += '<label  style="border: 1px solid black;width:200%;background-color: coral;">'+splitphone[i]+'</label></br>';
		    	 }
		 }	
		 }
	 
	    $("#value").empty();
	    $('#value').append(html);
 }
 
 
 </script>
 

</body>
</html>