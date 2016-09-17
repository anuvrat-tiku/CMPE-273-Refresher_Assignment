<!DOCTYPE HTML>
<html>
<head>
<meta name="author" content="Anuvrat Tiku">
<Title>JSON example</title>

<body style="background-color:lightgrey">
<h1><center> CMPE-273 STUDENT INFORMATION</center></h1>
<hr />

<h2>TO add a student into the database, kindly fill in the form</h2>
<form action ="add_student.php" method="POST">
Name : <input type="text" name="name"/>
Student ID : <input type="text" name="id"/>
Contact number : <input type="text" name="phone"/>
<input type="submit" value="add"/>
</form>
<br /><hr />

<h2>There are all the students in the CMPE-273 class.</h2>
<?php
//Using PHP to connect to database

//New connection to MongoDB server established
$connection = new MongoClient();

//Handle to CMPE273 database
$db = $connection->CMPE273;

//Handle to students collection within CMPE273 db
$student_collection = $db->students;

//Retrieving all docs...

$cursor = $student_collection->find();

foreach($cursor as $document) {
  
  echo "<strong>Name : </strong>", $document["Name"],";" . "\n";
  echo "<strong>Student_ID : </strong>", $document["SJSU_ID"],";" . "\n";
  echo "<strong>Contact number : </strong>", $document["Phone"] . "\n";
//  var_dump($value);
  echo "<br>";
  }

?>
<hr />
</body>
</html>
