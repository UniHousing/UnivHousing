<%@page contentType="text/html;charset=gb2312"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<title>Add New Request</title>
</head>
<script type="text/javascript">
function CheckHouses(val,id){
 var element=document.getElementById(id);
 if(val=='Specific Hall')
   element.style.display='inline-block';
 else  
   element.style.display='none';
}
</script> 
<body>
	<center>
		<h2>Add New Request</h2>
		<s:actionerror />
		<s:form action="addRequest">
<%-- 		 Preference1: <select name="preference1" onchange='CheckHouses(this.value,"preference1");'> 
			    <option>Pick a House</option>  
			    <option value="Specific Hall">Specific Hall</option>
			    <option value="Apartment">Apartment</option>
			    <option value="Resident Hall">Resident Hall</option>
			  </select> &nbsp;&nbsp;
			  <input type="text" name="preference1" id="preference1" style='display:none;'/>
			  <br>
			Preference2: <select name="preference2" onchange='CheckHouses(this.value,"preference2");'> 
			    <option>Pick a House</option>  
			    <option value="Specific Hall">Specific Hall</option>
			    <option value="Apartment">Apartment</option>
			    <option value="Resident Hall">Resident Hall</option>
			  </select> &nbsp;&nbsp;
			  <input type="text" name="preference2" id="preference2" style='display:none;'/>
			  
			  <br>
			  Preference3: <select name="preference3" onchange='CheckHouses(this.value,"preference3");'> 
			    <option>Pick a House</option>  
			    <option value="Specific Hall">Specific Hall</option>
			    <option value="Apartment">Apartment</option>
			    <option value="Resident Hall">Resident Hall</option>
			  </select> &nbsp;&nbsp;
			  <input type="text" name="preference3" id="preference3" style='display:none;'/>  --%>
		<s:if test="#session.type=='guest'">
		<s:select label="Select Your First Preferences" onchange='CheckHouses(this.value,"preference1");'
				list="#{'Apartment':'Apartment', 'Resident Hall':'Resident Hall'}"
				name="preference1" value="Apartment" />
			<s:textfield name="preference1" id="preference1" cssStyle='display:none'></s:textfield>
			
			<s:select label="Select Your Second Preferences" onchange='CheckHouses(this.value,"preference2");'
				list="#{'Apartment':'Apartment', 'Resident Hall':'Resident Hall'}"
				name="preference2" value="Apartment" />
			<s:textfield name="preference2" id="preference2" cssStyle='display:none'></s:textfield>
			
			<s:select label="Select Your Third Preferences" onchange='CheckHouses(this.value,"preference3");'
				list="#{'Apartment':'Apartment', 'Resident Hall':'Resident Hall'}"
				name="preference3" value="Apartment" />
			<s:textfield name="preference3" id="preference3" cssStyle='display:none'></s:textfield> 
			<s:select label="Payment Method"
				list="#{'Monthly':'Monthly', 'Semester':'Once per Semester'}"
				name="paymentMethod" value="Monthly" ></s:select>
   			

			<s:textfield name="startDate"
				label="Start Date (Format (MM/DD/YEAR))"></s:textfield>
			<s:textfield name="endDate" label="Start Date (Format (MM/DD/YEAR))"></s:textfield>

			<s:submit value="Submit"></s:submit>
			<s:reset value="Reset"></s:reset>
			</s:if>
			
				
		
		<s:if test="#session.type=='student'">
		<s:select label="Select Your First Preferences" onchange='CheckHouses(this.value,"preference1");'
				list="#{'Apartment':'Apartment', 'Resident Hall':'Resident Hall','Specific Hall':'Specific Hall'}"
				name="preference1" value="Specific Hall" />
			<s:textfield name="preference1" id="preference1" cssStyle='display:none'></s:textfield>
			
			<s:select label="Select Your Second Preferences" onchange='CheckHouses(this.value,"preference2");'
				list="#{'Apartment':'Apartment', 'Resident Hall':'Resident Hall','Specific Hall':'Specific Hall'}"
				name="preference2" value="Specific Hall" />
			<s:textfield name="preference2" id="preference2" cssStyle='display:none'></s:textfield>
			
			<s:select label="Select Your Third Preferences" onchange='CheckHouses(this.value,"preference3");'
				list="#{'Apartment':'Apartment', 'Resident Hall':'Resident Hall','Specific Hall':'Specific Hall'}"
				name="preference3" value="Specific Hall" />
			<s:textfield name="preference3" id="preference3" cssStyle='display:none'></s:textfield> 
			<s:select label="Payment Method"
				list="#{'Monthly':'Monthly', 'Semester':'Once per Semester'}"
				name="paymentMethod" value="Monthly" ></s:select>
   			

			<s:textfield name="startDate"
				label="Start Date (Format (MM/DD/YEAR))"></s:textfield>
			<s:textfield name="endDate" label="Start Date (Format (MM/DD/YEAR))"></s:textfield>

			<s:submit value="Submit"></s:submit>
			<s:reset value="Reset"></s:reset>
         </s:if>
         
         <s:if test="#session.type=='admin'">
		 <p>You have no permission to add lease request</p>
		 </s:if>
		
		</s:form>
		<a href="requestOptions.jsp">Back to Request</a>

	</center>
</body>
</html>