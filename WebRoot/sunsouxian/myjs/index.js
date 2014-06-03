$(function(){
//$('#box').draggable({
//revert:true,
//cursor:'text',
//handle:'#pox',
//disabled:true,
//axis:'v',
//proxy:'clone',
//deltaX:50,
//deltaY:50,
/* proxy:function(source){
var p = $('<div style="width:400px;height:200px;border:1px dashed #ccc">')
p.html($(source).html()).appendTo('body');
return p;
} */

/* onBeforeDrag:function(e){
alert('拖动前出发');
} */
/* onStopDrag:function(e){
alert('拖动前出发');
} */
//});
//$('#box').draggable('disable');
//console.log($('#box').draggable('options'))

$('#box').linkbutton({
//id:'pox'
toggle:true,

});

$('#pox').linkbutton({
//id:'pox'
//disabled:true,
toggle:true,
});

});