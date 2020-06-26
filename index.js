


// saving username and password as variables, will be sent to data base once linked.
function saveData() {
    var usr = document.getElementById('userName').value;
    var pas = document.getElementById('passWord').value;
    var myClass = Java.type("jbdcDriver.bin.jbdcDriver.Driver");
    myClass.insertData(usr, pas, 69);
    document.getElementById('savedUser').innerHTML = usr + " SAVED";
    document.getElementById('savedPass').innerHTML = pas + " SAVED";
    
}

// recover function for password recovery, only purpose is to save email for now
function recover() {
    var usrmail = document.getElementById('userEmail').value;
    document.getElementById('emailConfirm').innerHTML = usrmail + " EMAIL SENT";
}