$(document).ready(function(){
    $("button").click(function(){
		if(document.getElementById("currPlayer").innerHTML == "Player 1"){
			$(this).css('background-image', 'url(img/x.png)');
			document.getElementById("currPlayer").innerHTML = "Player 2";
		}else{
			$(this).css('background-image', 'url(img/o.png)');
			document.getElementById("currPlayer").innerHTML = "Player 1";			
		}
		
		$.ajax({url: "/makeMove/" + this.id, success: function(result) {
			var object = JSON.parse(result);
			var player = object.player;
			if (object.status == "win") {
				alert(player + " Won!");
				for(var i = 1; i <= 9; i++){
					$(document.getElementById(i)).css('background-image', 'none');
				}
			} 
			if (object.status == "draw") {
				alert("DRAW");
				for(var i = 1; i <= 9; i++){
					$(document.getElementById(i)).css('background-image', 'none');
				}
			}
		}});
    });
});
