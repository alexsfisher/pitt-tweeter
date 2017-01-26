$(document).ready(function(){
    $("#text").keyup(function(){
        var characters = $("#text").val().length;
        $("#count").text(characters + "/140");
        if(characters >= 130){
            $("#count").css("color","#d40d12");
        }
        else{
            $("#count").css("color","#000000");
        }
        if(characters > 0){
        	$("#submit").removeAttr("disabled");
        }
        else{
        	$("#submit").attr("disabled", "disabled");
        }
    });
});