<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>입력창 스타일링</title>
<link rel="stylesheet" type="text/css" href="/study/design/common.css">


<style>
	/*입력창 스타일 
	기본 : form-input
	
	버튼 스타일
	기본.form-btn
	*/
	.form-input, .form-btn{
		width :100%;
		padding:0.8rem;
		outline : none;
	}
	
	.form-btn{
	border :none;
	border-radius: 5px; 
	}
	
	.form-input.form-underline{
	border : none;
	border-bottom: 2px solid silver;
	}
	
	.form-input.form-underline:focus{
	border-bottom : 2px solid black;
	}

	.form-input.form-input-inline,
	.form-btn.form-input-inline{
	width:auto;
	}

	textarea.form-input{ /*여긴 .이 안들어가*/
		resize: vertical;
		min-height: 150px;
		max-height: 500px;
	}
	
	
	
	.form-btn.form-btn-normal{
		background-color:  white;
		color:  gary;
		border : 1px solid;
	}	
	.form-btn.form-btn-positive{
		background-color:  rgb(46,163,79);
		color:  white;
	}
	.form-btn.form-btn-negative{
		background-color:  rgb(202,36,49);
		color:  white;
	}

	
	.row{
	margin: 5px 0px,
	}
	
	

	
	
</style>

</head>
<body>


<form>


<div class="container-400">
	<div class="row">
		<label>아이디</label>
		<input type="text" name="memberId" placeholder ="아이디입력" class="form-input form-underline">
	</div>
	
	<div class="row">
		<label>비밀번호</label>
		<input type="password" name="memberPw" placeholder ="비밀번호입력" class="form-input form-underline">
	</div>
	
	<div class="row">
		<label>성별</label>
		<select name ="gender" class="form-input form-input-inline">
			<option>남자</option>
			<option>여자</option>
		</select>
	</div>
	
	<div class="row">
		<label>자기소개</label>
		<textarea name ="pr" class="form-input"></textarea>
	</div>
	
	<div class="row">
		<label>가입</label>
		<input type="submit" value="가입!" class ="form-btn form-btn-inline form-btn-positive">
	</div>
	
		
	<div class="row">
		<label>초기화</label>
		<input type="reset" value="가입!" class ="form-btn form-btn-inline form-btn-negative">
	</div>
	
		<div class="row">
		<label>이동</label>
		<input type="reset" value="이동!" class ="form-btn form-btn-inline form-btn-normal">
	</div>
	
	
</div>


</form>





</body>
</html>