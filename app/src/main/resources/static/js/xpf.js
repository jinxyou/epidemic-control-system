function submit(){
    var UID=$("#UID").val();
    var password=$("#password").val();

    $.ajax({
        type:"POST",
        url:"ss",
        data:{
            UID:UID,
            password:password
        },
        success:function (data){

            if (data=="管理员")
                location.href="aster";
            else if(data=="学生")
                location.href="studentships";
            else
                alert("账号不存在，请重新输入或注册");
        },
        error:function (){
            alert("error")
        }
    })
}
function login(){

    location.href="index";
}
function register(){
    location.href="register";
}
function feedback(){
    alert("THANKS FOR YOUR HELP!");
}