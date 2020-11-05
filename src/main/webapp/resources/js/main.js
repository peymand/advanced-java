function ajaxFetch() {

    var xhttp = new XMLHttpRequest();
    xhttp.onreadystatechange = function() {
        if (this.readyState == 4 && this.status == 200) {
            var obj = JSON.parse(this.responseText);
            document.getElementById("firstName").value = obj.firstName;

        }
    };
    // xhttp.setRequestHeader("Content-type", "application/x-www-form-urlencoded");
    xhttp.open("GET", "http://localhost:8080/demo/rest/customer/" + document.getElementById("id").value, true);
    xhttp.send();


}