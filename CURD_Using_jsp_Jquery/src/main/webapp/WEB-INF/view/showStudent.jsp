<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
	<jsp:include page="index.jsp"></jsp:include>
	<html>

	<head>
		<script src="https://code.jquery.com/jquery-3.7.1.js"
			integrity="sha256-eKhayi8LEQwp4NKxN+CfCh+3qOVUtJn3QNZ0TciWLP4=" crossorigin="anonymous"></script>
		<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet"
			integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
		<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
			integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
			crossorigin="anonymous"></script>
		<style>
			.btn {
				height: 50px;
				width: 150px;
				font-size: 18px;
				border-radius: 50px;
				margin-right: 10px;
				margin-top: 10px
			}

			form {
				box-shadow: rgba(0, 0, 0, 0.24) 0px 3px 8px;
				border-radius: 40px;
				width: 500px;
				padding-top: 20px;
				padding-bottom: 20px;
			}

			#div10 {
				text-align: center;
				display: none;  
				padding-left: 750px;
				box-shadow: 50px;

			}

			label {
				text-align: left;
				font-size: 30px;
			}

			#txt {
				height: 30px;
				width: 300px;
			}

			.btncln {
				height: 30px;
				width: 100px;
				margin-right: 10px;
			}
		</style>
	</head>

	<body>
		<div style="min-height: 700px; border: 1px solid black;">
			<div style="text-align: right">
				<button type="button" class="btn btn-danger" id="btn">Add Student</button>
				<!-- <button id="btn" class="btn">Add Student</button> -->
			</div>

			<div id="div10" class="div1">
				<form id="studentForm"	>
					<label>First Name</label><br> <input type="text" id="txt" class="fname"
						name="studentFirstName" /><br>
					<br> <label>Last Name</label><br> <input type="text" class="lname" id="txt"
						name="studentLastName" /><br>
					<br> <label>RollNo</label><br> <input type="text" id="txt" class="rollno"
						name="studentRollNo" /><br>
					<br> <label>Address</label><br> <input type="text" class="address" id="txt" name="address" /><br>
					<br> <br> <input type="submit" class="btncln" id="sub" />
					<input type="button" class="btncln" id="btnc" value="Cancal" />
				</form>

			</div>
			<div style="margin-top: 25px;">
				<table class="table table-dark table-striped" >
					<thead>
					<tr>
						<th>ID</th>
						<th>First Name</th>
						<th>Last Name</th>
						<th>Roll No</th>
						<th>Address</th>
					</tr>
				</thead>
				<tbody id="tbl">

				</tbody>
				</table>
			</div>
		</div>



		</div>
		<script>

			$(document).ready(function () {
				get();
				//Insert Data using Jquery and Ajax

				$("#sub").on("click", function (e) {
					console.log("button clicked...")
					e.preventDefault();
					var studentFirstName1 = $(".fname").val();
					var studentLastName1 = $(".lname").val();
					var studentRollNo1 = $(".rollno").val();
					var address1 = $(".address").val();

					if (studentFirstName1 == "" || studentLastName1 == "" || studentRollNo1 == "" || address1 == "") {
						alert("Plz Fill all Field...")
					}
					else{
						
					


						var dat = {
							studentFirstName: studentFirstName1,
							studentLastName: studentLastName1,
							studentRollNo: studentRollNo1,
							address: address1
						};

						console.log(dat);

						$.ajax({
							url: "/student/addStudent",
							type: "POST",
							contentType: "application/JSON",
							data: JSON.stringify(dat),
							success: function (data) {
								$("#studentForm").trigger("reset");
								$("#div10").slideUp();
							
								get();
							}

						});
					}
				});
				//Get Data Using Jquery
				function get() {
					$("#tbl").empty();
					$.ajax({
						url: "/student/getStudent",
						type: "GET",
						success: function (data) {
							$.each(data, function (key, value) {
								
								
									$("#tbl").append("<tr><td>" + value.studentId + "</td><td>" + value.studentFirstName + "</td><td>" + value.studentLastName + "</td><td>" + value.studentRollNo + "</td><td>" + value.address + "</td></tr>");
									
								
							});
	
						}
					});
				}

				$("#btn").mouseenter(function () {
					$(this).addClass("btn")
					$(this).css({
						"background-color": "red",
						"color": "white"
					});
				});

				$("#btn").mouseleave(function () {
					$(this).addClass("btn")
					$(this).css({
						"background-color": "white",
						"color": "black"
					});
				});

				$("#btn").click(function () {
					$("#div10").slideDown();
				});

				$("#btnc").click(function () {

					$("#div10").slideUp();
				})
			})

		</script>
	</body>

	</html>