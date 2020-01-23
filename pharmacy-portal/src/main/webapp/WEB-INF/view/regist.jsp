<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
<head lang="en">
    <meta charset="UTF-8">
    <title>百姓平安药房健康网-登录</title>
    <link type="text/css" rel="stylesheet" href="https://www.yuekangsong.com/shop/templates/default/css/new/bootstrap.min.css">
    <link type="text/css" rel="stylesheet" href="https://www.yuekangsong.com/shop/templates/default/css/new/login_register.css">
    <link type="text/css" rel="stylesheet" href="https://www.yuekangsong.com/shop/templates/default/css/new/ionicons.css">
    <!--<script src="http://static.runoob.com/assets/jquery-validation-1.14.0/lib/jquery.js" ></script>
        <script src="http://static.runoob.com/assets/jquery-validation-1.14.0/dist/jquery.validate.min.js"></script>-->
    <script type="text/javascript" src="https://www.yuekangsong.com/shop/resource/js/new/jquery-1.10.2.min.js"></script>
    <script type="text/javascript" src="https://www.yuekangsong.com/shop/resource/js/new/jquery.validate.min.js"></script>
</head>
<style>
    .outerror label{
        height: 30px;
        line-height: 30px;
        margin:10px 0px 0px 80px;
        color:red;
    }
    .am-form-area div.outerror label{
        height: 30px;
        line-height: 30px;
        margin:10px 0px 0px 10px;
        color:red;
    }
    .am-agree div.outerror label{
        height: 30px;
        line-height: 30px;
        margin:10px 0px 0px 10px;
        color:red;
    }

</style>
<body>
<div class="am-area">
<div class="am-left-bar">
    <div class="am-header"><a href="https://www.yuekangsong.com"> <img src="https://www.yuekangsong.com/data/upload/shop/common/06286872896538652.jpg"></a></div>
    <div class="am-peopel"><img src="https://www.yuekangsong.com/shop/templates/default/images/new/doctors.jpg"></div>

