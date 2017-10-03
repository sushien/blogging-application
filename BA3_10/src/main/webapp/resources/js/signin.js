function validateForm() {
    var x = document.forms["myForm"]["username"].value;
    if (x == "") {
        alert("username must be filled");
        return false;
    }
	x = /(?=.*[a-z]|[A-Z]).{6,}/;
    if(!x.test(myForm.username.value)) {
      alert("Error: Username must minimun six characters");
      myForm.username.focus();
      return false;
    }
	 var y = document.forms["myForm"]["password"].value;
    if (y == "") {
        alert("password must be filled");
        return false;
    }
	y = /(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{6,}/;

    if(!x.test(myForm.password.value)) {
      alert("Error: at least one number, one lowercase and one uppercase letter at least six characters");
      myForm.password.focus();
      return false;
    }
	
}
