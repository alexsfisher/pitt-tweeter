$(document).ready(function(){
    $("#submit").click(function(){
        var txt = $("#text").val();
        $.post("/post-tweet", {text: txt}, function(data){
            alert(data);
            $("#text").val('');
        });
    });
});