</div>
<div class="am-right-bar">
    <h1 class="am-title"><span class="am-tips">已有账号，<b><a href="https://www.yuekangsong.com/index.php?c=login&op=login"> 登录</a></b></span>注册</h1>
    <form id="am-register-form" method="post" action="https://www.yuekangsong.com/index.php?c=login&op=usersave">
        <input type="hidden" value="" name="ref_url">
        <input name="nchash" type="hidden" value="d39dbadf" />
        <input type="hidden" name="form_submit" value="ok" />
        <input type='hidden' name='formhash' value='dTPFKS_pEgtcHEfqA4seTXGISDJhNcD' />        <div class="form-group has-success has-feedback">
            <div class="input-group am-form-group">
                <span class="input-group-addon"><label class="am-name">注册<br>帐号</label></span>
                <input type="text" class="username form-control" id="user_name"
                       aria-describedby="inputGroupSuccess4Status" name="user_name" placeholder="请输入手机号" autofocus>
            </div>
            <span class="glyphicon glyphicon-ok-sign form-control-feedback am-hide" aria-hidden="true"></span>
            <div class="outerror"></div>
        </div>

        <div class="form-group has-success has-feedback">


            <div class="input-group am-form-group">
                <span class="input-group-addon"><label class="am-name">设置<br>密码</label></span>
                <input type="password" class="form-control" id="password"
                       aria-describedby="inputGroupSuccess4Status" name="password" placeholder="请输入您的密码">
            </div>
            <span class="glyphicon glyphicon-remove-sign form-control-feedback red-icon am-hide"
                  aria-hidden="true"></span>
            <div class="outerror"></div>
        </div>
        <div class="form-group has-success has-feedback">


            <div class="input-group am-form-group">
                <span class="input-group-addon"><label class="am-name">确认<br>密码</label></span>
                <input type="password" class="form-control" id="password_confirm"
                       aria-describedby="inputGroupSuccess4Status" name="password_confirm" placeholder="确认您的密码">
            </div>
            <span class="glyphicon glyphicon-remove-sign form-control-feedback red-icon am-hide"
                  aria-hidden="true"></span>
            <div class="outerror"></div>
        </div>
                <div class="form-group am-form-area clearfix">
            <div class="am-input-shadow"><input type="text" id="captcha" name="captcha" class="form-control am-input"
                                                placeholder="验证码">
            </div>

            <span class="am-code"><img id="codeimage" src="index.php?c=seccode&op=makecode&nchash=d39dbadf" alt="验证码"/> </span>
            <span class="am-code-name"> <a href="javascript:;" onclick="javascript:document.getElementById('codeimage').src='index.php?c=seccode&op=makecode&nchash=d39dbadf&t=' + Math.random();">看不清，换一张</a></span>
            <div class="outerror"><label></label></div>
        </div>
        
        <div class="form-group am-form-area">
            <div class="am-input-shadow">
                <input type="text" placeholder="" class="form-control am-input" name="phone_captcha" id="phone_captcha" placeholder="短信验证码">
            </div>
            <button type="button" class="btn btn-default am-button am-gray-button" onclick="settime()" id="sendCode">获取短信验证码</button>

        </div>

        <div class="checkbox am-agree">
            <div class="checkboxFive">
                <input type="checkbox" value="1" id="checkboxFiveInput" name="checkboxFiveInput"/>
                <label for="checkboxFiveInput"></label>
            </div>
            <div class="am-agreement">
                我阅读并同意<a href="https://www.yuekangsong.com/document-agreement.html">《服务协议》</a>

            </div>
            <div class="outerror"></div>
        </div>
        <div class="am-login-button">
            <input type="submit" class="btn btn-danger" value="注册">
        </div>

        <div class="am-other-method clearfix">

        </div>
    </form>
    <script type="text/javascript">
        $(document).ready(function () {
            jQuery.validator.addMethod("lettersonly", function(value, element) {
                //return this.optional(element) || /^[^:%,'\*\"\s\<\>\&]+$/i.test(value); //匹配用户名
                return this.optional(element) || /^(((13[0-9]{1})|(14[0-9]{1})|(15[0-9]{1})|(17[0-9]{1})|(18[0-9]{1}))+\d{8})$/i.test(value); //匹配手机号
            }, "手机号码格式不正确");

            $("#am-register-form").validate({
//
//                errorClass: "alert alert-danger",
//
//                focusInvalid: false, //当为false时，验证无效时，没有焦点响应
//                onkeyup: false,
//
//                groups: {
//
//                    codecheck: "user_name password password_confirm captcha checkboxFiveInput"
//
//                },
//                errorPlacement: function (error, element) {
//                    error.insertAfter(".am-title")
//                },
                errorPlacement: function (error, element) {
                    element.parent().parent().find('div.outerror').html(error);

                },
                submitHandler: function (form) {
                    form.submit();

                },
                rules: {
                    user_name : {
                        required : true,
                        lettersonly : true,
                        remote   : {
                            url :'index.php?c=login&op=check_member&column=ok',
                            type:'get',
                            data:{
                                user_name : function(){
                                    return $('#user_name').val();
                                }
                            }
                        }
                    },
                    password : {
                        required : true,
                        minlength: 6,
                        maxlength: 20
                    },
                    password_confirm : {
                        required : true,
                        equalTo  : '#password'
                    },
                                        captcha : {
                        required : true,
                        remote   : {
                            url : 'index.php?c=seccode&op=check&nchash=d39dbadf',
                            type: 'get',
                            data:{
                                captcha : function(){
                                    return $('#captcha').val();
                                }
                            },
                            complete: function(data) {
                                if(data.responseText == 'false') {
                                    document.getElementById('codeimage').src='https://www.yuekangsong.com/index.php?c=seccode&op=makecode&nchash=d39dbadf&t=' + Math.random();
                                }
                            }
                        }
                    },
                                        phone_captcha: {
                        required:true,
                    },
                    checkboxFiveInput: "required"

                },
                messages: {
                    user_name : {
                        required : '用户名不能为空',
                        remote	 : '该用户名已经存在'
                    },
                    password  : {
                        required : '密码不能为空',
                        minlength: '密码长度应在6-20个字符之间',
                        maxlength: '密码长度应在6-20个字符之间'
                    },
                    password_confirm : {
                        required : '请再次输入您的密码',
                        equalTo  : '两次输入的密码不一致'
                    },
                                        captcha : {
                        required : '请输入验证码',
                        remote	 : '验证码不正确'
                    },
                                        phone_captcha : {
                        required : '请填写手机验证码'
                    },
                    checkboxFiveInput: "请接受我们的声明",

                }

            })


        })



        var countdown=60;
        function settime(){
            if (countdown == 0) {
                $('#sendCode').attr("disabled",false);
                $('#sendCode').html("发送验证码");
                countdown = 60;
                return;
            }else {
                if(countdown == 60){
                    var mobile = $('#user_name').val();
                    var captcha = $('#captcha').val();
                    var nchash = "d39dbadf";
                    if (!mobile || mobile.length < 11) {
                        return false;
                    }
                    if(!captcha){
                        return false;
                    }
                    $.post('index.php?c=login&op=send_verify',{'mobile':mobile, 'captcha':captcha, 'nchash':nchash},function(data){
                        if(data.status == 1){
                            alert('发送验证码成功');
                        }else if(data.status == 2){
                            alert('验证码错误');
                            countdown=0;
                            return false;
                        }else if(data.status == 3){
                            alert('手机号已被使用，请重新换一个号码试试');
                            countdown=0;
                            return false;
                        }else{
                            alert('发送失败');
                            countdown=0;
                            return false;
                        }
                    }, 'json');
                }
                $('#sendCode').attr("disabled", true);
                $('#sendCode').html("重新发送(" + countdown + ")");
                countdown--;
            }
            setTimeout(function() {
                    settime() }
                ,1000)
        }
    </script>
</div>


</div>
</body>
</html>