$(document).ready(function(){
	$("button").click(function(){
		$.ajax({url: "/makeMove/" + this.id, success: function(result) {
			var object = JSON.parse(result);
			var player = object.player;
			if (object.status == "win") {
				alert(player + " Won!");
			} 
			if (object.status == "draw") {
				alert("DRAW");
			}
		}});
    });
});