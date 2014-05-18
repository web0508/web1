$(document).ready(function(){
	
	$('#damo1task').tree({
	    onClick: function(node){
	        // alert node text property when clicked
	        if(node.attributes){
	            settab(node.attributes.url,node.text);
	          }
	    }
	});
});

function settab(url,title){
	 if($("#main").tabs('exists',title)){
	        $('#main').tabs('select', title);
	    }else{
	    	$('#main').tabs('add',{
	    		title: title,
	    		closable: true,
	    		href:url // url
	    		});
	    }
	
	
}