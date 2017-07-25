/**
 * Created by Travis Brindley on 7/22/2017.
 */

function validateLogin() {
    var x = document.forms["loginForm"]["username"].value;
    var y = document.forms["loginForm"]["password"].value;
    if (x.length < 8) {
        alert("Invalid.  Username must be a minimum of 8 characters long");
        return false;
    }
    else if (y.length < 8) {
        alert("Invalid.  Password must be a minimum of 8 characters long");
        return false;
    }
}

function setDisplayNone(){
    document.getElementById("drinks").style.display = "none";
    document.getElementById("snacks").style.display = "none";
    document.getElementById("meals").style.display = "none";
    document.getElementById("cart").style.display = "none";
    document.getElementById("addUser").style.display = "none";
}

function showall(){
    document.getElementById("drinks").style.display = "block";
    document.getElementById("snacks").style.display = "block";
    document.getElementById("meals").style.display = "block";
}

function displayButtons(x){
    var id = document.getElementById(x);
    if (id.style.display === 'none') {
        id.style.display = 'block';
    } else {
        id.style.display = 'none';
    }
}

function addToCart(item,cost){
    var id = document.getElementById("cart");
    var textnode = document.createTextNode(item + ", $" + cost);
    var linebreak = document.createElement("br");
    id.appendChild(textnode);
    id.appendChild(linebreak);

    var oldtotal = Number(document.getElementById('total').textContent);
    var newtotal = cost + oldtotal;
    var printTotal = newtotal.toFixed(2);

    document.getElementById("total").innerHTML = printTotal;
}


function verifyAddUser(){
    var password = document.forms["addUser"]["password"].value;
    var x = document.forms["addUser"]["confirmPassword"].value;

    if(password !== x){
        alert("Your passwords don't match.  Please re-enter");
        return false
    }
    if(password.length < 8){
        alert("Password must be 8 characters long");
        return false
    }
    var tel = document.forms["addUser"]["tel"].value;
    if(tel.length != 10){
        alert("Invalid phone number.  You need a 10 character phone number ###-###-####");
        return false
    }
    var firstname = document.forms["addUser"]["firstname"].value;
    var lastname = document.forms["addUser"]["lastname"].value;
    var email = document.forms["addUser"]["email"].value;


    var reEnter = prompt("First Name: " + firstname +"\nLast Name: " + lastname + "\nEmail: "+ email
        + "\nPhone: " + tel + "\nYou are about to create the following user.  Do you wish to continue? (Y/N) ");

    if(reEnter !== "y" || reEnter !== "y"){
        return false
    }
    else {
        return true
    }
}
