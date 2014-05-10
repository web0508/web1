$(document).ready(function(){
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
	alert("add new people");
	
}

function updatepeople(){
	alert("update a people");
	
}	

function deletepeople(){
	alert("delete a people");
	
}	

