<?php

session_start();

//Database Information

$dbhost = "localhost";
$dbname = "hospital";
$dbuser = "root";
$dbpass = "root";

//Connect to database

$conn = mysql_connect ( $dbhost, $dbuser, $dbpass)or die("Could not connect: ".mysql_error());
mysql_select_db($dbname, $conn) or die(mysql_error());

$username = $_POST['user'];
$password = $_POST['pwd'];
$conpasswd = $_POST['cpwd2'];
echo $username;
echo $password;
echo $conpasswd;
$result = mysql_query("SELECT * FROM loginUser WHERE username='$username'");
$row=mysql_fetch_array($result);
if($password == $row["password"]) 
{
$result1 = mysql_query("UPDATE loginUser SET password = '$conpasswd' WHERE username='$username'");
header('Location:hospital_frame.php');
}
else
{
$string="username and password is incorrect";
header('Location:hospital_frame.php?string='.$string);
}
//echo($conpasswd);

?>
