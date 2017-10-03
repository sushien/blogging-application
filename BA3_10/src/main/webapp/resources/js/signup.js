function validateForm() {
    var x = document.forms["myForm"]["name"].value;
    if (x == "") {
        alert("username must be filled");
        return false;
    }
	x = /(?=.*[a-z]|[A-Z]).{6,}/;
    if(!x.test(myForm.name.value)) {
      alert("Error: Username must minimun six characters");
      myForm.name.focus();
      return false;
    }
	 var y = document.forms["myForm"]["pwd"].value;
    if (y == "") {
        alert("password must be filled");
        return false;
    }
	y = /(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{6,}/;

    if(!y.test(myForm.pwd.value)) {
      alert("Error: Password must contain at least one number, one lowercase and one uppercase letter at least six characters");
      myForm.pwd.focus();
      return false;
    }
	var z = document.forms["myForm"]["email"].value;
    if (z == "") {
        alert("email must be filled");
        return false;
    }
	z =  /^(([^<>()\[\]\\.,;:\s@"]+(\.[^<>()\[\]\\.,;:\s@"]+)*)|(".+"))@((\[[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}])|(([a-zA-Z\-0-9]+\.)+[a-zA-Z]{2,}))$/;

    if(!z.test(myForm.email.value)) {
      alert("enter a valid email id");
      myForm.email.focus();
      return false;
	
    
	
}
}
