<%-- 
    Document   : login
    Created on : July 13, 2020, 08:29:12 PM
    Author     : T�
--%>

<%-- include header file --%> 
<%@include file="header.jsp" %>
<section id="form"><!--form-->
    <div class="container">
        <div class="row">
           
            <div class="col-sm-4">
                <div class="signup-form"><!--sign up form-->
                    <h2>Please Enter Your UserName Account </h2>
                    <form action="ForgetPass" method="post" id="SignupForm" onsubmit="return validateSignup();">
                        <input type="text" placeholder="Name" id="SignupName" name=ForgetName required/>
                        <!--validate password-->
                        <button type="submit" class="btn btn-default">Enter</button>
                    </form>
                </div><!--/sign up form-->
            </div>
        </div>
    </div>
</section><!--/form-->

<%-- include footer file --%> 
<%@include file="footer.jsp" %>
