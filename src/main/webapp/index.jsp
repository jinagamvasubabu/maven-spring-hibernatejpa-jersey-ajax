<html>
<head>
	<script src="http://code.jquery.com/jquery-1.11.2.min.js"></script>
	<script>
		$(document).ready(function(){
			var data = {};
			data.id = 1;
			data.name = "vasu";
			data.skills = "java,cpp";
			$.ajax({
							url : 'rest/hello/postman',
							type : 'POST',
							headers : {
								'Accept' : 'application/json',
								'Content-Type' : 'application/json'
							},
							data : JSON.stringify(data),
							contentType : 'application/json',
							dataType : 'json',
							success : function(data) {
								alert("success");
							}
			});
		});
	
	</script>
	
	
</head>

</html>