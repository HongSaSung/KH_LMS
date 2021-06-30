function idDupleChk() {
	var id = document.getElementById("userid").value;
	
	
	var url = "./idDupleChk.do?userid="+id;
	var title = "아이디 중복검사";
	var prop = "top=100px, left=100px, width=350px, height=300px";
	
	
		
	window.open(url, title, prop);
	 
}