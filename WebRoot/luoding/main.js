$(document).ready(function(){
	$('#addnewwin').window('close');
	$('#tt').datagrid({   
			columns:[[   
		          {field:'code',title:'ID',width:100},   
		          {field:'name',title:'Name',width:300},   
		          {field:'price',title:'Age',width:300,align:'center'},
		          {field:'price',title:'Sex',width:300,align:'center'}   
		      ]]

			});
	
	
	
});


function addpeople(){
	$('#addnewwin').dialog('open');
}

function updatepeople(){
	$('#addnewwin').dialog('open');
	
}	

function deletepeople(){
	alert("delete a people");
	
}	

function adduser(){
	
	
	
}

