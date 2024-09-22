<?php

$servername = "sql202.infinityfree.com";
$username = "if0_36489768";
$password = "6JhOhovPlWMAb59";
$dbname = "if0_36489768_customers.sql";

$conn ($servername, $username, $password, $dbname);

if ($conn->error) {
    die("Connection failed: " . $conn->connect_error);
}

$stmt = $conn->prepare("INSERT INTO Customers (FullName, Email, Address, City, State, ZipCode, NameOnCard, CreditCardNum, ExpMonth, ExpYear, CCV) VALUES (?, ?, ?)");
$stmt->bind_param("sss", $fullname, $email, $address, $city, $state, $zip, $nameoncard, $creditnum, $expmonth, $expyear, $ccv);

$fullname = $_POST['FullName'];
$email = $_POST['Email'];
$address = $_POST['Address'];
$city = $_POST['City'];
$state = $_POST['State'];
$zip = $_POST['ZipCode'];
$nameoncard = $_POST['NameOnCard'];
$expmonth = $_POST['ExpMonth'];
$expyear = $_POST['ExpYear'];
$ccv = $_POST['CCV'];
$stmt->execute();

echo

$stmt->close();
$conn->close();
?>