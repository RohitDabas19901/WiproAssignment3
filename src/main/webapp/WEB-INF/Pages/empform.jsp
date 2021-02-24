<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
 <head>
    <link href="<c:url value="/resources/main.css" />" rel="stylesheet">
    <script src="<c:url value="/resources/jquery-3.5.1.min.js" />"></script>
    <script src="<c:url value="/resources/main.js" />"></script>
</head>
  
       <form:form method="post" action="save">    
        <table >    
         <tr>    
          <td>Name : </td>   
          <td><form:input path="name"  /></td>  
         </tr>    
         <tr>    
          <td>Salary :</td>    
          <td><form:input path="salary" /></td>  
         </tr>   
         <tr>    
          <td>Designation :</td>    
          <td><form:input path="designation" /></td>  
         </tr>   
         <tr>    
          <td colspan="2"><input type="submit" value="Save" /></td>    
         </tr>    
        </table>    
        <input type="text" name="Search" placeholder="searchPhoneNumberName">
        <div class="dropdown">
  <button onclick="myFunction()" class="dropbtn"  style=" background-color: #4CAF50;color: white;padding: 16px;font-size: 16px;border: none;cursor: pointer;">Dropdown</button>
  <div id="myDropdown" class="dropdown-content">
    <input type="text" placeholder="Search.." id="myInput" onkeyup="filterFunction()">
    <a href="#about">About</a>
    <a href="#base">Base</a>
    <a href="#blog">Blog</a>
    <a href="#contact">Contact</a>
    <a href="#custom">Custom</a>
    <a href="#support">Support</a>
    <a href="#tools">Tools</a>
  </div>
</div>
        
        
        
        
       </form:form>    