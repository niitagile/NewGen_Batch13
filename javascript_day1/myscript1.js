var username="Bobby";
(function(name){
	function display(name){
		alert("MyScript1 "+name);
	}
display(name)
})(username);

function getData(){
	console.log("outer script");
}