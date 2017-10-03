function validateForm() {
    var x = document.forms["myForm"]["email"].value;
    if (x == "") {
        alert("email must be filled");
        return false;
    }
	x =  /^(([^<>()\[\]\\.,;:\s@"]+(\.[^<>()\[\]\\.,;:\s@"]+)*)|(".+"))@((\[[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}])|(([a-zA-Z\-0-9]+\.)+[a-zA-Z]{2,}))$/;

    if(!x.test(myForm.email.value)) {
      alert("enter a valid email id");
      myForm.email.focus();
      return false;
}}