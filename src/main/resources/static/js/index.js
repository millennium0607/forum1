$(function(){
    $.ajax({
        url: "/getMenu",
        async:false,
        dataType:"json",
        success:function (data, textStatus) {
            console.log("data:"+data);
            console.log("textStatus:"+textStatus);
            console.log("dataText:"+data.text)
        },
        error:function(XMLHttpRequest,textStatus,errorThrow){
            console.log("XMLHttpRequest:"+XMLHttpRequest);
            console.log("textStatus:"+textStatus);
            console.log("errorThrown:"+errorThrow)
        }
    })
})

function logout(){
    window.location = "/logout";
}